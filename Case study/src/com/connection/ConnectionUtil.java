/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name ConnectionUtil
 * @description this class load the driver and  set the connection between java code and database
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.xml.ConnectionItems;
import com.xml.ReadConnectionXml;

public class ConnectionUtil {
	private static String DB_URL;
	private static String Driver;
	private static String USER;
	private static String PASSWORD;
	private Connection connection = null;

	/**
	 * @name getConnection()
	 * @description this method will get connection for vehicle database
	 * @param
	 * @return connection(reference of Connection interface)
	 */
	public Connection getConnection() {
		ConnectionItems connectionItem = new ConnectionItems();
		ReadConnectionXml read = new ReadConnectionXml();

		/* reading connection attributes' values from connection.xml file */
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.url);
		DB_URL = connectionItem.geturl();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.driver);
		Driver = connectionItem.getDriver();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.username);
		USER = connectionItem.getUsername();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.password);
		PASSWORD = connectionItem.getPassword();

		/* register driver */
		try {
			Class.forName(Driver);
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
