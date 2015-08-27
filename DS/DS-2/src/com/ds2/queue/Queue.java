package com.ds2.queue;
/*class which implements the queue function of enqueue and dequeue of elements*
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class Queue {
	 private Object[] array;
	    private int size;

	    public Queue() {
		array = new Object[5];
		size = 0;
	    }

	    // will return the size of queue
	    public int size() {
		return size;
	    }

	    // will add the element into the queue at rear
	    public void enqueue(Object object) {
		if (size < array.length) {
		    array[size] = object;
		    size++;
		} else {
		    Object[] newArray = new Object[array.length + 5];
		    for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		    }
		    newArray[size] = object;
		    size++;
		    array = newArray;
		}
	    }

	    // will remove element from front in queue
	    public Object dequeue() {
		Object val = array[0];
		// resetting values in the queue
		for (int i = 0; i < size-1 ; i++) {
		    array[i] = array[i + 1];
		}
		size--;

		return val;
	    }

	    public void makeEmpty() {
		size = 0;
	    }

	    // will return front element without removing it
	    public Object getFront() {
		if (size > 0)
		    return array[0];
		else
		    return null;
	    }

	    // will show every element
	    public void display() {
		for (int i = 0; i < size; i++) {
		    System.out.println(array[i]);
		}
	    }
}
