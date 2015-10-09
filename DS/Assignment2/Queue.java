/**
 * @author Girdhari
 * Program to implement queue using array
 */

package queue;

import java.lang.reflect.Array;
/* Start of Queue class */
public class Queue<T> {

	private T queue[];
	private int end;
	private int start;
	private int size;
	/* Start of getters and setters */
	public T[] getQueue() {
		return queue;
	}

	public void setQueue(T queue[]) {
		this.queue = queue;
	}

	public int getFront() {
		return end;
	}

	public void setFront(int front) {
		this.end = front;
	}

	public int getRear() {
		return start;
	}

	public void setRear(int rear) {
		this.start = rear;
	}

	public int getSize() {
		return size;
	}
	/* End of getters and setters */
	/* Start of class Constructor */
	public Queue(Class<T[]> classObject, int size) {
		this.size = size;
		queue = (T[]) classObject.cast(Array.newInstance(
				classObject.getComponentType(), size));
		end = -1;
		start = -1;
	}
	/* End of class Constructor */
	/* Start of insertElement function */
	public boolean insertElement(T data) {
		if (end + start < 0)
			end = 0;
		if (start >= size) {
			System.out.println("Overflow occured queue is full");
			return false;
		}
		start++;
		queue[ start ] = data;
		return true;
	}
	/* End of insertElement function */
	/* Start of deleteElement function */
	public T deleteElement() {
		if (end == start && end == -1) {
			System.out.println("Under Flow occured queue is empty");
			return null;
		}
		T data = queue[end];
		if (end == start)
			end = start = -1;
		else
			end++;
		return data;
	}
	/* End of deleteElement function */
	/* Start of displayQueue function */
	public void displayQueue() {
		if (end + start < 0) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue is\t");
		for (int index = end; index <= start; index++) {
			System.out.print(queue[index] + "\t");
		}
		System.out.println();
	}
	/* End of displayQueue function */
	/* Start of clearAll function */
	public void clearAll() // clear all the data in queue array
	{
		end = start = -1;
		System.out.println("Queue is cleared");
	}
	/* End of clearAll function */
	/* Start of isEmpty function */
	public boolean isEmpty() {
		if (end == -1 && start == -1)
			return true;

		return false;
	}
	/* End of isEmpty function */
}
/* End of Queue class */
