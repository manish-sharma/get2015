package com.metacube.carDekho.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * to get connection
 * 
 * @author Ravika
 *@since9/16/2015
 */
public class ConnectionUtil {
			
	private static final String DB_URL = "jdbc:mysql://localhost:3306/car_Dekho";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
			
	private static Connection connection = null;
	
	public static Connection getConnection() {
		
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		/* open connection */
		try {
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
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
