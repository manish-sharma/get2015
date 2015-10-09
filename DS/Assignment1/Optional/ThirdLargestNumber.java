/**
 * @author Girdhari
 * Program to find third largest element in the array
 */

package question6;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Start of ThirdLargestNumber class*/
public class ThirdLargestNumber {
	
	/*Start of main function */
	public static void main(String []args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		try{
			int size = scannerObject.nextInt();
			int []array = new int[size];
			for(int counter = 0 ; counter < size ; counter++) { //loop will take input of elements of array
				array [counter] = scannerObject.nextInt();
			}
			
			ThirdLargestNumber classObject = new ThirdLargestNumber();
			int thirdLargestNumber = classObject.thirdLargestNumber(array);
			System.out.println("The Third Largest Number in the list is "+thirdLargestNumber);
		}
		catch(InputMismatchException exception) {
			System.out.println("You had entered wrong value! It should be a number");
		}
		
	}
	/*End of main function */
	
	/*Start of thirdLargestNumber function*/	
	int thirdLargestNumber(int array[]) {
		int sizeOfArray = array.length - 1;
		int largest = -1, secondLargest = -1, thirdLargest = -1;
		
		for( int counter = 0 ; counter <= sizeOfArray ; counter++) {
			System.out.println(array[counter]);
			if( array[counter] > largest ) { //condition will check if current element is greater than next element
				thirdLargest = secondLargest ;          //if condition is true then shift elements to next level
				secondLargest = largest ;
				largest = array[counter] ;
			}
			else if(array[counter] > secondLargest) {
				thirdLargest = secondLargest ;
				secondLargest = array[counter];
			}
			else if(array[counter] > thirdLargest)
				thirdLargest = array[counter] ;
		}
		return thirdLargest ;
	}
	/*End of thirdLargestNumber function */

}
/*End of ThirdLargestElement class */
