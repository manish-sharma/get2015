package question1;


public class LinkedList {
	/*Starting of printList function*/ 
	void printList(Node start) {			//Function will print complete Linked List 
		if(start == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List is :");
		while(start!= null) {
			System.out.println(start.getData());
			start = start.getNextNode();
		}
		System.out.println();
	}
	/* End of printList function */
	
	/* Starting of insertAtEnd function */
	Node insertAtEnd(String value, Node start) {
		Node newNode = new Node(value);
		if( start == null ) {
			start = newNode;
			return start;
		}
		Node current = start;
		
		while(current.getNextNode() != null) {
			current = current.getNextNode() ;
		}
		current.setNextNode(newNode);
		newNode.setNextNode(null);
		return start;
	}
	/* End of insertAtEnd function */
	
	/* Start of deleteElement function */
		Node deleteElement(Node start) {
		if( start == null ) {
			System.out.println("List is Empty!!");
		} else {
			Node current = start;
			try{
				while( current.getNextNode().getNextNode() != null ) {
					current = current.getNextNode();
				}
			} catch(NullPointerException exception) {
					System.out.println("Stack is empty");
			}
			current.setNextNode(null);
		}
		return start;
	}
	/* End of deleteElement function */
}
