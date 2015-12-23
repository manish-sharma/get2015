package com.metacube.deadlock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtill {

	private String DB_URL;
	private String USER = "root";
	private String PASSWORD = "mysql";

	private Connection con = null;

	public Connection getConnection() {

		DB_URL = "jdbc:mysql://localhost:3306/deadlockExample";// get URL

		USER = "root"; // get USERNAME

		PASSWORD = "mysql";// get PASSWORD
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

		}

		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		return con;
	}

}
