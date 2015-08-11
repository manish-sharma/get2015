/*Program title : sort a given array using quicksort strategy.
 * Date : 10/10/2015
 * Made by : Gaurav Saini
 * */


import java.util.Scanner;

public class QuickSort {

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;									//size holds the size of the array
		System.out.println("enter the size of the array. ");
		size = sc.nextInt();
		if (size <= 0)
			System.out.println("Size should be greater than 0. ");		//if size is less than zero then stop execution.
		else
		{
			int[] array = new int[size];				//array holds the unsorted array input by the user.
			int[] sortedArray = new int[size];			//sortedArray holds the sorted array returned from the quicksort method
			QuickSort obj1 = new QuickSort();
			System.out.println("enter the array elements. ");
			for (int i = 0; i < size; i++)				//accepting array elements from the user
				array[i] = sc.nextInt();
			int low = 0, hi = size - 1;					//low and hi are the left and right boundaries of the array.
			sortedArray = obj1.quickSort(array, low, hi);
			System.out.println("the sorted array is : \n");
			for (int i = 0; i < size; i++)
				System.out.print(" " + sortedArray[i] + "  ");
		}
		sc.close();
	}
	
	//method to sort the array. the array along with low and hi are passed as arguments.
	int[] quickSort(int[] array, int low, int hi){
		if (array.length == 0)
			return array;
		int pivotIndex = partition(array, low, hi);			//pivotIndex holds the index of the element chosen as pivot
		if (low < pivotIndex - 1)
			quickSort(array, low, pivotIndex - 1);
		if (hi > pivotIndex)
			quickSort(array, pivotIndex, hi);
		return array;									//returning the sorted array
	}
	
	//method to partition the array by determining the correct position of pivot element
	int partition(int[] array, int low, int hi){
		int pivotValue = array[low];
		while (low <= hi){								//searching number which is greater than pivot
            while (array[low] < pivotValue){
                low++;
            }											//searching number which is less than pivot, top down
            while (array[hi] > pivotValue) {
                hi--;
            }											
            if (low <= hi) {
                swap(array, low, hi);                	// swap the values
                low++;									//increment left index and decrement right index
                hi--;
            }
        }
        return low;
    }
	
	//swap method for exchanging two values in array[] at indices x and y.
	void swap(int[] array, int x, int y){
		int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
	}
}
