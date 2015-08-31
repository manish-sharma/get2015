/**
 * @author Sumitra this is the POGO class for binary search tree node.
 */
public class BinarySearchTreeNode {
	int data;
	BinarySearchTreeNode leftNode;
	BinarySearchTreeNode rightNode;

	public BinarySearchTreeNode(int data) {

		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}

	public BinarySearchTreeNode() {
		this.data = 0;
		this.leftNode = null;
		this.rightNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinarySearchTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinarySearchTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinarySearchTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinarySearchTreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
