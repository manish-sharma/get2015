package designPattern.engineer;

/**
 * @author Suman
 *
 */
public class Developer implements IEngineer {

	//class defining properties of Developer
	private String name;
	private	String role;
	
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
}
