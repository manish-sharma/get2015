package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import model.Employee;

/**
 * Thie class stores the employee details for cache using map with Employeeid
 * and object as key valur pair
 * 
 * @author Shishir Date 15th October 2015
 */
public class EmployeeCache {

	private static ConcurrentHashMap<Integer, Employee> empMap = new ConcurrentHashMap<Integer, Employee>();

	/**
	 * getter for employee idd
	 * 
	 * @param id
	 * @return employee id
	 */
	public static Employee getEmployeeById(int id) {
		return empMap.get(id);
	}

	/**
	 * Function to get all the employee in list
	 * 
	 * @return arraylist containing employee object
	 */
	public static List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(empMap.values());

	}
    /** Function to add employee object in map
     * 
     * @param objEmployeeBean
     */
	public static void addEmployee(Employee objEmployeeBean) {
		objEmployeeBean.setEmployeeID(empMap.size() + 1);
		empMap.put(objEmployeeBean.getEmployeeID(), objEmployeeBean);

	}
    /**Function to update the employee object after registartion 
     * 
     * @param objEmployeeBean
     * @return String Success or Failure
     */
	public static String updateEmployee(Employee objEmployeeBean) {
		if (empMap.contains(objEmployeeBean.getEmployeeID())) {
			empMap.replace(objEmployeeBean.getEmployeeID(), objEmployeeBean);
			return "Success";
		} else {
			return "Failure";
		}
	}
}
