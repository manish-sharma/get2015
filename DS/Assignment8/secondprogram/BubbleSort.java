package secondprogram;
/**
 * this class is used to sort an array of smaller tahn 10 elements with bubble sort
 * @author Riddhi
 *
 */
public class BubbleSort {

	public static int[] sortedArray(int arr[]) {
		int lastIndexOfUnsorted = arr.length - 1;
		boolean swapped = true;
		do {
			swapped = false;
			for (int i = 0; i < lastIndexOfUnsorted; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
			lastIndexOfUnsorted--;
		} while (swapped == true);
		return arr;
	}

}
