import java.util.Comparator;
/**
 * to compare on the basis of Employee Name
 * @author Ravika
 * @since 1/9/2015
 */

@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator {

	public NameComparator() {
		
	}
	@ Override
	public int compare(Object object1, Object object2) {
	
		Employee employee1 = (Employee)object1;
		Employee employee2 = (Employee)object2;
		return (employee1.getName()).compareTo(employee2.getName());
	}

}
