import java.util.Comparator;

/**
 * Class used for sorting employee objects according to their name
 * 
 * @author Riddhi
 *
 */
public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		Employee emp1 = (Employee) e1;
		Employee emp2 = (Employee) e2;
		if (emp1.getName() == null && emp2.getName() == null)
			return 0;
		else
			return emp1.getName().compareTo(emp2.getName());   
	}

}
