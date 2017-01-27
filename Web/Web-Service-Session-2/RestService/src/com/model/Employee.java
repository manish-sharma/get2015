package com.model;

public class Employee {
   String id;
   String name;
   String dateOfBirth;
   String address;
   
public Employee(String id, String name, String dateOfBirth, String address) {
	super();
	this.id = id;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
   
   
}
