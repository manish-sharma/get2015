package queueByCollection;

import java.util.LinkedList;

public class Queue {
	LinkedList<Object> queue = new LinkedList<Object>();

	// Add element at rear position
	public boolean enqueue(Object element) {
		queue.addLast(element);
		return true;
	}

	// Remove element from front 
	public Object dequeue() {
		if (queue.size() > 0) {
			Object element = queue.removeFirst();
			return element;
		} else {
			// throw underflow exception
			throw new ArrayIndexOutOfBoundsException(
					"Queue is empty");
		}
	}
}
