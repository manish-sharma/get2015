/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacrm.db.helper;

import com.metacrm.db.ConnectionFactory;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *this class is responsible for inserting car into the database
 * @author Riddhi
 */
public class CarDBHelper extends VehicleDBHelper {
	private static String INSERT_CAR_QUERY = "INSERT INTO car (vehicle_id, ac, power_stering, accessory_kit ) VALUES (?, ?, ?, ?)";
	
	private static String UPDATE_CAR_QUERY = "UPDATE car SET  ac=?, power_stering=?, accessory_kit=? WHERE car_id=?";

	private static String SELECT_FOR_CAR_ID_QUERY = "SELECT car_id FROM car WHERE vehicle_id=?";


	public int create(Connection connection,Car objCar) throws MetaCRMSystemException {
		int created = -1;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				//calls the vehicle db helper create function
				super.create(connection, objCar);
				//gets the vehicle id of the vehicle object created
				int vehicleId = getVehicleIdByMakeModel(connection,
						objCar.getMake(), objCar.getModel());
				//if vehicle is inserted than car is also inserted in the car database
				if (vehicleId > 0) {
					preparedStatement = connection
							.prepareStatement(INSERT_CAR_QUERY);
					preparedStatement.setInt(1, vehicleId);
					preparedStatement.setBoolean(2, objCar.isAC());
					preparedStatement.setBoolean(3, objCar.isPowerSteering());
					preparedStatement.setBoolean(4, objCar.isAccessoryKit());
					created = preparedStatement.executeUpdate();
				}
			} catch (SQLException e) {
				
				throw new MetaCRMSystemException(
						"Could not create SalesPerson, [" + e.getMessage()
								+ "]");
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
				ConnectionFactory.closeConnection(connection);
			}
		}
		return created;
	}
	
	public int edit(Connection connection,Car objCar, int id)
			throws MetaCRMSystemException {
		int created = -1;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				// get the vehicle id of the vehicle to be updated
				super.edit(connection, objCar,id);
				//gets the car id of the car to be updated
				int carId = getCarIdByVehicleId(connection, id);
				if (carId > 0) {
					preparedStatement = connection
							.prepareStatement(UPDATE_CAR_QUERY);
					preparedStatement.setBoolean(1, objCar.isAC());
					preparedStatement.setBoolean(2, objCar.isPowerSteering());
					preparedStatement.setBoolean(3, objCar.isAccessoryKit());
					preparedStatement.setInt(4, carId);
					created = preparedStatement.executeUpdate();
				}
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Could not roleback.");
				}
				throw new MetaCRMSystemException("Could not update car, ["
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
				ConnectionFactory.closeConnection(connection);
			}
		}
		return created;
	}

	//function used to get the car id from the car table by vehicle id
	protected int getCarIdByVehicleId(Connection connection, int vehicleId)
			throws MetaCRMSystemException {
		int carId = -1;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection
						.prepareStatement(SELECT_FOR_CAR_ID_QUERY);
				preparedStatement.setInt(1, vehicleId);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					carId = resultSet.getInt(1);
				}
			} catch (SQLException e) {
				throw new MetaCRMSystemException(
						"Could not find car id by vehicle id, ["
								+ e.getMessage() + "]");
			}
		}
		return carId;
	}
}
