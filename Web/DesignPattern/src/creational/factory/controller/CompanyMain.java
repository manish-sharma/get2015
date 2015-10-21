package creational.factory.controller;

import java.util.List;
import java.util.Scanner;

import creational.factory.model.EmployeeType;
import creational.factory.model.IEmployee;
import creational.factory.view.Menu;
/**
 * this is main class which display menu and take input from user and show output to input
 * @author Sumitra
 *
 */
public class CompanyMain {
	
	static Scanner scanner = new Scanner(System.in);
	/**
	 * this is main method
	 * @param args
	 */
	public static void main(String args[]) {
		Menu menu = new Menu();
		
		int choice =0;
		Company company = Company.getInstance();
		do {
			menu.displayMenu();
			while (!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			while (choice < 0 || choice > 2) {
				System.out.println("Please enter valid value!");
				while (!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Please Enter employee type :-\n");
				IEmployee iEmployee = null;
				String name;
				String role;
				int employeeType = -1;
				System.out.println("Press 1 to add Developer\nPress 2 to add SalesPerson");
				while (!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				employeeType = scanner.nextInt();
				while (employeeType < 1 || employeeType > 2) {
					System.out.println("Please enter valid value!");

					while (!scanner.hasNextInt()) {
						System.out.println("Please Enter only Integer!");
						scanner.next();
					}
					employeeType = scanner.nextInt();
				}
				switch (employeeType) {
				case 1:
					iEmployee = EmployeeFactory
							.getIEmployee(EmployeeType.developer);
					break;
				case 2:
					iEmployee = EmployeeFactory
							.getIEmployee(EmployeeType.salesPerson);

					break;
				}
				if (!iEmployee.equals(null)) {

					System.out.println("Enter name of Employee");
					name = scanner.next();
					System.out.println("Enter role of Employee in company");
					role = scanner.next();
					iEmployee.setName(name);
					iEmployee.setRole(role);
					company.addEmployee(iEmployee);
				}
				break;

			case 2:
				List<IEmployee> employees = company.getEmployeesList();
				for (int i = 0; i < employees.size(); i++) {
					iEmployee = employees.get(i);
					System.out.println(iEmployee);
				}
				break;
			case 0:
				scanner.close();
				System.exit(0);
				break;
			}
		} while (choice != 0);

	}
}
