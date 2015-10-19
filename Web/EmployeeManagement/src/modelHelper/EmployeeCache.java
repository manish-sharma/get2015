package modelHelper;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.Employee;

/**
 * @author Anjita
 * class EmployeeCache for storing a map having empId as key and Employee as value.
 */
public class EmployeeCache {
	public static Map<Integer, Employee> employeeCache = new ConcurrentHashMap<Integer, Employee>();

	/**
	 * @param e : instance of employee class to be mapped in map
	 */
	public static void add(Employee e) {
		employeeCache.put(e.getEmployeeId(), e);
	}

	/**
	 * @param EmpId : used as key to fetch value from map
	 * @return : instance of employee corresponding to key empId
	 */
	public static Employee getByEmpId(int empId) {
		if (employeeCache.containsKey(empId)) {
			return employeeCache.get(empId);
		} else {
			return null;
		}
	}

	/**
	 * @return : all the values of map.
	 */
	public  static List<Employee> getAllEmployee() {
         List<Employee> employeeList=new LinkedList<Employee>(employeeCache.values());
         for(Employee e : employeeList) {
 			System.out.println("Classsss = "+e.getName());
 		}
		return (employeeList); 
	}

}
