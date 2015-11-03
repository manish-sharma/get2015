package com.metacrm.facade;

import java.sql.Connection;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import com.metacrm.db.helper.CarDBHelper;
import com.metacrm.db.helper.EditCarDBHelper;
import com.metacrm.db.helper.LoginDBHelper;
import com.metacrm.db.helper.SearchDBHelper;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;
import com.metacrm.model.User;

/**
 * This is class is responsible for getting data from db helper classes
 * @author Riddhi
 *
 */
public class MetaCRMFacade {

	
	/**
	 * @param connection 
	 * 			connection object from service class
	 * @param objUser
	 * 			object from User model class
	 * @return
	 * 			returns the username of the admin
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public String loginAdmin(Connection connection, User objUser)
			throws MetaCRMSystemException {
		String response = "";
		LoginDBHelper objOfLoginDBHelper = new LoginDBHelper();
		response = objOfLoginDBHelper.authenticate(connection, objUser);
		return response;
	}

	/**
	 * @param connection
	 * 			connection object from service class
	 * @param objCar
	 * 			object from Car model class
	 * @return
	 * 			returns the number of rows affected by the insert query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public int createCar(Connection connection, Car objCar)
			throws MetaCRMSystemException {
		int result = -1;
		CarDBHelper objOfCarDBHelper = new CarDBHelper();
		result = objOfCarDBHelper.create(connection, objCar);
		return result;
	}
	
	/**
	 *@param connection
	 * 			connection object from service class
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
	public int editCar(Connection connection, Car objCar,String oldMake, String oldModel)
			throws MetaCRMSystemException {
		int result = -1;
		EditCarDBHelper objOfEditCarDBHelper = new EditCarDBHelper();
		result = objOfEditCarDBHelper.create(connection, objCar,oldMake,oldModel);
		return result;
	}

	/**
	 *@param connection
	 * 			connection object from service class
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
	public ArrayList<Car> searchCar(Connection connection, String make,
			String model, String value) throws MetaCRMSystemException {
		ArrayList<Car> carList = null;
		SearchDBHelper objOfSeachDBHelper = new SearchDBHelper();
		if (value.equals("brand")) {
			carList = objOfSeachDBHelper.getDetailsByBrand(connection, make,
					model);
		} else if (value.equals("budget")) {
			carList = objOfSeachDBHelper.getDetailsByBudget(connection, make,
					model);
		}
		return carList;
	}

	/**
	 *@param connection
	 * 			connection object from service class
	 * @param make
	 * 			value holds the make of the car for which details is to be displayed
	 * @param model
	 * 			value holds the model of the car for which details is to be displayed
	 * @return
	 * 			returns the list of the car returned by the select query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public ArrayList<Car> carDetails(Connection connection, String make,
			String model) throws MetaCRMSystemException {
		ArrayList<Car> carList = null;
		SearchDBHelper objOfSeachDBHelper = new SearchDBHelper();
		carList = objOfSeachDBHelper.getDetailsByBrand(connection, make, model);
		return carList;
	}
	
	/**
	 *@param connection
	 * 			connection object from service class
	 * @return
	 * 			returns the JSONObject of the map returned by the select query
	 * @throws MetaCRMSystemException
	 * 			throws MetaCRMException if any error occurs while fetching values from database
	 */
	public JSONObject getMap(Connection connection) throws MetaCRMSystemException{
		JSONObject json = null;
		SearchDBHelper objOfSearchDBHelper = new SearchDBHelper();
		json = objOfSearchDBHelper.getMap(connection);
		return json;
	}
}
