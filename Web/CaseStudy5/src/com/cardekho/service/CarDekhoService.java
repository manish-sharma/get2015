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
 * @author Anjita
 * Class CarDekhoService provides connection to DB Helper Class through CarDekhoFacade Class
 */
public class CarDekhoService {

	/**
	 * @param car
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarAlreadyExistException
	 */
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

	/**
	 * @param vehicleID
	 * @return
	 * @throws CarDekhoSystemException
	 */
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

	/**
	 * @param car
	 * @throws CarDekhoSystemException
	 */
	public void update(Car car) throws CarDekhoSystemException {
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
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
			ConnectionFactory.closeConnection(connection);
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

	/**
	 * @return
	 * @throws CarDekhoSystemException
	 */
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
	
	/**
	 * @return
	 * @throws CarDekhoSystemException
	 */
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
	
	/**
	 * @param brand
	 * @return
	 * @throws CarDekhoSystemException
	 */
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