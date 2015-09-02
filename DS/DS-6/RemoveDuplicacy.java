/**
 * Class to implement set to remove duplicacy of values
 * @author Sanjay
 */
import java.util.*;



public class RemoveDuplicacy extends Employee{
	public static void main(String args[]){
		Set<Employee> recordSet = new HashSet<Employee>();
		//Adding values to set
		recordSet.add(new Employee(1, "gg", "Adarsh Nagar"));
		//Adding values to set
		recordSet.add(new Employee(2, "ankur", "Pratap Nagar"));
		//Adding values to set, but this value will not add.
		recordSet.add(new Employee(1, "amit", "Jhotwara"));
		//Adding values to set
		recordSet.add(new Employee(4, "gaurav", "malviya Nagar"));
		//Adding values to set
		recordSet.add(new Employee(3, "anurag", "Cscheme"));	
		//loop to print the sets
		for(Employee e : recordSet){
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}
	}
}