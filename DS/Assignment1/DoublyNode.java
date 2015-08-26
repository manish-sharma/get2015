public class DoublyNode {

	private int data;
	private DoublyNode previousNode;
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
