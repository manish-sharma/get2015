/**  
 * @author: Pooja Khandelwal
 * @created date:01/09/2015
 * @Name: SortedLinkedList class
 * @Description: it will add the elements into linkedList in sorted manner and print the elements of sorted linkedList
 *
 */
package com.sortedLinkList;

import java.util.LinkedList;

public class SortedLinkedList {
	private static int listIndex = 0;
	private LinkedList<Object> linkedList = new LinkedList<Object>();

	/**
	 * @Name : addElement()
	 * @param : element(new element to be added into linked list)
	 * @description : recursive function ,which will add new element into linked
	 *              list in sorted manner
	 * @return : nothing
	 */
	public void addElements(Object element) {
		if (linkedList.size() == 0) {
			linkedList.add(element);
		} else if ((int) linkedList.get(linkedList.size() - 1) < (int) element) {
			linkedList.add(element);
		} else if ((int) linkedList.get(listIndex) >= (int) element) {
			Object lastElement = linkedList.get(linkedList.size() - 1);
			int k = linkedList.size() - 1;

			for (int j = linkedList.size() - 2; j >= listIndex; j--) {
				linkedList.set(k, linkedList.get(j));
				k--;
			}
			linkedList.add(lastElement);
			linkedList.set(listIndex, element);
			listIndex = 0;
		} else {
			listIndex++;
			addElements(element);
		}
	}

	/**
	 * @Name : printList()
	 * @param : nothing
	 * @description : it will display the elements of sorted linked list
	 * @return : nothing
	 */
	public void printList() {
		Object[] listElements = new Object[linkedList.size()];
		for (int i = 0; i < linkedList.size(); i++) {
			listElements[i] = linkedList.get(i);
		}
		for (int i = 0; i < listElements.length; i++) {
			System.out.println(listElements[i]);
		}
	}

}
