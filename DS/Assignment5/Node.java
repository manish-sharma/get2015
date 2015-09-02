/** 
 * @author Girdhari
 * Node class for linkedList, it will handle node related data
 */

package question3;

/* Starting of Node class */
public class Node {

	private int data;
	private Node nextNode;

	// class constructor
	public Node(int data) {
		this.data = data;
	}

	/* Starting of getters and setters */
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	/* Ending of getters and setters */

}
/* Ending of Node class */
