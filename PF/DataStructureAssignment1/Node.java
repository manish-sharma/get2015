/**
 * @author Sumitra---- Class node
 *
 */
public class Node {

	protected int data;
	protected Node link;

	/* Constructor */
	public Node() {
		link = null;
		data = 0;
	}

	/* Constructor */
	public Node(int data, Node n) {
		this.data = data;
		link = n;
	}

	/* Function to set link to next Node */
	public void setLink(Node n) {
		link = n;
	}

	/* Function to set value to current Node */
	public void setData(int data) {
		this.data = data;
	}

	/* Function to get link to next node */
	public Node getLink() {
		return link;
	}

	/* Function to get value from current Node */
	public int getData() {
		return data;
	}

}
