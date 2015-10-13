package com.vehicle.db;

/**This class is used to setup connection between the database and JAVA code usind jdbc driver 
 @author Shishir Pareek
 Date 22nd September 2015
 **/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/automobile";// url
																					// for
																					// jdbc
																					// driver
																					// and
																					// the
																					// respective
																					// database
																					// on
																					// the
																					// system
	private static final String USER = "root";// username for database
	private static final String PASSWORD = "mysql";// password for database

	private Connection con = null;// connection typwe variable to get the state
									// of connection

	/**
	 * This class is used to form the connection between the database and the
	 * JAVA code
	 **/
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
