import java.util.LinkedList;

/**
 * Class that performs all queue related operations using linked list predefined
 * methods
 * 
 * @author Riddhi
 *
 */
public class Queue {
	LinkedList<Integer> linkedList;

	// Constructor
	public Queue() {
		linkedList = new LinkedList<Integer>();
	}

	// method to add element in the queue
	public void enqueue(int element) {
		linkedList.addLast(element);
	}

	// method to remove element from front end in queue and return element
	public int dequeue() {
		if (linkedList.isEmpty()) {
			throw new NullPointerException();
		}
		return (linkedList.removeFirst());
	}

	// method to display elements present in the list
	public String toString() {
		String result = "";
		for (Integer s : linkedList) {
			result += "\n" + s;
		}
		return result;
	}

}
