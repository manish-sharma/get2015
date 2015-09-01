package doublylinklist;

/**this class holds the data and function of nodes of doubly linked list
 * @author Khemanshu
 *
 */
public class DoublyNode {
	private int value;
	private DoublyNode next;
	private DoublyNode prev;

	public DoublyNode() {
		this.value = 0;
		this.next = null;
		this.prev = null;
	}

	/**
	 * @param value
	 * @param next
	 * @param prev
	 */
	public DoublyNode(int value, DoublyNode next, DoublyNode prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
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
	 * @return next node
	 */
	public DoublyNode getNext() {
		return next;
	}

	/**
	 * @param next
	 */
	public void setNext(DoublyNode next) {
		this.next = next;
	}

	/**
	 * @return prev node
	 */
	public DoublyNode getPrev() {
		return prev;
	}

	/**
	 * @param prev
	 */
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
}