/**
 * Class to implement natural sort by employee ID
 * @author Sanjay
 */
		
import java.util.*;


public class NaturalSort  {
	
	
	public static void main(String args[]){
		List<Employee> employeeList = new ArrayList<Employee>();
		NaturalSort object = new NaturalSort();
		//Adding values to list
		employeeList.add(new Employee(1, "Sanjay", "Adarsh Nagar"));
		//Adding values to list
		employeeList.add(new Employee(2, "Ankur", "Pratap Nagar"));
		//Adding values to list
		employeeList.add(new Employee(1, "Amit", "Jhotwara"));
		//Adding values to list
		employeeList.add(new Employee(4, "gaurav", "malviya Nagar"));
		//Adding values to list
		employeeList.add(new Employee(3, "anurag", "Cscheme"));
		//Sorting values on the basis of Employee Id
		Collections.sort(employeeList);
		for(Employee e : employeeList){
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}
		
	}
}
