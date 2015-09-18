/**
 * Class to implement the database connection
 * @author Sanjay 
 */
		

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	//name of the database LIBRARY
	private static final String DB_URL = "jdbc:mysql://localhost:3306/library";
	
	//USERNAME
	private static final String USER = "root";
	
	//PASSWORD
	private static final String PASSWORD = "mysql";
			
	//Connection object
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
