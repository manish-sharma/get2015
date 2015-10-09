/**
 * @author Girdhari
 */
package question1;

import java.util.Scanner;

/* Starting of main class */
public class MainClass {
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		System.out.println(args[0]);
		String inputString = args[0];
		FindOccurrence findOccurrenceObject = new FindOccurrence();
		findOccurrenceObject.findOccurrence(inputString);
		findOccurrenceObject.printOccurence();
		
	}
}
/* Ending of main class */
