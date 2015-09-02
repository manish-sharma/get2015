/**
 * Class to implement sorting by name
 * @author Sanjay
 */
import java.util.*;

public class SortByName extends Employee{
	public static void main(String args[]){
		List<Employee> employeeList = new ArrayList<Employee>();
		//Adding values to list
		employeeList.add(new Employee(1, "gg", "Adarsh Nagar"));
		//Adding values to list
		employeeList.add(new Employee(2, "ankur", "Pratap Nagar"));
		//Adding values to list
		employeeList.add(new Employee(1, "amit", "Jhotwara"));
		//Adding values to list
		employeeList.add(new Employee(4, "gaurav", "malviya Nagar"));
		//Adding values to list
		employeeList.add(new Employee(3, "anurag", "Cscheme"));
		//Sort function overridden to sort by name
		Collections.sort(employeeList, new NameComparator());
		for(Employee e : employeeList){
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}
		
	}
}
