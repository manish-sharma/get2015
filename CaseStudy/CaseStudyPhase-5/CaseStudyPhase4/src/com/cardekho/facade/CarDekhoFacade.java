package com.cardekho.facade;

import java.sql.Connection;




import java.util.List;

import com.cardekho.CarAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.db.helper.VehicleDBHelper;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;


public class CarDekhoFacade {
	
	public Car createCar(Connection connection, Car car) throws CarDekhoSystemException, CarAlreadyExistsException {
		Car carFromDB = null;
		
		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			carFromDB = (Car) carDBHelper.getCarByModel(connection, car);
			if(carFromDB == null) {
				carDBHelper.create(connection, car);
				carFromDB = (Car) carDBHelper.getCarByModel(connection, car);
			} else {
				throw new CarAlreadyExistsException("Sales Person with email " + car.getModel() + " already exists.");
			}
		} catch (CarDekhoSystemException e) {
			System.out.println("Exception while creating sales person " + e.getMessage());
			throw e;
		}
		return carFromDB;
	}

	public Car getCarByVehicleID(Connection connection, int vehicleId) {
		Car response = null;
		CarDBHelper carDBHelper = new CarDBHelper();
		try {	
			response = (Car) carDBHelper.getCarByVehicleId(connection, vehicleId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return response;	
	}
	
	public void update(Connection connection,Car car) throws CarDekhoSystemException
	{
		CarDBHelper carDBHelper = new CarDBHelper();
		carDBHelper.update(connection, car);
	}
	
	public List<Vehicle> getVehicleByBudget(Connection connection,String budget) throws CarDekhoSystemException
	{
		List<Vehicle> vehicleFromDB = null;
		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		try{
			vehicleFromDB = vehicleDBHelper.getVehiclesByBudget(connection,budget);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return vehicleFromDB;
		
	}
	
	public List<Vehicle> getVehicleBrands (Connection connection)
	throws CarDekhoSystemException
	{
		List<Vehicle> vehicleFromDB = null;
		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		try{
			vehicleFromDB = vehicleDBHelper.getVehicleBrands(connection);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return vehicleFromDB;
		
	}
	
	public List<Vehicle> getAllVehicles (Connection connection)
	throws CarDekhoSystemException
    {
				List<Vehicle> vehicleFromDB = null;
				VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
				try{
					vehicleFromDB = vehicleDBHelper.getAllVehicle(connection);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				return vehicleFromDB;
				
	 }
	
	public List<Vehicle> getVehicleByBrand(Connection connection,String brand) throws CarDekhoSystemException
	{
		List<Vehicle> vehicleFromDB = null;
		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		try{
			vehicleFromDB = vehicleDBHelper.getVehiclesByBrand(connection,brand);
			System.out.println("vehicle list in facade" +vehicleFromDB);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return vehicleFromDB;
		
	}

}

