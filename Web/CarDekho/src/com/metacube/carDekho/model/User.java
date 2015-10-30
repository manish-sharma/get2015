package com.metacube.carDekho.model;

public class User {
	
	String email;
	String password;
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public User() {
		email = null;
		password = null;
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
