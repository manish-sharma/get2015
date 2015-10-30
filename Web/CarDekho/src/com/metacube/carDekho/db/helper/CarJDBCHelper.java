package com.metacube.carDekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.carDekho.CarDekhoException;
import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarJDBCHelper extends VehicleJDBCHelper {
	
	public boolean create(Connection connection, Car car) throws CarDekhoException {
		boolean created = false;
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				created = super.create(connection,car);
				int id = VehicleJDBCHelper.getIdByModel(connection, car.getModel());
				if(id > -1) {
					String query = "INSERT INTO car(ac, power_steering, accessory_kit, model,idcar) VALUES(?,?,?,?,?)";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setInt(5, id);
					preparedStatement.setBoolean(1, car.isAC());
					preparedStatement.setBoolean(2, car.isPowerSteering());
					preparedStatement.setString(3, car.getAccessoryKit());
					preparedStatement.setString(4, car.getModel());
					preparedStatement.execute();
					connection.commit();
				}
			}catch (CarDekhoException e) {
				throw e;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
			}			
		}
		return created;
	}
	public int update(Connection connection, Car car) throws  CarDekhoException {
		int updated = 0;
		Statement statement = null;
		try {
			
			super.update(connection, car);
			int id = VehicleJDBCHelper.getIdByModel(connection, car.getModel());
			String query = "UPDATE car SET accessory_kit = " +car.getAccessoryKit()+ ", ac = " +car.isAC()
					+", power_steering = "+car.isPowerSteering()+  " where idcar = '" + id + "'"; 
			statement = connection.createStatement();
			updated = statement.executeUpdate(query);
		}catch (CarDekhoException e){
			throw e;
		} catch (SQLException e) {
			System.out.println("Exception while updation in Car" + e.getMessage());
		} finally {
			try{
				statement.close();
			} catch(SQLException e) {
				System.out.println("Excption in closing Statement" + e.getMessage());
			}
		}
		return updated;		
	}
	
	public List<Vehicle> searchAllCar(Connection connection) {
		List<Vehicle> Cars = new ArrayList<Vehicle>();
		Statement preparedStatement = null;
		ResultSet rsSpecific = null;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		try{
			List<Vehicle> vehicles = super.searchAll(connection);
			Iterator<Vehicle> iterator = vehicles.iterator();
			while (iterator.hasNext()) {
				Car vehicle = (Car) iterator.next();
				String query = "Select * from car where model = '" + vehicle.getModel() + "'";
				preparedStatement = connection.createStatement();
				rsSpecific = preparedStatement.executeQuery(query);
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehicle.setAC(ac);
					vehicle.setAccessoryKit(accessoryKit);
					vehicle.setPowerSteering(powerSteering);
				}
				Cars.add(vehicle);
			}
		} catch(SQLException e) {
			System.out.println("Excption in Searching " + e.getMessage());
		}
		
		return Cars;
	}
	public List<Vehicle> searchCarsByMake(Connection connection, String make) {
		List<Vehicle> Cars = new ArrayList<Vehicle>();
		Statement preparedStatement = null;
		ResultSet rsSpecific = null;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		try{
			List<Vehicle> vehicles = super.searchByMake(connection, make);
			Iterator<Vehicle> iterator = vehicles.iterator();
			while (iterator.hasNext()) {
				Car vehicle = (Car) iterator.next();
				String query = "Select * from car where model = '" + vehicle.getModel() + "'";
				preparedStatement = connection.createStatement();
				rsSpecific = preparedStatement.executeQuery(query);
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehicle.setAC(ac);
					vehicle.setAccessoryKit(accessoryKit);
					vehicle.setPowerSteering(powerSteering);
				}
				Cars.add(vehicle);
			}
		} catch(SQLException e) {
			System.out.println("Excption in Searching " + e.getMessage());
		}
		
		return Cars;
	}
	public Vehicle searchCarByModel(Connection connection, String model) {
		Statement preparedStatement = null;
		ResultSet rsSpecific = null;
		boolean ac;
		boolean powerSteering;
		String accessoryKit;
		Car vehicle = null;
		try{
			vehicle = (Car) super.searchByModel(connection, model);			
				String query = "Select * from car where model = '" + model + "'";
				preparedStatement = connection.createStatement();
				rsSpecific = preparedStatement.executeQuery(query);
				if(rsSpecific.next()) {
					ac = rsSpecific.getBoolean("ac");
					powerSteering = rsSpecific.getBoolean("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehicle.setAC(ac);
					vehicle.setAccessoryKit(accessoryKit);
					vehicle.setPowerSteering(powerSteering);
				}	
		} catch(SQLException e) {
			System.out.println("Excption in Searching " + e.getMessage());
		}
		
		return vehicle;
	}
	
}
