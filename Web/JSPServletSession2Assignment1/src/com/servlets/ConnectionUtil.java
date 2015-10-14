/**
 * Assignment-1
 * Write a user registration application:
 * 1. Contains a user registration information form (JSP page) that requests a servlet.
 * 2. Contains a servlet that accepts the request sent by client and persists the information in the database tables.
 */
package com.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anjita
 *
 */
public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/form";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;

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
