package assignmentDS_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTest 
{
	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String args[])
	{
		Set <Employee> set = new HashSet<Employee>();
		set.add(new Employee(1,"neha","A"));
		set.add(new Employee(1,"ritu","A"));
		set.add(new Employee(4,"richa","A"));
		set.add(new Employee(3,"chetna","A"));
		set.add(new Employee(2,"nidhi","A"));
		List<Employee> list=new ArrayList<Employee>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,new NameComparator());
		System.out.println(list);
		
	}
	
	
	

}
