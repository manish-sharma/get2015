/**
 * @author Girdhari
 * Class to implement logics of linear Sorting algorithms like counting sort, radix sort etc.
 */
package question2;


/* Starting of LinearSort class */
public class LinearSort {

	/* Starting of countingSort function */
	int[] countingSort(int[] array) {
		int largest = 0;
		int counter = 0;

		for (int number : array) { // loop to find largest element of array
			if (number > largest) {
				largest = number;
			}
		}

		int[] frequencyArray = new int[largest + 1]; // declaration of array

		for (int number : array) { // set frequency of array
			frequencyArray[number] = frequencyArray[number] + 1;
		}

		for (int number = 0; number < frequencyArray.length; number++) { // populate sorted array
			if (number == 0) {
				continue;
			} else {
				for (int loopCounter = 0; loopCounter < frequencyArray[number]; loopCounter++) {
					array[counter] = number;
					counter++;
				}
			}
		}
		return array;
	}
	/* End of countingSort function */

	/* Starting of radixSort function */
	int[] radixSort(int[] array) {
		int lengthOfArray = array.length;				//length of array
		int[] sortedArray = new int[lengthOfArray];		//sorted Array
		int exponent = 1;								//for exponent
		int largest = 0;								//largest element of array
		int loopCounter = 0;
		for (int number : array) { 						/* loop to find largest element 
														   of array */
			if (number > largest) {
				largest = number;
			}
		}
		while (largest / exponent > 0) { /* loop to iterate to total number of digits in
								 array */
			int[] bucket = new int[10];

			for (loopCounter = 0; loopCounter < lengthOfArray; loopCounter++) {	
				/* Loop to find frequency of element */
				bucket[(array[loopCounter] / exponent) % 10]++;
			}
			//loop to add frequency of current and previous element */
			for (loopCounter = 1; loopCounter < 10; loopCounter++)
				bucket[loopCounter] += bucket[loopCounter - 1];
			
			//loop will populate sortedArray
			for (loopCounter = lengthOfArray - 1; loopCounter >= 0; loopCounter--)
				sortedArray[--bucket[(array[loopCounter] / exponent) % 10]] = array[loopCounter];
			
			//loop to change original array to sortedArray intermediate copy
			for (loopCounter = 0; loopCounter < lengthOfArray; loopCounter++)
				array[loopCounter] = sortedArray[loopCounter];
			
			exponent *= 10;
		}
		return sortedArray;
	}
	/* Ending of radixSort function */
}
/* Ending of LinearSort class */
