/**
 * Class to implement Database connection
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.metacampus.vehiclemanagement.xml.ConnectionItems;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;



public class ConnectionUtil {

		private static String DB_URL;
		private static String USER;
		private static String PASSWORD;

		public static Connection getConnection() {
			
			/* Creating connection */
			Connection con = null;
			ConnectionItems connectionItem=new ConnectionItems();
			ReadConnectionXml read = new ReadConnectionXml();
			
			/* reading data from XML File */
			connectionItem = read.readConfig("connection.xml");
			DB_URL=connectionItem.geturl();
		    USER=connectionItem.getUsername();
			PASSWORD=connectionItem.getPassword();
			/* register driver */
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			/* open connection */
			try {
				con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			return con;
		}
}
