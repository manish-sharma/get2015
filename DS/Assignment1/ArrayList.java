package question1;

import java.util.Arrays;

public class ArrayList {
	private final int DEFAULT_SIZE = 10;
	private int array[] ;
	private int sizeOfArray = DEFAULT_SIZE;
	
	public ArrayList() {
		this.array = new int[DEFAULT_SIZE];
	}

	/* Start of printArrayList function */
	void printArrayList(ArrayList arrayListObject) {
		if(arrayListObject.array == null){
			System.out.println();
			System.out.println("Array is empty");
		}
		else {
			System.out.println("List is: ");
			for( int counter = 0 ; counter < arrayListObject.array.length - 1 ; counter++ ) {
				System.out.print(arrayListObject.array[counter]+ " ");
			}
		}
	}
	/* End of printArrayList function */
	
	/*Start of insertItem function */
	void insertItem(int element, int position) {
		if(position >= sizeOfArray) {
			increaseSizeOfArray();
		}
		array[position] = element ;
	}
	/* End of insertItem function */
	
	/* Start of increaseSizeOfArray function */
	private void increaseSizeOfArray() {
		sizeOfArray = sizeOfArray * 2;
		array = Arrays.copyOf(array, sizeOfArray);
		
	}
	/* End of increaseSizeOfArray function */
	
	/* Start of reverseArray function */
	int []reverseArray(ArrayList arrayObject) { //returns a reversed arrayList
		
		int arraySize = arrayObject.array.length -1;
		int []reversedArray = new int[arraySize + 1];
		System.out.println();
		for( int counter = arraySize ; counter >= 0 ; counter-- ) {
			reversedArray[arraySize - counter] = arrayObject.array[counter];
		}
		return reversedArray;
	}
	/* end of reverseArray function */
	
	/* Start of sortArray function */
	int []sortArray() {	//returns the sorted array
		int arraySize = this.array.length - 1;  
		int []sortedArray = array;
		for(int loopCounter1 = 0 ; loopCounter1 < arraySize - 1 ; loopCounter1++) {
			for( int loopCounter2 = 0 ; loopCounter2 < arraySize - loopCounter1 - 1; loopCounter2++) {
				if( sortedArray[loopCounter2] > sortedArray[loopCounter2 + 1] ) {
					int temp = sortedArray[loopCounter2] ;
					sortedArray[loopCounter2] = sortedArray[loopCounter2 + 1];
					sortedArray[loopCounter2 + 1] = temp;
				}
			}
		}
		return sortedArray;
	}
	
	/* End of sortArray function */
	
	/* Start of clearArrayList function */
	void clearArrayList(ArrayList arrayObject) {
		arrayObject.array = null;
	}
	
	/* End of clearArrayList function */
	
	/*
	
	/* Start of firstOccurence function */
	int firstOccurence(int element) {
		int counter = -1;
		for( counter = 0 ; counter < this.array.length -1 ; counter++) {
			if( this.array[counter] == element) {
				break;
			} else continue ;
		}
		return counter;
	}
	/* End of firstOccurence function */
	
	/* Start of firstOccurence function */
	int firstOccurence(int element, int position) {
		int counter;
		for( counter = position ; counter < this.array.length -1 ; counter++) {
			if( this.array[counter] == element) {
				break;
			} else continue ;
		}
		return counter;
	}
	/* End of firstOccurence function */
	
	/* Start of insertAtLocation function */
	void insertAtLocation(int element, int position) {
		int size = array.length - 1 ;
		if(size +1 > sizeOfArray) {
			increaseSizeOfArray();
		}
		int temp;													//variable to store intermediate exchange data
		for( int counter = size ; counter > position ; counter-- ) {
			this.array[counter + 1] = this.array[counter];
		}
		array[position] = element ;
	}
	/* End of insertAtLocation function */
	
	/* Start of deleteElementOnLocation function */
	void deleteElementOnLocation(int location) {
		int count;
		for( count = location ; count < array.length - 1 ; count++) {
			array[count] = array[count + 1 ] ;
		}
		array[ count -1 ] = 0;
	}
	/* End of deleteElementOnLocation function */

	/* Start of deleteElement function */
	void deleteElement(int element) {
		int position = firstOccurence(element);
		if( position == -1) {
			System.out.println("Element Doesn't Exist in the array!!");
		} else {
			deleteElementOnLocation(position);
		}
		
	}
	/* End of deleteElement function */
	
}
