/**this class is for sorting employee objects based on employeeId
 * and remove employees with duplicate employeeId
 * 
 * @author Gaurav Saini
 * Date : 01/09/2015
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmployeeIdSort extends Employee{
	
	//main method
	public static void main(String args[]){
		Set<Employee> recordSet = new HashSet<Employee>();
		NaturalSort object = new NaturalSort();
		
		recordSet.add(new Employee(1, "Gaurav", "Pratap Nagar"));
		recordSet.add(new Employee(2, "Ankur", "Pratap Nagar"));
		recordSet.add(new Employee(1, "Amit", "Jhotwara"));
		recordSet.add(new Employee(4, "Sanjay", "Adarsh Nagar"));
		recordSet.add(new Employee(3, "Anurag", "Cscheme"));
		
		System.out.println("remove duplicate employees based on employeeId.");
		for(Employee e : recordSet)
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
	}
}