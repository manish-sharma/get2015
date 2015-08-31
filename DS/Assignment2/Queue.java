/**
 * @author Girdhari
 * Program to implement queue using array
 */

package queue;

import java.lang.reflect.Array;

public class Queue<T> {

	private T queue[];
	private int end;
	private int start;
	private int size;

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

	public Queue(Class<T[]> classObject, int size) {
		this.size = size;
		queue = (T[]) classObject.cast(Array.newInstance(
				classObject.getComponentType(), size));
		end = -1;
		start = -1;
	}

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

	public void displayQueue() {
		if (end == -1 && start == -1) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue is\t");
		for (int index = end; index <= start; index++) {
			System.out.print(queue[index] + "\t");
		}
		System.out.println();
	}

	public void clearAll() // clear all the data in queue array
	{
		end = start = -1;
		System.out.println("Queue is cleared");
	}

	public boolean isEmpty() {
		if (end == -1 && start == -1)
			return true;

		return false;
	}
}
