/**quick sort class
 * 
 * @author Gaurav Saini
 * Date : 04/09/2015
 */

public class QuickSort {

	//method to sort array using quick sort technique
	public static void quickSort(int[] arr, int left, int right) {
		int i = left;				//leftmost index for a partition
		int j = right;				//rightmost index for a partition
		int temp;					//temp variable for swapping
		int pivot = arr[(left+right)/2];		//pivot element chosen as middle element of the partition
		
		while (i <= j) {
			while (arr[i] < pivot)			//searching for value greater than pivot in left partition
				i++;
			while (arr[j] > pivot)			//searching for value smaller than pivot in right partition
				j--;
			if (i <= j) {					//swapping values
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)						//recursively calling quickSort method for left partition
			quickSort(arr, left, j);
		if (i < right)						//recursively calling quickSort method for right partition
			quickSort(arr, i, right);
	}
}