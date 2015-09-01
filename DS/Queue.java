
import java.util.LinkedList;

/**
 * purpose : to implement Queue using LinkedList
 * @author Ravika
 * @since 1/9/2015
 * @param <E>
 */
public class Queue<E> {
	private LinkedList<String> queue;
	public Queue() {
		// TODO Auto-generated constructor stub
		queue = new LinkedList<String>();
	}
	/**
	 * purpose : delete the element from the front
	 * @return = the deleted item
	 */
	public String dequeue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty ");
			return null;
		}
		String temp = queue.peekFirst();
		queue.remove();
		return temp;
	}
	 /**
	  * purpose : to add the item in queue from the rear
	  * @param item = to add
	  */
	public void enqueue(String item) {
		queue.add(item);
	}
	 /**
	  * purpose : to print the queue
	  */
	public void printQueue() {
		System.out.println(queue);
	}
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		System.out.println("add");
		queue.enqueue("3");
		queue.enqueue("2");
		queue.enqueue("1");
		queue.printQueue();
		System.out.println("delete");
		queue.dequeue();
		queue.printQueue();
	}
}
