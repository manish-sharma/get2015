package question2;

import java.util.Scanner;

/**
 * This is the main class responsible for accepting input from the user
 * 
 * @author Riddhi
 *
 */
public class FactoryMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Company objOfCompany = Company.getInstance();
		do {
			System.out.println("\nMenu : ");
			System.out.println("1. Add developer");
			System.out.println("2. Show Developer");
			System.out.println("3. Exit  \n");
			choice = Utility.getintegerInput("Enter your choice");
			
			switch (choice) {

			case 1:
				System.out.println("Enter name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter role");
				String role = sc.nextLine();
				objOfCompany.addDevelopers(name, role);
				break;

			case 2:
				System.out.println();
				objOfCompany.showList();
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Enter a valid option");
			}
		} while (true);
	}
}
