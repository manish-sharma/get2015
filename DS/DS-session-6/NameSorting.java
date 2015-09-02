/**class for sorting employee objects based on employeeName
 * 
 * @author Gaurav Saini
 * Date : 01/09/2015
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorting extends Employee{
	
	public static void main(String args[]){
		List<Employee> employeeList = new ArrayList<Employee>();
		NaturalSort object = new NaturalSort();
		
		employeeList.add(new Employee(1, "Gaurav", "Pratap Nagar"));
		employeeList.add(new Employee(2, "Ankur", "Pratap Nagar"));
		employeeList.add(new Employee(1, "Amit", "Jhotwara"));
		employeeList.add(new Employee(4, "Sanjay", "Adarsh Nagar"));
		employeeList.add(new Employee(3, "Anurag", "Cscheme"));
		
		Collections.sort(employeeList, new NameComparator());
		
		System.out.println("sorting by name.");
		for(Employee e : employeeList)
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
	}
}
