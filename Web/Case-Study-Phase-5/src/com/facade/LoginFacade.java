package com.facade;

import java.sql.Connection;
import com.exception.CarDekhoSystemException;
import com.exception.CarDekhoUserAlreadyExist;
import com.exception.CarDekhologinException;
import com.helper.DBHelper;


public class LoginFacade {

	public boolean isLoginCorrect(Connection connection, String userId,
			String password) throws CarDekhoSystemException{
		 boolean flag = false;
		 try{ 
			 flag = DBHelper.isLogInCorrect(connection, userId, password);
			
           if(!flag){
        	   throw new CarDekhologinException("User with id " + userId + " can not login.");
           }

			 
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while Login " + e.getMessage());
				throw e;
			}
		
		return flag;
	}

	public boolean addUser(Connection connection, String userId, String password) throws CarDekhoSystemException,CarDekhoUserAlreadyExist{
		 boolean flag = false;
         
		 try{ 
			 flag = DBHelper.isLogInCorrect(connection, userId, password);
			
           if(!flag){
        	  flag = DBHelper.addUser(connection, userId, password);
  
           }else{
        	   throw new CarDekhoUserAlreadyExist("Usere with id " + userId +"  already exists.");
           }

			 
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while Login " + e.getMessage());
				throw e;
			}
		
		return flag;
	}

}
