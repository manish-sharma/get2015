package com.helper;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import com.modal.Employee;

public class EmployeeListMain {

	public static ConcurrentHashMap<Integer, Employee> employeeMap = new ConcurrentHashMap<Integer, Employee>();
	 static int count =1;
	public static ConcurrentHashMap<Integer, Employee> getAllEmployees()
	{
		if(count==1)
		{
		employeeMap.put(1, new Employee("Ankur", 21, 1, new Date()));
		employeeMap.put(2, new Employee("Aditya", 21, 2, new Date()));
		employeeMap.put(3, new Employee("Manish", 21, 3, new Date()));
		employeeMap.put(4, new Employee("Ajay", 21, 4, new Date()));
		employeeMap.put(5, new Employee("Rohit", 21, 5, new Date()));
		count++;
		}
		return employeeMap;

	}

}
