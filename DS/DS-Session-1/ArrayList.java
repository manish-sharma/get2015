/*ArrayList Class
 * this class have several fn which implements the fn of array list
 */
package com.array.list;

import java.util.Arrays;

public class ArrayList {
	private static Object[] myStore;
	private static int listSize;
	private static int listCapacity;
	private static int index;

	/*
	 * Constructor of Class ArrayList this will set the values of class members
	 */
	ArrayList() {
		listSize = 0;
		listCapacity = 10;
		index = -1;
		myStore = new Object[listCapacity];
	}

	/*
	 * this fn will add the elements in array list
	 */
	public void add(Object value) {
		listSize++;
		if (listSize < listCapacity) {
			index = index + 1;
			myStore[index] = value;

		} else {
			System.out.println("list is full ,resizing the list");
			increaseCapacityOfArrayAndCopyElementsOfMyStore();
			index++;
			myStore[index] = value;

		}

	}

	/*
	 * this fn will add the element in array list at given location
	 */
	public void add(int index2, Object value) {

		int flag = 0;
		listSize++;
		if (index2 < listSize) {
			flag = 1;
		}
		if (flag == 1) {
			int index1 = -1;

			Object myStore1[] = new Object[myStore.length - index2];
			if (listSize < listCapacity) {

				for (int j = index2; j < listSize; j++) {
					index1++;
					myStore1[index1] = myStore[j];

				}

				myStore[index2] = value;

				for (int k = 0; k < index1; k++) {
					index2++;

					myStore[index2] = myStore1[k];
				}

				index++;
			} else {
				for (int j = index2; j < listSize; j++) {
					index1++;
					myStore1[index1] = myStore[j];

				}
				increaseCapacityOfArrayAndCopyElementsOfMyStore();

				myStore[index2] = value;
				for (int k = 0; k < index1; k++) {
					index2++;
					myStore[index2] = myStore1[k];
				}
				index++;

			}
			System.out.println("Items are added in the list");
		} else {
			System.out.println("Array index out of bound");
			listSize--;
		}
	}

	/*
	 * this fn will increase the capacity of an array whenever it is required
	 */
	private void increaseCapacityOfArrayAndCopyElementsOfMyStore() {
		listCapacity = listCapacity * 2;
		myStore = Arrays.copyOf(myStore, listCapacity);
	}

	/*
	 * this fn will return total no. of elements in array i.e. in list
	 */
	public int size() {
		return listSize;
	}

	/*
	 * this fn will return the total capacity of array i.e. of arraylist
	 */
	public int capacity() {
		return listCapacity;
	}

	/*
	 * this fn will return the value from specified position in list
	 */
	public Object get(int i) {
		if (index == -1) {
			return -1;
		} else
			return myStore[i];

	}

	/*
	 * this fn will remove item from array list from specified position
	 */
	public void remove(int index2) {
		if (index2 >= listSize) {
			System.out.println("Array index out of bound");
		} else {
			for (int i = index2 + 1; i < listSize; i++) {
				myStore[i - 1] = myStore[i];

			}
			listSize--;
			index--;
			System.out.println("Item deleted from index " + index2);
		}
	}

	/*
	 * this fn will remove given item from array list
	 */
	public void removeValue(Object value) {
		int flag = 0;
		int index2 = 0;
		for (int i = 0; i < listSize; i++) {
			if (myStore[i] == value) {
				flag = 1;
				index2 = i;
				break;
			}
		}
		if (flag == 1) {
			for (int i = index2 + 1; i < listSize; i++) {
				myStore[i - 1] = myStore[i];
			}
			listSize--;
			index--;
			System.out.println(value + " deleted");
		} else {
			System.out.println(value + " not exist in list");
		}
	}

	/*
	 * this fn will clear array list i.e. remove all elements from array list
	 */
	public void reremoveAll() {
		int flag = 0;
		if (listSize > 0) {
			flag = 1;

		}
		if (flag == 1) {
			listSize = 0;
			index = -1;
			System.out.println("All elewments are removed from list");
		} else
			System.out.println("list is already empty");
	}

	/*
	 * this fn will return the index of first occurance of an element ' after
	 * the specified position in array list
	 */
	public int retrieveFirstOccuranceOfItemAfterGivenLocation(int index2,
			Object value) {
		System.out.println(index2);
		int index1 = 0, flag = -1;
		index2++;
		for (int i = index2; i < listSize; i++) {
			if (myStore[i] == value) {
				flag = 0;
				index1 = i;
				break;
			}
		}
		if (flag == 0) {
			return index1;
		} else {
			return flag;
		}

	}

	/*
	 * this fn will return the index of first occurance of an element in array
	 * list
	 */
	public int retrieveFirstIndexOfParticularItem(Object value) {
		int index2 = 0, flag = -1;
		for (int i = 0; i < listSize; i++) {
			if (myStore[i] == value) {
				flag = 1;
				index2 = i;
				break;
			}
		}
		if (flag == 1) {
			return index2;

		} else {
			return flag;
		}
	}

	/*
	 * this fn will reverse the array list
	 */
	public void reverse() {
		Object myStore1[] = new Object[listCapacity];
		int flag = 0;
		if (listSize > 0) {
			flag = 1;

		}
		if (flag == 1) {
			int j = listSize - 1;
			for (int i = 0; i < listSize; i++) {
				myStore1[i] = myStore[j];
				j--;
			}
			for (int i = 0; i < listSize; i++) {
				myStore[i] = myStore1[i];
			}
		}

		else
			System.out.println("Can't Reverse List is empty");

	}

	/*
	 * this fn will sort the array list
	 */
	public void sort() {
		int flag = 0;
		int temp;
		for (int i = 0; i < listSize; i++) {
			if (myStore[i] instanceof Integer) {
				flag = 1;
			} else {
				break;
			}
		}
		if (flag == 1) {
			Integer[] myStore1 = new Integer[myStore.length];
			for (int i = 0; i < listSize; i++) {
				myStore1[i] = (Integer) myStore[i];
			}
			for (int i = 0; i < listSize; i++) {
				for (int j = i + 1; j < listSize; j++) {
					if (myStore1[i] > myStore1[j]) {
						temp = myStore1[i];
						myStore1[i] = myStore1[j];
						myStore1[j] = temp;
					}
				}
			}
			for (int i = 0; i < listSize; i++) {
				myStore[i] = myStore1[i];
			}
		} else {
			System.out
					.println("All elements of array list must be of same type for sorting");
		}
	}

}
