/**
 * @author Girdhari
 * ConnectionUtil class
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* Starting of ConnectionUtil class */
public class ConnectionUtil {
	
	/* Starting of getConnection function */
	public static Connection getConnection() {
		/* register driver */
		ConnectionAttributesParser readConnectionAttributes = new ConnectionAttributesParser();
		readConnectionAttributes.parseXmlFile();
		readConnectionAttributes.parseDocument();
		SetConnection connectionAttributes = readConnectionAttributes
				.getConnectionAttributes();
		Connection connection = null;
	
		try {
			
			Class.forName(connectionAttributes.getDriver());
		} catch (ClassNotFoundException e) {
			
			System.out.println("Class not found Exception");
			System.exit(1);
		}

		/* open connection */
		try {
			
			connection = DriverManager.getConnection(connectionAttributes
					.getUrl().trim(),
					connectionAttributes.getUsername().trim(),
					connectionAttributes.getPassword().trim());
		} catch (SQLException e) {
		
			System.out.println("SQL exception Occured ");
			System.exit(1);
		}

		return connection;
	}
	/* Ending of getConnection function */

}
/* Ending of ConnectionUtil class */
