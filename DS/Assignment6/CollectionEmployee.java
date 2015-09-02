import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class CollectionEmployee  {

	private Set<Employee> employeeSet;

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}
	
	public CollectionEmployee() {
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
		
		public int compare(Object o1, Object o2)
		{
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			return e1.getName().compareTo(e2.getName());
		}
	}

	
}

