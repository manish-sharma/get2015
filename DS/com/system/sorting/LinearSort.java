/**
 * @author : Pooja Khandelwal
 * @created Date : 04/09/2015
 * @Name : LinearSort
 * @Description : this class provides the function to sort the elements without comparision.There are 2 functions (countingSort() and radixSort()) to provide linear sorting.
 */
package com.system.sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class LinearSort {
	/**
	 * @Name : countingSort()
	 * @Description : this function provides linear sorting to sort the
	 *              elements.It will create an array with (lowestIndex=0 &
	 *              maxIndex=maxElement) and then store count=1 at the indices
	 *              which are equal to any element in inputArray and every time
	 *              increase count by 1 if there are more elements equals to
	 *              that index.then retrive the indices as an element for which
	 *              values greater than 0 .
	 * @param : maxElement(max element in input elements list)
	 * @param : inputArray(array of input elements)
	 * @return : inputArray(after sorting)
	 */
	public int[] countingSort(int maxElement, int[] inputArray) {
		int countArray[] = new int[maxElement + 1];
		for (int i = 0; i <= maxElement; i++) {
			countArray[i] = 0;
		}
		int count;
		for (int i = 0; i <= maxElement; i++) {
			count = 0;
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[j] == i) {
					count++;
					countArray[i] = count;
				}
			}
		}
		int index = 0;
		for (int i = 0; i < countArray.length; i++) {
			while (countArray[i] != 0) {
				inputArray[index] = i;
				index++;
				countArray[i]--;
			}
		}
		return inputArray;
	}

	/**
	 * @Name : radixSort()
	 * @Description : this function will use radixSort algorithm to sort the
	 *              elements .In this 10 lists will be used for +ve elements and
	 *              10 lists will be used for -ve elements and this lists are
	 *              stored at different index in bucket starting from 0 to
	 *              9.then for each digit we will store the elements in the list
	 *              stored at ith index equal to ith digit value of a
	 *              element.then again store the all lists elements into input
	 *              array and repeat the same process for next digit values of
	 *              all elkements.
	 * @param : totalDigitsInMaxElement(total no. of digits in maximum element)
	 * @param : inputArray(array of input elements)
	 * @return : inputArray(array of input elements)
	 */
	public int[] radixSort(int totalDigitsInMaxElement, int[] inputArray) {
		Map<Integer, ArrayList<Integer>> radixBucket = new TreeMap<Integer, ArrayList<Integer>>();
		int ithDigit = 0;
		System.out.println("*-------All steps of radix Sort-------*");
		for (int i = 1; i <= totalDigitsInMaxElement; i++) {
			System.out.println("in bucket");

			for (int j = 0; j < inputArray.length; j++) {
				System.out.println("in array");
				int k = 1;
				int remainingNo = inputArray[j];
				while (k <= i) {
					ithDigit = remainingNo % 10;
					remainingNo = remainingNo / 10;
					k++;
				}
				System.out.println(ithDigit);
				if (radixBucket.containsKey(ithDigit)) {
					ArrayList<Integer> bucket = radixBucket.get(ithDigit);
					bucket.add(inputArray[j]);
					radixBucket.put(ithDigit, bucket);
				} else {
					ArrayList<Integer> bucket = new ArrayList<Integer>();
					bucket.add(inputArray[j]);
					radixBucket.put(ithDigit, bucket);
				}
				System.out.println(radixBucket);
			}
			int q = 0;
			for (Map.Entry<Integer, ArrayList<Integer>> indexAndelemenntsList : radixBucket
					.entrySet()) {
				ArrayList<Integer> bucket = indexAndelemenntsList.getValue();
				for (int count = 0; count < bucket.size(); count++) {
					inputArray[q] = bucket.get(count);
					q++;
				}
			}
			for (int x = 0; x < inputArray.length; x++) {
				System.out.print(inputArray[x] + " ");
			}
			System.out.println();
			radixBucket.clear();
		}
		return inputArray;
	}
}
