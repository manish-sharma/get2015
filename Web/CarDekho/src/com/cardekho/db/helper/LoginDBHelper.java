package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.User;

public class LoginDBHelper {
	public User validateLogin(HttpServletRequest request) throws CarDekhoSystemException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Connection connection = null;
		Statement statement = null;
		String validateQuery = "SELECT * from login where username='"+username+"'";
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(validateQuery);;
			if(resultSet.next()) {
				if(password.equals(resultSet.getString("password"))) {
					User admin = new User();
					admin.setUsername(username);
					admin.setPassword(password);
					admin.setName(resultSet.getString("name"));
					admin.setEmail(resultSet.getString("email"));
					System.out.println("Hello");
					return admin;
				}
				else {
					request.setAttribute("msg", "Password Incorrect");
					return null;
				}
			}
			else {
				request.setAttribute("msg", "Username not Correct");
				return null;
			}
		} catch(CarDekhoSystemException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw new CarDekhoSystemException("Could not Login, [" + e.getMessage() + "]");
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
			ConnectionFactory.closeConnection(connection);
		}
	}
}
