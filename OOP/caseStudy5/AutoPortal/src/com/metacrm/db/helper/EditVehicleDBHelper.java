package com.metacrm.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Vehicle;

/**
 * This class is responsible for updating vehicle entry in the database
 * 
 * @author Riddhi
 *
 */
public class EditVehicleDBHelper {
	private static String INSERT_VEHICLE_QUERY = "UPDATE vehicle SET make = ?, model = ?, engineIncc = ?, fuelcapacity = ?, milage = ?, price = ?, road_tax = ?, image = ? WHERE vehicle_id = ?";

	private static String SELECT_FOR_VEHICLE_ID_QUERY = "SELECT vehicle_id FROM vehicle WHERE make=? AND model=?";

	protected int create(Connection connection, Vehicle objVehicle,
			String oldMake, String oldModel) throws MetaCRMSystemException {
		PreparedStatement preparedStatement = null;
		// get the vehicle id of the vehicle to be updated
		int vehicleId = getVehicleIdByMakeModel(connection, oldMake, oldModel);

		try {
			preparedStatement = connection
					.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1, objVehicle.getMake());
			preparedStatement.setString(2, objVehicle.getModel());
			preparedStatement.setString(3, objVehicle.getEngineInCC());
			preparedStatement.setDouble(4, objVehicle.getFuelCapacity());
			preparedStatement.setDouble(5, objVehicle.getMilage());
			preparedStatement.setDouble(6, objVehicle.getPrice());
			preparedStatement.setDouble(7, objVehicle.getRoadTax());
			preparedStatement.setString(8, objVehicle.getImagePath());
			preparedStatement.setInt(9, vehicleId);
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

	protected int getVehicleIdByMakeModel(Connection connection,
			String oldMake, String oldModel) throws MetaCRMSystemException {
		int vehicleId = -1;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection
						.prepareStatement(SELECT_FOR_VEHICLE_ID_QUERY);
				preparedStatement.setString(1, oldMake);
				preparedStatement.setString(2, oldModel);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					vehicleId = resultSet.getInt(1);
				}
			} catch (SQLException e) {
				throw new MetaCRMSystemException(
						"Could not find vehicle id by make and model, ["
								+ e.getMessage() + "]");
			}
		}
		return vehicleId;
	}

}
