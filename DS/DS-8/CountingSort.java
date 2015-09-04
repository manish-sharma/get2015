/**
 * Class to implement counting sort
 * @author Sanjay
 *
 */

public class CountingSort {
	
	/**
	 * Method to implement counting sort
	 * @param array = input array
	 * @param maxValue = maximum value in the array
	 * @return sorted array
	 */
	public int[] countingSort(int[] array, int maxValue) {
		int countingArray[] = new int[maxValue+1];
		for (int i = 0; i <= array.length-1; i++){
			countingArray[array[i]]+=1;
		}
		for (int i = 1; i <= maxValue; i++){
			countingArray[i] += countingArray[i-1];
		}
		int sortedArray[] = new int[array.length];
		for (int i = array.length-1; i >= 0; i--){
			sortedArray[--countingArray[array[i]]] = array[i];
		}
		return sortedArray;
	}
	
	
	/**
	 * Method to find maximum element in the array
	 * @param array = input array
	 * @return = maximum value
	 */
	public int findMax(int[] array){
		int max = 0;
		for(int i=0;i<=array.length-1;i++){
			if(array[i]>=max){
				max=array[i];
			}
		}
		return max;
	}
}

