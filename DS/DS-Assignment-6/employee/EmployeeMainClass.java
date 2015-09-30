package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMainClass {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		java.util.List<Employee> employeeList = new ArrayList<Employee>();
		String choice = "";

		while (true) {
			try {
				System.out.print("\n1. Insert Employee Detail"
						+ "\n2. Sort By Employee Id" + "\n3. Sort By Name\n"
						+ "4. Exit\nEnter Your Choice : ");
				choice = scanner.next();

				switch (choice) {
				case "1":
					//case to insert employee data
					System.out.println("Enter employee ID : ");
					String employeeId = scanner.next();
					System.out.println("Enter employee name : ");
					String employeeName = scanner.next();
					System.out.println("Enter employee address : ");
					String employeeAddress = scanner.next();
					employeeList.add(new Employee(employeeId, employeeName, employeeAddress));
					break;

				case "2":
					//case to sorting employee data by Id
					Collections.sort(employeeList);
					System.out
							.println("---------Sorted By Employee Id----------");
					System.out.println("T" + employeeList);
					break;

				case "3":
					//case to sorting employee data by name
					Collections.sort(employeeList, new SortingByName());
					System.out
							.println("------------Sorted By Employee Name---------");
					System.out.println(employeeList);
					break;

				case "4":
					System.exit(0);

				default:
					System.out.println("Enter a valid choice");
					break;
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
