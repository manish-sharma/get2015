package question2;

/**
 * This is a model class that stores information about the developer
 * 
 * @author Riddhi
 *
 */

public class Developer {


	private String name;   //stores the name of developer
	private String role;   //stores the role of developer

	//protected constructor
	protected Developer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nRole = " + role + "\n";
	}

}
