package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassEmployee extends EmployeeCollection {

	public static void main(String args[]) {
		
		int choice;
		Employee employee = null;
		EmployeeCollection employeeCollectionObject = new EmployeeCollection();
		
		do {
		
			System.out.println("1. Insert Employee");
			System.out.println("2. Display Employee Order By Id");
			System.out.println("3. Display Employee Order By Name");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			
			choice = readData();
			
			switch (choice) {
			case 1:

				do {
					System.out.println("Enter Employee Details");
					employee = createEmployee();
					boolean hasInsert = employeeCollectionObject
							.addEmployeeCollection(employee);
					if (hasInsert)
						System.out.println("Employee has been added");
					else
						System.out.println("Employee Id already Exist");
					System.out.println("Press 1 for insert more Employee Details otherwise Press 2");
					choice = readData();
					if (choice == 1)
						continue;
					break;
				} while (true);
				break;

			case 2:
				if (employeeCollectionObject.getEmployeeSet().size() != 0)
					System.out.println("Display By Natural ordering(Order by Id)\n");
			
				employeeCollectionObject.displayEmployeeCollection();
				break;

			case 3:
				List<Employee> empList = new ArrayList<Employee>();
				
				empList.addAll(employeeCollectionObject.getEmployeeSet());
				Collections.sort(empList, new NameComparator());
				
				if (empList.size() != 0) {
					System.out.println("\nDisplay By Name ordering\n");
					
					for (Employee employee1 : empList) {
						System.out.println(employee1);
					}
					
				} else
					System.out.println("List is Empty");

				break;

			case 4:
				System.out.println("System Exit");
				System.exit(1);
			default:
				System.out.println("Enter correct choice");
			}

		} while (true);

	}

	public static Employee createEmployee() {
		System.out.println("Enter Employee Unique Id(In Numbers)");
		int eid = readData();
		System.out.println("Enter Employee Name");
		String ename = readString();
		System.out.println("Enter Employee Address");
		String eaddress = readString();
		return new Employee(eid, ename, eaddress);
	}

	public static String readString() {
		BufferedReader bufferedReaderObject = new BufferedReader(
				new InputStreamReader(System.in));
		String input = "";
		do {
			try {
				input = bufferedReaderObject.readLine().trim();
			} catch (IOException io) {
				System.out.println("Error occured please enter input again");
				continue;
			}
			if (!input.equals(""))
				break;
			System.out.println("Please enter correct input");
		} while (true);

		return input;
	}

	public static int readData() {
		BufferedReader bufferedReaderObject = new BufferedReader(
				new InputStreamReader(System.in));
		int data = 0;
		do {
			try {
				data = Integer.parseInt(bufferedReaderObject.readLine());
			} catch (IOException io) {
				System.out.println("Error occured please enter input again");
				continue;
			} catch (NumberFormatException nf) {
				System.out.println("Please enter correct input");
				continue;
			}
			if (data < 0) {
				System.out.println("Please enter positive no");
				continue;
			}
			break;
		} while (true);
		return data;
	}
}
