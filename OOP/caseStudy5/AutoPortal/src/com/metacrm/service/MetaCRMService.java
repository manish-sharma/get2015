package com.metacrm.service;

import java.sql.Connection;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import com.metacrm.db.ConnectionFactory;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.facade.MetaCRMFacade;
import com.metacrm.model.Car;
import com.metacrm.model.User;

public class MetaCRMService {
	
	/**
	 * @param objUser 
	 * 			object of the User model class
	* @return
	 * 			returns the username of the admin
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public String loginAdmin(User objUser) throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		String result = "";
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			result = facade.loginAdmin(connection, objUser);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return result;
	}

	/**
	 * @param objCar
	 * 			object from Car model class
	 * @return
	 * 			returns the number of rows affected by the insert query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public int createCar(Car objCar) throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		int result = -1;
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			result = facade.createCar(connection, objCar);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return result;
	}

	/**
	 * @param objCar
	 * 			object from Car model class
	 * @param oldMake
	 * 			value holds the old make of the car to be edited
	 * @param oldModel
	 * 			value holds the old make of the car to be edited
	 * @return
	 * 			eturns the number of rows affected by the update query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public int editCar(Car objCar, int id)
			throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		int result = -1;
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			result = facade.editCar(connection, objCar, id);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return result;
	}

	/**
	 * @param make
	 * 			value holds the make of the car to be searched
	 * @param model
	 * 			value holds the model of the car to be searched
	 * @param value
	 * 			it holds the value according to which car is to be searched
	 * @return
	 * 			returns the list of the car returned by the select query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public ArrayList<Car> searchCar(String make, String model, String value)
			throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		ArrayList<Car> carList = null;
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			carList = facade.searchCar(connection, make, model, value);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return carList;
	}

	/**
		 * @param make
	 * 			value holds the make of the car for which details is to be displayed
	 * @param model
	 * 			value holds the model of the car for which details is to be displayed
	 * @return
	 * 			returns the list of the car returned by the select query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public ArrayList<Car> carDetails(String make, String model)
			throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		ArrayList<Car> carList = null;
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			carList = facade.carDetails(connection, make, model);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return carList;
	}

	/**
	 * @return
	 * 			returns the JSONObject of the map returned by the select query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public static JSONObject getMap() throws MetaCRMSystemException {
		Connection connection = ConnectionFactory.getConnection();
		JSONObject json = null;
		MetaCRMFacade facade = new MetaCRMFacade();
		try {
			json = facade.getMap(connection);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return json;
	}
}
