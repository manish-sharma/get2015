package com.cardekho.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cardekho.CarAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.facade.CarDekhoFacade;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;



public class CarDekhoService {

	public Car createCar(Car car)
			throws CarDekhoSystemException, CarAlreadyExistsException {
		Car returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.createCar(connection, car);
		} catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not roleback.");
			}
			throw e;
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}

	public Car getCarByVehicleID(int vehicleID)
			throws CarDekhoSystemException {
		Car returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.getCarByVehicleID(connection, vehicleID);
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}
	
	public void update(Car car)
			throws CarDekhoSystemException {
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			facade.update(connection, car);
		}
		catch (CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
	}
	
	public List<Vehicle> getVehicleByBudget(String budget)
			throws CarDekhoSystemException {
		List<Vehicle> returnValue;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.getVehicleByBudget(connection, budget);
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}
	
	public List<Vehicle> getVehicleBrands ()
	throws CarDekhoSystemException
	{
		List<Vehicle> returnValue;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.getVehicleBrands(connection);
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
		
	}
	public List<Vehicle> getAllVehicles ()
			throws CarDekhoSystemException
    {
		List<Vehicle> returnValue;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.getAllVehicles(connection);
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
		
    }
	
	public List<Vehicle> getVehicleByBrand(String brand) throws CarDekhoSystemException
	{
		List<Vehicle> returnValue;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try {
			returnValue = facade.getVehicleByBrand(connection, brand);
			System.out.println("vehicle list in service" +returnValue);
		}finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
		
	}
}
