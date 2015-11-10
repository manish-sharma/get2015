/*
 * This class provides service method 
 * It will create connection for facade to interact with database
 * @author Banwari Kevat
 * @name CarService
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConnectionUtil;
import dao.Helper;
import facade.CarFacade;
import model.Car;
import model.User;

public class CarService {
    
	/*
	 * @name getUserByUserId
	 * @param userId is the id of user
	 * @return User class object
	 */
	public User getUserByUserId(String userId)
	{
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		User user = carFacade.getUserByUserId(userId, connection);
		
		return user;
	}
	
	/*
	 * @name insertCar
	 * @param car is the object of car which will be insert into database
	 * @return message about operation is successful or not
	 */
	public static String insertCar(Car car) {
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		String message = carFacade.insertCar(car, connection);
		
		return message;
	    
   }
	
	/*
	 * @name editCar
	 * @param car is the object of car which will be edit in database
	 * @return message
	 */
	public static String editCar(Car car) {
    
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		String message = carFacade.editCar(car, connection);
		
		return message;
	}
	
	/*
	 * @name distinctMake
	 * @return list of array of distinct model name
	 */
	public List<String> distinctMake() 
	{   
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		List<String> make = carFacade.distinctMake(connection);
		
		return make;
	}
	
	/*
	 * @name getModelList
	 * @param make
	 * @return list of model of specified make
	 */
	public List<String> getModelList(String make) 
	{   
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		List<String> modelList =carFacade.getModelList(make, connection);
		
		return modelList;
	}
	
	/*
	 * @name getInfoByModel
	 * @param model
	 * @return all info related to model in form of string array 
	 */
	public String[] getInfoByModel(String model ) 
	{   
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getDbConnection();
		CarFacade carFacade = new CarFacade();
		String[] infoList = carFacade.getInfoByModel(model, connection);
	
		return infoList;
	}
 }
