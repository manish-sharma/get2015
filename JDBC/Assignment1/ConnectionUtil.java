import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * this class is responsible to establish connection to the database driver
 * 
 * @author Riddhi
 *
 */
public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/library_information_system";
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
