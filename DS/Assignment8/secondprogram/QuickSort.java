package secondprogram;

/**
 *  this class is used to sort the array using quick sort if the number of
 * elements is greater than 10
 * 
 * @author Riddhi
 *
 */
public class QuickSort {

	public static int[] sortedArray(int arr[], int start, int end) {

		int pivot = start;
		int storeIndex = pivot + 1; 
		
		for (int index = pivot + 1; index < end; index++) {
			//swapping takes place if at any time pivot is smaller than the element at that index
			if (arr[pivot] > arr[index]) {
				int temp = arr[index];
				arr[index] = arr[storeIndex];
				arr[storeIndex] = temp;
				storeIndex++;
			}
		}
		
		int temp = arr[pivot];
		arr[pivot] = arr[storeIndex - 1];
		arr[storeIndex - 1] = temp;

		if (pivot == storeIndex - 1) {
			pivot = pivot + 1;
			if (pivot == end - 1)
				return arr;
		}
		sortedArray(arr, pivot, end);

		return arr;        //returns sorted array
	}
}
