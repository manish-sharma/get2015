package com.ds8.sortingapplication;

/**
 * This class contains a static function which implement the sorting for bubble
 * sort*
 * 
 * @author Shishir Date 4th Sep 2015
 */
public class BubbleSort {
	/**
	 * static function to implement bubbleSort
	 * 
	 * @param arr
	 * @return array of type integer
	 */
	public static int[] bubbleSort(int arr[]) {
		for (int index = 0; index < arr.length - 1; index++) { // loop to
																// traverse
																// array
			for (int counter = 0; counter < arr.length - index - 1; counter++) { // loop
																					// to
																					// traverse
																					// array
																					// and
																					// comparison
																					// of
																					// elements
				if (arr[counter] > arr[counter + 1]) { // if current element is
														// greater than next
														// than swap it
					int temp = arr[counter];
					arr[counter] = arr[counter + 1];
					arr[counter + 1] = temp;
				}
			}
		}
		return arr;
	}
}
