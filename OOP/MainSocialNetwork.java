/**Program to make a social network
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Arushi
 * 
 */
public class MainSocialNetwork {

	public static Scanner sc = new Scanner(System.in);

	// Main method
	public static void main(String[] args) {

		String tempName, email = null;
		int choice;
		Graph graph = new Graph();
		Processing processing = new Processing();
		processing.readPersons();// To read person details
		processing.readFriends();// To read connection details

		do {
			MenuClass.showBasicMenu();

			do {// Validation
				System.out.println("Please enter a positive number!");
				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice <= 0);

			switch (choice) {
			case 1:
				SocialNetwork.showNetwork();
				break;

			case 2:
				Entity entity = processing.acceptDetails();
				graph.addNode(entity);
				break;

			case 3:
				System.out.println("Enter name you want to remove : ");
				tempName = sc.next();
				for (Entity Object : Processing.nodeSet) {

					if (tempName.equalsIgnoreCase(Object.getName())) {
						graph.removeNode(Object);
						break;
					}
				}
				break;

			case 4:
				SocialNetwork socialNetwork = new SocialNetwork();
				System.out.println("Enter name you want to find : ");
				tempName = sc.next();
				socialNetwork.searchByName(tempName);
				break;

			case 5:
				System.out.println("Enter name whose friends list you want : ");
				tempName = sc.next();
				Iterator<Entity> entityIterator = Processing.nodeSet.iterator(); // Iterating
				// list
				// of
				// Friends
				while (entityIterator.hasNext()) {
					Entity entity2 = entityIterator.next();
					if (entity2.getName().equals(tempName)) {
						email = entity2.getEmail();
					}
				}
				for (Entity entityObject : Processing.nodeSet) {
					if (tempName.equalsIgnoreCase(entityObject.getName())) {
						Set<String> friends = SocialNetwork
								.getFriends(entityObject);
						if (friends.size() != 0) {
							System.out.println("Friends of " + tempName
									+ " are :");
							for (String friend : friends) {
								if (!friend.equals(email)) {
									System.out.println(friend);
								}
							}
						} else {
							System.out.println("No friends exist");
						}
					}
				}
				break;
			case 6:
				System.out.println("enter your name: ");
				Entity entityVariable = new Entity();
				boolean test;
				do {
					System.out.println("email : ");
					email = sc.next();
					test = entityVariable.isValidEmail(email);
					if (test == false)
						System.out
								.println("enter a valid email Id (example : abc@xyz.com)");
				} while (test == false);
				entityVariable.setEmail(email);
				System.out.println("enter friend name: ");
				Entity entitySecondVariable = new Entity();
				do {
					System.out.println("email : ");
					email = sc.next();
					test = entitySecondVariable.isValidEmail(email);
					if (test == false)
						System.out
								.println("enter a valid email Id (example : abc@xyz.com)");
				} while (test == false);
				entitySecondVariable.setEmail(email);
				SocialNetwork.connect(entityVariable, entitySecondVariable);
				break;
			case 7:
				System.out.println("enter your name: ");
				Entity entityFirst = new Entity();
				entityFirst.setEmail(sc.next());
				System.out.println("enter friend name: ");
				Entity entitySecond = new Entity();
				entitySecond.setEmail(sc.next());
				SocialNetwork.disconnect(entityFirst, entitySecond);
				break;
			default:
				System.out.println("Enter Correct Choice");
			}
			do {// validation
				System.out.println("Do you want to continue(Y/N)"); // continuing
																	// the
																	// procedure
				while (!sc.hasNext()) {
					System.out.println("That's not a character!");
					sc.next(); // this is important!

				}
				choice = sc.next().toUpperCase().charAt(0);
				if (choice == 'N')
					System.exit(0);
			} while (choice != 'Y');

		} while (choice == 'Y');
	}

}
