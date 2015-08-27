package Question4;

public class Node<T> 
{
	// data held by node
	public T nodeValue;
	
	// next node in the list
	public Node<T> next;
	
	// previous node in the list
	public Node<T> previous;

	// default constructor with no initial value
	public Node()
	{
		nodeValue = null;
		next = null;
	}

	public T getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(T nodeValue) {
		this.nodeValue = nodeValue;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
}
