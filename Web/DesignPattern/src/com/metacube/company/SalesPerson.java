package com.metacube.company;
/**
 *  to create the salesperson that implements IEngineer interface
 * @author Ravika
 * @since 10/21/2015
 */
public class SalesPerson implements IEngineer {
	private String name;
	private String role;
	protected SalesPerson() {
		
	}
	
	/**
	 * private constructor
	 * to not expose the constructor
	 * @param name = of new engineer
	 * @param role = of new engineer
	 */
	private SalesPerson(String name,String role) {
		this.name = name;
		this.role = role;
	}
	
	/**
	 * to get the Name of salesperson
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * to set the Name of salesperson
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * to get the role of salesperson
	 */
	@Override
	public String getRole() {
		return role;
	}
	
	/**
	 * to set the Name of salesperson
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * to create the engineer because the constructor is private
	 * @param name
	 * @param role
	 * @return salesPerson Object
	 */
	public static IEngineer createSalesPerson(String name,String role) {
		return new SalesPerson(name,role);
	}
	
}
