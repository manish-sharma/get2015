import java.util.Scanner;

/**
 * @author Sumitra
 *this is tha main class in which we will call the functions that are required.
 */
public class UserInput {
	public static void main(String arg[]) {
		char contiunebook;
		FetchFromFile fetch = new FetchFromFile();
		fetch.readData();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("WELCOME TO TRAIN RESERVATION SYSTEM");
			System.out.println("Enter name");
			String name = scanner.next();
			MenuList menu = new MenuList();
			menu.displayMainMenu();
			int type = scanner.nextInt();
			DisplayTrainTimeTable display = new DisplayTrainTimeTable();
			display.display(type);
			System.out.println("Enter Source");
			String source = scanner.next();
			System.out.println("Enter Destination");
			String destination = scanner.next();
			int wanted = 0;
			UserInformation user = new UserInformation(source, destination,
					wanted, name);
			display.requiredTrain(type, user.getFrom(), user.getTo(), wanted,
					user);
			menu.continuechoice();
			contiunebook = scanner.next().charAt(0);
		} while (contiunebook == 'Y');
		scanner.close();
	}

}
