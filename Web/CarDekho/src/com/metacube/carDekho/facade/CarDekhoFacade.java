package com.metacube.carDekho.facade;

import java.sql.Connection;
import java.util.List;

import com.metacube.carDekho.CarDekhoException;
import com.metacube.carDekho.CarIsNotExistException;
import com.metacube.carDekho.ModelAlreadyExists;
import com.metacube.carDekho.db.helper.CarJDBCHelper;
import com.metacube.carDekho.db.helper.VehicleJDBCHelper;
import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;


public class CarDekhoFacade {
		
	public Car create(Connection connection, Car car) throws ModelAlreadyExists, CarDekhoException {
		Car createdCar= null;
		CarJDBCHelper carJDBCHelper = new CarJDBCHelper();
		try {
			createdCar = (Car) carJDBCHelper.searchCarByModel(connection, car.getModel());
			if(createdCar == null) {
				carJDBCHelper.create(connection, car) ;
				createdCar = (Car) carJDBCHelper.searchCarByModel(connection, car.getModel());
			} else{
				throw new ModelAlreadyExists("This model "+car.getModel()+" is already exist ");
			}
		} catch(CarDekhoException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return createdCar;
	}
	
	public Car update(Connection connection, Car car) throws CarDekhoException, CarIsNotExistException {
		Car createdCar= null;
		CarJDBCHelper carJDBCHelper = new CarJDBCHelper();
		try {
			createdCar = (Car) carJDBCHelper.searchCarByModel(connection, car.getModel());
			if(createdCar == null) {
				throw new CarIsNotExistException("This model "+car.getModel()+" is already exist ");
				
			} else{
				carJDBCHelper.update(connection, car) ;
				createdCar = (Car) carJDBCHelper.searchCarByModel(connection, car.getModel());
			}
		} catch(CarDekhoException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return createdCar;
		
	}
	
	public List<Vehicle> searchAllCar(Connection connection) {
		List<Vehicle> vehicles = null;
		CarJDBCHelper carJDBCHelper = new CarJDBCHelper();
		
			vehicles = carJDBCHelper.searchAllCar(connection);			
		return vehicles;
	}
	
	public List<Vehicle> searchCarsByMake(Connection connection, String make) {
		List<Vehicle> vehicles = null;
		CarJDBCHelper carJDBCHelper = new CarJDBCHelper();
		
			vehicles = carJDBCHelper.searchCarsByMake(connection, make);			
		return vehicles;
	}
	public Vehicle searchCarByModel(Connection connection, String model) {
		Vehicle vehicle = null;
		CarJDBCHelper carJDBCHelper = new CarJDBCHelper();
		
			vehicle= carJDBCHelper.searchCarByModel(connection, model);			
		return vehicle;
	}
	
	public List<String> searchMakes(Connection connection) {
		VehicleJDBCHelper vehicleJDBCHelper = new VehicleJDBCHelper();
		List<String> makes = vehicleJDBCHelper.searchMakes(connection);
		return makes;
	}
}
