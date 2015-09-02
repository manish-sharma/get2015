import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MainClassCollectionEmployee extends CollectionEmployee {
	
	public static void main(String args[])
	{
		
		CollectionEmployee collectionEmployee = new CollectionEmployee();
		collectionEmployee.addEmployeeCollection( new Employee(1, "Dheeraj", "Jaipur"));
		collectionEmployee.addEmployeeCollection( new Employee(5, "Girdhari", "Jaipur"));
		collectionEmployee.addEmployeeCollection( new Employee(2, "Amit", "Jaipur"));
		collectionEmployee.addEmployeeCollection( new Employee(3, "Anurag", "Jaipur"));
		collectionEmployee.addEmployeeCollection( new Employee(4, "Sanjay", "Jaipur"));
		System.out.println("Display By Natural ordering\n");
		collectionEmployee.displayEmployeeCollection();
		List<Employee> empList = new ArrayList<Employee>();
		empList.addAll(collectionEmployee.getEmployeeSet());
		Collections.sort(empList , new NameComparator( ));
		System.out.println("\nDisplay By Name ordering\n");
		for(Employee employee : empList)
		{
			System.out.println(employee);
		}
	}

	
}
