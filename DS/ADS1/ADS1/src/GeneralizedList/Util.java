package GeneralizedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	/**
	 * This function takes string input from user and validate that it only
	 * contain Integers.
	 * 
	 * @return String
	 */

	public static int userInput() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nPlease Enter only integer.");
			number = userInput();
		}
		return number;
	}

	/**
	 * This function takes string input from user and validate neither it is
	 * empty nor it is contains only spaces.
	 * 
	 * @return String
	 */
	static String userInputForString() {
		Scanner scanner = new Scanner(System.in);
		String detail = scanner.nextLine();
		return detail;
	}

	/**
	 * This function used to print the displayMenue of queue.
	 * 
	 * @return String
	 */
	public static void displayMenueForList() {

		System.out.println("1. Insert Elements in list.");
		System.out.println("2. Maximum Element from list.");
		System.out.println("3. Sum of all Elements of list.");
		System.out.println("4. Search an element.");
		System.out.println("5. Display list.");
		System.out.println("6. Exit.");
		System.out.println("Please Enter your choice: ");

	}

	/**
	 * This function used to print the displayMenue of sorted Link list.
	 * 
	 * @return String
	 */
	public static void displayMenueForSortedLinkList() {

		System.out.println("Enter your choice: ");
		System.out.println("1.Insert Element in List.");
		System.out.println("2.Show list.");
		System.out.println("3.Exit.");

	}

	public static void print(Object string) {
		System.out.println(string);
	}

}
