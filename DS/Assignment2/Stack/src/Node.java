
@SuppressWarnings("hiding")
public class Node<Object> {
	
	/* Data members of node */
	public Object value;
	public Node<Object> next;

	/* Default Constructor */
	Node() {
		value = null;
		next = null;
	}

	/** Parameterized Constructor 
	 * 
	 * @param item : value of the node
	 */
	Node(Object item) {
		value = item;
		next = null;
	}
}
