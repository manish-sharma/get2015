package com.helper;

import com.model.Employee;

public class InitializeConstructor {
	public static void main(String[] args) {
		EmployeeCache employeeCache = EmployeeCache.getInstance();
		employeeCache.addEmployee(new Employee("Amit", "Amit@mail.com", 1, 25, "21-4-89"));
		employeeCache.addEmployee(new Employee("Nikhil", "Nikhil@mail.com", 2, 26, "26-05-88"));
		employeeCache.addEmployee(new Employee("Prakash", "Prakash@mail.com", 4, 26, "12-01-88"));
	}
}
