package com.helper;

import com.model.Employee;

public class InitializeConstructor {
	public static void main(String[] args) {
		EmployeeCache employeeCache = EmployeeCache.getInstance();
		employeeCache.addEmployee(new Employee("Sanjay", "Sanjay@mail.com", 1, 25, "25-4-89"));
		employeeCache.addEmployee(new Employee("vijay", "vijay@mail.com", 2, 28, "14-05-98"));
		employeeCache.addEmployee(new Employee("ajay", "ajay@mail.com", 4, 25, "12-01-99"));
	}
}
