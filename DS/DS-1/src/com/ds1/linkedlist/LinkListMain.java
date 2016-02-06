package com.ds1.linkedlist;

import java.util.Scanner;

/*This classimplements main function and presents the menu which is used by user to perform the options given in operation and 
 * input is taken through console
 * @author Shishir Pareek
 * Date 25th August 2015
 */
public class LinkListMain {
	
	public static void main(String args[]) {
		LinkList linkList = new LinkList();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {//loop to displya menu 
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
				linkList.createLinkList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.insertAtPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				linkList.removeByValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.removeByIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.itemRetrieval(loc);
				break;
			case 6:
				linkList.reverseList();
				break;
			case 7:
				linkList.sortLinkedList();
				break;
			case 8:
				linkList.printLinkList();
				break;
			case 9:
				System.exit(0);
			}
		}
	}

}
