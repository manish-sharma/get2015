import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Queue {

	List<Object> queue = new LinkedList<Object>();
	/**
	 *  size function return the size of queue.
	 */
	public int size() {
		return queue.size();

	}
	/**
	 * enqueue function insert element at last in queue.
	 */
	public void enqueue(Object element) {
		queue.add(element);

	}

	/**
	 * dequeue function remove element at first in queue.
	 */
	public Object dequeue() {
		if (queue.size() == 0)
			return null;
		else
			return queue.remove(0);
	}

	/**
	 * display function display element of queue.
	 */
	public void display() {
		
		if(queue.size()==0)
			System.out.println("queue is empty");
		else
			System.out.println(queue);

	}

	/**
	 * peek function return the first element from queue.
	 */
	public Object peek() {
		if (queue.size() == 0)
			return null;
		else
			return queue.get(0);
	}
	
	
	

}