/**
 * @author : Pooja Khamdelwal
 * @created Date : 01/09/2015
 * @Name : Queue class
 * @Description : this class will maintain the Queue functionality i.e add,remove and display the Queue elements
 * for this Queue implementation it will use LinkedList class of java
 
 *@ Why LinkedList : 1.)LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
 * Implements all optional list operations, and permits all elements (including null).
    2.)PriorityQueue is an unbounded priority queue based on a priority heap. The elements of the priority queue are ordered 
    according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor
     is used. A priority queue does not permit null elements. A priority queue relying on natural ordering also does 
     not permit insertion of non-comparable objects (doing so may result in ClassCastException).

 */
package com.queue;

import java.util.LinkedList;

public class Queue {
	private LinkedList<Object> queue = new LinkedList<Object>();

	/**
	 * @Name : add()
	 * @param : element(new element to be added to Queue)
	 * @description : it will use add() method of linkedList class and add the
	 *              new element into Queue
	 * @return : nothing
	 */
	public void add(String element) {
		queue.add(element);
	}

	/**
	 * @Name : remove()
	 * @param : nothing
	 * @description : it will use removeFirst() method of linkedList class and
	 *              remove the front element from Queue
	 * @return : removed element
	 */
	public Object remove() {
		return queue.removeFirst();
	}

	/**
	 * @Name : displayQueueElements()
	 * @param : nothing
	 * @description : it will display the elements of Queue
	 * @return : nothing
	 */
	public void displayQueueElements() {
		Object queueElements[] = new Object[queue.size()];
		for (int i = 0; i < queue.size(); i++) {
			queueElements[i] = queue.get(i);
		}
		System.out.println("*----Queue elements are----*");
		if (queueElements.length != 0) {
			for (int i = 0; i < queueElements.length; i++) {
				System.out.print(queueElements[i] + " ");
			}
		} else {
			System.out.println("Queue is empty");
		}

	}

}
