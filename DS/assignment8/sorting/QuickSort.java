package sorting;
/**
 * to do quick sort
 * @author Ravika
 * @since 3/9/2015
 */

public class QuickSort {
	
	/**
	 * to divide array in 2 arrays in which left part have elements <= pivot element and right part have elements >= pivot element
	 * @param array
	 * @param left = left index of array
	 * @param right = right index of array
	 * @return = pivot elements's position in array
	 */
	private int partition(int array[], int left, int right)
	{
	      int i = left, j = right;
	      int pivot = array[ ( left + right) / 2];
	      int temp;
	     
	      while (i <= j) {
	          while (array[i] < pivot && i <= right) {
	           	 i++;
	          }
	                 
	            while (array[j] > pivot && j >= left) {
	                  j--;
	            }
	            if (i <= j) {
	                temp=array[j];
	                array[j] = array[i];
	                array[i] = temp;
	                  i++;
	                  j--;
	            }
	      }
	      return i;
	}
	 
	/**
	 * to do quick sort by dividing in parts and again apply quick sort on each part in each call one element (pivot) get its correct position
	 *  @param array
	 * @param left = left index of array
	 * @param right = right index of array
	 */
	public void quickSort(int array[], int left, int right) {
	      int index = partition(array, left, right);
	      if (left < index - 1)
	            quickSort(array, left, index - 1);
	      if (index < right)
	            quickSort(array, index, right);
	}

}