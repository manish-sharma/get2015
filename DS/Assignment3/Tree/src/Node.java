
public class Node {

	private Object data;
	private Node left;
	private Node right;
	
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

	public void setData(int data) {
		this.data = data;
	}

	public Node(Object data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public Node() {
		left = null;
		right = null;
	}
	
	public Object getData() {
		return data;
	}
	
}
