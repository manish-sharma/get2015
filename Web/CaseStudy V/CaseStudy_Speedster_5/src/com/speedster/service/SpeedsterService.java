package com.speedster.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;



import com.speedster.db.ConnectionManager;
import com.speedster.exception.CarAlreadyExistException;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.fascade.SpeedsterFascade;
import com.speedster.model.Car;
import com.speedster.model.Vehicle;


public class SpeedsterService {
	/**
	 * @param car
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarAlreadyExistException
	 */
	public Car insert(Car car) throws CarDekhoSystemException,
			CarAlreadyExistException {
		Car returnCar = null;
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFacade = new SpeedsterFascade();
		try {
			returnCar = speedsterFacade.insert(connection, car);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}
		return returnCar;
	}
	
	/**
	 * @param vehicleID
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public Vehicle getCarByVehicleId(int vehicleID)
			throws CarDekhoSystemException {
		Vehicle vehicle = null;

		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFacade = new SpeedsterFascade();
		try {
			vehicle = speedsterFacade.getCarByVehicleId(connection, vehicleID);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}
		return vehicle;
	}
	
	/**
	 * @param car
	 * @throws CarDekhoSystemException
	 */
	public void update(Car car) throws CarDekhoSystemException {
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade carDekhoFacade = new SpeedsterFascade();
		try {
			carDekhoFacade.update(connection, car);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}
	}
	
	/**
	 * @param budget
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehiclesByBudget(String budget)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFascade = new SpeedsterFascade();
		try {
			vehicleList = speedsterFascade.getVehiclesByBudget(connection, budget);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}

		return vehicleList;
	}
	
	/**
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehicleBrands()
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFascade = new SpeedsterFascade();
		try {
			vehicleList = speedsterFascade.getVehicleBrands(connection);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}

		return vehicleList;
	}
	
	/**
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getAllVehicle()
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFascade = new SpeedsterFascade();
		try {
			vehicleList = speedsterFascade.getAllVehicle(connection);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}

		return vehicleList;
	}
	
	/**
	 * @param brand
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehiclesByBrand(String brand)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionManager.getConnection();
		SpeedsterFascade speedsterFascade = new SpeedsterFascade();
		try {
			vehicleList = speedsterFascade.getVehiclesByBrand(connection, brand);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionManager.closeConnection(connection);
		}
		return vehicleList;
	}

}


