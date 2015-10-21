package com.model;

public class User {
	private String userName;
	private String password;
	private String email;
	
	/**
	 * This is a default constructor.
	 */
	
	public User() {
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} userName
	 * @param{String} password
	 * @param{String} email
	 */
	
	public User(String userName, String password, String email) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setEmail(email);
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} userName
	 * @param{String} password
	 */
	
	public User(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
	}
	
	/**
	 * This function returns the username.
	 * @return{String}
	 */
	
	public String getUserName() {
		return userName;
	}
	
	/**
	 * This function sets the username.
	 * @param{string} userName
	 */
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * This function returns the password of the user.
	 * @return{String}
	 */
	
	public String getPassword() {
		return password;
	}
	
	/**
	 * This function sets the password of the user.
	 * @param{String} password
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * This function returns the password of the user.
	 * @return{String}
	 */
	
	public String getEmail() {
		return email;
	}
	
	/**
	 * This function sets the email of the user.
	 * @param{String} email
	 */
	
	public void setEmail(String email) {
		this.email = email;
	}
}