/**counting sort class
 * 
 * @author Gaurav Saini
 * Date : 04/09/2015
 */

public class CountingSort {

	//method to sort array using counting sort technique
	static void countingSort(int[] arr, int maximumElement) {
		
		int size = arr.length;							//size holds the length of input array
		
		int[] bucket = new int[maximumElement + 1];		//bucket in array of size 1 more than maximumElement
		
		int bucketLength = bucket.length;				//bucketLength holds the length of bucket array
		
		for(int count = 0; count < size; count++)		//loop to fill the bucket according to the numbers in arr
			bucket[arr[count]] = bucket[arr[count]] + 1;
		
		for(int count = 0, j = 0; count < bucketLength;) {		//fill the bucket with sorted values
			if(bucket[count] != 0) {
				arr[j] = count;
				j++;
				bucket[count] = bucket[count] - 1;
			}
			else
				count++;
		}
	}
}