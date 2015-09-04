/**bubble sort class
 * 
 * @author Gaurav Saini
 * Date : 04/09/2015
 */

public class BubbleSort {

	//method to sort array using bubble sort technique
	public static void bubbleSort(int[] arr) {
		int size = arr.length;

		for (int pass = 1; pass < size; pass++)			//pass variable represents current pass
			for (int i = 0; i < size-pass; i++)
				if (arr[i] > arr[i+1]) {				//putting maximum element at last position in each pass
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
	}
}