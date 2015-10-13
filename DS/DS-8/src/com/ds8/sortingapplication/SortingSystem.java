package com.ds8.sortingapplication;

public class SortingSystem {
	/**
	 * This class makes sure that decision is made based on number of input and
	 * hence depending upon that type of sort is called
	 * 
	 * @author Shishir Pareek Date 4th September 2015
	 * 
	 */
	/**
	 * function to display array
	 * 
	 * @param arr
	 */
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/**
	 * function to obtain maximum number in array
	 * 
	 * @param arr
	 * @return max
	 */
	public int checkMaximumNumber(int arr[]) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 100)// if array elements contains some element greater
				// or equal to 100
				return 0;
			else {
				if (arr[i] > max)// if array element is greater than maximum
					// value
					max = arr[i];// update max with new element
			}
		}
		return max;
	}

	/**
	 * function to select comparison sort based on length of input
	 * 
	 * @param arr
	 * @return string
	 */
	public String selectComparisonSort(int arr[]) {
		if (arr.length <= 10) { // if array size is less than 10
			return "Bubble Sort";
		} else {

			return "Quick Sort";

		}
	}

	/**
	 * function to select linear sort using dependent upon number
	 * 
	 * @param num
	 * @return string
	 */
	public String selectLinearSort(int num) {

		if (num == 0) {

			return "Radix Sort";
		} else {

			return "Counting Sort";
		}
	}

}