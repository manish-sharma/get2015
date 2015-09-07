/**
 * @author Girdhari
 * This class will handle all the employee related operation using collections
 */
package question1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class EmployeeCollection  {

	private Set<Employee> employeeSet;

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}
	
	public EmployeeCollection() {
		employeeSet = new  TreeSet<Employee>();
	}
	
	public boolean addEmployeeCollection(Employee employee)
	{
		if(employeeSet.add(employee))
			return true;
		return false;
	}
	
	public void displayEmployeeCollection()
	{
		if(employeeSet.size()==0)
		{
			System.out.println("Set is empty");
			return ;
		}
		for(Employee employee : employeeSet)
		{
			System.out.println(employee);
		}
	}
	
	public static class NameComparator implements Comparator<Object>
	{	
		
		public int compare(Object object1, Object object2)
		{
			Employee employee1 = (Employee)object1;
			Employee employee2 = (Employee)object2;
			return employee1.getName().compareTo(employee2.getName());
		}
	}

	
}

