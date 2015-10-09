package question2;

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
		arrayListObject.insertItem(170, 7);
		arrayListObject.insertItem(18, 8);
		arrayListObject.insertItem(19, 9);
		arrayListObject.insertItem(20, 10);
		arrayListObject.printArrayList(arrayListObject);			//print the list after insertion of elements
		
		ArrayList arrayListObject1 = new ArrayList();
		arrayListObject1.insertItem(10, 0);		//inserts element
		arrayListObject1.insertItem(11, 1);
		arrayListObject1.insertItem(12, 2);
		arrayListObject1.insertItem(13, 3);
		arrayListObject1.insertItem(14, 4);
		arrayListObject1.insertItem(15, 5);
		arrayListObject1.insertItem(16, 6);
		arrayListObject1.insertItem(170, 7);
		arrayListObject1.insertItem(18, 8);
		arrayListObject1.insertItem(19, 9);
		arrayListObject1.insertItem(20, 10);
		arrayListObject1.printArrayList(arrayListObject1);		
		int array[] = new int[20];
		array = arrayListObject.mergeList(arrayListObject1);
		System.out.println();
		int sizeOfArray = array.length;
		for( int counter = 0 ; counter < sizeOfArray ; counter++) {  //to print reversed array
			System.out.print(array[counter]+ " ");
		}
	}
}
