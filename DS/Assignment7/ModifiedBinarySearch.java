/**
 * @author Girdhari
 * Class will perform binary search operation
 */
package question1;

/* Starting of ModifiedBinarySearch class */
public class ModifiedBinarySearch {

	private int location = -1;
	/* Starting of binarySearch function */
	public int binarySearch(int []array, int value) {
		int locationLeft = -1 ;
		int locationRight = -1 ;
		int lower = 0 ;
		int upper = array.length - 1 ;
		int mid;
		
		while(lower <= upper) {
			mid = ( lower + upper ) / 2 ;
			
			if(array[mid] == value ) {
				
				locationRight = locationLeft = location = mid;
				locationLeft = leftLinearSearch(array, location, value);
				
				if(locationLeft != location) {
					location = locationLeft ;
					return location;
				}
				else {
					locationRight = rightLinearSearch(array, location, value);
					if(locationRight != location) {
						location = locationRight ;
						return location;
					}
				}
				break;
			} else if(array[mid] > value) {
				upper = mid - 1;
			} else if(array[mid] < value ) {
				lower = mid + 1;
			}
		}
		return location;
	}
	/* Ending of binarySearch function */

	/* Starting of leftLinearSearch function */ 
	private int leftLinearSearch(int[] array, int location, int value) {
		for(int counter = location - 1; counter >= 0 ; counter--) {
			if(array[counter] == value) {
				location = counter ;
			} else {
				break;
			}
		}
		return location;
	}
	/* Ending of leftLinerSearch function */ 
	
	/* Starting of rightLinearSearch function */ 
	private int rightLinearSearch(int[] array, int location, int value) {
		for(int counter = location + 1; counter < array.length  ; counter++) {
			if(array[counter] == value) {
				location = counter ;
			} else {
				break;
			}
		}
		return location;
	}
	/* Ending of leftLinearSearch function */
	
}
/* Ending of ModifiedBinarySearch Class */
