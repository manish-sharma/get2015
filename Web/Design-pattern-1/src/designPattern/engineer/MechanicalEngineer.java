/**
 * 
 */
package designPattern.engineer;

/**
 * @author Suman
 *
 */
public class MechanicalEngineer implements IEngineer {
	//interface defining properties of mechanical engineer
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
