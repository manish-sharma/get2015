package vehicles;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Have all the all the methods which perform the queries
 * @author Ravika
 *
 */

public class VehicleJDBCHelper {
	
	@SuppressWarnings("resource")
	/**
	 * to insert into the data base
	 * @param vehicle = insert 
	 */
	public static void create(Vehicle vehicle) {
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = null;
		
		try {
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			int engineCC = vehicle.getEngineInCC();
			int fuelCapacity = vehicle.getFuelCapacity();
			int milage = vehicle.getMilage();
			long price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			boolean ac;
			boolean powerSteering;
			String accessoryKit;
			boolean selfStart;
			long helmetPrice; 
			
			String query = "INSERT INTO vehicles (make, model, Engine_in_CC, fuel_capacity, milage, price, road_tax) values(?,?,?,?,?,?,?)";
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, make);
			preparedStmt.setString(2, model);
			preparedStmt.setInt(3, engineCC);
			preparedStmt.setInt(4, fuelCapacity);
			preparedStmt.setInt(5, milage);
			preparedStmt.setLong(6, price);
			preparedStmt.setInt(7, roadTax);
			preparedStmt.execute();
			
			if(vehicle instanceof Car) {
				ac = ((Car) vehicle).isAC();
				powerSteering = ((Car) vehicle).isPowerSteering();
				accessoryKit = ((Car) vehicle).getAccessoryKit();
				query = "INSERT INTO car(ac, power_steering, accessory_kit, model) VALUES(?,?,?,?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setBoolean(1, ac);
				preparedStmt.setBoolean(2, powerSteering);
				preparedStmt.setString(3, accessoryKit);
				preparedStmt.setString(4, model);
				preparedStmt.execute();
			}
			
			else if(vehicle instanceof Bike) {
				selfStart = ((Bike) vehicle).isSelfStart();
				helmetPrice = ((Bike) vehicle).getHelmetPrice();
				query = "INSERT INTO bike(self_start, helmet_price, model) VALUES (?, ?, ?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setBoolean(1, selfStart);
				preparedStmt.setLong(2, helmetPrice);
				preparedStmt.setString(3, model);
				preparedStmt.execute();
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int deleteByMake(String make) {
		String query = "DELETE FROM vehicles where make = '"+make+"'";
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
	
	public static int deleteByModel(String model) {
		String query = "DELETE FROM vehicles where model = '"+model+"'";
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
	
	public static int deleteByMakeModel(String make, String model) {
		String query = "DELETE FROM vehicles WHERE make = '"+make+"' AND model = '"+model+"'";
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
	
	@SuppressWarnings("resource")
	public static List<Vehicle> searchByMakeAndModel(String make, String model) {
		String query = "SELECT * FROM vehicles WHERE make = '"+make+"' AND model = '"+model+"'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		boolean selfStart = false;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax;
		long helmetPrice= 0;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while(rsVehicle.next()) {
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				
				
				query = "SELECT * FROM car WHERE model = "+model;
				
				rsSpecific = stmt2.executeQuery(query);
				
				if(rsSpecific.next() == false) {
					query = "SELECT * FROM bike WHERE model = "+model;
					rsSpecific = stmt2.executeQuery(query);
					if(rsSpecific.next()) {
						selfStart = rsSpecific.getBoolean("self_Start");
						helmetPrice = rsSpecific.getLong("helmet_Price");
					}
					Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE,"Royal Enfield", "Bullet 300");

					Bike bike = VehicleHelper.createBike((Bike)vehicle, engineCC, fuelCapacity, milage, price, roadTax, selfStart, helmetPrice);
					vehicles.add(bike);
				}
				else {
					Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,"Ford","EcoSport");

					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					Car car = VehicleHelper.createCar((Car)vehicle, engineCC, fuelCapacity, milage, price, roadTax, ac, powerSteering, accessoryKit);

					vehicles.add(car);
				}
				
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
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
	
	public static int updateByMake(String make) {
		String query = "UPDATE vehicles SET price = price+100000 where make = '"+make+"'";
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
