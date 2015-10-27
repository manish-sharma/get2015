package com.metacube.carDekho.model;

public class User {
	
	String email;
	String firstName;
	String lastName;
	String password;
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
