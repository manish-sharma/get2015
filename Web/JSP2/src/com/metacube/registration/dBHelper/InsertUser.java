package com.metacube.registration.dBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.metacube.registration.User;

public class InsertUser {
	
	public static boolean insertUser(User user) {
		Connection connection = ConnectionUtil.getConnection();
		System.out.println("hello"+connection);
		PreparedStatement preparedStatement = null;
		boolean isInserted = false;
		String query = "Insert into user(email,first_Name,last_Name,password) values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getFirstName());
			preparedStatement.setString(3, user.getLastName());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.execute();
			isInserted = true;
		} catch (SQLException e) {
			System.out.println("User is not Inserted" + e);
		} finally {
			/* close connection */
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				System.out.println("User is not Inserted" + e);
			}
		}
		
		return isInserted;
	}

}
