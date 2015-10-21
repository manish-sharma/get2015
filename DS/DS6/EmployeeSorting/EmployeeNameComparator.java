package EmployeeSorting;

import java.util.Comparator;

/** this class override the comparator function of comparator interface
*
*/
public class EmployeeNameComparator  implements Comparator{

	/**override function of Comparator interface which is compare the employee name of two employee
  */
	@Override
	public int compare(Object o1, Object o2) {
		Employee employeeNameOfFirstPerson=(Employee)o1;
		
		Employee employeeNameOfSecondPerson=(Employee)o2;
			
		return employeeNameOfFirstPerson.getName().compareTo(employeeNameOfSecondPerson.getName());
	}

}
