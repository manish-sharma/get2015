/**node class to define the structure of the node
 * 
 * @author Gaurav Saini
 * Date : 27/08/2015
 */

public class Node<Object> {
	public Object value;
	public Node<Object> next;

	Node() {			//new empty node
		value = null;
		next = null;
	}

	Node(Object item) {		//new node with value
		value = item;
		next = null;
	}
}
