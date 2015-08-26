package thirdProgram;
import java.util.Scanner;

/**
 * @author Riddhi
 *
 */
public class DoublyLinkedList<T> {

	public DoublyNode<T> start;
	int size = 0;
	private static Scanner sc;

	/**
	 * @param item
	 *            value to be added to the doublylinked list
	 */
	void createDoublyLinkedList(T item) {
		DoublyNode<T> newNode = new DoublyNode<T>(item, null, null);
		DoublyNode<T> temp;
		if (start == null) {
			start = newNode;
		} else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setPrevious(temp);
		}
		size = +1;
	}

	/**
	 * @param item
	 *            value to be inserted
	 * @param index
	 *            position for insertion of e=item
	 */
	public void insertAtParticularPosition(T item, int index) {
		DoublyNode<T> newNode = new DoublyNode<T>(item, null, null);
		DoublyNode<T> temp = start;
		int count;
		if (index > size) {
			System.out.println("Invalid position");
		}
		if (index == 0) {
			newNode.setNext(start);
			newNode.setPrevious(null);
			start = newNode;
		} else {
			for (count = 0; count < index - 1; count++) {
				temp = temp.getNext();
				if (temp == null) {
					System.out.println("Node in the list is at less than one");
					return;
				}
			}
			newNode.setNext(temp.getNext());
			newNode.setPrevious(temp);
			temp.setNext(newNode);
			temp.setPrevious(newNode.getPrevious());
		}
		size = +1;
	}

	/**
	 * method to print doubly linked list
	 */
	void traversalDoublyLinkedList() {
		DoublyNode<T> temp = start;
		System.out.println("The linked list is.. ");
		while (temp != null) {
			System.out.print(temp.getValue() + "\t");
			temp = temp.getNext();
		}
	}

	/**
	 * @param index
	 *            position for print the value
	 */
	void retrievalAtIndex(int index) {
		DoublyNode<T> temp = start;
		int count;
		if (index > size) {
			System.out.println("Invalid position");
		}
		for (count = 1; count <= index; count++) {
			temp = temp.getNext();
		}
		System.out.println("The value at index is " + temp.getValue());
	}

	/**
	 * @param index
	 *            position for deletion
	 */
	public void deleteItemOnIndex(int index) {
		DoublyNode<T> temp = null, current = start;
		int count;
		if (index > size) {
			System.out.println("Invalid position");
		}
		if (index == 0) {
			start = current.getNext();
		} else {
			for (count = 1; count <= index; count++) {
				temp = current;
				current = current.getNext();
			}
			// System.out.println("Node deleted " + current.getValue());
			temp.setNext(current.getNext());
			temp.setPrevious(current.getPrevious());
		}
		size = -1;
	}

	/**
	 * @param item
	 *            value that to be deleted
	 */
	public void deleteItemOnValue(int item) {
		DoublyNode<T> current = start;
		DoublyNode<T> temp = current;
		if (start == null) {
			System.out.println("Empty List");
		} else {
			while (current != null) {
				if (current.getValue().equals(item)) {
					if (temp == start) {
						start = temp.getNext();
						temp.setPrevious(null);
						return;
					} else {
						temp.setNext(current.getNext());
						temp.setPrevious(current.getPrevious());
						return;
					}
				}
				temp = current;
				current = current.getNext();
			}
		}
		size = -1;
	}

	/**
	 * method for reversing the doubly linked list
	 */
	void reverse() {
		DoublyNode<T> tempnode1 = null, tempnode2;
		DoublyNode<T> current = start;
		while (current != null) {
			tempnode2 = tempnode1;
			tempnode1 = current;
			current = current.getNext();
			tempnode1.setNext(tempnode2);
			tempnode1.setPrevious(current);
		}
		start = tempnode1;
	}

	/**
	 * sort the doubly linked list
	 */
	// void sortLinkedList() {
	// DoublyNode<T> temp, current = start;
	// int check;
	// while (current != null) // apply simple sorting to sort the elements of
	// // Linked list
	// {
	// temp = start;
	// while (temp.getNext() != null) {
	// if (temp.getValue() > temp.getNext().getValue()) {
	// check = temp.getValue();
	// temp.setValue(temp.getNext().getValue());
	// temp.getNext().setValue(check);
	// }
	// temp = temp.getNext();
	// }
	// current = current.getNext();
	// }
}
