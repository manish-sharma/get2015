package com.metacube.carDekho.db.helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.carDekho.db.ConnectionUtil;
import com.metacube.carDekho.model.User;
import com.mysql.jdbc.Connection;

public class UserJDBCHelper {

	@SuppressWarnings("finally")
	public static User getUserByEmail(String email) {
		
		Connection connection = (Connection) ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = new User();
		try {
			String query = "select * from admin where email = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println("User is not Inserted 1" + e);
		} finally {
			
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				
				
			} catch (SQLException e) {
				System.out.println("User is not Inserted  " + e);
			}
			return user;
		}
	}

}
