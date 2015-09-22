package com.metacampus.vehiclemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * this class is responsible to establish connection to the database driver
 * 
 * @author Riddhi
 * 
 */
public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle_management_system";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private static Connection con = null;

	public static Connection getConnection() {

		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

}
