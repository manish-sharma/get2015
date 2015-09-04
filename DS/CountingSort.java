package sorting;
/**
 * to do counting sort
 * @author Ravika
 * @since 4/9/2015
 */
public class CountingSort {

	public CountingSort() {
		
	}
	
	/**
	 * find the maximum number and create the counting array of size maximum + 1
	 * iterate array and increase the value respect  to the index in counting array = array[i] 
	 * @param array
	 */
	public static void countingSort(int[] array) {
		int max = max(array);
		int[] countArray = new int[max + 1];
		//to update count array
		for(int index = 0; index < array.length ; index++) {
			if(array[index] < 0) {
				System.out.println(" not valid for negative number ");
				return;
			}
			countArray[array[index]]++;
		}
		int indexOfarray = 0;
		//to update array according count array
		for(int index = 0; index < max +1 ; index++) {
			for(int count = 0 ; count < countArray[index] ; count++) {
				array[indexOfarray] = index;
				indexOfarray++;
			}
		}
		
	}
	
	/**
	 * to found maximum number in array
	 * @param array
	 * @return = maximum number
	 */
	private static int max(int[] array) {
		int max = 0;
		for(int a : array) {
			if(a > max ) {
				max = a;
			}
		}
		return max;
	}
}
