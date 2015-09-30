package singlyLinkList;

import java.util.Scanner;

public class MainClass {

	public static void main(String args[]) {
		LinkedList linkList = new LinkedList();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n1. Create Linked List"
					+ "\n2. Add Element at particular Location"
					+ "\n3. Removal of an item by value "
					+ "\n4. Removal of an item by index"
					+ "\n5. Retrieval of an item by index"
					+ "\n6. Reversal of linked list"
					+ "\n7. Sorting of linked list"
					+ "\n8. Display linked list" + "\n9. Exit");
			System.out.println("\nEnter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\nEnter node value : ");
				item = sc.nextInt();
				linkList.createLinkedList(item);
				break;
			case 2:
				System.out.print("\nEnter node value : ");
				item = sc.nextInt();
				System.out.print("\nEnter Location : ");
				loc = sc.nextInt();
				linkList.insertAtParticularPosition(item, loc);
				break;
			case 3:
				System.out.print("\nEnter node value : ");
				item = sc.nextInt();
				linkList.deleteItemOnValue(item);
				break;
			case 4:
				System.out.print("\nEnter Location : ");
				loc = sc.nextInt();
				linkList.deleteItemOnIndex(loc);
				break;
			case 5:
				System.out.print("\nEnter Location : ");
				loc = sc.nextInt();
				linkList.retrievalAtIndex(loc);
				break;
			case 6:
				linkList.reverse();
				break;
			case 7:
				linkList.sortLinkedList();
				break;
			case 8:
				linkList.traversalLinkedList();
				break;
			case 9:
				sc.close();
				System.exit(0);
			}
		}
	}
}
