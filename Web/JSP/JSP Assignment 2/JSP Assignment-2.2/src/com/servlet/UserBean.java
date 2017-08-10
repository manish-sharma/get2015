package com.servlet;
/*This class act as bean class for the jsp and servlet having getter setter for user details*/
public class UserBean {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	public boolean valid;
    //getter for first name 
	public String getFirstName() {
		return firstName;
	}
    //setter for first name
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
    //getter for last name
	public String getLastName() {
		return lastName;
	}
    //setter for last name
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
    //getter for password 
	public String getPassword() {
		return password;
	}
    //setter for password 
	public void setPassword(String newPassword) {
		password = newPassword;
	}
    //getter for user name 
	public String getUsername() {
		return username;
	}
    //setter for user name
	public void setUserName(String newUsername) {
		username = newUsername;
	}
    //getter for valid credentials 
	public boolean isValid() {
		return valid;
	}
    //setter for valid credentials 
	public void setValid(boolean newValid) {
		valid = newValid;
	}
}
