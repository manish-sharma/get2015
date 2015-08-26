package thirdProgram;

/**
 * Class used to initialize node to be added in the list
 * @author Riddhi
 *
 * @param <T> to make class generic type
 */
public class DoublyNode<T> {
	
	private T value;
	private DoublyNode<T> previous;
	private DoublyNode<T> next;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DoublyNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyNode<T> previous) {
		this.previous = previous;
	}

	public DoublyNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyNode<T> next) {
		this.next = next;
	}

	public DoublyNode()
	{
		value=null;
		previous=null;
		next=null;
	}
	
	public DoublyNode(T value,DoublyNode<T> previous,DoublyNode<T> next)
	{
		this.value=value;
		previous=null;
		next=null;
	}
}
