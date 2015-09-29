package com.metacampus.vehiclemanagement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehiclemanagement";
	private static final String USER = "root";
	private static final String PASSWORD = "abab";
			
	private static Connection con = null;
	
	public static Connection getConnection() {
		
		
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}