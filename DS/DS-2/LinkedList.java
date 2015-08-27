/**
 * Class to implement stack using linked list
 * @author Sanjay
 *
 */

public class LinkedList {

	static Node top = null;


	/**
	 * Method to add element to top of stack
	 * @param data
	 */
	public void insertTop(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public Node deleteTop() {
		top = top.next;
		return top;
	}

	/**
	 * Method to display stack
	 */
	public void displayList() {
		Node current = top;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	/**
	 * Method to show if the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return (top == null);
	}
}