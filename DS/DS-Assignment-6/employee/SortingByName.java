package employee;

import java.util.Comparator;

public class SortingByName implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		//method sorting employee data by name
		Employee employe1 = (Employee) o1;
		Employee employee2 = (Employee) o2;
		return employe1.getEmployeeName()
				.compareTo(employee2.getEmployeeName());
	}

}
