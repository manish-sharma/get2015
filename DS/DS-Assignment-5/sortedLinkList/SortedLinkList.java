package sortedLinkList;

import java.util.LinkedList;

public class SortedLinkList {
	int index = 0;
	// using linkedList collection for storing values in sorted order
	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public void insertInToSortedLinkList(int item) {
		// Insert element in sorted order
		int index = 0;
		if (linkedList.isEmpty()) {
			linkedList.add(item);
		} else {
			java.util.Iterator<Integer> iterator = linkedList.iterator();
			while (iterator.hasNext()) {
				int data = iterator.next();
				if (data > item) {
					break;
				} else {
					index++;
					continue;
				}
			}
			linkedList.add(index, item);
		}
	}

	public void displayList() {
		// Display linked List
		java.util.Iterator<Integer> iterator = linkedList.iterator();
		System.out.print("start");

		while (iterator.hasNext()) {
			int data = iterator.next();
			System.out.print("->" + data);
		}
	}

}
