/**
 * Class to implement Bubble Sort
 * @author Sanjay
 *
 */
class BubbleSort {
	
	/**
	 * Method to implement Bubble Sort
	 * @param array = input array of integers
	 * @return = sorted array
	 */
	public int[] bubbleSort(int[] array){
		int count,index,swap;
		for (count = 0; count < ( array.length - 1 ); count++) {
		      for (index = 0; index < array.length - count - 1; index++) {
		        if (array[index] > array[index+1]) /* For descending order use < */
		        {
		          swap       = array[index];
		          array[index]   = array[index+1];
		          array[index+1] = swap;
		        }
		      }
		    }
		return array;
	}
}