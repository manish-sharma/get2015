/**
 * @author Pooja Khandelwal
 * @createdDate 16/09/2015
 * @name ConnectionUtil
 * @description this class load the driver and  set the connection between java code and database
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
	private Connection connection = null;

	/**
	 * @name getConnection()
	 * @return connection(reference of Connection interface)
	 */
	public Connection getConnection() {
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
