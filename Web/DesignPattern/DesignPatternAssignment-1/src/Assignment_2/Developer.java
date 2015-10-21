package Assignment_2;

/**
 * This class act as the modal class for the Factory with protected constructor
 * so its object can't be made without extending it
 * 
 * @author Shishir Date 21st October 2015
 */
public class Developer {

	@Override
	public String toString() {
		return "Developer [name=" + name + ", role=" + role + "]";
	}

	private String name;
	private String role;

	// protected type constructor
	protected Developer() {

	}

	// getter for the name
	public String getName() {
		return name;
	}

	// setter for the name
	public void setName(String name) {
		this.name = name;
	}

	// getter for the role
	public String getRole() {
		return role;
	}

	// setter for the role
	public void setRole(String role) {
		this.role = role;
	}

}
