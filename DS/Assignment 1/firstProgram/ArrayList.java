package firstProgram;
import java.util.Arrays;

public class ArrayList {

	private Object[] myArray;
	private int size = 0;

	// initialize array list object
	public ArrayList() {
		myArray = new Object[10];
	}

	// used to retrieve value at a position
	public Object get(int index) {
		if (index < size) {
			return myArray[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	// used to add object at the last
	public void add(Object obj) {
		if (myArray.length <= size) {
			myArray = Arrays.copyOf(myArray, myArray.length + 10);
		}
		myArray[size++] = obj;
	}

	// used to remove a specified object
	public Object remove(int index) {
		if (index < size) {
			Object obj = myArray[index];
			myArray[index] = null;
			int tmp = index;
			while (tmp < size) {
				myArray[tmp] = myArray[tmp + 1];
				myArray[tmp + 1] = null;
				tmp++;
			}
			size--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	// used to return the size of array list
	public int size() {
		return size;
	}

	// used to check if array list is empty
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else
			return false;
	}

	// used to clear array list and initialize all its value to null
	public void clear() {
		for (int index = 0; index < size; index++) {
			myArray[index] = null;
		}
		size = 0;
	}

	// used to retrieve the index of the given object
	public int retrieve(Object obj) {
		int index = 0;
		while (index < size) {
			if (myArray[index].equals(obj))
				return index;
			index++;
		}
		return -1;
	}

	// to retrieve index of a object after a particular location
	public int retrieveItemsBasedOnLocation(Object obj, int position) {
		int index = position - 1;
		while (index < size) {
			if (myArray[index].equals(obj))
				return index;
			index++;
		}
		return -1;
	}

	// used to reverse a array list
	public void reverse() {
		int start = 0, end = size - 1;
		Object temp;
		while (start <= end) {
			temp = myArray[start];
			myArray[start] = myArray[end];
			myArray[end] = temp;
			start++;
			end--;
		}
	}

	// used to sort values of array list
	public void sort() {

		for (int index = 0; index < size; index++) {
			int min = (int) myArray[index];
			for (int index2 = index + 1; index2 < size; index2++) {
				if (min > (int) myArray[index2]) {
					int temp = min;
					min = (int) myArray[index2];
					myArray[index2] = temp;
				}
			}
			myArray[index] = min;

		}
	}

	// used to display values of array list
	public void display() {
		for (int index = 0; index < size; index++) {
			System.out.print(get(index));
		}
	}

	// used to merge two array list together
	public void mergeLists(ArrayList list2) {
		Object[] tempArray = new Object[size + list2.size];
		int index = 0;
		for (; index < size; index++) {
			tempArray[index] = myArray[index];
		}
		for (int j=0; j < list2.size; j++) {
			tempArray[index+j] = list2.get(j);
		}
		for(index=0;index<tempArray.length;index++)
		{
			System.out.println(tempArray[index]);
		}
	}

}
