package com.meta.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.meta.EmployeeSystemException;

/**
 * @author Khemanshu
 *
 */
public class ConnectionFactory {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/EmployeeWebservice";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
	
	private static Connection connection = null;
	public static Connection getConnection() throws EmployeeSystemException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
			throw new EmployeeSystemException("Could not load driver class, please add mysql jdbc driver to classpath.", e);
		} catch (SQLException e) {
			System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
			throw new EmployeeSystemException("Coult not create connection with database, [" + e.getMessage() + "]", e);
		}
		return connection;
	}
	public static void closeConnection(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection due to following error, [" + e.getMessage() + "]");
			}
		}
	}
}
