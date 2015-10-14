/**
 * Assignment-2
 * login page:
 * 1. Contains a login jsp page which requires username and password.
 * 2. The login page requests a servlet to validate the login credentials. 
 * The servlet calls the api to fetch the information saved in assignment #1 and then validates it 
 * (possibly username and password) against the login credentials.
 * 3. In case of successful login the jsp page must be displayed showing the successfully logged in 
 * and in case of failure the login page 	must again be displayed to re-login.
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
