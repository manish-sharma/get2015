import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;


public class ConnectionUtil {
	private static final String DB_URI = "jdbc:mysql://localhost:3306/jspassignment1";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "mysql";
	
	public static Connection createConnection(HttpServletResponse response) throws IOException {
		Connection connectionObject = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connectionObject = DriverManager.getConnection(DB_URI,USER_NAME,PASSWORD);
			
		} catch (ClassNotFoundException exception) {
				response.sendRedirect("error.jsp");
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return connectionObject;
	}
}
