package com.ds8.sortingapplication;

/**
 * This class implements the quicksort sorting technique to sort the given array
 * nad return sorted array
 * 
 * @author Shishir Date 4th September 2015
 */
public class QuickSort {

	/**
	 * This function is recursive function whihc partians array in sub array ad
	 * performs the sorting among them using divide and conquer technique
	 * 
	 * @param arr
	 * @param pivot
	 * @param end
	 * @return sorted array arr
	 */
	public static int[] quickSort(int arr[], int pivot, int end) {

		int storeIndex = pivot + 1;
		for (int index = pivot + 1; index < arr.length; index++) {// loop to
																	// iterate
																	// the array
			if (arr[index] < arr[pivot]) {// if element at array is greater than
											// element at pivot position then
											// swap it it with the element at
											// storedIndex Position
				int temp = arr[index];
				arr[index] = arr[storeIndex];
				arr[storeIndex] = temp;
				storeIndex++;
			}
		}

		int temp = arr[pivot]; // after loop end swap the position of pivot
								// element and the element before the
								// storedIndex element
		arr[pivot] = arr[storeIndex - 1];
		arr[storeIndex - 1] = temp;

		if (pivot == storeIndex - 1) { // if pivot is equal to storeindex than
										// for next iteration we need to
										// increase pivot vale by 1
			pivot = pivot + 1;
			if (pivot == end - 1)// if element is reached at end
				return null;
		}
		quickSort(arr, pivot, end);// recursive function call
		return arr;
	}
}
