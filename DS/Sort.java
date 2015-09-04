/**
 * sorting algorithm
 * @author Ankur
 * @since 03-09-2015
 */
public class Sort {
	/**
	 * method to sort the user array by bubble sort algorithm
	 * @param array... user array
	 * @return..sorted array
	 */
	public int[] bubbleSort(int[] array){
		for (int count1 = 0; count1 < ( array.length - 1 ); count1++) {
			for (int count2 = 0; count2 < array.length - count1 - 1; count2++) {
				/* For ascending order use  */
				if (array[count2] > array[count2 + 1]){
					swappingNumbers(array, count2, count2 + 1);
				}
			}
		}
		return array;
	}
	/**
	 * method to swap two numbers
	 * @param array,,, user array
	 * @param firstNumber.... first number to be swapped
	 * @param secondNumber... second number to be swapped
	 */
	private void swappingNumbers(int[] array,int firstNumber, int secondNumber) {
		int temp = array[firstNumber];
		array[firstNumber] = array[secondNumber];
		array[secondNumber] = temp;
	}
	/**
	 * method to sort the user array by quick sort algorithm
	 * @param array...user input array
	 * @param lowerIndex
	 * @param higherIndex
	 * @return...sorted array
	 */
	public int[] quickSort(int[] array,int lowerIndex,int higherIndex){

		int leftIndex = lowerIndex;
		int rightIndex = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		//partitioning the array
		while (leftIndex <= rightIndex) {
			while (array[leftIndex] < pivot) {
				leftIndex++;
			}
			while (array[rightIndex] > pivot) {
				rightIndex--;
			}
			if (leftIndex <= rightIndex) {
				swappingNumbers(array,leftIndex, rightIndex);
				leftIndex++; //move index to next position on both sides
				rightIndex--;
			}
		}

		if (lowerIndex < rightIndex)		// call quickSort method recursively
			quickSort(array,lowerIndex, rightIndex);
		if (leftIndex < higherIndex)
			quickSort(array,leftIndex, higherIndex);
		return array;
	}
	/**
	 * method to sort the user array by radix sort algorithm
	 * @param array
	 * @param maximumElement...maximum value in the array
	 */
	public  void radixSort( int[] array,int maximumElement)
	{
		int count, divisor = 1, lengthOfArray = array.length;
		int[] temporaryArray = new int[lengthOfArray];
		while (maximumElement / divisor > 0)
		{
			int[] bucket = new int[10];

			for (count = 0; count < lengthOfArray; count++)
				bucket[(array[count] / divisor) % 10]++;
			for (count = 1; count < 10; count++)
				bucket[count] = bucket[count] + bucket[count - 1];
			for (count = lengthOfArray - 1; count >= 0; count--)
				temporaryArray[--bucket[(array[count] / divisor) % 10]] = array[count];
			for (count = 0; count < lengthOfArray; count++)
				array[count] = temporaryArray[count];
			divisor *= 10;        
		}
	}   
	/**
	 * method to sort the user array by count sort algorithm
	 * @param array
	 * @return...sorted array
	 */
	public int[] sort( int[] array )
	{
		int lengthOfArray = array.length;
		//		if (lengthOfArray == 0)
		//			return null;

		int maximumValue = array[0];
		int minimumValue = array[0];
		for (int i = 1; i < lengthOfArray; i++)
		{
			if (array[i] > maximumValue)
				maximumValue = array[i];
			if (array[i] < minimumValue)
				minimumValue = array[i];
		}
		int range = maximumValue - minimumValue + 1;
		/** check if maximum value is greater than 99 than it use count sort algorithm **/
		/**  else it use radix sort algorithm
		 * **/
		if (maximumValue > 99)
		{
			System.out.println("\nradix sorting is done:");
			radixSort(array,maximumValue);
			return array;
		}
		else{
			System.out.println("\ncount sorting is done:");
			int[] temporaryArray = new int[range];

			/** make count/frequency array for each element **/
			for (int count = 0; count < lengthOfArray; count++)
				temporaryArray[array[count] - minimumValue]++;

			/** modify count so that positions in final array is obtained **/
			for (int count = 1; count < range; count++)
				temporaryArray[count] += temporaryArray[count - 1];

			/** modify original array **/
			int count1 = 0;

			for (int count2 = 0; count2 < range; count2++)
				while (count1 < temporaryArray[count2])
					array[count1++] = count2 + minimumValue;

			return array;
		}    
	}
}
