package com.cardekho.facade;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.db.helper.LoginDBHelper;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.db.helper.VehicleDBHelper;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;


public class CarDekhoFacade
{

	public Car createCar(Connection connection, Car car) throws CarDekhoSystemException, CarDekhoAlreadyExistsException {
		Car carFromDB = null;
		
		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			
				carDBHelper.create(car,connection);
			
		
		} catch (CarDekhoSystemException e) {
			System.out.println("Exception while creating car" + e.getMessage());
			throw e;
		}
		return carFromDB;
	}
	
	public User validateLogin(HttpServletRequest request) throws CarDekhoSystemException 
	{
		User admin = new User();
		LoginDBHelper validate = new LoginDBHelper();
		try
		{
			
					if(validate.validateLogin(request)!=null)
					{
						admin= validate.validateLogin(request);
					}
					else
					{
						admin= null;
					}
		}
		catch(CarDekhoSystemException e)
		{
			System.out.println("Exception during validation " + e.getMessage());
		}
		return admin;
	}



	public List<Vehicle> searchCar(String make, String model)
	{
		List<Vehicle> returnValue =null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try
		{
			returnValue=searchDBHelper.searchCar(make, model);
		}
		catch(CarDekhoSystemException e)
		{
			System.out.println("Exception during search " + e.getMessage());
		}
		
		
		return returnValue;
	}
}
