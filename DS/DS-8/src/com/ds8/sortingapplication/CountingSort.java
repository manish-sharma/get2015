package com.ds8.sortingapplication;

/**
 * This class implements counting sort logic
 * 
 * @author Shishir Date 4th September 2015
 */
public class CountingSort {
	/**
	 * this function implements the count sort logic and return the sorted array
	 * 
	 * @param arr
	 * @return arr(sorted)
	 */
	public static int[] countSort(int arr[]) {
		try {
			int max = arr[0];
			int min = arr[0];

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > max)
					max = arr[i];
				if (arr[i] < min)
					min = arr[i];
			}

			int range = max - min + 1;
			int count[] = new int[range];
			for (int index = 0; index < arr.length; index++) {
				count[arr[index] - min]++;
			}

			for (int index = 1; index < range; index++) {
				count[index] += count[index - 1];
			}

			int counter = 0;
			for (int index = 0; index < range; index++) {
				while (counter < count[index]) {
					arr[counter++] = index + min;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
}
