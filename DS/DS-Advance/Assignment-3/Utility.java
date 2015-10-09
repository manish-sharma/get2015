/**
 *	@author Girdhari
 *  Program to implement Puzzle problem
 */

package assignment3;

import java.util.Scanner;

/* Starting of Utility Class */
public class Utility {

	/* Starting of getCharacterInput method */
	public static char getCharacterInput(String message) {
		System.out.println(message);
		Scanner scannerObject = new Scanner(System.in);
		char input = scannerObject.next().charAt(0);
		
		if ((input == 'y' || input == 'Y') || (input == 'n' || input == 'N')) {
			return input;
		} else {
			return getCharacterInput(message);
		}
	}

	/* Ending of getCharacterInput method */

	/* Starting of getArrayInput method */
	public static int[] getArrayInput(String message) {
		System.out.println(message);
		Scanner scannerObject = new Scanner(System.in);
		int array[] = new int[9];
		for (int i = 0; i < (array.length - 1); i++) {
			array[i] = scannerObject.nextInt();
		}
		return array;
	}
	/* Ending of getArrayInput method */

}
/* Ending of Utility Class */
