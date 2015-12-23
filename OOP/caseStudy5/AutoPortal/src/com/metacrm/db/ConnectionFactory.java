package com.metacrm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.metahrm.MetaHRMSystemException;

public class ConnectionFactory {
	
	private static final String URL = "jdbc:mysql://localhost:3306/vehicle_management_system";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
//	throws MetaHRMSystemException 
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
			//connection.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
//			throw new MetaHRMSystemException("Could not load driver class, please add mysql jdbc driver to classpath.", e);
		} catch (SQLException e) {
			System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
//			throw new MetaHRMSystemException("Coult not create connection with database, [" + e.getMessage() + "]", e);
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
