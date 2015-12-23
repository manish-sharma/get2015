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
 *This class is responsible for inserting vehicle into the vehicle table
 * @author Riddhi
 */
public class VehicleDBHelper {

	 private static String UPDATE_VEHICLE_QUERY = "UPDATE vehicle SET engineIncc = ?, fuelcapacity = ?, milage = ?, price = ?, road_tax = ?, image = ? WHERE vehicle_id = ?";
	 
    private static String INSERT_VEHICLE_QUERY = "INSERT INTO vehicle (make, model, engineIncc, fuelcapacity, milage, price,road_tax,created_by,created_time,image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static String SELECT_FOR_VEHICLE_ID_QUERY = "SELECT vehicle_id FROM vehicle WHERE make=? AND model=?";
    
    public void create(Connection connection, Vehicle objVehicle) throws MetaCRMSystemException {
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
			//calls the insert vehicle query in the system
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
    
    //return vehicle id based on make and model
    public static int getVehicleIdByMakeModel(Connection connection, String make, String model) throws MetaCRMSystemException {
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
    
   
	protected int edit(Connection connection, Vehicle objVehicle,
			int id) throws MetaCRMSystemException {
		PreparedStatement preparedStatement = null;
		// get the vehicle id of the vehicle to be updated
		int vehicleId = id;

		try {
			preparedStatement = connection
					.prepareStatement(UPDATE_VEHICLE_QUERY);
			preparedStatement.setString(1, objVehicle.getEngineInCC());
			preparedStatement.setDouble(2, objVehicle.getFuelCapacity());
			preparedStatement.setDouble(3, objVehicle.getMilage());
			preparedStatement.setDouble(4, objVehicle.getPrice());
			preparedStatement.setDouble(5, objVehicle.getRoadTax());
			preparedStatement.setString(6, objVehicle.getImagePath());
			preparedStatement.setInt(7, vehicleId);
			// calls update query of the system
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new MetaCRMSystemException("Could not update Vehicle, ["
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
		return vehicleId;
	}

    
}
