package com.metacube.jdbc.example;

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

	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
			
	private Connection connection = null;
	
	public Connection getConnection() {
		
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
	
}
