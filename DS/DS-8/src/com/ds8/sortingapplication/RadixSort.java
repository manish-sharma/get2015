package com.ds8.sortingapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * This function implements the radix sort sorting technique
 * 
 * @author Shishir Date 4th September 2015
 */
public class RadixSort {
	/**
	 * function to perform radix sort and it takes an array and a value which is
	 * largest in the given array and returns the sorted array
	 * 
	 * @param arr
	 * @param largestValue
	 * @return
	 */
	public static int[] radixSort(int arr[], int largestValue) {
		{
			int maxBucketSize = 10; // since buckets are from 0 to 9

			List<Integer> bucket[] = new ArrayList[maxBucketSize];
			for (int index = 0; index < bucket.length; index++)
				bucket[index] = new ArrayList<Integer>();

			int count = 1;

			while (largestValue / count > 0) { // till largest number is not
												// zero iterate the loop
				for (int index = 0; index < arr.length; index++) {
					int unitsDigit = (arr[index] / count) % 10; // extracting
																// digits
																// starting from
																// MSB to LSB
					bucket[unitsDigit].add(arr[index]);// and adding these
														// element according to
														// key
				}

				int index = -1;

				for (List<Integer> item : bucket) {
					for (int item1 : item) {
						index++;
						arr[index] = item1;// putting the elements from the list
											// to the array for sorting based of
											// key extracted as units or tens or
											// so on
					}
					item.clear();
				}

				count *= 10;// increasing counter
			}
			return arr;
		}

	}
}