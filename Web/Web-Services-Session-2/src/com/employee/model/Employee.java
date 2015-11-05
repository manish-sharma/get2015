package com.employee.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Name:Employee
 * @author Gaurav Saini
 * Since: 2 November,2015
 * Description: Model Class of employee
 **/
public class Employee
{
	// To Store the Id
	int id;
	// To store name
	String name;
	// To Store Email
	String email;
	// sets the id
	public void setId(int id)
	{
		this.id = id;
	}
	// Gets the Id
	public int getId() 
	{
		return id;
	}
	// sets the Name
	public void setName(String name)
	{
		this.name = name;
	}
	// Gets the Name
	public String getName()
	{
		return name;
	}
	// sets the Email
	public void setEmail(String email) 
	{
		this.email = email;
	}
	// Gets the Email
	public String getEmail() {
		return email;
	}

}
