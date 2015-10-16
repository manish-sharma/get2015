package com.helper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.model.Employee;

/**
 * 
 * @author Sumitra
 *this helper class save the data of employees registered
 */

public class EmployeeCache {
	private static EmployeeCache employeeCache = new EmployeeCache();
	private static Map<Integer, Employee> cache = new ConcurrentHashMap<Integer, Employee>();
	private EmployeeCache() {
		
	}

	public static EmployeeCache getInstance() {
		return employeeCache;
	}

	public Employee getEmployeeForId(int id) {
		if(!(cache.isEmpty())) {
			return cache.get(id);
		} else {
			return null;
		}
	}
	public Map<Integer, Employee> getAllEmployees() {
		//return (List<Employee>) cache.values();
		return cache;
	}
	public void updateEmployee(Employee employee) {
		cache.put(employee.getId(),employee);
	}
	public void addEmployee(Employee employee) {
		cache.put(employee.getId(),employee);
	}

}