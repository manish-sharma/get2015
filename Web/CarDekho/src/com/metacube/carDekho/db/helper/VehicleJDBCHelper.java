package com.metacube.carDekho.db.helper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.metacube.carDekho.CarDekhoException;
import com.metacube.carDekho.helper.VehicleHelper;
import com.metacube.carDekho.helper.VehicleType;
import com.metacube.carDekho.model.*;

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
	static String query = "INSERT INTO vehicles (make, model, Engine_in_CC, fuel_capacity, milage, price, road_tax) values(?,?,?,?,?,?,?)";

	protected boolean create(Connection connection, Vehicle vehicle) throws CarDekhoException {
		PreparedStatement preparedStatement = null;
		boolean created = false;
		if(connection != null){
			
		}
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setInt(3, vehicle.getEngineInCC());
			preparedStatement.setInt(4, vehicle.getFuelCapacity());
			preparedStatement.setInt(5, vehicle.getMilage());
			preparedStatement.setLong(6, vehicle.getPrice());
			preparedStatement.setInt(7, vehicle.getRoadTax());
			preparedStatement.execute();				
			created = true;
		}
		catch (SQLException e) {
			throw new CarDekhoException("Could not create Vehicle, [" + e.getMessage() + "]");
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
				}
			}
		}	
		return created;
	}

	
	
	public static List<Vehicle> searchAll(Connection connection) {
		String query = "SELECT * FROM vehicles ";
		Statement stmt = null;
		ResultSet rsVehicle = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		String make;
		String model;
		
		long price;
		int roadTax;
		List<Vehicle> vehicles = null;
		try {
			stmt = connection.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while (rsVehicle.next()) {
				make = rsVehicle.getString("make");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				vehicle.setEngineInCC(engineCC);
				vehicle.setFuelCapacity(fuelCapacity);
				vehicle.setMilage(milage);
				vehicle.setRoadTax(roadTax);
				vehicle.setPrice(price);
				vehicles.add(vehicle);				

			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return vehicles;
	}
	public static List<Vehicle> searchByMake(Connection connection, String make) {
		String query = "SELECT * FROM vehicles WHERE make = '" + make + "'";
		Statement stmt = null;
		ResultSet rsVehicle = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		String model;
		
		long price;
		int roadTax;
		List<Vehicle> vehicles = null;
		try {
			stmt = connection.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			while (rsVehicle.next()) {
				make = rsVehicle.getString("make");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				

				Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				vehicle.setEngineInCC(engineCC);
				vehicle.setFuelCapacity(fuelCapacity);
				vehicle.setMilage(milage);
				vehicle.setRoadTax(roadTax);
				vehicle.setPrice(price);
				vehicles.add(vehicle);				

			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return vehicles;
	}

	public static Vehicle searchByModel(Connection connection, String model) {
		String query = "SELECT * FROM vehicles WHERE model = '" + model + "'";
		Statement stmt = null;
		ResultSet rsVehicle = null;
		int engineCC;
		int fuelCapacity;
		int milage;
		String make;		
		long price;
		int roadTax;
		Vehicle vehicle = null;
		try {
			stmt = connection.createStatement();
			rsVehicle = stmt.executeQuery(query);
			if (rsVehicle.next()) {
				make = rsVehicle.getString("make");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("Engine_in_CC");
				fuelCapacity = rsVehicle.getInt("Fuel_Capacity");
				milage = rsVehicle.getInt("milage");
				price = rsVehicle.getLong("price");
				roadTax = rsVehicle.getInt("road_tax");
				vehicle = VehicleHelper.createVehicle(VehicleType.CAR,
						make, model);
				vehicle.setEngineInCC(engineCC);
				vehicle.setFuelCapacity(fuelCapacity);
				vehicle.setMilage(milage);
				vehicle.setRoadTax(roadTax);
				vehicle.setPrice(price);
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return vehicle;
	}
	
	public static void update(Connection connection, Vehicle vehicle) throws CarDekhoException {
		Car car = (Car)vehicle;
		String model = car.getModel();
		String query = "UPDATE vehicles SET price = " +car.getPrice()+ 
				", Engine_in_CC = " 
				+car.getEngineInCC()+" ,fuel_Capacity = " +car.getFuelCapacity()+ ", milage = " 
				+car.getMilage()+ " ,road_tax = " +car.getRoadTax()+ " where model = '" + model + "'";
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			System.out.println("Exception while updation " + e.getMessage());
			throw new CarDekhoException("Exception while updation " + e.getMessage());			
		}
	}
	
	public static List<String> searchMakes(Connection connection) {
		String query = "SELECT DISTINCT make FROM vehicles ";
		Statement stmt = null;
		ResultSet rsMakes = null;		
		List<String> makes = new ArrayList<String>();
		try {
			stmt = connection.createStatement();
			rsMakes = stmt.executeQuery(query);
			while (rsMakes.next()) {
				makes.add(rsMakes.getString("make"));
			}
		} catch(SQLException sqlException) {
			System.out.println(sqlException+"SQL exception");
		}
		return makes;
	}



	public static int getIdByModel(Connection connection, String model) throws CarDekhoException {
		int id = -1;
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try{
				String query = "select id from vehicles where model = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, model);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					id = resultSet.getInt("id");
				}
			} catch (SQLException e) {
				throw new CarDekhoException("Could not find VehicleId, [" + e.getMessage() + "]");
			} finally {
				if(preparedStatement != null) {
					try {
						if(resultSet != null) {
							 try{					
								 resultSet.close();
							 }	catch (SQLException e) {
								System.out.println("Could not close resultset, [" + e.getMessage() + "]");
							}
						}
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
				
			}	
		}
		return id;
	}
}
