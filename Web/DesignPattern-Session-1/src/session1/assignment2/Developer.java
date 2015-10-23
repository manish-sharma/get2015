package session1.assignment2;

/**
 * Name: Developer
 * @author Gaurav Saini
 * Since: 21-10-2015
 * Description: Modal Class of Developer
 **/

public class Developer {
	
	// To store name
	String name;
	
	// To store role
	String role;

	public String getName()	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole()	{
		return role;
	}
	
	protected Developer() {

	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	// Overrides the toString method
	@Override
	public String toString() {
		return "Name: " + name + "\nRole: " + role + "\n";
	}
}