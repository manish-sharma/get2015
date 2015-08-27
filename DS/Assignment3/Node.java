/**
 * @author Girdhari
 * This class will create Node
 */

package preordertraversal;

/* Start of Node class */
public class Node {

	private Node leftNode;
	private int dataNode;
	private Node rightNode;
	
	public Node() {
		leftNode = null;
		rightNode = null;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	
	public int getDataNode() {
		return dataNode;
	}
	
	public void setDataNode(int dataNode) {
		this.dataNode = dataNode;
	}
	
	public Node getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
}
/* End of Node class */
