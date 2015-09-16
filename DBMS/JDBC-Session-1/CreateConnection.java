/*
 * This class for create connection and return connection object
 */
package Connection;
import java.sql.*;
public class CreateConnection {	
	//Dtabase URL
	private static final String DB_URL = "jdbc:mysql://localhost:3306/lib_info_sys2";
	//User  name
	private static final String USER = "root";
	//USer password
	private static final String PASSWORD = "mysql";
	 
	Connection cn = null;
	//this method for create database connection
	public Connection getConnection()
	{   
		try
		{   
			Class.forName("com.mysql.jdbc.Driver");
		    cn  = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		// return connection
		return cn;
	}
}
