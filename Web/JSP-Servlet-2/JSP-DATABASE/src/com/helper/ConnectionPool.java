
/**
 * @class  ConnectionPool
 * @author Sanjay
 * @since  14th October 15
 * This class implements the connection polling system.
 */

package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/user";       
	private final String USER = "root";
	private final String PASSWORD = "mysql";		
	private static Vector<Connection> connectionPool = new Vector<Connection>();
	
	/**
	 * This is the constructor of connection pool.
	 */
	
	public ConnectionPool() {
		initialize();													 	// For creating the pool
	}

	/**
	 * This function initializes the connection pool.
	 */
	
	private void initialize() {
		Connection newObject = null;
		while (!isConnectionPoolFull()) {									// Adding new connection objects in pool until full.
			newObject = getConnection();
			connectionPool.addElement(newObject);							// Creating pool of connection object.
		}
	}

	/**
	 * This function creates a new connection object and returns it.
	 * @return{Connection}
	 */
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");							// Loading the diver.
			connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;													// Returning a newly created connection object for pool
	}
	
	/**
	 * This function returns the connection pool full condition status.
	 * @return{boolean}
	 */
	
	private synchronized boolean isConnectionPoolFull() {
		final int MAX_POOL_SIZE = 5;
		if (connectionPool.size() < MAX_POOL_SIZE) {						// Checking if pool is full.
			return false;
		}
		return true;
	}
	 
	/**
	 * This function collects a connection object from the connection pool.
	 * @return{connection}
	 */
	
	public synchronized Connection getConnectionFromPool() {
		Connection connection = null;
		if (connectionPool.size() > 0) {
			connection = (Connection) connectionPool.firstElement();		// Picking a connection object from pool.
			connectionPool.removeElementAt(0);								// Removing just picked connection object from pool.
		}
		return connection;													// Returning the just picked connection object.
	}

	/**
	 * This function returns back the connection object to connection object pool.
	 * @param{connection} connection
	 */
	
	public synchronized void returnConnectionToPool(Connection connection) {
		connectionPool.addElement(connection);								// Adding back the connection object returned to pool.
	}

}
