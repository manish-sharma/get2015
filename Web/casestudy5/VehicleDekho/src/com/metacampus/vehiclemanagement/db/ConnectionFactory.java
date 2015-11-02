package com.metacampus.vehiclemanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.metacampus.vehiclemanagement.MetacampusException;
import com.metacampus.vehiclemanagement.xml.ConnectionItems;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;

/**
 * @author Khemanshu
 */

public class ConnectionFactory {

		private static String DB_URL = "jdbc:mysql://localhost:3306/vehicle_management";
		private static String USER = "root";
		private static String PASSWORD = "mysql";

		public static Connection getConnection() throws MetacampusException {
			
			/* Creating connection */
			Connection con = null;
			ConnectionItems connectionItem=new ConnectionItems();
			ReadConnectionXml read = new ReadConnectionXml();
			
			/* reading data from XML File */
			
			/* register driver */
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				throw new MetacampusException("Could not load driver class, please add mysql jdbc driver to classpath.");
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
				throw new MetacampusException("Could not create connection with database due to following error, [" + e.getMessage() + "]");
			}
			return con;
		}
		
		public static void closeConnection(Connection connection) throws MetacampusException {
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new MetacampusException("Could not close connection due to following error, [" + e.getMessage() + "]");
				}
			}
		}
}
