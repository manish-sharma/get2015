package com.example.model;

/* this is a model class for employee */
public class EmployeeBean {

	private int employeeId;
	private String name;
	private String email;
	private int age;
	private String dateOfRegistration;
	
	/* default constructor */
	public EmployeeBean(){
		
	}
	
	/* parameterized constructor */
	public EmployeeBean(  int employeeId,String name, String email, int age,
			String dateOfRegistration) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dateOfRegistration = dateOfRegistration;
	}
	
	/* -------------------------  setters and getters ---------------------------- */
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	@Override
	public String toString() {
		return "EmployeeId = " + employeeId + "\n Name = " + name
				+ " \n  Email = " + email + "\n Age = " + age + " \n DateOfRegistration = "
				+ dateOfRegistration;
	}	
}
