package ds7;

/**this class contain function of binary search
 * @author Khemanshu
 *
 */
public class BinarySearch {
	
	/** This method finds the leftmost occurrence of an element in a given array
	 * 
	 * @param itemArray : Array in which item is to be searched
	 * @param searchNumber :
	 * @param lowerBound : 
	 * @param upperBound : 
	 * @return Returns index of the leftmost occurrence of the element in the array,
	 * if the element is not fount then it returns -1
	 */
	public static int getLeftMostOccurrenceIndex(int[] itemArray, int searchNumber, int lowerBound, int upperBound) {
		//it stores the position of search element
		int index = -1;
		/* If itemArray is null or length of itemArray is zero
		 * then return -1
		 */
		if(itemArray == null || itemArray.length == 0)
			return -1;
		
		/* If length of itemArray is 1, and if searchNumber is equal to first element of array, 
		 * then return 0 */
		else if(itemArray.length == 1)
			if(itemArray[0] == searchNumber)
				return 0;
		while (lowerBound <= upperBound) {                      //invariant condition is lowerBound not equals to upperBound
			int mid = (lowerBound + upperBound) / 2;
			if (itemArray[mid] == searchNumber) {
	           index = mid;
	           upperBound = mid-1;
			}
	  
			if (itemArray[mid] < searchNumber) {
	           lowerBound = mid + 1;
			} 
			else {
	           upperBound = mid-1;
			}
		}
		return index;
	}

}
