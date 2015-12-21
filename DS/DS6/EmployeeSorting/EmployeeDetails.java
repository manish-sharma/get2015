package EmployeeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeDetails {

	//store the details of employee
	static HashMap<String, Employee> map = new HashMap<String, Employee>();
	
	
	/** this function used to add employee into hash map.if hash map already contain employee id than this function show error message
	 * 
	 */
	static String storeEmployeeDetail() {
		String employeeId;
		String name;
		String address;
		System.out.println("Enter  employee Id");
		employeeId = Util.employeeIdInput();
		if (map.containsKey(employeeId.toLowerCase())) {
			System.out.println("Database already exists employee id .please Enter valid employee id ");
			employeeId = storeEmployeeDetail();
		} else {
			System.out.println("Enter name  of  employee");
			name = Util.employeeNameInput();
			System.out.println("Enter address of employee");
			address = Util.userInputForString();
			Employee employee = new Employee();
			employee.setEmployeeId(employeeId);
			employee.setName(name);
			employee.setAddress(address);
			map.put(employeeId.toLowerCase(), employee);
		}
		return employeeId;
	}

	public static void main(String[] args) {

		List<Employee> employees;
		int choice = 0;
		while (choice != 4) {
			System.out.println("Enter 1 to add employee");
			System.out
					.println("Enter 2 to show sorted employee list according their empId");
			System.out
					.println("Enter 3 to show sorted employee list according their name");
			System.out.println("Enter 4 to exit");
			choice = Util.userInput();
			switch (choice) {

			case 1:
				storeEmployeeDetail();
				break;
			case 2:
				if (map.size() == 0)
					System.out.println("Datbase is empty");
				else {
					employees = new ArrayList(map.values());
					Collections.sort(employees);
					System.out.println(employees);
				}
				break;
			case 3:
				if (map.size() == 0)
					System.out.println("Datbase is empty");
				else {
					employees = new ArrayList(map.values());
					Collections.sort(employees, new EmployeeNameComparator());
					System.out.println(employees);
				}
				break;
			case 4:
				choice = 4;
				break;
			default:
				System.out.println("please enter right choice");
			}
		}
	}

}
