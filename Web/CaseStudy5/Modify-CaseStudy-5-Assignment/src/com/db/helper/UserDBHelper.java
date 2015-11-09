package com.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.MetaHRMSystemException;
import com.model.Gender;
import com.model.Login;
import com.model.User;

public class UserDBHelper {
	
	private static String INSERT_USER_QUERY = "insert into USER (FIRSTNAME, LASTNAME, PASSWORD ,EMAILID, PHONENO ,ADDRESS ,GENDER) VALUES (?, ?, ?, ? ,?, ?, ?)";

	private static String SELECT_FOR_EMAIL_ID_QUERY = "Select FIRSTNAME , LASTNAME ,PASSWORD ,EMAILID ,PHONENO ,ADDRESS ,GENDER , PRIVILEGE FROM USER where EMAILID=?";
	
	private static String SELECT_FOR_LOGIN_QUERY = "Select FIRSTNAME , LASTNAME ,PASSWORD ,EMAILID ,PHONENO ,ADDRESS ,GENDER , PRIVILEGE FROM USER where EMAILID=? and PASSWORD=?";

	public boolean create(Connection connection, User user) throws MetaHRMSystemException {
		boolean created = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
					preparedStatement = connection.prepareStatement(INSERT_USER_QUERY);
					preparedStatement.setString(1,user.getFirstName() );
					preparedStatement.setString(2, user.getLastName());
					preparedStatement.setString(3, user.getPassword());
					preparedStatement.setString(4, user.getEmail());
					preparedStatement.setString(5,user.getPhoneNo());
					preparedStatement.setString(6, user.getAddress());
					preparedStatement.setString(7, user.getGender().toString());
					int isInserted = preparedStatement.executeUpdate();
					connection.commit();
					if(isInserted>0)
						created = true;
					
				}
			 catch (SQLException e) {
				throw new MetaHRMSystemException("Exception occur while inserting user in database"+e.getMessage());
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
			}
		}
		return created;
	}

	public User getUserByEmailId(Connection connection, User user)
			throws MetaHRMSystemException {
		User returnValue = null;
		
		if(connection != null && user != null && user.getEmail() != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_FOR_EMAIL_ID_QUERY);
				preparedStatement.setString(1, user.getEmail());
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					returnValue = new User();
					returnValue.setFirstName(resultSet.getString("FIRSTNAME"));
					returnValue.setLastName(resultSet.getString("LASTNAME"));
					returnValue.setEmail(resultSet.getString("EMAILID"));
					returnValue.setPassword(resultSet.getString("PASSWORD"));
					returnValue.setPhoneNo(resultSet.getString("PHONENO"));
					returnValue.setAddress(resultSet.getString("ADDRESS"));
					returnValue.setGender(Gender.valueOf(resultSet.getString("GENDER")));
					returnValue.setPrivilege(resultSet.getInt("PRIVILEGE"));
					break;
				}
			} catch(SQLException e) {
				System.out.println("Error while getting salesPerson by email " + user.getEmail());
				throw new MetaHRMSystemException("Error while getting salesPerson by email " + user.getEmail() + ", [" + e.getMessage() + "]", e);
			}
			 finally {
					if (preparedStatement != null) {
						try {
							preparedStatement.close();
						} catch (SQLException e) {
							System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
						}
					}
				}
		}
		return returnValue;
	}

	public User getUserByLogin(Connection connection, Login login) throws MetaHRMSystemException {
		
	User returnValue = null;
		
		if(connection != null && login != null && login.getEmailId() != null && login.getPassword() != null) {
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(SELECT_FOR_LOGIN_QUERY);
				System.out.println("hi prepared statement");
				preparedStatement.setString(1, login.getEmailId());
				System.out.println("Hi fsjfsd"+login.getEmailId()+login.getPassword());
				preparedStatement.setString(2, login.getPassword());
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println("Hi in result set");
					returnValue = new User();
					returnValue.setFirstName(resultSet.getString("FIRSTNAME"));
					returnValue.setLastName(resultSet.getString("LASTNAME"));
					returnValue.setEmail(resultSet.getString("EMAILID"));
					returnValue.setPassword(resultSet.getString("PASSWORD"));
					returnValue.setPhoneNo(resultSet.getString("PHONENO"));
					returnValue.setAddress(resultSet.getString("ADDRESS"));
					returnValue.setGender(Gender.valueOf(resultSet.getString("GENDER")));
					returnValue.setPrivilege(resultSet.getInt("PRIVILEGE"));
					break;
				}
			} catch(SQLException e) {
				System.out.println("Error while getting user by Login " + login.getEmailId());
				throw new MetaHRMSystemException("Error while getting user by Login" + login.getEmailId() + ", [" + e.getMessage() + "]", e);
			}
			 finally {
					if (preparedStatement != null) {
						try {
							preparedStatement.close();
						} catch (SQLException e) {
							System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
						}
					}
				}
		}
		return returnValue;
		
	}

}
