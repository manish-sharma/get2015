package com.metahrm.facade;

import java.sql.Connection;
import java.util.List;

import com.CarAlreadyExistsException;
import com.MetaHRMBusinessException;
import com.MetaHRMSystemException;
import com.UserAlreadyExistsException;
import com.db.helper.CarDBHelper;
import com.db.helper.UserDBHelper;
import com.model.Car;
import com.model.Login;
import com.model.User;

public class MetaHRMFacade {
	
	public User createUser(Connection connection, User user) throws MetaHRMSystemException, UserAlreadyExistsException {
		User userFromDB = null;
		
		UserDBHelper userDBHelper = new UserDBHelper();
		try {
			userFromDB = userDBHelper.getUserByEmailId(connection, user);
			if(userFromDB == null) {
				userDBHelper.create(connection, user);
				userFromDB = userDBHelper.getUserByEmailId(connection, user);
			} else {
				throw new UserAlreadyExistsException("User Person with email " + user.getEmail() + " already exists.");
			}
		} catch (MetaHRMSystemException e) {
			System.out.println("Exception while creating User " + e.getMessage());
			throw e;
		}
		return userFromDB;
	}

	public User getUserByEmail(Connection connection, User user) throws MetaHRMSystemException {
		User response = null;
		UserDBHelper userDBHelper = new UserDBHelper();
		try {	
			response = userDBHelper.getUserByEmailId(connection, user);
		} catch(MetaHRMSystemException e) {
			System.out.println("Exception while creating user" + e.getMessage());
			throw e;
		}
		return response;	
	}
	
	public User getUserByLogin(Connection connection ,Login login) throws MetaHRMBusinessException, MetaHRMSystemException{
		User response = null;
		UserDBHelper userDBHelper = new UserDBHelper();
	
			try {
				response = userDBHelper.getUserByLogin(connection,login);
				if(response==null)
					throw new MetaHRMBusinessException("USer is incorrect id or password");
			} catch (MetaHRMSystemException e) {
				System.out.println("Exception while checking login id and password");
				throw e ;
			}
		
		
	
	
		return response;
		}

	public Car createCar(Connection connection, Car car) throws CarAlreadyExistsException, MetaHRMSystemException {

		Car carFromDB = null;

		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			carFromDB = carDBHelper.getCarByModel(connection, car);
			
			if (carFromDB == null) {
				carDBHelper.createCar(connection, car);
				carFromDB = carDBHelper.getCarByModel(connection, car);
			} else {
				throw new CarAlreadyExistsException("Car with model"
						+ car.getModel()+ " already exists.");
			}
		} catch (MetaHRMSystemException e) {
			String message ="Exception while creating Car "
					+ e.getMessage() ;
			System.out.println(message);
			throw new MetaHRMSystemException(message);
		}
		return carFromDB;
	}
	
	public Car updateCar(Connection connection, Car car) throws MetaHRMSystemException {

		Car carFromDB = null;

		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			carDBHelper.updateCar(connection, car);
			carFromDB = carDBHelper.getCarByModel(connection, car);
			}catch (MetaHRMSystemException e) {
			String message ="Exception while updating Car "+ e.getMessage() ;
			System.out.println(message);
			throw new MetaHRMSystemException(message);
		}
		return carFromDB;
	}
	
	public List<Car> getAllCar(Connection connection) throws MetaHRMBusinessException, MetaHRMSystemException {
		List<Car> listOfCar = null ;
		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			listOfCar  = carDBHelper.getAllCar(connection);
			if(listOfCar == null) {
				throw new MetaHRMBusinessException("Does not have any car in the system database");
			}
		}
		catch(MetaHRMSystemException e) {
			throw new MetaHRMSystemException("Exception while getting all car" +e.getMessage());
		}
		return listOfCar;
	}

}
