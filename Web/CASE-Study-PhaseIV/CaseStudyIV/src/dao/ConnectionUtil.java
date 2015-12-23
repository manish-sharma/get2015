package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle_management";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;

	public Connection getDbConnection() {

		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!!");
		}

		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Error while getting connection!!");
		}
	
		return con;
	}

}
