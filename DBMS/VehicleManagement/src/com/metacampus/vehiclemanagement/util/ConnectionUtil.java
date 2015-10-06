package com.metacampus.vehiclemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.metacampus.vehiclemanagement.xml.ConnectionItems;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;

/**
 * @author Gaurav Saini
 */

public class ConnectionUtil {

	private static String DB_URL;
	private static String USER;
	private static String PASSWORD;

	public static Connection getConnection() {

		Connection con = null;
		ConnectionItems connectionItem = new ConnectionItems();
		ReadConnectionXml read = new ReadConnectionXml();
		connectionItem = read.readConfig("connection.xml");
		DB_URL = connectionItem.geturl();
		USER = connectionItem.getUsername();
		PASSWORD = connectionItem.getPassword();
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}