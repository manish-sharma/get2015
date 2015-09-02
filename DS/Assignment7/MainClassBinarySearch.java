/**
 * @author Girdhari
 * Class contains main function
 */
package question1;

/* Starting of MainClassBinarySearch class */
public class MainClassBinarySearch {
	
	/* Starting of main function */
	public static void main(String[] args) {
		ModifiedBinarySearch binarySearchObject = new ModifiedBinarySearch();
		int array[] = {1,3,5,5,6,7,9,10,33,49};
		int value = 5;
		int location = binarySearchObject.binarySearch(array, value);
		if(location == -1 ) {
			System.out.println("Element doesn't exist in the array!!");
		} else {
			System.out.println("Element found on "+location);
		}
	}
	/* Ending of main function */

}
/* Ending of MainClassBinarySearch class */
