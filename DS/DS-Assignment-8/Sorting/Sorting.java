package Sorting;

import java.util.ArrayList;

public class Sorting {

	void display(ArrayList<Integer> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}

class ComparisonSorting {
	int size = 0;

	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
		size = arrayList.size();

		if (size <= 10)
			return bubbleSort(arrayList);
		else {
			System.out.println(" go quickSort");
			return quickSort(arrayList);
		}

	}

	private ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (arrayList.get(j) > arrayList.get(j + 1)) {
					int temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(j + 1));
					arrayList.set(j + 1, temp);
				}
			}
		}
		return arrayList;
	}

	private ArrayList<Integer> quickSort(ArrayList<Integer> arrayList) {
		return arrayList;

	}
}

class LinearSorting {

	int max = 0, size = 0;;

	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

		size = arrayList.size();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) >= max) {
				max = arrayList.get(i);
			}
		}
		if (max < 100)
			return countingSort(arrayList);
		else
			return radixSort(arrayList);
	}

	private ArrayList<Integer> countingSort(ArrayList<Integer> arrayList) {

		int countArray[] = new int[max + 1];
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			countArray[arrayList.get(i)]++;
		}
		for (int i = 0; i < countArray.length; i++) {
			for (int j = 0; j < countArray[i]; j++) {
				arrayList1.add(i);
			}
		}
		return arrayList1;
	}

	private ArrayList<Integer> radixSort(ArrayList<Integer> arrayList) {
		ArrayList<Integer>[] arrayListArray = new ArrayList[10];
		int n = 0, temp;
		int digit = countDigitsOfMax(max);
		
		while (n != digit) {
			
			for (int i = 0; i < arrayList.size(); i++) {
				temp = arrayList.get(i) / (int) Math.pow(10, n);
				int remainder = temp % 10;
				arrayListArray[remainder].add(arrayList.get(i));
			}
			
			for (int k = 0, j = 0; j < arrayListArray.length; j++) {
				java.util.Iterator iterator = arrayListArray[k].iterator();
				while (iterator.hasNext()) {
					arrayList.set(j++, (int) iterator.next());
				}
				arrayListArray[k].clear();
			}
			n++;
		}
		return arrayList;
	}

	int countDigitsOfMax(int max) {
		int digit = 0;
		while (max != 0) {
			max = max / 10;
			digit++;
		}
		return digit;

	}

}
