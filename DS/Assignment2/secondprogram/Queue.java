package secondprogram;
/**
 * Class repents the queue with first in first out property
 */
import java.util.Arrays;

public class Queue {
	private int front;     //index at which value is deleted
	private int rear;      //index at with value is inserted
	private int size;      //size of the queue
	Object[] queue;        //array of object type

	//Consstructor
	public Queue() {         
		front = -1;
		rear = -1;
		size = 5;
		queue = new Object[size];
	}

	//checks if queue is empty or not
	public boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	//it is used to insert a value in the queue
	public void enqueue(Object value) {
		//if queue is initially empty than front and rear values are set at first position
		if (isEmpty()) {
			front = 0;
			rear = 0;
			queue[rear] = value;
		} else if (rear == (size - 1)) {                     //if queue becomes full than size of queue is increased
			queue = Arrays.copyOf(queue, queue.length + 10);
			size = queue.length;
			rear++;
			queue[rear] = value;
		} else {                              //elements is inserted and pointer is incremented
			rear++;
			queue[rear] = value;
		}

	}

	//function is used to remove the first element iserted in the queue
	public Object dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			throw new NullPointerException();
		} else if (front == rear) {
			Object item = queue[front];
			queue[front] = null;
			front = -1;
			rear = -1;
			return item;
		} else {
			Object item = queue[front];
			queue[front] = null;
			front++;
			return item;
		}
	}

	//function used to display all values of queue
	public void traverse() {
		if (!isEmpty()) {
			int rearPointer = rear;
			int frontPointer = front;
			while (rearPointer >= frontPointer) {
				System.out.print(queue[rearPointer] + " ");
				rearPointer--;
			}
		}
	}

	//function returns the size of queue
	public int size() {
		return size;
	}

}
