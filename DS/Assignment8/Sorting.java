/**
 * @author Girdhari
 * Sorting is a Abstract class which will define signature of  
 */
package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Starting of Sorting class */
public class Sorting {

	/* Starting of main function */
	public static void main(String[] args) {
		LinearSort linearSortObject = new LinearSort();
		int array[] = null;
		ComparsionSorting comparisonSortObject = new ComparsionSorting();
		BufferedReader bufferedReaderObject = new BufferedReader(
				new InputStreamReader(System.in));
		Sorting classObject = new Sorting();
		try {
			System.out.println("Enter Your Choice for Algorithm Type: \n"
					+ "1. Comparision Sort \n" + "2. Linear Sort");
			int choice = Integer.parseInt(bufferedReaderObject.readLine());
			switch (choice) {
			case 1:
				array = classObject.takeInput();
				if(array.length <= 10) {
					array = comparisonSortObject.bubbleSort(array);
				} else {
					array = comparisonSortObject.quickSort(array);
				}
				break;
			case 2:
				array = classObject.takeInput();
				int largest = 0;
				for(int value : array) {
					if(largest < value ) {
						largest = value;
					}
				}
				if(largest > 99 ) {
					array = linearSortObject.radixSort(array);
				}
				else {
					array = linearSortObject.countingSort(array);
				}
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
			
			// print the sorted array
			System.out.println("Elements are: ");
			for(int elements : array) {
				System.out.print(elements+" , ");
			}
			
		} catch (NumberFormatException exception) {
			System.out.println("Not A valid number!!");
		} catch (IOException exception) {
			System.out.println("Some Input / Output related error occured!!");
		}
	}
	/* Ending of main function */

	public int[] takeInput() {

		BufferedReader bufferedReaderObject = new BufferedReader(
				new InputStreamReader(System.in));
		int[] array = null;
		try {
			System.out.println("How many element you want to enter: ");
			int length = Integer.parseInt(bufferedReaderObject.readLine());
			array = new int[length];

			System.out.println("Enter elements of Array: ");
			for (int count = 0; count < length; count++) {
				array[count] = Integer.parseInt(bufferedReaderObject
						.readLine());
			}
			
		} catch(NumberFormatException exception) {
			System.out.println("Not A valid Number!!");
		} catch(IOException exception) {
			System.out.println("Some Input / Output related error occured");
		}
		return array;
	}
}

/* Ending of Sorting class */
