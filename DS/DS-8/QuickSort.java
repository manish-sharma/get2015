
public class QuickSort {
	/**
	 * Method to partition the array for sorting using Quick Sort
	 * @param array = array
	 * @param left = first index
	 * @param right = last index
	 * @return
	 */
	private int partition(int array[], int left, int right)
	{
		int i = left, j = right;
		int tmp;

		// pivot is middle index
		int pivot = array[(left + right) / 2];


		// Divide into two arrays
		while (i <= j) {


			/**
			 * We will check a number from left side which is greater then the pivot value,
			 * and a number from right side which is less then the pivot value.
			 * Once search is complete, we can swap both numbers.
			 */

			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j) {
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}
		};

		return i;
	}


	/**
	 * This method implements and calls the quickSort method recursively
	 * @param array = input array
	 * @param left = index of the array
	 * @param right = length of the array
	 * @return array = the sorted array
	 */

	private int[] quickSort(int array[], int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1)
			quickSort(array, left, index - 1);
		if (index < right)
			quickSort(array, index, right);
		return array;
	}

	
	/**
	 * Sort method to call quicksort.
	 * @param array
	 * @return
	 */
	public int[] sort(int[] array){
		int left = 0;
		int right = array.length-1;
		int[] sortedArray = quickSort(array, left, right);
		return sortedArray;
	}
}
