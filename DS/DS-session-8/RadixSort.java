/**radix sort class
 * 
 * @author Gaurav Saini
 * Date : 04/09/2015
 */

public class RadixSort {

	//method to sort array using radix sort technique
	static void radixSort( int[] arr,int maxElement) {
		int count;									//count is the loop variable
		int divisor = 1;							//divisor is used to get digits
		int size = arr.length;						//size holds the size of the array
		int[] tempArray = new int[size];			//to store array elements after each pass

		while (maxElement / divisor > 0) {								//to execute loop until maximum element > 0
			int[] bucket = new int[10];
			
			for (count = 0; count < size; count++)						//value in bucket is incremented by 1 at index = current digit in
				bucket[(arr[count] / divisor) % 10]++;					//												  given array

			for (count = 1; count < 10; count++)						//to set values only at those positions where values are present
				bucket[count] = bucket[count] + bucket[count - 1];

			for (count = size - 1; count >= 0; count--)					//storing result after each pass in tempArray
				tempArray[--bucket[(arr[count] / divisor) % 10]]
						= arr[count];

			for (count = 0; count < size; count++)						//copying tempArray in arr
				arr[count] = tempArray[count];
			
			divisor *= 10;						//multiply divisor by 10 for next pass
		}
	}
}