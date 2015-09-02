import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * to make the collection of Employee
 * to remove duplication
 * to sort on the basis of Employee Id
 * to sort on the basis of Employee Name
 * @author Ravika
 * @since 1/9/2015
 */
public class EmpolyeeCollection {

	public EmpolyeeCollection() { 
		
	}
	void printEmployeeList(List<Employee> list) {
		for(int index = 0 ;index < list.size(); index++ ) {
			Employee employee = list.get(index);
			System.out.println(employee.getEmpId() + "\t" + employee.getName() + "\t" + employee.getAddress());
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EmpolyeeCollection empolyeeCollection = new EmpolyeeCollection();
		Scanner scanner = new Scanner(System.in);
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(5, "ravi", "kota"));
		employeesList.add(new Employee(4, "sumit", "jaipur"));
		employeesList.add(new Employee(5, "priti", "ajmer"));
		employeesList.add(new Employee(7, "pooja", "jodhpur"));
		employeesList.add(new Employee(8, "reena", "kota"));
		System.out.println("list of Employees after insertion ");
		empolyeeCollection.printEmployeeList(employeesList);
		
		//to remove duplication
		
		Set<Employee> setEmployee = new TreeSet<Employee>(employeesList);
		employeesList = new ArrayList<Employee>(setEmployee);
		System.out.println("list of Employees after remove duplicetion ");
		empolyeeCollection.printEmployeeList(employeesList);
		
		
		// sort on the basis of Employee Id
		Collections.sort(employeesList);
		System.out.println("list of Employees after sort on the basis of Employee Id ");
		empolyeeCollection.printEmployeeList(employeesList);
		
		// sort on the basis of Employee Name
		Collections.sort(employeesList, new NameComparator());
		System.out.println("list of Employees after sort on the basis of Employee Name ");
		empolyeeCollection.printEmployeeList(employeesList);
		scanner.close();
		
	
	}
}
