package com.metacube.carDekho.helper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.metacube.carDekho.model.*;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

/**
 * Have all the all the methods which perform the queries
 * 
 * @author Ravika
 *
 */

public class VehicleJDBCHelper {

	/**
	 * to insert into the data base
	 * 
	 * @param vehicle
	 *            = insert
	 * @throws SQLException 
	 */
	public static boolean createCar(Vehicle vehicle) {
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = null;
		
		try {
			con.setAutoCommit(false);

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
			query = "Select id from vehicles where model = '" + model + "'";
			preparedStmt = con.prepareStatement(query);
			ResultSet resultSet = preparedStmt.executeQuery();
			int id = -1;
			if(resultSet.next()) {
				id = resultSet.getInt("id");
			}
			
				ac = ((Car) vehicle).isAC();
				powerSteering = ((Car) vehicle).isPowerSteering();
				accessoryKit = ((Car) vehicle).getAccessoryKit();
				query = "INSERT INTO car(ac, power_steering, accessory_kit, model,idcar) VALUES(?,?,?,?,?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setInt(5, id);
				preparedStmt.setBoolean(1, ac);
				preparedStmt.setBoolean(2, powerSteering);
				preparedStmt.setString(3, accessoryKit);
				preparedStmt.setString(4, model);
				preparedStmt.execute();
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			try {
				con.rollback();
			} catch (SQLException sql) {
				System.out.println(sql);
			}
			return false;
		}
		try {
			con.commit();
		} catch (SQLException sql) {
			System.out.println(sql);
		}		return true;
	}

	public static int deleteByMake(String make) {

		String query = "Select id FROM vehicles where make = '" + make + "'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);
			query = "DELETE FROM vehicles where make = '" + make + "'";

			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			while (resultSet.next()) {
				query = "DELETE FROM car where id = '" + resultSet.getInt(1)
						+ "'";
			}
			return numberOfrecordsDeleted;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static int deleteByModel(String model) {
		String query = "Select id FROM vehicles where model = '" + model + "'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);
			query = "DELETE FROM vehicles where model = '" + model + "'";

			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			while (resultSet.next()) {
				query = "DELETE FROM car where idcar = '" + resultSet.getInt(1)
						+ "'";
			}
			return numberOfrecordsDeleted;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static int deleteByMakeModel(String make, String model) {
		String query = "Select id FROM vehicles where make = '" + make
				+ "' OR model = '" + model + "'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);
			query = "DELETE FROM vehicles where make = '" + make
					+ "' OR model = '" + model + "'";

			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			while (resultSet.next()) {
				query = "DELETE FROM car where idcar = '" + resultSet.getInt(1)
						+ "'";
			}
			return numberOfrecordsDeleted;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static List<Vehicle> searchByMakeAndModel(String make, String model) {
		String query = "SELECT * FROM vehicles WHERE make = '" + make
				+ "' OR model = '" + model + "'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while (rsVehicle.next()) {
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");

				query = "SELECT * FROM car WHERE model = " + model;

				rsSpecific = stmt2.executeQuery(query);

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						"Ford", "EcoSport");

				ac = rsSpecific.getBoolean("ac");
				powerSteering = rsSpecific.getBoolean("power_steering");
				accessoryKit = rsSpecific.getString("accessory_kit");
				Car car = VehicleHelper.createCar((Car) vehicle, engineCC,
						fuelCapacity, milage, price, roadTax, ac,
						powerSteering, accessoryKit);

				vehicles.add(car);

			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException);
		}
		return vehicles;
	}
	public static List<Vehicle> searchAll() {
		String query = "SELECT * FROM vehicles ";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		String make;
		boolean ac;
		String model;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while (rsVehicle.next()) {
				int id = rsVehicle.getInt("id");
				make = rsVehicle.getString("make");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				query = "Select * from car where idcar = '" + id + "'";
				rsSpecific = stmt2.executeQuery(query);

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					Car car = VehicleHelper.createCar((Car) vehicle, engineCC,
							fuelCapacity, milage, price, roadTax, ac,
							powerSteering, accessoryKit);

					vehicles.add(car);
				}
				

			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return vehicles;
	}
	public static List<Vehicle> searchByMake(String make) {
		String query = "SELECT * FROM vehicles WHERE make = '" + make + "'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		boolean ac;
		String model;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while (rsVehicle.next()) {
				int id = rsVehicle.getInt("id");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				query = "Select * from car where idcar = '" + id + "'";
				rsSpecific = stmt2.executeQuery(query);

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					Car car = VehicleHelper.createCar((Car) vehicle, engineCC,
							fuelCapacity, milage, price, roadTax, ac,
							powerSteering, accessoryKit);

					vehicles.add(car);
				}
				

			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return vehicles;
	}

	public static Vehicle searchByModel(String model) {
		String query = "SELECT * FROM vehicles WHERE model = '" + model + "'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		boolean ac;
		String make;
		boolean powerSteering;
		String accessoryKit;
		long price;
		int roadTax;
		int id;
		Car car = null;
		Connection con = ConnectionUtil.getConnection();
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			while (rsVehicle.next()) {
				model = rsVehicle.getString("model");
				make = rsVehicle.getString("make");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				id = rsVehicle.getInt("id");
				query = "Select * from car where idcar = '" + id + "'";
				rsSpecific = stmt2.executeQuery(query);

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					System.out.println(ac);
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					car = VehicleHelper.createCar((Car) vehicle, engineCC,
							fuelCapacity, milage, price, roadTax, ac,
							powerSteering, accessoryKit);
				}
				System.out.println(car.getAccessoryKit());

			}		
		} catch(SQLException sqlException) {
			System.out.println(sqlException);
			System.out.println("sql Exception");

		}
		return car;
	}
	public static int update(Vehicle vehicle) {
		Car car = (Car)vehicle;
		String model = car.getModel();
		String query = "UPDATE vehicles SET price = " +car.getPrice()+ 
				", Engine_in_CC = " 
				+car.getEngineInCC()+" ,fuel_Capacity = " +car.getFuelCapacity()+ ", milage = " 
				+car.getMilage()+ " ,road_tax = " +car.getRoadTax()+ " where model = '" + model + "'";
		
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			query = "UODATE car SET accessory_kit = " +car.getAccessoryKit()+ ", ac = " +car.isAC()
					+", power_steering = "+car.isPowerSteering()+  " where model = '" + model + "'"; 
			return numberOfrecordsUpdated;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static List<String> searchMakes() {
		String query = "SELECT DISTINCT make FROM vehicles ";
		Statement stmt = null;
		ResultSet rsMakes = null;		
		Connection con = ConnectionUtil.getConnection();
		List<String> makes = new ArrayList<String>();
		try {
			stmt = con.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				makes.add(rsMakes.getString("make"));
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return makes;
	}
}
