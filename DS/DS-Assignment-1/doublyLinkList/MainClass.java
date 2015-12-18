package doublyLinkList;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		DoublyLinkedList doublyLinkList = new DoublyLinkedList();
		
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n 1. Create DoublyLinked List"
					+ "\n 2. Add Element at particular Location"
					+ "\n 3. Removal of an item based on its value "
					+ "\n 4. Removal of an item based on its index"
					+ "\n 5. Retrieval of an item of particular index"
					+ "\n 6. Reversal of linked list"
					+ "\n 7. Sorting of linked list"
					+ "\n 8. Display linked list" + "\n 9. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				doublyLinkList.createDoublyLinkedList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.insertAtParticularPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				doublyLinkList.deleteItemOnValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.deleteItemOnIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.retrievalAtIndex(loc);
				break;
			case 6:
				doublyLinkList.reverse();
				break;
			case 7:
				doublyLinkList.sortLinkedList();
				break;
			case 8:
				doublyLinkList.traversalLinkedList();
				break;
			case 9:
				sc.close();
				System.exit(0);
			}
		}

	}

}
