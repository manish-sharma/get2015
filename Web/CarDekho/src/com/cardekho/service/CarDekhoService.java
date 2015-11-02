package com.cardekho.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.facade.CarDekhoFacade;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;

public class CarDekhoService
{
	

public static Car createCar(Car car)
		throws CarDekhoSystemException,CarDekhoAlreadyExistsException {
	Car returnValue = null;
	java.sql.Connection connection = ConnectionFactory.getConnection();
	CarDekhoFacade facade = new CarDekhoFacade();
	
	try {
		returnValue = facade.createCar(connection, car);
	} finally {
		ConnectionFactory.closeConnection(connection);
	}
	return returnValue;

}

public static User validateLogin(HttpServletRequest request)
		throws CarDekhoSystemException,CarDekhoAlreadyExistsException {
	User returnValue = null;
	java.sql.Connection connection = ConnectionFactory.getConnection();
	CarDekhoFacade facade = new CarDekhoFacade();
	
	try {
		System.out.println("user");
		returnValue = facade.validateLogin(request);
	} finally {
		ConnectionFactory.closeConnection(connection);
	}
	return returnValue;

}
public static List<Vehicle>  searchCar(String Make, String Model) throws CarDekhoSystemException
{
	 List<Vehicle> returnValue =null;
	java.sql.Connection connection = ConnectionFactory.getConnection();
	CarDekhoFacade facade = new CarDekhoFacade();
	try
	{
		System.out.println("search implemented");
		returnValue = facade.searchCar(Make,Model);
	}
	finally {
		ConnectionFactory.closeConnection(connection);
	}
	return returnValue;
	
}

}