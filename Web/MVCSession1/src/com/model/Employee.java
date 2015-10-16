package com.model;

public class Employee {
	
	private String email;
	private int id;
	private int age;
	private String dateOfRegistration;
	private String name;
	public Employee(String name, String email, int id, int age,
			String dateOfRegistration) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.age = age;
		this.dateOfRegistration = dateOfRegistration;
	}
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
}
