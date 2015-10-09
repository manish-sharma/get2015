/**
 * @author Girdhari
 * Class to develop a sorting system
 */
package question2;

/* Starting of Sorting class */
public class ComparsionSorting {

	/* Starting of bubbleSort function */
	int[] bubbleSort(int[] array) {
		
		int sizeOfArray = array.length - 1;
		
		for(int outerLoop = 0 ; outerLoop < sizeOfArray ; outerLoop++ ) {
		
			for(int innerLoop = 0; innerLoop < sizeOfArray - outerLoop ; innerLoop++ ) {
		
				if( array[innerLoop] > array[innerLoop + 1]) {
				
					array = swap(array, innerLoop, innerLoop + 1);
				}
			}
		}
		return array;
	}
	/* Ending of bubbleSort function */
	private int[] array;
	
	public int[] getArray() {
		return array;
	}
	private int length;
	
	 public void quickSort(int[] inputArr) {
         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.length;
	        sort(0, length - 1);
	    }
	 
	    private void sort(int lowerIndex, int higherIndex) {
	         
	        int lowerIndexNew = lowerIndex;
	        int higherIndexNew = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (lowerIndexNew <= higherIndexNew) {
	            while (array[lowerIndexNew] < pivot) {
	                lowerIndexNew++;
	            }
	            while (array[higherIndexNew] > pivot) {
	                higherIndexNew--;
	            }
	            if (lowerIndexNew <= higherIndexNew) {
	                array = swap(array, lowerIndexNew, higherIndexNew);
	                //move index to next position on both sides
	                lowerIndexNew++;
	                higherIndexNew--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < higherIndexNew)
	            sort(lowerIndex, higherIndexNew);
	        if (lowerIndexNew < higherIndex)
	        	sort(lowerIndexNew, higherIndex);
	    }
	 
	/* Starting of swap function */
	int[] swap(int[] array, int indexFirst, int indexSecond) {
		int temp = array[indexFirst];
		array[indexFirst] = array[indexSecond];
		array[indexSecond] = temp ;
		return array;
	}
	/* Ending of swap function */
}
/* Ending of Sorting class */
