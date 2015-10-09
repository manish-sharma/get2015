/**
 * @author Girdhari
 * Program to implement doubly linked list
 * This program will implement doubly node
 */

package question4;
public class DoublyNode {

	private DoublyNode previousNode;
	private int data;
	private DoublyNode nextNode;
	private static int noOfNodes;
	
	public DoublyNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoublyNode previousNode) {
		this.previousNode = previousNode;
	}

	public static int getNoOfNodes() {
		return noOfNodes;
	}

	public static void setNoOfNodes(int noOfNodes) {
		DoublyNode.noOfNodes = noOfNodes;
	}

	public int  getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyNode(int data) {
		setData(data);
		noOfNodes++;
		
	}
	

	
}
