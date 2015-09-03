package ds6;

import java.util.Comparator;

/** this class override the comparator function of comparator interface
 * @author Khemanshu
 *
 */
public class EmployeeNameComparator  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee employeeNameOfFirstPerson=(Employee)o1;
		
		Employee employeeNameOfSecondPerson=(Employee)o2;
			
		return employeeNameOfFirstPerson.getEmployeeName().compareTo(employeeNameOfSecondPerson.getEmployeeName());
	}

}
