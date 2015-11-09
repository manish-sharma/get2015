package com.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.MetaHRMSystemException;
import com.model.Vehicle;


public class VehicleDBHelper {
	
	private static String INSERT_VEHICLE_QUERY = "INSERT INTO vehicle (make, model, engine_in_cc, fuel_capacity, milage, price, road_tax, created_by ,created_time )" 
    		+ "values(?,?,?,?,?,?,?,?,?)";
	private static String UPDATE_VEHICLE_QUERY ="UPDATE vehicle SET make =? , model=? ,engine_in_cc =? ,fuel_capacity =? ,milage =? , "
			+ "price =? ,road_tax =? ,created_by =? WHERE vehicle_id = ?";
	
	protected void createVehicle(Connection connection, Vehicle vehicle) throws MetaHRMSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setDouble(3, vehicle.getEngineInCC());
			preparedStatement.setDouble(4, vehicle.getFuelCapacity());
			preparedStatement.setDouble(5, vehicle.getMilage());
			preparedStatement.setDouble(6, vehicle.getPrice());
			preparedStatement.setDouble(7, vehicle.getRoadTax());
			preparedStatement.setString(8, vehicle.getCreatedBy());
			preparedStatement.setTimestamp(9,  new Timestamp(vehicle.getCreatedTime().getTime()));
	
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new MetaHRMSystemException("Could not create Vehicle, [" + e.getMessage() + "]");
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
	
	
	protected void updateVehicle(Connection connection, Vehicle vehicle) throws MetaHRMSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(UPDATE_VEHICLE_QUERY);
			preparedStatement.setString(1, vehicle.getMake());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setDouble(3, vehicle.getEngineInCC());
			preparedStatement.setDouble(4, vehicle.getFuelCapacity());
			preparedStatement.setDouble(5, vehicle.getMilage());
			preparedStatement.setDouble(6, vehicle.getPrice());
			preparedStatement.setDouble(7, vehicle.getRoadTax());
			preparedStatement.setString(8, vehicle.getCreatedBy());
			preparedStatement.setInt(9 , vehicle.getId());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new MetaHRMSystemException("Could not update Vehicle, [" + e.getMessage() + "]");
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
