package com.metacube.registration.dBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FatchDatabase {
	
	@SuppressWarnings("finally")
	public static boolean isUserAlreadyPresernt(String email) {
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean isUserAlreadyPresernt = false;
		try {
			String query = "select email from user where email = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				isUserAlreadyPresernt = true;
			}
		} catch (SQLException e) {
			System.out.println("User is not Inserted 1" + e);
		} finally {
			/* close connection */
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				System.out.println("User is not Inserted  " + e);
			}
			return isUserAlreadyPresernt;
		}
	}

	@SuppressWarnings("finally")
	public static boolean isEmailCorrect(String email) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean isEmailPresent = false;
		try {
			String query = "select email from user where email = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				isEmailPresent = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return isEmailPresent;
		}
	}
	
	@SuppressWarnings("finally")
	public static boolean isPasswordCorrect(String email, String password) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean isEmailPresent = false;
		try {
			String query = "select password from user where email = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			if(resultSet.getString("password").equals(password)){
				isEmailPresent = true;
			}
			
		} catch (SQLException e) {
			System.out.println("User is not Inserted" + e);
		} finally {
			/* close connection */
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				System.out.println("User is not Inserted" + e);
			}
			return isEmailPresent;
		}
	}
	
}
