/**
 * Class that creates a node for tree
 * 
 * @author Riddhi
 * 
 */
public class Node {
	private int data; // value in the node
	private Node left; // left link of the node
	private Node right; // right link of the node

	// Constructor
	public Node(int data) {
		this.data = data;
	}

	// getter setter for private data members
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
