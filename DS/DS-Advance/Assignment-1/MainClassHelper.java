/**
 * @author Girdhari
 * Program to generate generalised list
 */
package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Starting of MainClassHelper */
public class MainClassHelper {
	
	/* Starting of main method */
	public static void main(String args[]) {

		System.out.println("Please Enter a String (Should contains 0-9, comma , (Parentheses)): ");
		String inputString = readString();
		GeneralisedList<Integer> list = new GeneralisedList<Integer>(inputString);
		GeneralisedList temp = list;
		System.out.println("\n Output: ");
		GeneralisedList.traverse(temp);
		Integer sum = GeneralisedList.sum(temp);
		System.out.println("\nSum is " + sum);
		Integer max = GeneralisedList.max(temp);
		System.out.println("\nMax is " + max);
		System.out.println("Enter data to be search");
		Integer dataSearch = readData();
		boolean isFound = GeneralisedList.find(temp, dataSearch);
		String show = "Available";
		if (!isFound)
			show = "Not " + show;
		System.out.println("Data " + dataSearch + " is " + show);
	}
	/* Ending of main method *
	
	/* Starting of readData method */
	private static int readData() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int data = 0;
		do {
			try {
				data = scanner.nextInt();
			} catch (InputMismatchException io) {
				System.out.println("Please enter correct no");
				continue;
			}
			if (data < 0) {
				System.out.println("Please enter correct no");
				continue;
			}
			break;
		} while (true);
		return data;
	}
	/* Ending of readData method */

	/* Starting of method readString */
	public static String readString() {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String input = "";
		do {
			try {
				input = bufferedReader.readLine();
			} catch (IOException io) {
				System.out.println("Error occured please enter input again");
				continue;
			}
			break;
		} while (true);
		return input;
	}
	/* Ending of method readString */
}
/* Ending of MainClassHelper */
