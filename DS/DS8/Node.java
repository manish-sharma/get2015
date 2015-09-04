//class to create a new node
class Node {
	Integer nodeInformation;
	public Node rightChildAddress,leftChildAddress,rootNode;
	public Node() {
		rootNode=null;
	}
	public Node getNewNode(Integer nodeInformation) {
		Node newNode=new Node();
		newNode.nodeInformation=nodeInformation;
		return newNode;
	}
}