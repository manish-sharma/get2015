package com.metacube.model;

import lombok.Data;

@Data
// to generate getters and setters automatically
public class Employee {
	private int id;
	private String name;
	private String email;
	private String Address;
}
