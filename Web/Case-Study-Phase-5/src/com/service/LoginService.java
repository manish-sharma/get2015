package com.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.exception.CarDekhoSystemException;
import com.facade.CarDekhoFacade;
import com.facade.LoginFacade;
import com.helper.ConnectionFactory;
import com.model.Car;
import com.model.Vehicle;

public class LoginService {

	public boolean Login(String userId,String password) throws CarDekhoSystemException,LoginException {
		boolean flag =false;
		Connection connection = ConnectionFactory.getConnection();
		LoginFacade loginFacade = new LoginFacade();
		try{
			
		flag = loginFacade.isLoginCorrect(connection , userId , password);
		}catch(CarDekhoSystemException e){
		
			try{
				connection.rollback();
			}catch(SQLException e1){
				System.out.println("Could not Rollback");
			}
			throw e;
		}finally{
			ConnectionFactory.closeConnection(connection);
		}
		return flag;
	}
	public boolean addUser(String userId,String password) throws CarDekhoSystemException {
		boolean flag =false;
		Connection connection = ConnectionFactory.getConnection();
		LoginFacade loginFacade = new LoginFacade();
		try{
		flag = loginFacade.addUser(connection , userId , password);
		}catch(CarDekhoSystemException e){
		
			try{
				connection.rollback();
			}catch(SQLException e1){
				System.out.println("Could not Rollback");
			}
			throw e;
		}finally{
			ConnectionFactory.closeConnection(connection);
		}
		return flag;
	}
}
