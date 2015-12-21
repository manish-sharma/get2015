package SortingSystem;

import java.util.List;
/**
 * This class is used to perform the Comparison sort.
 * This class  implement two method Quicksort and bubble sort.
 * In Comparison sort element compare to each other and sort it.
 * @author Nikhil
 */
public class ComparisonSort {

	/**
	 * This function compares each element of list with other all element of
	 * list and after each pass maximum element of list is at its proper
	 * position.
	 * @param list to be sort
	 * @return sorted list
	 */
	
	static List<Integer> bubbleSort(List<Integer> list) {

		if (list.size() > 1) {
			for (int count = 0; count < list.size(); count++) {

				for (int lenght = 1; lenght < (list.size() - count); lenght++) {

					if (list.get(lenght - 1) > list.get(lenght)) {

						int temp = list.get(lenght);
						list.set(lenght, list.get(lenght - 1));
						list.set(lenght - 1, temp);
					}
				}
			}
		}
		return list;
	}

	/**
	 * QuickSort is a function which sort the element with quick sort algorithm
	 * 
	 * @param input is array which we want to sort it.
	 * @param StartIndex is starting index of the array
	 * @param LastIndex is ending index of array
	 */

	List<Integer> quickSort(List<Integer> list, int StartIndex, int LastIndex) {
		int partition = Partition(list, StartIndex, LastIndex);

		if (StartIndex < partition - 1)
			list = quickSort(list, StartIndex, partition - 1);

		if (LastIndex > partition)
			list = quickSort(list, partition, LastIndex);
		return list;
	}

	/**
	 * Partition is a function which is divide array in two parts.
	 * @param inputis array which we want to sort it.
	 * @param StartIndex is starting index of the array
	 * @param LastIndex is ending index of array
	 * @return left side element is smaller and right element is larger from the
	 *  return value
	 */

	int Partition(List<Integer> input, int StartIndex, int LastIndex) {
		int pivort = input.get(StartIndex);

		while (StartIndex <= LastIndex) { // check if left index does not cross
											// right index.

			while (input.get(StartIndex) < pivort) { // check left of array is
														// less than pivot
														// element.
				StartIndex++;
			}

			while (input.get(LastIndex) > pivort) { // check right of element is
													// grater than pivot
													// element.
				LastIndex--;
			}

			if (StartIndex <= LastIndex) // swap the element

			{
				int temp;
				temp = input.get(StartIndex);
				input.set(StartIndex, input.get(LastIndex));
				input.set(LastIndex, temp);
				StartIndex++;
				LastIndex--;
			}
		}

		return StartIndex;

	}
}
