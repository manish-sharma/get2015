import java.util.HashSet;
import java.util.Set;
/**
 * method to remove duplicacy in the list
 * @author Ankur
 * @since 01-09-2015
 */
public class RemoveDuplicacy extends Employee{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		Set<Employee> recordSet = new HashSet<Employee>(); // recordSet that stores only unique value
		//NaturalSort object = new NaturalSort();
		/* adding data in the recordSet */
		recordSet.add(new Employee(1, "gg", "Adarsh Nagar"));
		recordSet.add(new Employee(2, "ankur", "Pratap Nagar"));
		recordSet.add(new Employee(1, "amit", "Jhotwara"));
		recordSet.add(new Employee(4, "gaurav", "malviya Nagar"));
		recordSet.add(new Employee(3, "anurag", "Cscheme"));
		for(Employee e : recordSet){
			/* print the record set */
			System.out.println(e.getEmployeeName()+"\t"+e.getEmployeeId()+"\t"+e.getEmployeeAddress());
		}
	}
}