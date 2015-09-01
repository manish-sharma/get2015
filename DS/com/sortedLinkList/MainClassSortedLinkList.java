/**  
 * @author: Pooja Khandelwal
 * @created date:01/09/2015
 * @Name: MainClassSortedLinkList class
 * @Description: it will take user input and maintain sorted linked list functionality
 */
package com.sortedLinkList;

import java.awt.List;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClassSortedLinkList {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(); // LinkedList class object
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu(); // Menu class object
		SortedLinkedList sortedLinkedList = new SortedLinkedList(); // SortedLinkedList class object
		int n;
		String n1;
		int userChoice;
		String userChoice1;
		int exitFlag = 1;
		String regix = "[0-9]+";
		while (exitFlag != 0) {

			do {
				menu.displayMenu(); // call displayMenu() function of Menu class
				userChoice1 = scanner.nextLine();
			} while (!userChoice1.matches(regix));
			userChoice = Integer.parseInt(userChoice1);
			switch (userChoice) {
			case 1:
				System.out.println("Enter new element");
				String element1;
				int element;
				do {
					element1 = scanner.nextLine();
				} while (!element1.matches(regix));
				element = Integer.parseInt(element1);
				sortedLinkedList.addElements(element); // call addElements() function of SortedLinkedList class

				break;
			case 2:
				sortedLinkedList.printList(); // call printList() function of SortedLinkedList Class
				break;
			case 3:
				exitFlag = 0;
				System.out.println("*--Exit--*");
				System.exit(0);
				break;
			default:
				System.out.println("Choose Valid Option");
				break;
			}

		}

	}
}