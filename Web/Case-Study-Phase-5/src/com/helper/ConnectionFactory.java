/**
 * @author sumitra godara
 * this is a helper class to establish connection.
 * @description this class load the driver and  set the connection between java code and database
 */
package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.exception.CarDekhoSystemException;

public class ConnectionFactory {
	private static String DB_URL = "jdbc:mysql://localhost:3306/vehicledatabase";
	private static String Driver = "com.mysql.jdbc.Driver";
	private static String USER = "root";
	private static String PASSWORD = "mysql";
	private static Connection connection = null;

	/**
	 * @name getConnection()
	 * @description this method will get connection for vehicle database
	 * @param
	 * @return connection(reference of Connection interface)
	 */
	public static  Connection getConnection() throws CarDekhoSystemException  {
		
		try {
			Class.forName(Driver);
		
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			connection.setAutoCommit(false);
		}catch (ClassNotFoundException e) { 
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
		throw new CarDekhoSystemException("Could not load driver class, please add mysql jdbc driver to classpath.", e);
	} catch (SQLException e) {
		System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
		throw new CarDekhoSystemException("Coult not create connection with database, [" + e.getMessage() + "]", e);
	}
		return connection;
	}

	/**
	 * @name closeConnection()
	 * @description this method will close the connection when the use of
	 *              database will complete
	 * @param connection
	 *            (reference of Connection interface)
	 * @return
	 */
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection due to following error, [" + e.getMessage() + "]");
			}
		}
	}
}
