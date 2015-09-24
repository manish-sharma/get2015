package Com.HelperClasses;

/**
 * @author Ankur
 * this is a helper class to establish connection.
 * @description this class load the driver and  set the connection between java code and database
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Com.Vehicle.*;
import Com.Xml.*;


public class ConnectionHelper {
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
	public  Connection getConnection() {
		ConnectionItems connectionItem = new ConnectionItems();
		ReadConnectionXml read = new ReadConnectionXml();

		/* reading connection attributes' values from connection.xml file */
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.Url);
		DB_URL = connectionItem.geturl();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.Driver);
		Driver = connectionItem.getDriver();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.Username);
		USER = connectionItem.getUsername();
		connectionItem = read.readConfig("connection.xml",
				ConnectionAttributes.Password);
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
