/*
 * this is model POJO class for  User
 * @author Banwari kevat 
 */
package model;

public class User {
	String userId;
	String password;
	public User(){};
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
