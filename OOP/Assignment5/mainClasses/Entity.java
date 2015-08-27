// Parent class entity

package mainClasses;

import java.util.ArrayList;
import java.util.List;

public class Entity {

	String name;
	String email;
	String phoneNumber;
	List<Entity> entitySet = new ArrayList<Entity>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
