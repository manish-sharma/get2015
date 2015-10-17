package model;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
	private int id;
	private String name;
	private String email;
	private int age;
	private String dateOfRegistration;

	public Employee() {
		
	}
	public Employee(int id, String name, String email, int age, String dateOfRegistration) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dateOfRegistration = dateOfRegistration;
	}
}
