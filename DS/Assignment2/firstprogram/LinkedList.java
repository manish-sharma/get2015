package firstprogram;
import java.util.NoSuchElementException;
/**
 * Class that is used to perform operations on a linked list
 * @author Riddhi
 *
 * @param <T>
 */
public class LinkedList<T> {
	private Node<T> top;            //start node of the list or top of stack
	private int size;               //size of the list

	//constructor
	public LinkedList() {
		top = null;
		size = 0;
	}

	//parameterized constructor
	public LinkedList(int size) {
		top = null;
		this.size = size;
	}

	//insert the element at top or start
	public void insertAtFirst(T item) {
		Node<T> newNode = new Node<T>(item);
		size++;
		if (top == null) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
	}

	//displays all elements in the list
	public void traverse() {
		Node<T> temp = top;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	//deletes the last element entered in the list and returns its value
	public T deleteFromFirst() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node<T> temp = top;
		top = temp.getNext();
		size--;
		return temp.getData();

	}

	//function is used to check if the list is empty
	public boolean isEmpty() {
		return (top == null);
	}

	//returns the size of list
	public int getSize() {
		return size;
	}

	//returns the top element present in the list
	public T topElement() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return top.getData();
	}
}
