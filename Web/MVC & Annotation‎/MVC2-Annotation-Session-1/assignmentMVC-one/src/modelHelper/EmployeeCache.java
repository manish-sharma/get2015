package modelHelper;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.Employee;

public class EmployeeCache {
	
	public static Map<Integer, Employee> employeeCache =new ConcurrentHashMap<Integer, Employee>();
	
	public static void addEmployee(Employee employee)
	{
		if(employeeCache.containsKey(employee.getID()))
		{
			((ConcurrentHashMap<Integer, Employee>) employeeCache).replace(employee.getID(),employee);
			
		}
		else
		{
			employeeCache.put(employee.getID(), employee);
			
		}
		
	}
	
	public static Employee getEmployeeById(int id)
	{
		if(employeeCache.containsKey(id))
		{
			return employeeCache.get(id);
		}
		else
		{
			return null;
		}
			
	}
	public static List<Employee> allEmployees()
	{
		List<Employee> employeeList = new LinkedList<Employee>(employeeCache.values());
		
		for(int i=0;i<employeeList.size();i++)
		{
			
			System.out.print(employeeList.get(i));
		}
		return employeeList;
		
	}
	

}
