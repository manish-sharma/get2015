/**
 * Class to implement JDBC
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.utils.ConnectionUtil;

public class VehicleJDBCHelper {
	
	/** Method to insert Vehicle data into database
	 * @param vehicle : Object of vehicle whose data is to be inserted
	 */
	@SuppressWarnings("resource")
	public static void insert(Vehicle vehicle) {
		
		if(vehicle == null) {
			System.out.println("Null object can't be inserted");
		}
		
		/* Creating Coneectiotn */
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = null;
		
		try {
			
			/* Getting attributes of the object */
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			String engineCC = vehicle.getEngineCC();
			String fuelCapacity = vehicle.getFuelCapacity();
			String mileage = vehicle.getMileage();
			String createdBy =vehicle.getCreatedBy();
			Date createdTime = vehicle.getCreatedTime();
			int price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			String ac, powerSteering, accessoryKit, selfStart;
			int helmetPrice; 
			
			/* query contains the database query to insert a row in database */ 
			String query = "INSERT INTO vehicle (make, created_by, created_time, model, engine_cc, fuel_capacity, mileage, price, road_tax) values(?,?,?,?,?,?,?,?,?)";
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, make);
			preparedStmt.setString(2, createdBy);
			preparedStmt.setDate(3, createdTime);
			preparedStmt.setString(4, model);
			preparedStmt.setString(5, engineCC);
			preparedStmt.setString(6, fuelCapacity);
			preparedStmt.setString(7, mileage);
			preparedStmt.setInt(8, price);
			preparedStmt.setInt(9, roadTax);
			
			/* Executing preparedstatement */
			preparedStmt.execute();
			
			query = "SELECT vehicle_id FROM vehicle ORDER BY vehicle_id DESC";
			
			ResultSet rs = preparedStmt.executeQuery(query);
			
			int vehicleId = 0;
			if(rs.next())
				vehicleId = rs.getInt(1);
			
			/* If inserted vehicle is instance of Car, 
			 * then entry in Car tbale is also done
			 */
			if(vehicle instanceof Car) {
				ac = ((Car) vehicle).getAC();
				powerSteering = ((Car) vehicle).getPowerSteering();
				accessoryKit = ((Car) vehicle).getAccessoryKit();
				query = "INSERT INTO car(ac, power_steering, accessory_kit, vehicle_id) VALUES(?,?,?,?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, ac);
				preparedStmt.setString(2, powerSteering);
				preparedStmt.setString(3, accessoryKit);
				preparedStmt.setInt(4, vehicleId);
				preparedStmt.execute();
			}
			
			/* If inserted vehicle is instance of Bike, 
			 * then entry in Bike tbale is also done
			 */
			else if(vehicle instanceof Bike) {
				selfStart = ((Bike) vehicle).getSelfStart();
				helmetPrice = ((Bike) vehicle).getHelmetPrice();
				query = "INSERT INTO bike(self_start, helmet_price, vehicle_id) VALUES (?, ?, ?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, selfStart);
				preparedStmt.setInt(2, helmetPrice);
				preparedStmt.setInt(3, vehicleId);
				preparedStmt.execute();
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/** Method to delete records by make 
	 * 
	 * @param make : Company name
	 * @return -1 if exception occurred, otherwise returns number of rows deleted
	 */
	public static int deleteByMake(String make) {
		
		/* query to delete data from database based on make */
		String query = "DELETE FROM vehicle where make = '"+make+"'";
		Connection con = ConnectionUtil.getConnection();
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
	
	/** Method to delete records by model 
	 * 
	 * @param model : model name
	 * @return -1 if exception occurred, otherwise returns number of rows deleted
	 */
	public static int deleteByModel(String model) {
		
		/* query to delete data from database based on model */
		String query = "DELETE FROM vehicle where model = '"+model+"'";
		Connection con = ConnectionUtil.getConnection();
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
	
	/** Method to delete recoeds by make and model both 
	 * 
	 * @param make : company name
	 * @param model : model name
	 * @return -1 if exception occurred, otherwise returns number of rows deleted
	 */
	public static int deleteByMakeModel(String make, String model) {
		
		/* query to delete data from database based on make and model both*/
		String query = "DELETE FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Connection con = ConnectionUtil.getConnection();
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
	
	/** Method to search in database based upon make and model
	 * 
	 * @param make : Company Name
	 * @param model : Model Name
	 * @return : List of vehicles
	 */
	@SuppressWarnings("resource")
	public static List<Vehicle> searchByMakeAndModel(String make, String model) {
		String query = "SELECT * FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		String engineCC, fuelCapacity, mileage, selfStart = "", ac, powerSteering, accessoryKit, createdBy;
		Date createdTime;
		int price, roadTax, helmetPrice= 0;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while(rsVehicle.next()) {
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getString("engine_cc");
				fuelCapacity = rsVehicle.getString("fuel_capacity");
				mileage = rsVehicle.getString("mileage");
				price = rsVehicle.getInt("price");
				roadTax = rsVehicle.getInt("road_tax");
				createdBy = rsVehicle.getString("created_by");
				createdTime = rsVehicle.getDate("created_time");
				
				int vehicle_id = rsVehicle.getInt("vehicle_id");
				
				query = "SELECT * FROM car WHERE vehicle_id = "+vehicle_id;
				
				rsSpecific = stmt2.executeQuery(query);
				
				if(rsSpecific.next() == false) {
					query = "SELECT * FROM bike WHERE vehicle_id = "+vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					if(rsSpecific.next()) {
						selfStart = rsSpecific.getString("self_start");
						helmetPrice = rsSpecific.getInt("helmet_price");
					}
					vehicles.add(VehicleHelper.create(make, createdBy, createdTime, model, engineCC, fuelCapacity, mileage, price, roadTax, selfStart, helmetPrice));
				}
				else {
					ac = rsSpecific.getString("ac");
					powerSteering = rsSpecific.getString("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehicles.add(VehicleHelper.create(make, createdBy, createdTime, model, engineCC, fuelCapacity, mileage, price, roadTax, ac, powerSteering, accessoryKit));
				}
				
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
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
				System.out.println(e.getMessage());
			}
		}
		return vehicles;
	}
	
	/** Method to update records by make
	 * 
	 * @param make : Company name
	 * @return -1 if excetion occurred, otherwise returns number of rows updated
	 */
	public static int updateByMake(String make) {
		
		/* query to update price of vehicle database based on make */
		String query = "UPDATE vehicle SET price = price+100000 where make = '"+make+"'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
