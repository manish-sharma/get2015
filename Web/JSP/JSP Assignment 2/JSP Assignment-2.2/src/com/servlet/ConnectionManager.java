package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**This class setups the database connection and forms the java code connection with the database
 * 
 * @author Shishir
 *
 */
public class ConnectionManager {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/userInformation";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;

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
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
