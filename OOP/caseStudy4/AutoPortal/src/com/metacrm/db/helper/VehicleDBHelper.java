/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacrm.db.helper;
import com.metacrm.exception.*;
import com.metacrm.model.Vehicle;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;


/**
 *
 * @author Riddhi
 */
public class VehicleDBHelper {

    private static String INSERT_VEHICLE_QUERY = "INSERT INTO vehicle (make, model, engineIncc, fuelcapacity, milage, price,road_tax,created_by,created_time,image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static String SELECT_FOR_VEHICLE_ID_QUERY = "SELECT vehicle_id FROM vehicle WHERE make=? AND model=?";
    
    protected void create(Connection connection, Vehicle objVehicle) throws MetaCRMSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1, objVehicle.getMake());
			preparedStatement.setString(2, objVehicle.getModel());
			preparedStatement.setString(3, objVehicle.getEngineInCC());
			preparedStatement.setDouble(4, objVehicle.getFuelCapacity());
			preparedStatement.setDouble(5, objVehicle.getMilage());
			preparedStatement.setDouble(6, objVehicle.getPrice());
			preparedStatement.setDouble(7, objVehicle.getRoadTax());
			preparedStatement.setString(8, "Admin");
			preparedStatement.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setString(10,objVehicle.getImagePath());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new MetaCRMSystemException("Could not create Vehicle, [" + e.getMessage() + "]");
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
    
    protected static int getVehicleIdByMakeModel(Connection connection, String make, String model) throws MetaCRMSystemException {
		int vehicleId = -1;
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_FOR_VEHICLE_ID_QUERY);
				preparedStatement.setString(1, make);
				preparedStatement.setString(2, model);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					vehicleId = resultSet.getInt(1);
				}
			} catch(SQLException e) {
				throw new MetaCRMSystemException("Could not find vehicle id by make and model, [" + e.getMessage() + "]");
			}
		}
		return vehicleId;
	}
    
}
