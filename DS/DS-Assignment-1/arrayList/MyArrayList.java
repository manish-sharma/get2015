package arrayList;

public class MyArrayList {
	private int myArray[];
	private int size = 0;

	public MyArrayList() {
		myArray = new int[10];
	}

	// will merge two lists <q.2>
	public int[] mergeLists(int[] list1, int[] list2) {
		int[] tempArray = new int[list1.length + list2.length];
		int i = 0;
		for (; i < list1.length; i++) {
			tempArray[i] = list1[i];
		}
		for (; i < list2.length; i++) {
			tempArray[i] = list2[i];
		}
		list1 = tempArray;
		return list1;
	}

	// Adding an item into array list and check if list is full, then resizing
	// the arraylist
	public void addElement(int item) {
		if (size < myArray.length) {
			myArray[size] = item;
			size++;
		} else {
			int newArray[] = new int[myArray.length + 5];
			for (int i = 0; i < myArray.length; i++) {
				newArray[i] = myArray[i];
			}
			newArray[size] = item;
			size++;
			myArray = newArray;
		}
	}

	// Adding an item into array list at the given particular location i
	public int[] addElementAtPosition(int index, int item) {
		for (int i = size; i > index; i--) {
			myArray[i] = myArray[i - 1];
		}
		myArray[index] = item;
		size++;
		return myArray;
	}

	// Retrieving the first occurrence of an item
	public int retrievingPosition(int obj) {
		for (int i = 0; i < size; i++) {
			if (myArray[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	// Retrieving the first occurrence of an item based on its given location
	public int retrievingPositionBasedOnLocation(int obj, int position) {
		for (int i = position; i < size; i++) {
			if (myArray[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	// Removing an item based on particular location
	public int[] removeAtIndex(int index) {
		for (int i = index; i < size; i++) {
			myArray[i] = myArray[i + 1];
		}
		size--;
		return myArray;
	}

	// Remove given particular item from the arraylist
	public int[] removeItem(int item) {
		for (int i = 0; i < size; i++) {
			if (myArray[i] == item) {
				for (int j = i; j < size - 1; j++) {
					myArray[j] = myArray[j + 1];
				}
			}
		}
		size--;
		return myArray;
	}

	// print all elements
	public void printAllElements() {
		for (int i = 0; i < size; i++) {
			System.out.println(myArray[i]);
		}
	}

	// Return Reverse of arraylist
	public int[] reverseArrayList() {
		int[] tempArray = new int[size];
		for (int i = size; i > 0; i--) {
			tempArray[i] = myArray[i];
		}
		return myArray;
	}

	// will return value at given position
	public int getItem(int index) {
		return myArray[index];
	}

	// Clear the list i.e. remove all the elements of the list
	public void clearList() {
		size = 0;
	}

}
