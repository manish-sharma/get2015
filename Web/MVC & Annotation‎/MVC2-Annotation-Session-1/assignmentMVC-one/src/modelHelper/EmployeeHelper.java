package modelHelper;

import model.Employee;

public class EmployeeHelper {
	public static Employee createEmployee(String name,int age,  String dateOfRegistration, String email, int id)
	{
		Employee employee = new Employee();
		employee.setAge(age);
		employee.setDateOfRegistration(dateOfRegistration);
		employee.setMail(email);
		employee.setID(id);
		employee.setName(name);
		return employee;
		
		
	}
	public static void editEmployee(Employee employee, int age, String name, String email )
	{
		employee.setName(name);
		employee.setAge(age);
		employee.setMail(email);
	}

}
