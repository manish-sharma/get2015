package com.assignment.webservice;

import java.util.List;

public class EmployeeService {
	
	public void createEmployee(Employee employee){
		EmployeeDAO.insert(employee);
	}
    
	public Employee getEmployeeById(Employee employee){
		return EmployeeDAO.getEmployeeByID(employee);
	}
	
	public List<Employee> getEmployeeAsList(){
		return EmployeeDAO.getAll();
	}
	
	public void deleteEmployee(Employee employee){
		EmployeeDAO.remove(employee);
	}
}
