package com.model;

public class Employee {
	private Integer id;
	private String name;
	private String email;
	private Integer age;
	private String dateOfRegistration;
	
	
	public Employee(Integer id, String name, String email, Integer age,String dateOfRegistration) {
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
