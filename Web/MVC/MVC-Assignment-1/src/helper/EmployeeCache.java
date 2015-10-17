package helper;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.Employee;

public class EmployeeCache {

	private static Map<Integer, Employee> employeeMap = new ConcurrentHashMap<Integer, Employee>();
	private static EmployeeCache employeeCache = new EmployeeCache();

	private EmployeeCache () {
		employeeMap.put(1, new Employee(1,"Girdhari Agrawal","girdhari.agrawal@metacube.com",22,"17/10/2015"));
		employeeMap.put(2, new Employee(2,"Dheeraj Kumar","dheeraj.kumar1@metacube.com",21,"17/10/2015"));
		employeeMap.put(3, new Employee(3,"Babalu Patidar","babalu.patidar@metacube.com",21,"17/10/2015"));
		employeeMap.put(4, new Employee(4,"Sumitra Qmari","sumitra.kumari@metacube.com",23,"17/10/2015"));
		employeeMap.put(5, new Employee(5,"Banwari Kevat","banwari.kevat@metacube.com",23,"17/10/2015"));
	}
	
	public static EmployeeCache getCacheObject() {
		return employeeCache;
	}
	
	public Employee getEmployee(Integer id) {
		return employeeMap.get(id);
	}
	
	public void createEmployee(Employee employeeObject) {
		employeeMap.put(employeeObject.getId(), employeeObject);
	}
	
	public Collection<Employee> listAllEmployee() {
		return employeeMap.values();
	}
	
	public int getNextId() {
		return employeeMap.size()+1;
	}
	
}
