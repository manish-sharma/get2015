package Assignment2;

import java.util.Scanner;
/**
 * FactoryInterface is the user interface
 * @author Ankur
 * Since: 21 October,2015
 **/
public class FactoryInterface
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String[] args)
	{
		// To store the name
		String name;
		// To store The Role
		String role;
		// To store the Choice
		char choice;
		// getting instance of company
		Company company = Company.getInstance();
		// To take the Input
		Scanner scanner = new Scanner(System.in);
		do 
		{
			System.out.println("Press 1 .To add developer");
			System.out.println("Press 2 .To print list");
			int inputChoice;
			do
			{
				System.out.println("Enter integer value");
				// Checking The Validation
				while (!scanner.hasNextInt())
				{
					System.out.println("Please Enter numeric Value");
					scanner.next();
				}
				inputChoice = scanner.nextInt();
			} 
			while (inputChoice < 0);
			// Checking the input
			switch (inputChoice)
			{
			case 1:
				// adding data in list
				System.out.println("Enter name---");
				name = scanner.next();
				System.out.println("enter role---");
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
			System.out.println("want to continue press y)");
			choice = scanner.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		scanner.close();
	}

}
