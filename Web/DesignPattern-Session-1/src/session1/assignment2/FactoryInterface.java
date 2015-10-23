package session1.assignment2;

import java.util.Scanner;

/**
 * Name: FactoryInterface
 * @author Gaurav Saini
 * Since: 21-10-2015
 * Description: UserInterface
 **/

public class FactoryInterface {

	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String[] args) {

		// To store the name
		String name;

		// To store The Role
		String role;

		// To store the choice
		char choice;

		// getting instance of company
		Company company = Company.getInstance();

		// To take the Input
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("1. To add developer");
			System.out.println("2. To print list");
			int inputChoice;
			do {
				System.out.println("Enter integer value");

				while (!scanner.hasNextInt()) {
					System.out.println("Please Enternumeric Value");
					scanner.next();
				}

				inputChoice = scanner.nextInt();
			}

			while (inputChoice < 0);

			switch (inputChoice) {

			case 1:
				// adding data in list
				System.out.println("Enter name: ");
				name = scanner.next();
				System.out.println("enter role: ");
				role = scanner.next();
				company.addDeveloper(name, role);
				break;

			case 2:
				// showing list
				company.showList();
				break;

			default:
				System.out.println("enter correct choice");
				break;
			}

			// Checking the input
			System.out.println("to continue enter 'y', to stop enter 'n'");
			choice = scanner.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		scanner.close();
	}
}