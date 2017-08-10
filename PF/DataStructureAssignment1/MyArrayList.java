import java.util.Arrays;

/**
 * @author Sumitra---- This class is all about implementing array list by array
 *
 */
public class MyArrayList {

	Object arrayNew[];

	private Object[] myStoreArray; // It is an array to store object type
									// values.
	private int actSize = 0; // It resembles the current node

	public MyArrayList() { // Constructor calling
		myStoreArray = new Object[10];
	}

	public Object get(int index) { // Function to return value at the index
									// point
		if (index < actSize) {
			return myStoreArray[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) { // Function to add values
		if (myStoreArray.length - actSize <= 1) {
			increaseListSize(); // Calling function to increase size
		}
		myStoreArray[actSize++] = obj;// adding element at its right place
	}

	/**
	 * Function to add item at particular position
	 * 
	 * @param object
	 *            ---object type integer
	 * @param index
	 *            ----position at which we have to add
	 */
	public void addItem(Object object, int index) {
		int length = myStoreArray.length;
		if (index > length || index > actSize) {
			System.out.println("Index value must by less than length of array."
					+ " currently length of array is: " + actSize);
		} else {
			if (myStoreArray.length - actSize <= 1) {
				increaseListSize(); // Calling function to increase size
			}

			for (int count = actSize; count > index; count--) // loop to shift
																// all elements
																// by one
			{
				myStoreArray[count] = myStoreArray[count - 1];
			}
			myStoreArray[index] = object;
			actSize++;
		}
	}

	/**
	 * Function to sort the element using bubble sort
	 */
	public void sort() {
		for (int count = 0; count < actSize; count++) {
			for (int count1 = count + 1; count1 < actSize; count1++) {
				int temp;
				if ((int) myStoreArray[count] > (int) myStoreArray[count1]) {
					temp = (int) myStoreArray[count];
					myStoreArray[count] = myStoreArray[count1];
					myStoreArray[count1] = temp;
				}
			}
		}
	}

	/**
	 * function to delete data
	 * 
	 * @param index
	 *            ---at which point you want to delete data
	 * @return---Returning the new array list
	 */
	public void removeAtIndex(int index) {

		if (index < actSize) {

			myStoreArray[index] = null;
			int tempVar = index;
			while (tempVar < actSize) {
				myStoreArray[tempVar] = myStoreArray[tempVar + 1];
				myStoreArray[tempVar + 1] = null;
				tempVar++;
			}
			actSize--;

		} else {
			System.out.println("Not Possible");
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	/**
	 * Function to reverse the array
	 */
	public void reverse() {
		Object[] arrayNew = new Object[actSize];
		int countArray = actSize - 1;
		for (int count = 0; count < actSize; count++) {
			arrayNew[count] = myStoreArray[countArray];
			countArray--;
		}
		myStoreArray = arrayNew;
	}

	/**
	 * to clear the array
	 */
	public void clear() {
		Object[] arrayNew = new Object[10];
		myStoreArray = arrayNew;
		actSize = 0;
	}

	/**
	 * @param object
	 *            ---remove a particular element
	 */
	public void remove(Object object) {
		int count;
		for (count = 0; count < actSize; count++) {
			if (myStoreArray[count] == object)
				break;
		}
		for (int counter = count; counter < actSize; counter++) {
			myStoreArray[counter] = myStoreArray[counter + 1];
		}
		actSize--;
	}

	/**
	 * @param object
	 *            ---element to trace
	 * @param index
	 *            --- index from which to search
	 * @return----returning index
	 */
	public int firstOcccurence(Object object, int index) {
		for (int count = index; count < actSize; count++) {
			if ((int) object == (int) myStoreArray[count]) {
				return count;
			}
		}
		return -1;
	}

	/**
	 * @param object
	 *            ----element to search Function to return the first appearance
	 *            from initial
	 * @return
	 */
	public int firstIndex(Object object) {
		for (int count = 0; count < actSize; count++) {
			if ((int) object == (int) myStoreArray[count]) {
				return count;
			}
		}
		return -1;
	}

	/**
	 * Program to show the elements
	 */
	public void show() {
		for (int count = 0; count < actSize; count++) {
			System.out.println(myStoreArray[count]);
		}
	}

	public int size() {
		return actSize;
	}

	/**
	 * Function to merge the list
	 * 
	 * @param object
	 *            ---to be add
	 */
	public void merge(MyArrayList object) {
		int totalLength = this.actSize + object.actSize;

		if (totalLength >= this.actSize) {

			this.arrayNew = new Object[totalLength];
			for (int count = 0; count < this.actSize; count++) {
				this.arrayNew[count] = this.myStoreArray[count];
				System.out.println("" + this.arrayNew[count]);
			}

			int secondArrayCount = 0;
			for (int count = this.actSize; count < totalLength; count++) {
				this.arrayNew[count] = object.myStoreArray[secondArrayCount];
				secondArrayCount++;
			}
			this.myStoreArray = this.arrayNew;
			this.actSize = totalLength;
		}

	}

	/**
	 * Function to increase the list size
	 */
	private void increaseListSize() {
		myStoreArray = Arrays.copyOf(myStoreArray, myStoreArray.length * 2);
		System.out.println("\nNew length: " + myStoreArray.length);
	}

}
