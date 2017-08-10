package com.speedster.fascade;

import java.sql.Connection;
import java.util.List;

import com.speedster.db.helper.CarDAO;
import com.speedster.db.helper.VehicleDAO;
import com.speedster.exception.CarAlreadyExistException;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Car;
import com.speedster.model.Vehicle;



public class SpeedsterFascade {
	/**
	 * @param connection
	 * @param car
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarAlreadyExistException
	 */
	public Car insert(Connection connection, Car car)
			throws CarDekhoSystemException, CarAlreadyExistException {
		Car carFromDB = null;
		CarDAO carDBHelper = new CarDAO();
		try {
			carFromDB = (Car) carDBHelper.getCarByModel(connection, car);
			if (carFromDB == null) {
				carDBHelper.insert(connection, car);
				carFromDB = (Car) carDBHelper.getCarByModel(connection, car);
			} else {
				throw new CarAlreadyExistException("car with model "
						+ car.getModel() + " already exists.");
			}
		} catch (CarDekhoSystemException e) {
			System.out
					.println("Exception while creating car " + e.getMessage());
			throw e;
		}
		return carFromDB;
	}
	
	/**
	 * @param connection
	 * @param vehicleID
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public Vehicle getCarByVehicleId(Connection connection, int vehicleID)
			throws CarDekhoSystemException {

		Vehicle vehicleFromDB = null;
		CarDAO carDBHelper = new CarDAO();
		try {
			vehicleFromDB = carDBHelper
					.getCarByVehicleId(connection, vehicleID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vehicleFromDB;
	}
	
	/**
	 * @param connection
	 * @param car
	 * @throws CarDekhoSystemException
	 */
	public void update(Connection connection, Car car)
			throws CarDekhoSystemException {
		CarDAO carDBHelper = new CarDAO();

		carDBHelper.update(connection, car);
	}

	/**
	 * @param connection
	 * @param budget
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehiclesByBudget(Connection connection,
			String budget) throws CarDekhoSystemException {
		List<Vehicle> vehicleFromDB = null;

		VehicleDAO vehicleDBHelper = new VehicleDAO();

		try {
			vehicleFromDB = vehicleDBHelper.getVehiclesByBudget(connection,
					budget);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vehicleFromDB;
	}

	/**
	 * @param connection
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehicleBrands(Connection connection)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleFromDB = null;

		VehicleDAO vehicleDBHelper = new VehicleDAO();

		try {
			vehicleFromDB = vehicleDBHelper.getVehicleBrands(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vehicleFromDB;
	}

	/**
	 * @param connection
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getAllVehicle(Connection connection)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleFromDB = null;

		VehicleDAO vehicleDBHelper = new VehicleDAO();

		try {
			vehicleFromDB = vehicleDBHelper.getAllVehicle(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vehicleFromDB;
	}

	/**
	 * @param connection
	 * @param brand
	 * @return
	 * @throws CarDekhoSystemException
	 */
	public List<Vehicle> getVehiclesByBrand(Connection connection, String brand)
			throws CarDekhoSystemException {
		List<Vehicle> vehicleFromDB = null;

		VehicleDAO vehicleDBHelper = new VehicleDAO();

		try {
			vehicleFromDB = vehicleDBHelper.getVehiclesByBrand(connection,
					brand);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vehicleFromDB;
	}
}
