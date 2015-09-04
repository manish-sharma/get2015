/**
 * @author : Pooja Khandelwal
 * @created Date : 04/09/2015
 * @Name : SortingSystem 
 * @Description : this class provides the function to sort the elements with & without comparision.i.e provides functions for comparision as well linear sorting.
 */
package com.system.sorting;

public class SortingSystem {
	private int sortedArray[];
	private int totalElements;

	/**
	 * @Name : parameterized constructor of SortingSystem class
	 * @param totalElements
	 *            (total no. of elements to be sorted)
	 */
	public SortingSystem(int totalElements) {
		this.totalElements = totalElements;
	}

	/**
	 * @Name : linearSorting()
	 * @Description : this function sorts the elements without comparision by
	 *              further calling the functions of LinearSort class.it will
	 *              call countingSort() function of LinearSort class if all
	 *              elements are +ve as well as total no. of digits in each
	 *              element less than or equal to 2.and call radixSort()
	 *              function of lLinearSort class if -ve element is present in
	 *              the list or no. of digits in any element is greater than 2.
	 * @param : inputArray(array of input elements)
	 * @return : sortedArray(array after sorting)
	 */
	public int[] linearSorting(int[] inputArray) {
		int negativeElementFlag = 0;
		LinearSort linearSort = new LinearSort();
		int maxElement = inputArray[0];
		int totalDigitsInMaxElement;
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxElement) {
				maxElement = inputArray[i];
			}
		}
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < 0) {
				negativeElementFlag = 1;
			}
		}
		totalDigitsInMaxElement = (int) (Math.log10(maxElement) + 1);
		if (totalDigitsInMaxElement <= 2 && negativeElementFlag == 0) {
			System.out
					.println("*-Since total all elemenmts are +ve and no. of digits in maximum element are less than or equal to 2(totalDigitsInMaxElement="
							+ totalDigitsInMaxElement
							+ "), so Using Counting Sort-*\n");
			sortedArray = linearSort.countingSort(maxElement, inputArray);
		} else {
			System.out
					.println("*-Since either  element is -ve or  total no of digits in maximum element are greater than 2(totalDigitsInMaxElement="
							+ totalDigitsInMaxElement
							+ "), so Using Radix Sort-*\n");
			sortedArray = linearSort.radixSort(totalDigitsInMaxElement,
					inputArray);
		}
		return sortedArray;
	}

	/**
	 * @Name : comparisionSorting()
	 * @Description : this function sorts the elements with comparision by
	 *              further calling the functions of ComparisionSort class.it
	 *              will call bubbleSort() function of ComparisionSort class if
	 *              total no. of elements are less than or equal to 10 .and call
	 *              quickSort() function of ComparisionSort class if total no.
	 *              of elements are greater than 10.
	 * @param : inputArray(array of input elements)
	 * @return : sortedArray(array after sorting)
	 */
	public int[] comparisionSorting(int[] inputArray) {
		ComparisionSort comparisionSort = new ComparisionSort();
		if (totalElements <= 10) {
			System.out
					.println("*-Since total elements are less than or equal to 10(totalElements="
							+ totalElements + "), so Using BUBBLE SORT-*\n");
			sortedArray = comparisionSort.bubbleSort(inputArray);
		} else {
			System.out
					.println("*-Since total elements are greater than 10(totalElements="
							+ totalElements + "), so Using QUICK SORT-*\n");
			int low = 0;
			int high = inputArray.length - 1;
			sortedArray = comparisionSort.quickSort(inputArray, low, high);
		}
		return sortedArray;
	}

}
