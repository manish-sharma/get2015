import java.util.Scanner;

/*
 * This User class contains the user information
 * @ Banwari Kevat
 */
public class User {
	
	private String name;
	private String userId;
	private String contactNumber;
	
	void setName(String name) {
		this.name=name;
	}
	
	String  getName() {
		return name;
	}
	
	void setUserId(String id) {
		this.userId=id;
	}
	
	String  getUserId() {
		return userId;
	}
	
	void setContactNumber(String contNum) {
		this.contactNumber=contNum;
	}
	
	String  getContactNumber() {
		return contactNumber;
	}
	
	void userRegistration(String name, String id, String contact) {
		  setName(name);
		  setUserId(id);
		  setContactNumber(contact);
		 
	}
	
}
