

public class Node {
	private int value;
	private Node next;

	Node() {
		this.value = 0;
		this.next = null;
	}

	/**
	 * @param value
	 * @param next
	 */
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
