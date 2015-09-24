package helper;
/**
 * this class perform the operation on database perform operations on database
 * @author Banwari kevat
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;





import java.util.ArrayList;
import java.util.List;

import model.Car;
import model.Bike;
import model.Vehicle;
import Utills.ConnectionUtill;

public class VehicleJDBCHelper {
	
	// Method to insert vehicle data in database	 
	@SuppressWarnings("resource")
	public static void create( Vehicle vehicle ) throws MyException
	{
		// Creating connection
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		PreparedStatement prepareStmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			/// take data from vehicle to corresponding variables*/
			String author = vehicle.getCreated_By();
			java.sql.Date date = vehicle.getCreated_Time();
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			int engineCC = vehicle.getEnginInCC();
			int fuelCapacity = vehicle.getFuelCapacity();
			int milage = vehicle.getMilage();
			double price = vehicle.getPrice();
			double roadTax = vehicle.getRoadTax();
			// query for inserting data
			String query = "INSERT INTO Vehicle(created_by,created_time,make,model,engine_cc,fuel_capacity,milage,price,roadTax) VALUES(?,?,?,?,?,?,?,?,?)";
			// make prepare statement object
			prepareStmt = con.prepareStatement(query); 
			prepareStmt.setString(1, author);
			prepareStmt.setDate(2, date);
			prepareStmt.setString(3, make);
			prepareStmt.setString(4, model);
			prepareStmt.setInt(5, engineCC);
			prepareStmt.setInt(6, fuelCapacity);
			prepareStmt.setInt(7, milage);
			prepareStmt.setDouble(8, price);
			prepareStmt.setDouble(9, roadTax);
			prepareStmt.execute(); // execute query
			
			query = "SELECT vehicle_id FROM Vehicle ORDER BY vehicle_id DESC"; //take vehicle id for current inserting data
			int vehicleId;
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			vehicleId = rs.getInt(1);
			if(vehicle instanceof Car) // check if vehicle is instance of car than entry do in car table
			{
				String ac = "NO", powerSteering = "NO", accessoryKit = "NO";
				if(((Car)vehicle).isAC())
				{
					ac = "YES";
				}
				if(((Car)vehicle).isPowerSteering())
				{
					powerSteering = "YES";
				}
				if(((Car)vehicle).isAccessoryKit())
				{
					accessoryKit = "YES";
				}
				query = "INSERT INTO Car(ac,powersteering,accessorykit,vehicle_id) VALUES(?,?,?,?)"; // query for inserting data in car table
				prepareStmt = con.prepareStatement(query);
				prepareStmt.setString(1, ac);
				prepareStmt.setString(2, powerSteering);
				prepareStmt.setString(3, accessoryKit);
				prepareStmt.setInt(4, vehicleId);
				prepareStmt.execute();			// execute query
			}
			else				// otherwise do in bike table
			{
				String selfStart = "NO";
				double helmetprice = ((Bike)vehicle).getHelmetPrize();
				if(((Bike)vehicle).isSelfStart())
				{
					selfStart = "YES";
				}
				// query for inserting data in Bike table
				query = "INSERT INTO Bike(selfstart,helmetprice,vehicle_id) VALUES(?,?,?)"; 
				prepareStmt = con.prepareStatement(query);
				prepareStmt.setString(1, selfStart);
				prepareStmt.setDouble(2, helmetprice);
				prepareStmt.setInt(3, vehicleId);
				prepareStmt.execute();
			}
		}
		catch (SQLException e)
		{
			throw new MyException(e);
		}
		finally
		{
			try 
			{
				stmt.close();
				prepareStmt.close();
				con.close();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				throw new MyException(e);
			}
			
		}
	}
	
	// Method to search vehicles in database
	@SuppressWarnings("resource")
	public static List<Vehicle> searchByMakeAndModel(String make, String model) throws MyException
	{   // query for search
		String query = "SELECT * FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		String selfStart = "", ac, powerSteering, accessoryKit, createdBy;
		int engineCC, fuelCapacity, mileage;
		Date createdTime;
		double price, roadTax, helmetPrice= 0;
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query); // execute the query and take data in resultset
			vehicles = new ArrayList<Vehicle>(); // make a list which holds results
			Vehicle vehicle = null;
			while(rsVehicle.next()) {
				// put data from result set to corresponding variables
				createdBy = rsVehicle.getString("created_by");
				createdTime = rsVehicle.getDate("created_time");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("engine_cc");
				fuelCapacity = rsVehicle.getInt("fuel_capacity");
				mileage = rsVehicle.getInt("milage");
				price = rsVehicle.getDouble("price");
				roadTax = rsVehicle.getDouble("roadTax");
				
				int vehicle_id = rsVehicle.getInt("vehicle_id");
				
				query = "SELECT * FROM Car WHERE vehicle_id = "+vehicle_id;
				
				rsSpecific = stmt2.executeQuery(query);
				
				if(rsSpecific.next() == false) {// if vehicle is not a car than it will be bike
					query = "SELECT * FROM Bike WHERE vehicle_id = "+vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					if(rsSpecific.next()) {
						vehicle = new Bike();
						boolean b1 = false;
						selfStart = rsSpecific.getString("selfstart");
						helmetPrice = rsSpecific.getDouble("helmetprice");
						if( selfStart.equals("YES") )
							b1 = true;;
						((Bike)vehicle).setSelfStart(b1);
						((Bike)vehicle).setHelmetPrize(helmetPrice);
					}
				}
				else {// otherwise it is a car than put specific attributes of car in vehicle
					vehicle = new Car();
					boolean b1 = false, b2 = false, b3 = false;
					ac = rsSpecific.getString("ac");
					powerSteering = rsSpecific.getString("powersteering");
					accessoryKit = rsSpecific.getString("accessorykit");
					if( ac.equals("YES") ) b1 = true;
					if( powerSteering.equals("YES") ) b2 = true;
					if( accessoryKit.equals("YES") ) b3 = true;
					((Car)vehicle).setAC(b1);
					((Car)vehicle).setPowerSteering(b2);
					((Car)vehicle).setAccessoryKit(b3);
				}
				// set all the attributes of vehicle
				vehicle.setCreated_By(createdBy);
				vehicle.setCreated_Time(createdTime);
				vehicle.setEnginInCC(engineCC);
				vehicle.setFuelCapacity(fuelCapacity);
				vehicle.setMake(make);
				vehicle.setMilage(mileage);
				vehicle.setModel(model);
				vehicle.setPrice(price);
				vehicle.setRoadTax(roadTax);
				vehicles.add(vehicle);				// add vehicle object in a list
			}
		}
		catch(Exception e)
		{
			throw new MyException(e);
		}
		finally {
			try {
				if(stmt != null)
					stmt.close();
				if(stmt2 != null)
					stmt2.close();
				if(rsSpecific != null)
					rsSpecific.close();
				if(rsVehicle != null)
					rsVehicle.close();
			} catch(Exception e) {
				throw new MyException(e);
			}
		}
		return vehicles;	// return the list
	}
	 // method used for delete data from database based on make
	public static int deleteByMake(String make) throws MyException 
	{
		String query = "DELETE FROM Vehicle where make = '"+make+"'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	// method used for delete data from database based on model
	public static int deleteByModel(String model) throws MyException
	{
		String query = "DELETE FROM Vehicle where model = '"+model+"'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	//method used for delete data from database based on make and model
	public static int deleteByMakeModel(String make, String model) throws MyException
	{
		String query = "DELETE FROM Vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	 //  method for update data in database
	public static int updateByMake(String make) throws MyException
	{
		String query = "UPDATE Vehicle SET price = price+100000 where make = '"+make+"'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} catch(Exception e) 
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
