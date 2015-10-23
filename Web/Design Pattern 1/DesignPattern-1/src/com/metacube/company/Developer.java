package com.metacube.company;
/**
 *  to create the developer that implements IEngineer interface
 * @author Sanjay
 * @since 10/21/2015
 */
public class Developer implements IEngineer {
	private String name;
	private String role;
	protected Developer() {
		
	}
	
	/**
	 * private constructor
	 * to not expose the constructor
	 * @param name = of new engineer
	 * @param role = of new engineer
	 */
	private Developer(String name,String role) {
		this.name = name;
		this.role = role;
	}
	 
	/**
	 * to get the Name of Developer
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * to set the Name of Developer
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * to get the Name of Role
	 */
	@Override
	public String getRole() {
		return role;
	}
	
	/**
	 * to set the Name of Role
	 */
	@Override
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * to create the engineer because the constructor is private
	 * @param name
	 * @param role
	 * @return
	 */
	public static IEngineer createDeveloper(String name,String role) {
		return new Developer(name,role);
	}
	
}
