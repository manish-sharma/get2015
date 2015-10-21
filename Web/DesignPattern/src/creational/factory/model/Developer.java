package creational.factory.model;

/**
 * this is employee type developers model class holding getter setter method
 * @author Sumitra
 *
 */

public class Developer implements IEmployee {
	private String name;
	private String role;
	
	
	private Developer() {
	}
	
	public static Developer getInstance() {
		Developer iDeveloper = new Developer();
		return iDeveloper;

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
	

	@Override
	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		
		String developer = "[Employee Type:-" + EmployeeType.developer
				+ ",\nName:-" + name + ",   Role:-" + role + "]";
		return developer;
	}
}
