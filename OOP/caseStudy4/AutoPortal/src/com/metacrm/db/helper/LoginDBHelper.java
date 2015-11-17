package com.metacrm.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.metacrm.model.User;
import com.metacrm.db.ConnectionFactory;

public class LoginDBHelper {

	private String query = "SELECT password FROM user where userName = ?";

	public String authenticate(HttpServletRequest request) {
		User objUser = (User) request.getAttribute("user");
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		if (connection != null) {
			
			try {
				PreparedStatement preparedStatement = connection
						.prepareStatement(query);
				preparedStatement.setString(1, objUser.getUserName());
				rs = preparedStatement.executeQuery();
				if(rs.next()) {
					if (rs.getString("password").equals(objUser.getPassword()))
						return objUser.getUserName();
					else
						return "user";
				}
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
				System.out.println("Could not roleback.");
			} catch (Exception e) {

			}
		}
		return null;
	}
}
