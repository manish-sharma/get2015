/**
 * @author sumitra godara
 * this is a helper class to establish connection.
 * @description this class load the driver and  set the connection between java code and database
 */
package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	private static String DB_URL;
	private static String Driver;
	private static String USER;
	private static String PASSWORD;
	private static Connection connection = null;

	/**
	 * @name getConnection()
	 * @description this method will get connection for vehicle database
	 * @param
	 * @return connection(reference of Connection interface)
	 */
	public static  Connection getConnection() {
		

		/* reading connection attributes' values from connection.xml file */
		DB_URL = "jdbc:mysql://localhost:3306/vehicledatabase";
		USER = "root";
		PASSWORD = "mysql";

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

	/**
	 * @name closeConnection()
	 * @description this method will close the connection when the use of
	 *              database will complete
	 * @param connection
	 *            (reference of Connection interface)
	 * @return
	 */
	public void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
