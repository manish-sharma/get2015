import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * sort the list according to the employee id
 * @author Ankur
 * @since 01-09-2015
 */

public class NaturalSort  {
	@SuppressWarnings("unchecked")
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		List<Employee> employeeList = new ArrayList<Employee>();
		/* adding data in the list */
		employeeList.add(new Employee(1, "Sanjay", "Adarsh Nagar"));
		employeeList.add(new Employee(2, "Ankur", "Pratap Nagar"));
		employeeList.add(new Employee(1, "Amit", "Jhotwara"));
		employeeList.add(new Employee(4, "gaurav", "malviya Nagar"));
		employeeList.add(new Employee(3, "anurag", "Cscheme"));
		Collections.sort(employeeList);
		for(Employee e : employeeList){
			/*print the list*/
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}	
	}
}
