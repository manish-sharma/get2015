/**natural sorting class for sorting employee objects based on employeeId
 * 
 * @author Gaurav Saini
 * Date : 01/09/2015
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalSort {
	
	//main method
	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<Employee>();
		NaturalSort object = new NaturalSort();
		
		employeeList.add(new Employee(1, "Gaurav", "Pratap Nagar"));
		employeeList.add(new Employee(2, "Ankur", "Pratap Nagar"));
		employeeList.add(new Employee(1, "Amit", "Jhotwara"));
		employeeList.add(new Employee(4, "Sanjay", "Adarsh Nagar"));
		employeeList.add(new Employee(3, "Anurag", "Cscheme"));
		
		Collections.sort(employeeList);
		
		System.out.println("natural order sorting based on employeeId.");
		for(Employee e : employeeList)
			System.out.println(e.getEmployeeName() + "\t" + e.getEmployeeId() + "\t" + e.getEmployeeAddress());
	}
}
