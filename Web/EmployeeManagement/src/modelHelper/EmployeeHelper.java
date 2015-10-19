package modelHelper;

import model.Employee;

/**
 * @author Anjita
 * EmployeeHelper class to create or update employee.
 */
public class EmployeeHelper {

	/**
	 * function to create employee
	 * @param id
	 * @param name
	 * @param age
	 * @param dor
	 * @param email
	 * @return : instance of employee
	 */
	public static Employee createEmployee(int id, String name, int age,
			String dor, String email) {
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setName(name);
		employee.setAge(age);
		employee.setDor(dor);
		employee.setEmail(email);
		return employee;
	}

	/**
	 * function to update employee
	 * @param employee
	 * @param name
	 * @param age
	 * @param dor
	 * @param email
	 */
	public static void updateEmployee(Employee employee, String name, int age,
			String dor, String email) {
		employee.setName(name);
		employee.setAge(age);
		employee.setDor(dor);
		employee.setEmail(email);
	}

}
