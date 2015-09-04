/**
 * @author : Pooja Khandelwal
 * @created Date : 04/09/2015
 * @Name : ComparisionSort
 * @Description : this class provides the function to sort the elements with comparision.There are 2 functions (bubbleSort() and quickSort()) to provide comparision sorting.
 */
package com.system.sorting;

public class ComparisionSort {
	private int index;

	/**
	 * @Nmae : bubbleSort()
	 * @Description : this function use bubbleSort algorithm to sort the
	 *              elements.In this every element will be compared with it's
	 *              adjacent in each pass and swapped if required.Total no. of
	 *              pass will be equal to total no. of elements and in each pass
	 *              total comparisions are equal to (Pass-1).
	 * @param : inputArray(array of input elements)
	 * @return : inputArray(after sorting)
	 */
	public int[] bubbleSort(int[] inputArray) {
		for (int i = inputArray.length; i > 0; i--) {
			for (int j = 0; j < (i - 1); j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					inputArray = swap(inputArray, j, j + 1);
				}
			}
		}
		return inputArray;
	}

	/**
	 * @Name : swap()
	 * @Description : this function will swap 2 elements of array
	 * @param : inputArray(array of input elements)
	 * @param : j,k(indices of the elements which has to be swapped)
	 * @return : inputArray(after swapping the elements of given indices)
	 */
	private int[] swap(int[] inputArray, int j, int k) {
		int temp;
		temp = inputArray[j];
		inputArray[j] = inputArray[k];
		inputArray[k] = temp;
		return inputArray;
	}

	/**
	 * @Nmae : quickSort()
	 * @Description : recursive function,each time it will sort the portion of
	 *              an array.It will use pivot element and partition() fuction
	 *              to sort the elements.
	 * @param : inputArray(array of input elements)
	 * @param : low(index of leftmost element in sublist to be sorted)
	 * @param : high(index of rightmost element in sublist to be sorted)
	 * @return : inputArray(after sorting)
	 */
	public int[] quickSort(int[] inputArray, int low, int high) {
		index = partition(inputArray, low, high);
		if (low < index - 1)
			quickSort(inputArray, low, index - 1);
		if (index < high)
			quickSort(inputArray, index, high);
		return inputArray;
	}

	/**
	 * @Name : partition()
	 * @Description : this function will divides the list into 2 halves and
	 *              returns the index from where list is divided into 2 halves
	 * @param : array(list of elements which has to be divided into 2 halves)
	 * @param : low(index of leftmost element in list to be divided)
	 * @param : high(index of rightmost element in list to be divided)
	 * @return : i(index ,from where list is divided into 2 halves)
	 */
	int partition(int array[], int low, int high) {
		int i = low, j = high;
		int pivot = array[(low + high) / 2];
		while (i <= j) {
			while (array[i] < pivot && i<=high)
				i++;
			while (array[j] > pivot && j>=low)
				j--;
			if (i <= j) {
				array = swap(array, j, i);
				i++;
				j--;
			}
		}
		return i;
	}
}
