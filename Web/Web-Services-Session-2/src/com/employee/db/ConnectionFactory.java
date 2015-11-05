package com.employee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.employee.exception.EmployeeSystemException;
/**
 * Name: ConnectionFactory
 * @author Gaurav Saini
 * Since: 2 November.2015
 * Description: Establishes Connection to the Database
 **/ 
public class ConnectionFactory 
{
	// Url of the database
	private static final String DB_URL = "jdbc:mysql://localhost:3306/EmployeeDatabase";
	// User 
	private static final String USER = "root";
	// Password of the Database
	private static final String PASSWORD = "mysql";

	/**
	 * Name:getConnection
	 * @return
	 * @throws EmployeeSystemException
	 * Description: Gets The Connection of the database
	 */
	public static Connection getConnection() throws EmployeeSystemException
	{
		// Gets the Connection
		Connection connection = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL);
			connection.setAutoCommit(false);
		} 
		// Catch
		catch (ClassNotFoundException e)
		{
			// Throws the Exception
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
			throw new EmployeeSystemException("Could not load driver class, please add mysql jdbc driver to classpath.", e);
		} 
		catch (SQLException e) 
		{
			System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
		}
		finally
		{
			return connection;
		}

	}
	/**
	 * Name: closeConnection
	 * @param connection
	 * Description: Closes the connection
	 **/
	public static void closeConnection(Connection connection)
	{
		if(connection != null) 
		{
			try 
			{
				connection.close();
			}
			catch (SQLException e)
			{
				System.out.println("Could not close connection due to following error, [" + e.getMessage() + "]");
			}
		}
	}
}
