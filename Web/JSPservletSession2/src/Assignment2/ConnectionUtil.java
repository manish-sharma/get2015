package Assignment2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/RegistrationForm";
	private static final String user = "root";
	private static final String password = "mysql";
	private static   Connection con = null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("Class not found");
		}
		try {
			con = DriverManager.getConnection(DB_URL, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
