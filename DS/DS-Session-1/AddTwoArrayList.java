/*AddTwoArrayList Class
 * this class will add items in array lists and merge two array lists
 */
package com.add.array.list;

import java.util.Arrays;

public class AddTwoArrayList {
	private Object[] myStore;
	private int listSize;
	private int listCapacity;
	private int index;

	/*
	 * Constructor of Class AddTwoArrayList this will set the values of class
	 * members
	 */
	AddTwoArrayList() {
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
	 * this fn will concatenate 2 array list
	 */
	public AddTwoArrayList concatnate(AddTwoArrayList arrayList1,
			AddTwoArrayList arrayList2) {

		AddTwoArrayList arrayList = new AddTwoArrayList();
		int i;
		for (i = 0; i < arrayList1.listSize; i++) {
			arrayList.add(arrayList1.myStore[i]);
		}
		for (i = 0; i < arrayList2.listSize; i++) {
			arrayList.add(arrayList2.myStore[i]);

		}
		return arrayList;
	}

}
