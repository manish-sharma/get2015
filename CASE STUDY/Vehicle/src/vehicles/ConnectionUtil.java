package vehicles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * to get connection
 * 
 * @author Ravika
 *@since9/16/2015
 */
public class ConnectionUtil {
			
	private static Connection con = null;
	
	public static Connection getConnection() {
		
		/* register driver */
		WriteConnectionXML connectionFile = new WriteConnectionXML();
		//to set the path of file
	    connectionFile.setFile("Web Contant/Connection.xml");
	    try {
	    	// to write the Xml
	    	connectionFile.saveConfig();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    //to read the file and store the info of connection in object
		ReadConnectionXml readConnectionXml = new ReadConnectionXml();
	    ConnectionItems connectionItems= readConnectionXml.readConfig("Web Contant/Connection.xml");

		try {
			System.out.println(connectionItems.getDriver());
			String driver = connectionItems.getDriver();
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		/* open connection */
		try {
			con = DriverManager.getConnection(connectionItems.geturl(), connectionItems.getUsername(), connectionItems.getPassword());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
}
