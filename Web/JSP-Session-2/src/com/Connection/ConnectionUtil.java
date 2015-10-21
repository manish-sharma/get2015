package com.Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//connection class to create connection to library database
public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/userinfo";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
			
	private Connection con = null;
	
	public Connection getConnection() {
		
		/* register driver */
		try  {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
