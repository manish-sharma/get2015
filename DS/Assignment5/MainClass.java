/**
 * @author Girdhari
 */
package question1;

import java.util.Scanner;

/* Starting of main class */
public class MainClass {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputString = scannerObject.nextLine();
		FindOccurrence findOccurrenceObject = new FindOccurrence();
		findOccurrenceObject.findOccurrence(inputString);
		findOccurrenceObject.printOccurence();
		
	}
}
/* Ending of main class */
