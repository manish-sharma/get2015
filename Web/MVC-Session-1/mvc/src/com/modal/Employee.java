package com.modal;

import java.util.Date;

public class Employee {
	
	private String name = "";
	private int age;
	private int employeeID;
	private java.util.Date lastUpdated;
	private final java.util.Date dateOfRegistration = new Date();
	
	public Employee(String name, int age, int employeeID, java.util.Date lastUpdated) {
		super();
		this.name = name;
		this.age = age;
		this.employeeID = employeeID;
		this.lastUpdated = lastUpdated;
	}
	
	public Employee replaceEmployee(String name, int age, int employeeID) {
		this.name = name;
		this.age = age;
		this.employeeID = employeeID;
		this.lastUpdated = new Date();
		
		return this;
	}
	
	public java.util.Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(java.util.Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		
		return "Employee Name: " + name + "\nEmployee ID: " + employeeID + "\nAge: " + age 
				+ "\nDate of Registration: " + dateOfRegistration + "\n Last Updated: " + lastUpdated;
		
//		return "Employee [name=" + name + ", age=" + age + ", employeeID="
//				+ employeeID + ", dateOfRegistration=" + dateOfRegistration
//				+ "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public java.util.Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	
}
