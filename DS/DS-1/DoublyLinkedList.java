/**
 * class to implement the functionality of doubly linked list
 */
import java.util.Scanner;


public class DoublyLinkedList {

	public DoublyNode start;
	private static Scanner sc;

	/**
	 * Method to create the linked list and add the item to it
	 * @param item = item to be added
	 */
	void createDoublyLinkedList(int item) {
		DoublyNode newNode = new DoublyNode(item, null, null);
		DoublyNode temp;
		if (start == null) {
			start = newNode;
		} else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setPrev(temp);
		}
	}

	/**
	 * Method to insert element at particular location
	 * @param item = value of the node
	 * @param index = location to insert
	 */
	public void insertAtParticularPosition(int item, int index) {
		DoublyNode newNode = new DoublyNode(item, null, null);
		DoublyNode temp = start;
		int count;
		if (index == 0) {
			newNode.setNext(start);
			newNode.setPrev(null);
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
		newNode.setPrev(temp);
		temp.setNext(newNode);
		temp.setPrev(newNode.getPrev());

	}

	/**
	 * Method to print the linked list
	 */
	void traversalDoublyLinkedList() {
		DoublyNode temp = start;
		System.out.println("The linked list is.. ");
		while (temp != null) {
			System.out.print(temp.getValue() + "\t");
			temp = temp.getNext();
		}
	}

	/**
	 * Method to print the element at particular location
	 * @param index = location of element
	 */
	void retrievalAtIndex(int index) {
		DoublyNode temp = start;
		int count;
		for (count = 1; count <= index; count++) {
			temp = temp.getNext();
		}
		System.out.println("The value at index is " + temp.getValue());
	}

	/**
	 * Method to delete element at a particular location
	 * @param index = location of element
	 */
	public void deleteItemOnIndex(int index) {
		DoublyNode temp = null, current = start;
		int count;
		if (index == 0) {
			start = current.getNext();
		} else {
			for (count = 1; count <= index; count++) {
				temp = current;
				current = current.getNext();
			}
			// System.out.println("Node deleted " + current.getValue());
			temp.setNext(current.getNext());
			temp.setPrev(current.getPrev());
		}
	}

	/**
	 * Method to delete item based on its value
	 * @param item = element to be deleted
	 */
	public void deleteItemOnValue(int item) {
		DoublyNode current = start;
		DoublyNode temp = current;
		if (start == null) {
			System.out.println("Empty List");
		} else {
			while (current != null) {
				if (current.getValue() == item) {
					if (temp == start) {
						start = temp.getNext();
						temp.setPrev(null);
						return;
					} else {
						temp.setNext(current.getNext());
						temp.setPrev(current.getPrev());
						return;
					}
				}
				temp = current;
				current = current.getNext();
			}
		}
	}

	/**
	 * Method to reverse the linked list
	 */
	void reverse() {
		DoublyNode tempnode1=null,tempnode2;
		DoublyNode current = start;
			while( current != null )
		{
			tempnode2 = tempnode1;
			tempnode1 = current;
			current = current.getNext();
			tempnode1.setNext(tempnode2);
			tempnode1.setPrev(current);
		}
		start = tempnode1;
	}

	/**
	 * Method to sort the linked list
	 */
	void sortLinkedList() {
		DoublyNode temp, current = start;
		int check;
		while (current != null) // apply simple sorting to sort the elements of
								// Linked list
		{
			temp = start;
			while (temp.getNext() != null) {
				if (temp.getValue() > temp.getNext().getValue()) {
					check = temp.getValue();
					temp.setValue(temp.getNext().getValue());
					temp.getNext().setValue(check);
				}
				temp = temp.getNext();
			}
			current = current.getNext();
		}
	}

	public static void main(String args[]) {
		DoublyLinkedList doublyLinkList = new DoublyLinkedList();

		int ch, item, loc;
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n 1. Create DoublyLinked List"
					+ "\n 2. Add Element at particular Location"
					+ "\n 3. Removal of an item based on its value "
					+ "\n 4. Removal of an item based on its index"
					+ "\n 5. Retrieval of an item of particular index"
					+ "\n 6. Reversal of linked list"
					+ "\n 7. Sorting of linked list"
					+ "\n 8. Display linked list" + "\n 9. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				doublyLinkList.createDoublyLinkedList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.insertAtParticularPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				doublyLinkList.deleteItemOnValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.deleteItemOnIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				doublyLinkList.retrievalAtIndex(loc);
				break;
			case 6:
				doublyLinkList.reverse();
				break;
			case 7:
				doublyLinkList.sortLinkedList();
				break;
			case 8:
				doublyLinkList.traversalDoublyLinkedList();
				break;
			case 9:
				System.exit(0);
			}
		}

	}

}
