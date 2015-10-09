/** 
 * @author Girdhari
 * LinkedList class will contain insertNode method which will insert node in a shoted manner
 */
package question3;

public class LinkedList {

	public Node insertNode(Node startNode, int data) {
		if (startNode == null || startNode.getData() > data) {
			Node newNode = createNode(data);
			newNode.setNextNode(startNode);
			startNode = newNode;
		}

		else if (startNode.getData() < data && startNode.getNextNode() != null)
			startNode.setNextNode(insertNode(startNode.getNextNode(), data));
		else {
			Node newNode = createNode(data);
			newNode.setNextNode(startNode.getNextNode());
			startNode.setNextNode(newNode);
		}

		return startNode;
	}

	public Node createNode(int data) {
		return new Node(data);
	}

	public void displayList(Node startNode) {
		if (startNode == null) {
			System.out.println("List is empty");
			return;
		}
		while (startNode != null) {
			System.out.print(startNode.getData()+ " -> ");
			startNode = startNode.getNextNode();
		}
	}

}
