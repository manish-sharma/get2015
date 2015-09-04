/**main class for sorting system
 * user selects the type of sorting to be used i.e. comparison sort or linear sort
 * we use quick sort for 10 or more elements else we use bubble sort
 * we use radix sort if maximum value is three digits or more else we use counting sort
 * 
 * @author Gaurav Saini
 * Date : 04/09/2015
 */

import java.util.Arrays;
import java.util.Scanner;

public class MainSortingSystem {

	static int size;				//size of array to be sorted
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n\nenter your choice.\n\t1. comparison sorting"		//showing menu
					+ "\n\t2. linear sorting\n\t3. exit");
			int choice = sc.nextInt();
			
			System.out.println("enter number of elements.");
			size = sc.nextInt();
			System.out.println("enter numbers to sort.");
			
			int[] arr = new int[size];
			for (int i = 0; i < size; i++)						//enter unsorted array
				arr[i] = sc.nextInt();

			switch (choice) {
			case 1:							//comparison sort case
				if (size > 10) {			//size > 10 so we use quickSort method
					System.out.println("number of elements > 10. using quick sort method.\n");
					int left = 0;
					int right = arr.length - 1;
					QuickSort.quickSort(arr, left, right);
				}
				else {						//size < 10 so we use bubbleSort method
					System.out.println("number of elements <= 10. using bubble sort method.\n");
					BubbleSort.bubbleSort(arr);
				}
				
				System.out.println("sorted array is : ");			//show the sorted array
				for (int i : arr)
					System.out.print(i + " ");
				break;

			case 2:							//linear sort case
				if (getMax(arr) > 99) {				//maximum element with three or more digits so we use radix sort
					System.out.println("maximum element > 99. using radix sort method.\n");
					RadixSort.radixSort(arr, getMax(arr));
				}
				else {								//maximum element with two or less digits so we use counting sort
					System.out.println("maximum element < 99. using counting sort method.\n");
					CountingSort.countingSort(arr, getMax(arr));
				}
				
				System.out.println("sorted array is : ");			//show the sorted array
				for (int i : arr)
					System.out.print(i + " ");
				break;

			case 3:				//exit case
				System.exit(0);
				break;

			default:			//default case
				System.out.println("enter one of the above options only!");
				break;
			}
		} while (true);
	}
	
	//method to get the maximum value from unsorted array
	static int getMax(int[] arr) {
		int[] tempArray = arr.clone();
		Arrays.sort(tempArray);
		return tempArray[size - 1];
	}
}