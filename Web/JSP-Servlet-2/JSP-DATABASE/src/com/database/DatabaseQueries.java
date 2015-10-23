package com.database;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.helper.ConnectionPool;
import com.model.User;

public class DatabaseQueries {
	
	/**
	 * This function inserts the user into the user table.
	 * @param{User} user
	 */
	
	public boolean insertUserIntoDatabase(User user) {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		int count;
		boolean status = false;
		String query = "INSERT INTO user_table (user_name,password,email) VALUES (?,?,?)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			//connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			count = statement.executeUpdate();
			if(count > 0 ) {
				status = true;
			}
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return status;
	}

	/**
	 * This function inserts the relevant data of bike type vehicle into the bike table.
	 * @param{User} user
	 */
	
	public boolean matchUserInDatabase(User user) {
		boolean returnVal =false;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "SELECT email,password FROM user_table";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			Statement statement = connectionObject.createStatement(); // Creating a statement.
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				String userName = result.getString("email");
				
				String password = result.getString("password");
				String inputUserName = user.getEmail();
				
				String inputPassword = user.getPassword();
				if(userName.equalsIgnoreCase(inputUserName) && password.equalsIgnoreCase(inputPassword)) {
					returnVal = true;
					break;
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return returnVal;
	}
	
	
	public static java.util.List<User> getDataFromDatabase() {
		Connection connectionObject = null;
		
		java.util.List<User> resultList = new ArrayList<User>();
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		int count;
		boolean status = false;
		String query = "Select user_name,email from user_table";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			//connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			ResultSet resultSet = statement.executeQuery();
			
				
				while (resultSet.next()) {
					User user = new User();
					user.setEmail(resultSet.getString("email"));
					user.setUserName(resultSet.getString("user_name"));
					user.setEmail(resultSet.getString("email"));
					resultList.add(user);
				
					
				}
		
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return resultList;
	}
	
}