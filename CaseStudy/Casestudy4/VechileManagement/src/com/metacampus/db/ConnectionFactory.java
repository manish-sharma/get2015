package com.metacampus.db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Exception.VehicleException;


public class ConnectionFactory {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicleManagement";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	public static Connection getConnection() throws VehicleException {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
			throw new VehicleException("Could not load driver class, please add mysql jdbc driver to classpath.");
		} catch (SQLException e) {
			System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
			throw new VehicleException("Coult not create connection with database, [" + e.getMessage() + "]");
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
