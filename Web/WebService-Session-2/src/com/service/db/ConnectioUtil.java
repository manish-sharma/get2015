package com.service.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anjita
 * Class ConnectioUtil to provide connection
 */
public class ConnectioUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/employeemgmt";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
			
	private static Connection con = null;
	
	/**
	 * @return : connection
	 */
	public static Connection getConnection() {
		
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
