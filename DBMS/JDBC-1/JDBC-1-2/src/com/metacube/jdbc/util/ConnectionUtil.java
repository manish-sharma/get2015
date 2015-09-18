package com.metacube.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**Connection establishment and closing is done in this class
 * 
 * @author Gaurav Saini
 * Date:  15/09/2015
 */

public class ConnectionUtil {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/new_library";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
			
	private Connection con = null;
	
	/** Method to get a connection to the database
	 * 
	 * @return con : Connection object
	 */
	public Connection getConnection() {
		
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
