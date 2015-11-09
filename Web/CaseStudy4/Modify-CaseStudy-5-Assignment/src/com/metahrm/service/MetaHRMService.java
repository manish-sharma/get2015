package com.metahrm.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.CarAlreadyExistsException;
import com.MetaHRMBusinessException;
import com.MetaHRMSystemException;
import com.UserAlreadyExistsException;
import com.db.ConnectionFactory;
import com.metahrm.facade.MetaHRMFacade;
import com.model.Car;
import com.model.User;

public class MetaHRMService {

	public User createUser(User user)
			throws MetaHRMSystemException, UserAlreadyExistsException {
		User returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		MetaHRMFacade facade = new MetaHRMFacade();
		try {
			returnValue = facade.createUser(connection, user);
			
		} catch (MetaHRMSystemException e) {
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

	public User getUserByEmail(User user)
			throws MetaHRMSystemException {
		User returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		MetaHRMFacade facade = new MetaHRMFacade();
		try {
			returnValue = facade.getUserByEmail(connection, user);
		} catch (MetaHRMSystemException e) {
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


	public User getUserByLogin(com.model.Login login) throws MetaHRMSystemException, MetaHRMBusinessException {
		User returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		MetaHRMFacade facade = new MetaHRMFacade();
		try {
			returnValue = facade.getUserByLogin(connection, login);
		} catch (MetaHRMSystemException e) {
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

	public Car createCar(Car car)throws MetaHRMSystemException, CarAlreadyExistsException {
		Car returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		MetaHRMFacade facade = new MetaHRMFacade();
		try {
			returnValue = facade.createCar(connection, car);
		} catch (MetaHRMSystemException e) {
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
	 
	
	
	public Car updateCar(Car car)throws MetaHRMSystemException {
		Car returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		MetaHRMFacade facade = new MetaHRMFacade();
		try {
			returnValue = facade.updateCar(connection ,car);
		} catch (MetaHRMSystemException e) {
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
	public List<Car> getAllCar() throws MetaHRMSystemException, MetaHRMBusinessException {
		List<Car> carList = null ;
		Connection connection = ConnectionFactory.getConnection() ;
		MetaHRMFacade metaHRMFacade = new MetaHRMFacade();
		
		try {
			carList = metaHRMFacade.getAllCar(connection);
		} catch (MetaHRMSystemException m) {
			try {
				connection.rollback();
			} catch (SQLException s) {
				System.out.println("Could not rollback");
			}
			throw m;	
		}
		finally  {
			ConnectionFactory.closeConnection(connection);
		}
		return carList;
	}
}
