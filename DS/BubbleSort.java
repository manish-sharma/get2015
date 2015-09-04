package sorting;
/**
 * to do sorting using bubble sort
 * compare adjacent elements and swap if element on index > element on index + 1
 * in each pass greatest element get its proper position 
 * @author Ravika
 * @since 3/9/2015
 */

public class BubbleSort {

	public BubbleSort() {
		
	}
	
	/**
	 * to swap two adjacent elements in array
	 * @param array = in which the two elements are present
	 * @param index = to swap index and index+1 element
	 */
	private static void swap(int[] array, int index) {
		array[index] = array[index] + array[index + 1];
		array[index + 1] = array[index] - array[index + 1];
		array[index] = array[index] - array[index + 1];
	}
	
	/**
	 * to do bubble sort
	 * compare adjacent elements and swap if element on index > element on index + 1
	 * in each pass greatest element in (length - pass -1) size array get place
	 * @param array = to sort
	 */
	public static void bubbleSort(int[] array) {
		for(int pass = 0; pass < array.length; pass++) {
			for(int iteration = 0; iteration < array.length - pass -1 ; iteration++) {
				if(array[iteration] > array[iteration + 1]) {
					swap(array, iteration);
				}
			}
		}
	}	
	
	
}
