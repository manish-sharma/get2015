package com.speedster.db.helper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import com.speedster.db.ConnectionManager;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Vehicle;
import com.speedster.model.helper.ModelHelper;

public class VehicleDAO {

	List<Vehicle> vehicleList = null;
	
	private static String INSERT_VEHICLE_QUERY = "insert into VEHICLE (MAKE, MODEL, ENGINE_IN_CC, FUEL_CAPACITY, MILAGE, IMAGE_URL, PRICE, ROAD_TAX, ON_ROAD_PRICE, CREATED_BY, CREATED_TIME) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static String UPDATE_VEHICLE_QUERY = "update VEHICLE set MAKE=?, ENGINE_IN_CC=?, FUEL_CAPACITY=?, MILAGE=?, IMAGE_URL=?, PRICE=?, ROAD_TAX=?, ON_ROAD_PRICE=? Where ID=?";
    private static String SELECT_FOR_MODEL_QUERY = "select id from VEHICLE where MODEL=?";
	private static String SELECT_FOR_BELOW_PRICE_QUERY = "select ID, MAKE, MODEL, PRICE, IMAGE_URL from VEHICLE where PRICE<=2000000";
	private static String SELECT_FOR_ABOVE_PRICE_QUERY = "select ID, MAKE, MODEL, PRICE, IMAGE_URL from VEHICLE where PRICE>2000000";
	private static String SELECT_FOR_BRAND_QUERY = "select ID, MAKE, MODEL, PRICE, IMAGE_URL from VEHICLE where MAKE=?";
    private static String SELECT_FOR_ALL_MAKE_QUERY = "select distinct MAKE from VEHICLE";
	private static String SELECT_FOR_ALL_QUERY = "select ID, MAKE, MODEL, PRICE, IMAGE_URL from VEHICLE";
	
	protected void insert(Connection connection, Vehicle vehicle) throws CarDekhoSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setInt(3, vehicle.getEngineInCC());
			preparedStatement.setInt(4, vehicle.getFuelCapacity());
			preparedStatement.setInt(5, vehicle.getMilage());
			preparedStatement.setString(6, vehicle.getImageUrl());
			preparedStatement.setBigDecimal(7,BigDecimal.valueOf(vehicle.getPrice()));
			preparedStatement.setBigDecimal(8,BigDecimal.valueOf(vehicle.getRoadTax()));
			preparedStatement.setBigDecimal(9,BigDecimal.valueOf(vehicle.getOnRoadPrice()));
			preparedStatement.setString(10, vehicle.getCreatedBy());
			preparedStatement.setTimestamp(11, new Timestamp(vehicle.getCreatedTime().getTime()));
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new CarDekhoSystemException("Could not create Vehicle, ["
					+ e.getMessage() + "]");
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, ["
							+ e.getMessage() + "]");
				}
			}
		}
	}
	
	protected void update(Connection connection,Vehicle vehicle) throws CarDekhoSystemException{
		PreparedStatement preparedStatement = null;
		try{
			preparedStatement = connection.prepareStatement(UPDATE_VEHICLE_QUERY);
			//System.out.println("MAKE   =====   "+vehicle.getMake());
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setInt(2, vehicle.getEngineInCC());
			preparedStatement.setInt(3, vehicle.getFuelCapacity());
			preparedStatement.setInt(4, vehicle.getMilage());
			//System.out.println("kchasc = "+vehicle.getImageUrl());
			preparedStatement.setString(5, vehicle.getImageUrl());
			preparedStatement.setBigDecimal(6,BigDecimal.valueOf(vehicle.getPrice()));
			preparedStatement.setBigDecimal(7,BigDecimal.valueOf(vehicle.getRoadTax()));
			preparedStatement.setBigDecimal(8,BigDecimal.valueOf(vehicle.getOnRoadPrice()));
			preparedStatement.setInt(9, vehicle.getId());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new CarDekhoSystemException("Could not update Vehicle, ["
					+ e.getMessage() + "]");
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, ["
							+ e.getMessage() + "]");
				}
			}
		}
	}

protected int getVehicleIdByModel(Connection connection, String model)
		throws CarDekhoSystemException {
	int id = -1;
	if (connection != null) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection
					.prepareStatement(SELECT_FOR_MODEL_QUERY);
			preparedStatement.setString(1, model);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			throw new CarDekhoSystemException(
					"Could not find Vehicle by Model, [" + e.getMessage()
							+ "]");
		}
	}
	return id;
}

public List<Vehicle> getVehiclesByBudget(Connection connection,String budget)
		throws CarDekhoSystemException {
	//int id = -1
	if (connection != null) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			if (budget.equalsIgnoreCase("Below 20 lac")) {
				preparedStatement = connection
						.prepareStatement(SELECT_FOR_BELOW_PRICE_QUERY);
			
			} else {
				preparedStatement = connection
						.prepareStatement(SELECT_FOR_ABOVE_PRICE_QUERY);
			}

			//preparedStatement.setString(1, budget);
			resultSet = preparedStatement.executeQuery();
			vehicleList = ModelHelper.createVehicleList(resultSet);
			ConnectionManager.closeConnection(connection);
			
		} catch (SQLException e) {
			throw new CarDekhoSystemException(
					"Could not find Vehicle by Model, [" + e.getMessage()
							+ "]");
			}
		}	
		return vehicleList;
	}

/**
 * 
 * @param brand
 * @return List of vehicle object
 * @throws CarDekhoSystemException
 */
public List<Vehicle> getVehiclesByBrand(Connection connection,String brand)
		throws CarDekhoSystemException {
	if (connection != null) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			 preparedStatement = connection.prepareStatement(SELECT_FOR_BRAND_QUERY);
			 preparedStatement.setString(1, brand);
			 resultSet = preparedStatement.executeQuery();
			 vehicleList =ModelHelper.createVehicleList(resultSet);
			 ConnectionManager.closeConnection(connection);
		} catch (SQLException e) {
			throw new CarDekhoSystemException(
					"Could not find Vehicle by Model, [" + e.getMessage()
							+ "]");
		}
	}
	return vehicleList;
}

/**
 * 
 * @return List of vehicle object
 * @throws CarDekhoSystemException
 */
public List<Vehicle> getAllVehicle(Connection connection)
		throws CarDekhoSystemException {
	if (connection != null) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			 preparedStatement = connection.prepareStatement(SELECT_FOR_ALL_QUERY);
			 resultSet = preparedStatement.executeQuery();
			 vehicleList =ModelHelper.createVehicleList(resultSet);
			 ConnectionManager.closeConnection(connection);
		} catch (SQLException e) {
			throw new CarDekhoSystemException(
					"Could not find Vehicle by Model, [" + e.getMessage()
							+ "]");
		}
	}
	return vehicleList;
}

/**
 * 
 * @return List of vehicle object
 * @throws CarDekhoSystemException
 */
public List<Vehicle> getVehicleBrands(Connection connection)
		throws CarDekhoSystemException {
	if (connection != null) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			 preparedStatement = connection.prepareStatement(SELECT_FOR_ALL_MAKE_QUERY);
			 resultSet = preparedStatement.executeQuery();
			 vehicleList =ModelHelper.makeVehicleList(resultSet);
			 ConnectionManager.closeConnection(connection);
		} catch (SQLException e) {
			throw new CarDekhoSystemException(
					"Could not find Vehicle by Model, [" + e.getMessage()
							+ "]");
		}
	}
	return vehicleList;
}	
}
