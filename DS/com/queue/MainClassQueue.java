/**
 * @author : Pooja Khamdelwal
 * @created Date : 01/09/2015
 * @Name : MainClassQueue class
 * @Description : this class will take user input and then maintain the Queue functionality
 */
package com.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainClassQueue {
	public static void main(String args[]) {
		Menu menu = new Menu(); // Menu class object
		Queue queue = new Queue(); // Queue class object
		String regix = "[0-9]+";
		Scanner scanner = new Scanner(System.in);
		int exitFlag = 1;
		int userChoice;
		String userChoice1;
		String element;
		while (exitFlag != 0) {
			do {
				menu.displayMenu(); // call displayMenu() function of Menu class
				userChoice1 = scanner.nextLine();
			} while (!userChoice1.matches(regix));
			userChoice = Integer.parseInt(userChoice1);
			switch (userChoice) {
			case 1:
				System.out.println("Enter new element");
				element = scanner.nextLine();
				queue.add(element); // call add() function of Queue class
				System.out.println(element + " is added into the Queue");
				break;
			case 2:
				try {
					Object deletedElement = queue.remove(); // call remove() function of Queue class
					System.out.println(deletedElement
							+ " is deleted from Queue");
				} catch (NoSuchElementException ex) {
					System.out.println("Queue is already empty");
				}
				break;
			case 3:
				queue.displayQueueElements(); // call displayQueueElements() function of Queue class
				break;
			case 4:
				System.out.println("*----Exit----*");
				System.exit(0);
				break;
			default:
				System.out.println("give valid input");
				break;
			}
		}
	}

}
