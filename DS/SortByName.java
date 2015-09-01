import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * class to sort the list according to the name
 * @author Ankur
 * @since 01-09-2015
 */
public class SortByName extends Employee{
	@SuppressWarnings("unchecked")
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		List<Employee> employeeList = new ArrayList<Employee>();
		/* data entry in the list*/
		employeeList.add(new Employee(1, "gg", "Adarsh Nagar"));
		employeeList.add(new Employee(2, "ankur", "Pratap Nagar"));
		employeeList.add(new Employee(1, "amit", "Jhotwara"));
		employeeList.add(new Employee(4, "gaurav", "malviya Nagar"));
		employeeList.add(new Employee(3, "anurag", "Cscheme"));
		Collections.sort(employeeList, new NameComparator());
		for(Employee e : employeeList){
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}
	}
}
