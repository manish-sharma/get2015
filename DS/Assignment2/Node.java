package question1;

public class Node {

	private String data;
	private Node nextNode;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node(String data) {
		this.data = data;
	}
	public Node() {
	
	}

}
