/**
 * @author Pooja Khandelwal
 * @created date 10/06/2015
 * @name GeneralizedListMain
 * @description Main class to create generalized list
 */
package com.main;

import java.util.Scanner;
import com.linkedlist.List;
import com.validate.ListValidation;

public class GeneralizedListMain {
	public static void main(String[] args) {
		List list = new List();
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int choice = -1;
		do {
			printMenu();
			while (!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			while (choice < 1 || choice > 8) {
				System.out.println("Please enter valid integer!");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Enter the Input ");
				input = scanner.next();
				break;
			case 2:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				System.out.println(ListValidation.isInputValid(input));
				break;
			case 3:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				list = new List(input);
				break;
			case 4:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				list.traverse();
				break;
			case 5:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				System.out.println("Max = " + list.max());
				break;

			case 6:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				System.out.println("Sum = " + list.sum());
				break;

			case 7:
				if (input == null) {
					System.out.println(" Please first Enter The input ");
					break;
				}
				System.out.println("Enter an element to find");
				while (!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				int searchingElement = scanner.nextInt();
				System.out.println("Find = " + list.find(searchingElement));
				break;
			case 8:
				scanner.close();
				System.exit(0);
			}
		} while (choice != 8);

		// list = new List("(3,4,(1,2),5,6,7,(8))");
	}

	/**
	 * @name printMenu()
	 * @description this method willdisplay menu to the user
	 * @param
	 * @return
	 */
	public static void printMenu() {
		System.out
				.println(" Enter 1for give the input \n 2 for the Check the validity of input \n 3 "
						+ "for the list Creation \n 4 for the list display \n 5 for the Maximum Number in List \n 6 for the Sum Of elements "
						+ "\n 7 to find the element in List \n 8 for Exit");
	}
}
