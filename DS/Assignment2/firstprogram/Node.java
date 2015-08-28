package firstprogram;
/**
 * Class that initializes the node of a linked list
 * @author Riddhi
 *
 * @param <T>
 */
public class Node<T> {
	private Node<T> next;      //node link to next element
	private T data;            //data stored at a node

	//Constructor
	public Node()
	{
		next=null;
		data=null;
	}
	
	//parameterized Constructor
	public Node(T value)
	{
		next=null;
		data=value;
	}
	
	//getter setter for private members
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
