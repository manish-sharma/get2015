import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class forms the connection with the help of driver between java code and
 * database
 * 
 * @author Shishir Pareek Date 16th August 2015
 */
public class ConnectionUtil {

	// variable containing the URL for database
	private static final String DB_URL = "jdbc:mysql//localhost:3306/libraryInformationSystem";
	// variable containing the user id for database
	private static final String USER = "root";
	// variable to store password for database
	private static final String PASSWORD = "mysql";

	// connection type reference
	private Connection con = null;

	// function which establishes the connection between java code and database
	public Connection getConnection() {

		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
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
