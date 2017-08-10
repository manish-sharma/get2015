package helper;

import java.util.List;

import model.Employee;
/**This class form the employee helper class for employee cache and contains the methods for the manipulation
 * and extraction of data using the method 
 * @author Shishir
 *Date 15th October 2015
 */
public class EmployeeModelHelper {
	private static EmployeeModelHelper Instance = new EmployeeModelHelper();

	/**Constructor 
	 */
	private EmployeeModelHelper() {
		EmployeeCache.addEmployee(new Employee(1, "Shishir Pareek",
				"shishir.pareek@metacube.com", 21,"16-10-2015"));
		EmployeeCache.addEmployee(new Employee(2, "Kajal",
				"kajal@gmail.com", 21,"14-06-2015"));
		EmployeeCache.addEmployee(new Employee(3, "parul",
				"parul@gmail.com", 22,"15-08-2015"));
		EmployeeCache.addEmployee(new Employee(4, "Sumit Chaudhary",
				"jatboy@gmail.com", 22,"16-10-2015"));
		EmployeeCache.addEmployee(new Employee(5, "Pankhuri",
				"pankh@gmail.com", 21,"17-09-2011"));
	}

	/**Function which returns the instance of the current object
	 * 
	 * @return Instance 
	 */
	public static EmployeeModelHelper getInstance() {
		return Instance;
	}

	/**Function to get the employee details by supplying id 
	 * 
	 * @param id
	 * @return employee cache
	 */
	public static Employee getEmployeeById(int id) {
		return EmployeeCache.getEmployeeById(id);
	}
    /**Function to get the list of all employees
     * 
     * @return list of all employee
     */
	public static List<Employee> getAllEmployees() {
		return EmployeeCache.getAllEmployees();

	}
    /**Function to add employee 
     * @param objEmployeeBean
     */
	public static void addEmployee(Employee objEmployeeBean) {
		EmployeeCache.addEmployee(objEmployeeBean);
	}
    /**Function to update the employee details 
     * 
     * @param objEmployeeBean
     * @return String Success or Failure
     */
	public static String updateEmployee(Employee objEmployeeBean) {
		return EmployeeCache.updateEmployee(objEmployeeBean);
	}
}
