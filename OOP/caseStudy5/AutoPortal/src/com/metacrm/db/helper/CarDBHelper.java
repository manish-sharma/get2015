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
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *this class is responsible for inserting car into the database
 * @author Riddhi
 */
public class CarDBHelper extends VehicleDBHelper {
	private static String INSERT_CAR_QUERY = "INSERT INTO car (vehicle_id, ac, power_stering, accessory_kit ) VALUES (?, ?, ?, ?)";

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
}
