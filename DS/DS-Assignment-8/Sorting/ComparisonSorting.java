package Sorting;

import java.util.ArrayList;

public class ComparisonSorting extends Sorting {

	// class having two comparison method bubble sorting and quick sorting
	int size = 0;
	private static ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

		// sort method choosing the sorting type according to user input
		size = arrayList.size();

		if (size <= 10)
			return bubbleSort(arrayList);
		else {
			System.out.println(" go quickSort");
			ComparisonSorting.arrayList = arrayList;
			quickSort(0, arrayList.lastIndexOf(arrayList));
			return arrayList;
		}
	}

	private ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList) {

		// Bubble sorting logic
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				// check which element greater at position j and j+1
				if (arrayList.get(j) > arrayList.get(j + 1)) {
					// swap element at position j and j+1
					int temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(j + 1));
					arrayList.set(j + 1, temp);
				}
			}
		}
		return arrayList;
	}

	private void quickSort(int lowerBound, int upperBound) {

		// get the pivot element
		int pivot = partition(lowerBound, upperBound);
		// call the method quick sort the first half
		if (lowerBound < upperBound) {
			quickSort(lowerBound, pivot - 1);
		}
		// call the method quick sort second half
		else if (upperBound > pivot) {
			quickSort(pivot + 1, upperBound);
		}
	}

	int partition(int left, int right) {
		int pivot = left;
		int storeIndex = pivot + 1;

		for (int i = pivot + 1; i <= right; i++) {
			// check which element greater at position i and pivot
			if (arrayList.get(i) < arrayList.get(pivot)) {
				// swap element at position i and storeIndex
				Integer t = arrayList.get(i);
				arrayList.set(i, arrayList.get(storeIndex));
				arrayList.set(storeIndex, t);
				storeIndex++;
			}
		}
		// swap element at position p and storeIndex-1
		Integer i = arrayList.get(pivot);
		arrayList.set(pivot, arrayList.get(storeIndex - 1));
		arrayList.set(storeIndex - 1, i);
		return pivot;
	}
}
