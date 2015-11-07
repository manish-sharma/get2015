package ds6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/** this class holds the collection of employees object an their corresponding functionality
 * @author Khemanshu
 *
 */
public class EmployeeCollection {

	//store the details of employee
	private HashMap<String , Employee> employeeList = new HashMap<String , Employee>();
	
	/** add employe to hash map
	 * 
	 */
	public void addEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId();
		if(employeeList.containsKey(employee.getEmployeeId())) {
			System.out.println("this employee Id already exist in database try with another one");
			addEmployee();
		}
		else {
			employee.setEmployeeName();
			employee.setEmployeeAddress();
			employeeList.put(employee.getEmployeeId(), employee);
		}
	}
	
	/** natural sorting of the list of employees
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void naturalOrderSort() {
		List<Employee> employee = new ArrayList<Employee>(employeeList.values());
		Collections.sort(employee);
		System.out.println(employee);
	}
	
	/** sorting of employees on the basis of name of employees 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void nameSort() {
		List<Employee> employee = new ArrayList<Employee>(employeeList.values());
		Collections.sort(employee, new EmployeeNameComparator());
		System.out.println(employee);
	}
	
}
