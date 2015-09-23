package question1;

public class ArrayListMain {

	public static void main(String []args) {
		ArrayList arrayListObject = new ArrayList();
		arrayListObject.insertItem(10, 0);		//inserts element
		arrayListObject.insertItem(11, 1);
		arrayListObject.insertItem(12, 2);
		arrayListObject.insertItem(13, 3);
		arrayListObject.insertItem(14, 4);
		arrayListObject.insertItem(15, 5);
		arrayListObject.insertItem(16, 6);
		arrayListObject.insertItem(17, 7);
		arrayListObject.insertItem(18, 8);
		arrayListObject.insertItem(19, 9);
		arrayListObject.insertItem(20, 10);
		arrayListObject.printArrayList(arrayListObject);			//print the list after insertion of elements
		int array[] = arrayListObject.reverseArray(arrayListObject);
		int sizeOfArray = array.length;
		System.out.println("Reversed Array: ");
		for( int counter = 0 ; counter < sizeOfArray ; counter++) {  //to print reversed array
			System.out.print(array[counter]+ " ");
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		array = arrayListObject.sortArray(arrayListObject);
		sizeOfArray = array.length;
		
		for( int counter = 0 ; counter < sizeOfArray ; counter++) {  //to print reversed array
			System.out.print(array[counter]+ " ");
		}
		System.out.println();
		arrayListObject.clearArrayList(arrayListObject);			//clears the list
		arrayListObject.printArrayList(arrayListObject);			//print the list after cleared
		
	}
}
