package com.cardekho.db.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

public class VehicleDBHelper {

	private static String INSERT_VEHICLE_QUERY = "INSERT INTO Vehicle (make, model, engine_cc, fuel_capacity, mileage, price, road_tax, created_by, created_time, last_modified_time, image_path) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static String SELECT_FOR_MODEL_QUERY = "SELECT id FROM Vehicle WHERE model=?";
	
	private static String VEHICLE_DETAIL_QUERY = "SELECT * FROM Vehicle WHERE id = ?";
	
	private static String UPDATE_VEHICLE_QUERY ="UPDATE Vehicle SET make = ?,model = ?, engine_cc = ?, fuel_capacity =?, mileage = ?, price = ?, road_tax = ?,last_modified_time =?, image_path =? WHERE id = ?";
	
	protected void create(Connection connection, Vehicle vehicle) throws CarDekhoSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setString(3, vehicle.getEngineCC());
			preparedStatement.setString(4, vehicle.getFuelCapacity());
			preparedStatement.setString(5, vehicle.getMileage());
			preparedStatement.setInt(6, vehicle.getPrice());
			preparedStatement.setInt(7, vehicle.getRoadTax());
			preparedStatement.setString(8, vehicle.getCreatedBy());
			preparedStatement.setTimestamp(9, new Timestamp(vehicle.getCreatedTime().getTime()));
			preparedStatement.setTimestamp(10, new Timestamp(vehicle.getLastModifiedTime().getTime()));
			preparedStatement.setString(11, vehicle.getImagePath());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new CarDekhoSystemException("Could not create Vehicle, [" + e.getMessage() + "]");
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
				}
			}
		}
	}
	
	protected int getVehicleIdByModel(Connection connection, String model) throws CarDekhoSystemException {
		int id = -1;
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			System.out.println("Get Model : "+model);
			try {
				preparedStatement = connection.prepareStatement(SELECT_FOR_MODEL_QUERY);
				preparedStatement.setString(1, model);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					id = resultSet.getInt(1);
					System.out.println("id="+id);
				}
			} catch(SQLException e) {
				throw new CarDekhoSystemException("Could not find Vehicle by Model, [" + e.getMessage() + "]");
			}
		}
		return id;
	}
	
	protected Vehicle getVehicleDetails(Connection connection, int id) throws CarDekhoSystemException {
		Vehicle vehicle = null;
		if(connection != null) {
			vehicle = new Car();
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection.prepareStatement(VEHICLE_DETAIL_QUERY);
				preparedStatement.setInt(1, id);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					vehicle.setId(resultSet.getInt("id"));
					vehicle.setMake(resultSet.getString("make"));
					vehicle.setModel(resultSet.getString("model"));
					vehicle.setEngineCC(resultSet.getString("engine_cc"));
					vehicle.setFuelCapacity(resultSet.getString("fuel_capacity"));
					vehicle.setMileage(resultSet.getString("mileage"));
					vehicle.setPrice(resultSet.getInt("price"));
					vehicle.setRoadTax(resultSet.getInt("road_tax"));
					vehicle.setCreatedBy(resultSet.getString("created_by"));
					vehicle.setCreatedTime(resultSet.getDate("created_time"));
					vehicle.setLastModifiedTime(resultSet.getDate("last_modified_time"));
					vehicle.setImagePath(resultSet.getString("image_path"));
					System.out.println(vehicle);
				}
			} catch(SQLException e) {
				throw new CarDekhoSystemException("Could not find Vehicle by Model, [" + e.getMessage() + "]");
			}
		}
		return vehicle;
	}
	
	protected void updateByModel(Connection connection, Vehicle vehicle, int id) throws CarDekhoSystemException {
		PreparedStatement preparedStatement = null;
		try {
			System.out.println("Model2 : "+id);
			preparedStatement = connection.prepareStatement(UPDATE_VEHICLE_QUERY);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setString(3, vehicle.getEngineCC());
			preparedStatement.setString(4, vehicle.getFuelCapacity());
			preparedStatement.setString(5, vehicle.getMileage());
			preparedStatement.setInt(6, vehicle.getPrice());
			preparedStatement.setInt(7, vehicle.getRoadTax());
			preparedStatement.setTimestamp(8, new Timestamp(vehicle.getLastModifiedTime().getTime()));
			preparedStatement.setString(9, vehicle.getImagePath());
			preparedStatement.setInt(10, id);
			System.out.println("Model : "+id);
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new CarDekhoSystemException("Could not update Vehicle, [" + e.getMessage() + "]");
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
				}
			}
		}
	}
}
