/**
 * Queue
 * @author Ravika
 *
 */
public class Queue {
	Object[] array;
	int front ;   //for remove
	int rear;			//for insert
	/**
	 * purpose : to initialize array
	 * @param length= of Queue
	 */
	public Queue(int length) {
		// TODO Auto-generated constructor stub
		array =new Object[length];
		front = -1;
		rear = -1;
	}
	/**
	 * purpose : to add item in Queue
	 * @param item = to insert
	 */
	void enqueue(Object item ) {
		if(front == -1 && rear == -1) {
			front++;
			array[front] = item;
			rear++;
		} else if(rear == array.length-1) {
			System.out.println(" Overflow");
		} else {
			rear++;
			array[rear] = item;	
		}
	}
	
	/**
	 * purpose to print the item of Queue
	 */
	void printQueue() {
		for(int count = front; count <= rear ;count++) {
			System.out.println(array[count]);
		}
	}
	/**
	 * purpose : to remove the an item
	 * @return = item that has been removed
	 */
	Object dequeue( ) {
		if(front > rear) {
			System.out.println(" underflow");
			return 0;
		} else {
			Object recent = array[rear];
			front++;
			return recent;
		}
		
	}
	/**
	 * purpose : to make empty
	 */
	void makeEmpty( ) {
		front = -1;
		rear = -1;
		array = new Object[array.length];
	}
	/**
	 * purpose : to get the item last inserted
	 * @return = item last inserted
	 */
	Object getFront( ) {
		return array[rear];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}
}
