package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;
import com.cardekho.model.helper.ModelHelper;

public class CarDBHelper extends VehicleDBHelper {

	private static String INSERT_CAR_QUERY = "insert into CAR (VEHICLE_ID, AC, POWER_STEERING, ACCESSORY_KIT, CREATED_BY, CREATED_TIME) VALUES (?, ?, ?, ?, ?, ?)";

	private static String UPDATE_CAR_QUERY = "update CAR set ACCESSORY_KIT=? where VEHICLE_ID=? ";

	private static String SELECT_FOR_DETAIL_QUERY = "Select V.ID, V.MAKE, V.MODEL, V.ENGINE_IN_CC, V.FUEL_CAPACITY, "
			+ " V.MILAGE,  V.PRICE, V.ROAD_TAX, V.ON_ROAD_PRICE, V.IMAGE_URL, C.AC, C.POWER_STEERING,C.ACCESSORY_KIT "
			+ " from CAR C INNER JOIN  VEHICLE V ON V.ID =  C.VEHICLE_ID where C.VEHICLE_ID=?";

	private static String SELECT_CAR_BY_MODEL_QUERY = "Select V.ID, V.MAKE, V.MODEL, V.ENGINE_IN_CC, V.FUEL_CAPACITY, "
			+ " V.MILAGE,  V.PRICE, V.ROAD_TAX, V.ON_ROAD_PRICE, V.IMAGE_URL, C.AC, C.POWER_STEERING,C.ACCESSORY_KIT "
			+ " from CAR C INNER JOIN  VEHICLE V ON V.ID =  C.VEHICLE_ID where V.MODEL=?";

	/**
	 * 
	 * @param car
	 * @return insert status
	 * @throws CarDekhoSystemException
	 */
	public boolean insert(Connection connection, Car car)
			throws CarDekhoSystemException {
		boolean created = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.insert(connection, car);
				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				if (vehicleId > 0) {
					preparedStatement = connection
							.prepareStatement(INSERT_CAR_QUERY);
					preparedStatement.setInt(1, vehicleId);
					preparedStatement.setString(2, car.getAc());
					preparedStatement.setString(3, car.getPowerSteering());
					preparedStatement.setString(4, car.getAccessoryKit());
					preparedStatement.setString(5, car.getCreatedBy());
					preparedStatement.setTimestamp(6, new Timestamp(car
							.getCreatedTime().getTime()));
					created = preparedStatement.execute();
					connection.commit();
				}
			} catch (CarDekhoSystemException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not rollback.");
				}
				throw e;
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not rollback.");
				}
				throw new CarDekhoSystemException("Could not create car, ["
						+ e.getMessage() + "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}
			}
		}

		return created;
	}

	/**
	 * 
	 * @param car
	 * @return update status
	 * @throws CarDekhoSystemException
	 */
	public boolean update(Connection connection, Car car)
			throws CarDekhoSystemException {
		boolean updated = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			System.out.println("5");
			try {
				super.update(connection, car);
				preparedStatement = connection
						.prepareStatement(UPDATE_CAR_QUERY);
				preparedStatement.setString(1, car.getAccessoryKit());
				preparedStatement.setInt(2, car.getId());
				updated = preparedStatement.execute();
				connection.commit();

			} catch (CarDekhoSystemException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw e;
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new CarDekhoSystemException("Could not update car, ["
						+ e.getMessage() + "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}

			}
		}
		System.out.println("6");
		return updated;
	}

	/**
	 * 
	 * @param vehicleID
	 * @return Vehicle object
	 * @throws CarDekhoSystemException
	 */
	public Vehicle getCarByVehicleId(Connection connection, int vehicleID)
			throws CarDekhoSystemException {
		Vehicle vehicle = null;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection
						.prepareStatement(SELECT_FOR_DETAIL_QUERY);
				preparedStatement.setInt(1, vehicleID);
				resultSet = preparedStatement.executeQuery();
				vehicle = ModelHelper.createCar(resultSet);
			} catch (SQLException e) {
				throw new CarDekhoSystemException(
						"Could not find Vehicle by Model, [" + e.getMessage()
								+ "]");
			}
		}
		return vehicle;
	}

	public Vehicle getCarByModel(Connection connection, Car car)
			throws CarDekhoSystemException {
		Vehicle vehicle = null;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection
						.prepareStatement(SELECT_CAR_BY_MODEL_QUERY);
				preparedStatement.setString(1, car.getModel());
				resultSet = preparedStatement.executeQuery();
				vehicle = ModelHelper.createCar(resultSet);
			} catch (SQLException e) {
				throw new CarDekhoSystemException(
						"Could not find Vehicle by Model, [" + e.getMessage()
								+ "]");
			}
		}
		return vehicle;
	}

}
