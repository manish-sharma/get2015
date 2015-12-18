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
 * Facade provides a layer between service and database that is dbHelper
 *
 */
public class CarDekhoFacade {

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

	public void update(Connection connection, Car car)
			throws CarDekhoSystemException {
		System.out.println("4");
		CarDBHelper carDBHelper = new CarDBHelper();

		carDBHelper.update(connection, car);
		System.out.println("7");
	}

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