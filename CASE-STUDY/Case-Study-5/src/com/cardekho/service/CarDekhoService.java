package com.cardekho.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cardekho.db.ConnectionFactory;
import com.cardekho.exception.CarAlreadyExistException;
import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.facade.CarDekhoFacade;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

/**
 * Service provides a layer between controller and facade 
 *
 */
public class CarDekhoService {

	public Car insert(Car car) throws CarDekhoSystemException,
			CarAlreadyExistException {
		Car returnCar = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			returnCar = carDekhoFacade.insert(connection, car);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnCar;
	}

	public Vehicle getCarByVehicleId(int vehicleID)
			throws CarDekhoSystemException {
		Vehicle vehicle = null;

		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			vehicle = carDekhoFacade.getCarByVehicleId(connection, vehicleID);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return vehicle;
	}

	public void update(Car car) throws CarDekhoSystemException {
		System.out.println("2");
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			System.out.println("3");
			carDekhoFacade.update(connection, car);
			System.out.println("8");
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
	}

	public List<Vehicle> getVehiclesByBudget(String budget)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			vehicleList = carDekhoFacade.getVehiclesByBudget(connection, budget);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return vehicleList;
	}

	public List<Vehicle> getVehicleBrands()
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			vehicleList = carDekhoFacade.getVehicleBrands(connection);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return vehicleList;
	}
	
	public List<Vehicle> getAllVehicle()
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			vehicleList = carDekhoFacade.getAllVehicle(connection);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return vehicleList;
	}
	
	
	public List<Vehicle> getVehiclesByBrand(String brand)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try {
			vehicleList = carDekhoFacade.getVehiclesByBrand(connection, brand);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return vehicleList;
	}

}