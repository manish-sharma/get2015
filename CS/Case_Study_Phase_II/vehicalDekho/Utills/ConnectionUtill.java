package Utills;

import helper.MyException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import VehicleXML.*;

public class ConnectionUtill {

	
	private String DB_URL;
	private String USER;
	private String PASSWORD;
			
	private Connection con = null;
	
	public Connection getConnection() throws MyException {
		
		ConnectionItems connectionItem = new ConnectionItems();
		ReadConnectionXml read = new ReadConnectionXml();			// make object of ReadConnectionXml
		connectionItem = read.readConfig("connection.xml"); //call readConfig method and get connectionItem 
		DB_URL = connectionItem.geturl(); // get URL
		
	    USER = connectionItem.getUsername(); // get USERNAME
		
		PASSWORD = connectionItem.getPassword();// get PASSWORD
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new MyException(e);
		}
		
		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new MyException(e);
		}
		return con;
	}
	
}
