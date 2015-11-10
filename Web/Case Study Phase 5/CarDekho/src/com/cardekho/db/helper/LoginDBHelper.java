package com.cardekho.db.helper;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.User;

public class LoginDBHelper {

	/** Method to validate login
	 * 
	 * @param request
	 * @return User object if validated successfully, null otherwise 
	 * @throws CarDekhoSystemException
	 */
	public User validateLogin(Connection connection,HttpServletRequest request) throws CarDekhoSystemException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Statement statement = null;
		String validateQuery = "SELECT * from login where username='"+username+"'";
		ResultSet resultSet = null;
		try 
		{
			statement = connection.createStatement();
			resultSet = statement.executeQuery(validateQuery);
			if(resultSet.next()) 
			{
				/* Validating user based on user name and password */
				if(password.equals(resultSet.getString("password"))) 
				{
					/* ON successful validation returning User Object */
					User admin = new User();
					admin.setUsername(username);
					admin.setPassword(password);
					admin.setName(resultSet.getString("name"));
					admin.setEmail(resultSet.getString("email"));
					return admin;
				}
				else 
				{
					/* in case of incorrect password */
					request.setAttribute("msg", "Password Incorrect");
					return null;
				}
			}
			else 
			{
				/* in case of incorrect username */
				request.setAttribute("msg", "Username not Correct");
				return null;
			}
		} 
		catch (SQLException e) 
		{
			try 
			{
				connection.rollback();
			} 
			catch (SQLException e1) 
			{
				System.out.println("Could not rollback.");
			}

			throw new CarDekhoSystemException("Could not Login, [" + e.getMessage() + "]");
		} 
		finally 
		{
			if(statement != null) 
			{
				try 
				{
					statement.close();
				} 
				catch (SQLException e)
				{
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
		}
	}
}
