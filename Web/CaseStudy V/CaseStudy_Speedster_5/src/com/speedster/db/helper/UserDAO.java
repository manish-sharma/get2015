package com.speedster.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.speedster.db.ConnectionManager;
import com.speedster.model.User;

public class UserDAO {

	static Connection currentCon = null;
	static ResultSet resultSet = null;

	public static User login(User user) {

		Statement authenticationQuery = null;

		String username = user.getEmailId();
		String password = user.getPassword();

		String searchQuery = "Select * from admin where email_id = '"
				+ username + "' AND password = '" + password + "'";
		try {
			ConnectionManager con1 = new ConnectionManager();
			// connect to DB
			currentCon = con1.getConnection();
			authenticationQuery = currentCon.createStatement();
			resultSet = authenticationQuery.executeQuery(searchQuery);
			boolean more = resultSet.next();
			if (!more) {
				System.out
						.println("Sorry, you are not a registered user! Please sign up first");
				user.setValid(false);
			} else if (more) {
				user.setValid(true);
			}
		} catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! "
					+ ex);
		}
		// some exception handling
		finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
				}
				resultSet = null;
			}
			if (authenticationQuery != null) {
				try {
					authenticationQuery.close();
				} catch (Exception e) {
				}
				authenticationQuery = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return user;
	}
}
