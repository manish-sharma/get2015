package com.cardekho.service;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.facade.CarDekhoFacade;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;

public class CarDekhoService {
	
	public boolean createCar(Car car) throws CarDekhoSystemException 
	{
		boolean carCreated = true;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carCreated  = facade.createCar(connection, car);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carCreated;
	}
	
	public boolean updateByModel(Car car , int id) throws CarDekhoSystemException 
	{
		boolean carUpdated = true;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carUpdated = facade.updateByModel(connection, car,id);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carUpdated;
	}
	
	public Car getCarDetails(int id) throws CarDekhoSystemException 
	{
		Car returnvalue = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			returnvalue = facade.getCarDetails(connection,id);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return returnvalue;
	}
	
	public List<Vehicle> populateRecentList() throws CarDekhoSystemException 
	{
		List<Vehicle> carList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carList = facade.populateRecentList(connection);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carList;
	}
	
	public User validateLogin(HttpServletRequest request) throws CarDekhoSystemException 
	{
		User user = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			user = facade.validateLogin(connection, request);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return user;
	}
	
	public List<String> populateList() throws CarDekhoSystemException 
	{
		List<String> carList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carList = facade.populateList(connection);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carList;
	}
	
	public List<Vehicle> searchCar(String make, String model) throws CarDekhoSystemException 
	{
		List<Vehicle> carList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carList = facade.searchCar(connection,make,model);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carList;
	}
	
	
	public List<Vehicle> searchCarByBudget(int minBudget, int maxBudget) throws CarDekhoSystemException 
	{
		List<Vehicle> carList = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			carList = facade.searchCarByBudget(connection,minBudget,maxBudget);
		} 
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		
		return carList;
	}
}
