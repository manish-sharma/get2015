package Sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class LinearSorting extends Sorting {

	// class having two linear sorting method counting sorting and radix sorting
	int max = 0, size = 0;

	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

		// sort method choosing the sorting type according to user input
		size = arrayList.size();
		for (int i = 0; i < arrayList.size(); i++) {
			// finding maximum element
			if (arrayList.get(i) >= max) {
				max = arrayList.get(i);
			}
		}
		if (max < 100)
			// if user enter less then 100 then perform counting sorting
			return countingSort(arrayList);
		else
			// if user enter more then 100 then perform radix sorting
			return radixSort(arrayList);
	}

	private ArrayList<Integer> countingSort(ArrayList<Integer> arrayList) {

		// count sorting method
		int countArray[] = new int[max + 1];
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		// count occurrence of element
		for (int i = 0; i < size; i++) {
			countArray[arrayList.get(i)]++;
		}

		// add element to list by its occurrence in increasing order
		for (int i = 0; i < countArray.length; i++) {
			for (int j = 0; j < countArray[i]; j++) {
				arrayList1.add(i);
			}
		}
		return arrayList1;
	}

	private ArrayList<Integer> radixSort(ArrayList<Integer> arrayList) {

		ArrayList<Integer>[] arrayListArray = new ArrayList[10];
		// initializing arrayList
		for (int bucketNumber = 0; bucketNumber < arrayListArray.length; bucketNumber++) {
			arrayListArray[bucketNumber] = new ArrayList<Integer>();
		}

		int n = 0, temp;
		// counting number of digits in maximum element
		int digit = countDigitsOfMax(max);

		while (n != digit) {

			for (int i = 0; i < arrayList.size(); i++) {
				// arranging element in corresponding arrayList according to
				// remainder
				temp = arrayList.get(i) / (int) Math.pow(10, n);
				int remainder = temp % 10;
				arrayListArray[remainder].add(arrayList.get(i));
			}

			for (int k = 0, j = 0; j < arrayList.size(); k++) {
				// retrieving elements from corresponding arrayList for next
				// digit sorting
				Iterator<Integer> iterator = arrayListArray[k].iterator();
				while (iterator.hasNext()) {
					arrayList.set(j, (int) iterator.next());
					j++;
				}
				arrayListArray[k].clear();
			}
			n++;
		}
		return arrayList;
	}

	private int countDigitsOfMax(int max) {
		// method for counting
		int digit = 0;
		while (max != 0) {
			max = max / 10;
			digit++;
		}
		return digit;

	}
}
