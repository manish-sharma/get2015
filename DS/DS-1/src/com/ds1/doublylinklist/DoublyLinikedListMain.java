package com.ds1.doublylinklist;
/*This class implements main function and presents the menu which is used by user to perform the options given in operation and 
 * input is taken through console
 * @author Shishir Pareek
 * Date 25th August 2015
 */
import java.util.Scanner;

import com.ds1.linkedlist.LinkList;

public class DoublyLinikedListMain {
 
	public static void main(String args[])
	{
		DoublyLinkList doublyLinkList = new DoublyLinkList();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) { //loop to display menu to user and accept inputs
			System.out.print("\n 1. Create Linked List"
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
				doublyLinkList.createDoubleLinkList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.insertAtPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				doublyLinkList.removeByValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.removeByIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.itemRetrieval(loc);
				break;
			case 6:
				doublyLinkList.reverseList();
				break;
			case 7:
				doublyLinkList.sort();
				break;
			case 8:
				doublyLinkList.printLinkList();
				break;
			case 9:
				System.exit(0);
			}
		}
	}
}
