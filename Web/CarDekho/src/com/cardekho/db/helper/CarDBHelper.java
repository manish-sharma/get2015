package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

public class CarDBHelper extends VehicleDBHelper {
	
	private static String INSERT_CAR_QUERY = "INSERT INTO car (vehicle_id, ac, power_steering, accessory_kit, created_by, created_time, last_modified_time) VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	private static String CAR_DETAIL_QUERY = "SELECT * FROM car WHERE vehicle_id = ?";
	
	private static String UPDATE_CAR_QUERY = "UPDATE Car SET ac = ?, power_steering =?, accessory_kit = ?,last_modified_time = ? WHERE vehicle_id = ?";
//	private static String SELECT_FOR_MDOEL_QUERY = "SELECT vehicle.id vehicle_id, vehicle.make make, vehicle. LAST_NAME, EMP.SALARY SALARY, "
//			+ " SP.ID ID, SP.BONUS_PER_CLIENT BONUS_PER_CLIENT, SP.CREATED_BY CREATED_BY, SP.CREATED_TIME CREATED_TIME "
//			+ " from SALES_PERSON SP INNER JOIN  EMPLOYEE EMP ON SP.EMPLOYEE_ID =  EMP.ID where EMP.EMAIL_ID=?";
	
	public boolean create(Car car) throws CarDekhoSystemException {
		boolean created = false;
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.create(connection, car);

				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				if(vehicleId > 0) {
					preparedStatement = connection.prepareStatement(INSERT_CAR_QUERY);
					preparedStatement.setInt(1, vehicleId);
					preparedStatement.setString(2, car.getAC());
					preparedStatement.setString(3, car.getPowerSteering());
					preparedStatement.setString(4, car.getAccessoryKit());
					preparedStatement.setString(5, car.getCreatedBy());
					preparedStatement.setTimestamp(6, new Timestamp(car.getCreatedTime().getTime()));
					preparedStatement.setTimestamp(7, new Timestamp(car.getLastModifiedTime().getTime()));
					created = preparedStatement.execute();
					connection.commit();
				}
			} catch(CarDekhoSystemException e) {
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
				throw new CarDekhoSystemException("Could not create Car, [" + e.getMessage() + "]");
			} finally {
				if(preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return created;
	}
	
	public boolean updateByModel(Car car, int id) throws CarDekhoSystemException {
		boolean created = false;
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				System.out.println("Model1 : "+id);
				super.updateByModel(connection, car, id);
				int vehicleId = id;//getVehicleIdByModel(connection, id);
				System.out.println("Update Id : "+vehicleId);
				if(vehicleId > 0) {
					preparedStatement = connection.prepareStatement(UPDATE_CAR_QUERY);
					preparedStatement.setString(1, car.getAC());
					preparedStatement.setString(2, car.getPowerSteering());
					preparedStatement.setString(3, car.getAccessoryKit());
					preparedStatement.setTimestamp(4, new Timestamp(car.getLastModifiedTime().getTime()));
					preparedStatement.setInt(5, vehicleId);
					created = preparedStatement.execute();
					connection.commit();
				} 
			} catch(CarDekhoSystemException e) {
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
					throw new CarDekhoSystemException("Could not update Car, [" + e.getMessage() + "]");
				} finally {
					if(preparedStatement != null) {
						try {
							preparedStatement.close();
						} catch (SQLException e) {
							System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
						}
					}
					ConnectionFactory.closeConnection(connection);
				}
			}

		return false;
	}
	
	public Car getCarDetails(int id) throws CarDekhoSystemException {
		Car car = null;
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) {
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				car = (Car) super.getVehicleDetails(connection, id);
				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				if(vehicleId > 0) {
					preparedStatement = connection.prepareStatement(CAR_DETAIL_QUERY);
					preparedStatement.setInt(1, vehicleId);
					resultSet = preparedStatement.executeQuery();
					if(resultSet.next()) {
						car.setAC(resultSet.getString("ac"));
						car.setPowerSteering(resultSet.getString("power_steering"));
						car.setAccessoryKit(resultSet.getString("accessory_kit"));
						System.out.println(car);
					}
				}
			} catch(CarDekhoSystemException e) {
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
				throw new CarDekhoSystemException("Could not Show Details, [" + e.getMessage() + "]");
			} finally {
				if(preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		System.out.println("1: "+car);
		return car;
	}
}
