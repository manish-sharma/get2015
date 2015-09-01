/**
 * Class to implement the functionality of a node
 * @author Sanjay
 *
 */

public class Node {
	private int value;
	private Node next;

	Node() {
		this.value = 0;
		this.next = null;
	}

	/**
	 * Method to create the constructor
	 * @param value
	 * @param next
	 */
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * method to get the value
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * method to set the value
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * method to get the next node
	 * @return next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Method to set the next node
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
