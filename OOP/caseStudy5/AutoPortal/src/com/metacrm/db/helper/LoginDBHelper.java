package com.metacrm.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.metacrm.model.User;

/**
 * This class is responsible for login the admin into the website
 * 
 * @author Riddhi
 *
 */
public class LoginDBHelper {
	// query to check whether the username of the person trying to login in
	// exists or not
	private String query = "SELECT password FROM user where userName = ?";

	public String authenticate(Connection connection, User objUser) {
		ResultSet rs = null;
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection
						.prepareStatement(query);
				preparedStatement.setString(1, objUser.getUserName());
				rs = preparedStatement.executeQuery();
				if (rs.next()) {
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
