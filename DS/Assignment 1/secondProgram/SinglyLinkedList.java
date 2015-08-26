package secondProgram;

class SinglyLinkedList<T> {
	protected Node<T> start;
	public int size;

	/* Constructor */
	public SinglyLinkedList() {
		start = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return start == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element at begining */
	void insertAtStart(T item) {
		Node<T> newNode = new Node<T>(item, null);
		Node<T> temp;
		if (start == null) {
			start = newNode;
		} else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}

	/* Function to insert an element at position */
	public void insertAtParticularPosition(T item, int index) {
		Node<T> newNode = new Node<T>(item, null);
		Node<T> temp = start;
		int count;
		if (index == 0) {
			newNode.setNext(start);
			start = newNode;
		}
		for (count = 0; count < index - 1; count++) {
			temp = temp.getNext();
			if (temp == null) {
				System.out.println("Node in the list is at less than one");
				return;
			}
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

	/* Function to retrieve element at an index */
	void retrievalAtIndex(int index) {
		Node<T> temp = start;
		int count;
		for (count = 1; count <= index; count++) {
			temp = temp.getNext();
		}
		System.out.println("The value at index is " + temp.getValue());
	}

	/* Function to delete an element at position */
	public void deleteAtPos(int index) {
		Node<T> temp = null, current = start;
		int count;
		if (index == 0) {
			start = current.getNext();
		} else {
			for (count = 1; count <= index; count++) {
				temp = current;
				current = current.getNext();
			}
			System.out.println("Node deleted " + current.getValue());
			temp.setNext(current.getNext());
			;
		}
	}

	/* Function to delete a value of element in the list */
	public void deleteItemOnValue(T item) {
		Node<T> current = start;
		Node<T> temp = current;
		if (start == null) {
			System.out.println("Empty List");
		} else {
			while (current != null) {
				if (current.getValue() == item) {
					if (temp == start) {
						start = temp.getNext();
						return;
					} else {
						temp.setNext(current.getNext());
						return;
					}
				}
				temp = current;
				current = current.getNext();
			}
		}
	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getNext() == null) {
			System.out.println(start.getValue());
			return;
		}
		Node<T> ptr = start;
		System.out.print(start.getValue() + "->");
		ptr = start.getNext();
		while (ptr.getNext() != null) {
			System.out.print(ptr.getValue() + "->");
			ptr = ptr.getNext();
		}
		System.out.print(ptr.getValue() + "\n");
	}

	/* Function to reverse the linked list */
	void reverse() {
		Node<T> prev = null;
		Node<T> temp = start;
		Node<T> next = temp.getNext();
		while (temp != null) {
			if (next == null)
				break;

			temp.setNext(prev);

			prev = temp;
			temp = next;
			next = next.getNext();
		}
		temp.setNext(prev);
		start = temp;

	}
	/* function to sort linked list */
	// void sortLinkedList() {
	// Node<T> temp, current = start;
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
	//
	// }

}