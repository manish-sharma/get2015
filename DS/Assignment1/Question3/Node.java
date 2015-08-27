package Question3;

public class Node<T> 
{
	// data held by node
	public T nodeValue;
	
	// next node in the list
	public Node<T> next;
	
	// default constructor with no initial value
	public Node()
	{
		nodeValue = null;
		next = null;
	}
	
	// initialize nodeValue to item and set next to null
//	public Node (T item)
//	{
//		nodeValue = item;
//		next = null;
//	}

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
	
}
