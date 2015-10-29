package com.cardekho.facade;

import java.sql.Connection;
import java.util.List;

import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.db.helper.VehicleDBHelper;
import com.cardekho.exception.CarAlreadyExistException;
import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

/**
 * @author Anjita
 * Class CarDekhoFacade provides connection to DB helper class through CarDekhoService Class
 */
public class CarDekhoFacade {

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
		CarDBHelper carDBHelper = new CarDBHelper();
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

		CarDBHelper carDBHelper = new CarDBHelper();

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
		CarDBHelper carDBHelper = new CarDBHelper();

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

		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();

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

		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();

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

		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();

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

		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();

		try {
			vehicleFromDB = vehicleDBHelper.getVehiclesByBrand(connection,
					brand);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vehicleFromDB;
	}
}