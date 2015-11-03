package com.assignment.webservice;

public class Employee {
private int id;
private String name;
private String email;
private String age;
private String dateOfBirth;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(int id, String name, String email, String age,
		String dateOfBirth, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
}
public Employee() {
	// TODO Auto-generated constructor stub
}


}
