package Utills;
/**
 *this class for  establish connection from database
 * @author Banwari kevat
 */

import helper.MyException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import VehicleXML.*;

public class ConnectionUtill 
{
    private String DB_URL;
	private String USER;
	private String PASSWORD;
			
	private Connection con = null;
	
	public Connection getConnection() throws MyException 
	{
		
		ConnectionItems connectionItem = new ConnectionItems();
		// make object of ReadConnectionXml
		ReadConnectionXml read = new ReadConnectionXml();
		//call readConfig method and get connectionItem 
		connectionItem = read.readConfig("connection.xml"); 
		// get URL
		DB_URL = connectionItem.geturl(); 
		// get USERNAME
	    USER = connectionItem.getUsername(); 
	    // get PASSWORD
		PASSWORD = connectionItem.getPassword();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			throw new MyException(e);
		}
		
		//open connection
		try 
		{
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} 
		catch (SQLException e)
		{
			throw new MyException(e);
		}
		return con;
	}
	
}
