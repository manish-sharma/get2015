package sortedLinkList;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		SortedLinkList sortedLinkList = new SortedLinkList();
		Scanner scanner = new Scanner(System.in);
		while (true) {

			try {

				System.out.println("\n1. Insert in linklist"
						+ "\n2. Display linklist" + "\n3. exit"
						+ "\nEnter your choice : ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					// Insert in linked list
					System.out.print("Enter a value : ");
					int item = scanner.nextInt();
					sortedLinkList.insertInToSortedLinkList(item);
					break;

				case 2:
					// Display linked list
					sortedLinkList.displayList();
					break;

				case 3:
					System.exit(0);

				default:
					System.out.println("Please enter valid choice");
					scanner.close();
					break;
				}
			} catch (Exception e) {
				System.out.print(e);
				System.exit(0);
			}
		}

	}

}
