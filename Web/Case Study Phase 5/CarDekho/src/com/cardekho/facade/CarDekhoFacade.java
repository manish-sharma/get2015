package com.cardekho.facade;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.db.helper.LoginDBHelper;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;

public class CarDekhoFacade {

	public boolean createCar(Connection connection, Car car) throws CarDekhoSystemException {
		boolean carCreated = true;

		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			carCreated = carDBHelper.createCar(connection, car);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while creating car " + e.getMessage());
			throw e;
		}

		return carCreated;
	}

	public boolean updateByModel(Connection connection, Car car, int id) throws CarDekhoSystemException {

		boolean carUpdated = true;
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			carUpdated = carDBHelper.updateByModel(connection, car, id);

		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while updating car " + e.getMessage());
			throw e;
		}

		return carUpdated;
	}

	public Car getCarDetails(Connection connection, int id) throws CarDekhoSystemException {
		Car response = null;
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			response = carDBHelper.getCarDetails(connection,id);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while Getting car details " + e.getMessage());
			throw e;
		}

		return response;
	}

	public List<Vehicle> populateRecentList(Connection connection) throws CarDekhoSystemException {
		List<Vehicle> carList = null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try 
		{
			carList = searchDBHelper.populateRecentList(connection);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while generating list " + e.getMessage());
			throw e;
		}

		return carList;
	}


	public User validateLogin(Connection connection, HttpServletRequest request) throws CarDekhoSystemException {
		User user = null;
		LoginDBHelper loginDBHelper = new LoginDBHelper(); 
		try 
		{
			user = loginDBHelper.validateLogin(connection, request);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while Login " + e.getMessage());
			throw e;
		}

		return user;
	}

	public List<String> populateList(Connection connection) throws CarDekhoSystemException {
		List<String> carList = null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try 
		{
			carList = searchDBHelper.populateList(connection);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while generating List " + e.getMessage());
			throw e;
		}

		return carList;
	}

	public List<Vehicle> searchCar(Connection connection, String make, String model) throws CarDekhoSystemException {
		List<Vehicle> carList = null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try 
		{
			carList = searchDBHelper.searchCar(connection, make, model);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while searching car " + e.getMessage());
			throw e;
		}

		return carList;
	}


	public List<Vehicle> searchCarByBudget(Connection connection, int minBudget, int maxBudget) throws CarDekhoSystemException {
		List<Vehicle> carList = null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try 
		{
			carList = searchDBHelper.searchCarByBudget(connection, minBudget, maxBudget);
		} 
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while searching car " + e.getMessage());
			throw e;
		}

		return carList;
	}
}
