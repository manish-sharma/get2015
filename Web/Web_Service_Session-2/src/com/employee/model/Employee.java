/**
 * @author Ravika Jain
 * @since 02/11/2015
 * it is the model class for employee 
 */
package com.employee.model;

public class Employee {
	int id;
	String name;
	String email;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
