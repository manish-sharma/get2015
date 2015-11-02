package com.service.model;

import lombok.Data;

/**
 * @author Anjita
 * EmployeeModel POJO class
 */
@Data
public class EmployeeModel {

	private int id;
	private String name;
	private String designation;
	private String email;
	private String address;
	private int salary;
}
