package modelHelper;

import java.util.Date;

import model.Employee;

public class EmployeeHelper {

	public static 
	Employee createEmployee(int id,String name, int age, String dor,
			String email) {

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setName(name);
		employee.setAge(age);
		employee.setDor(dor);
		employee.setEmail(email);
		return employee;
	}
	
	public static void updateEmployee(Employee employee,String name, int age,
			String email) {

	
		employee.setName(name);
		employee.setAge(age);

		employee.setEmail(email);
	}

}
