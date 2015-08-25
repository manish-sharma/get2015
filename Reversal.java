
public class Reversal {

	public Node<Integer> reverseLinkedList(Node<Integer> first) {
		
		Node<Integer> nextNode = null;
		Node<Integer> previous;
		Node<Integer> reverse;
		previous = first;
		while(previous != null){
			reverse=nextNode;
			nextNode=previous;
			previous = previous.next;
			nextNode.next = reverse;
		}
		
		
		
		return nextNode;
	}

}
