package model;

/**
 * @author Anjita
 * Employee class having variables email, dor, EmployeeId, age and name.
 */
public class Employee {
	private String email;
	private String dor;
	private  int EmployeeId;
	private int age;
	private String name;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the dor
	 */
	public String getDor() {
		return dor;
	}
	
	/**
	 * @param dor the dor to set
	 */
	public void setDor(String dor) {
		this.dor = dor;
	}
	
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return EmployeeId;
	}
	
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
