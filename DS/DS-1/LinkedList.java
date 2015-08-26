/**
 * Class to implement the functionality of Linked List
 * @author Sanjay
 */
import java.util.Scanner;


public class LinkedList {
	public Node start;
	int size = 0;
	private static Scanner sc;

	/**
	 * Method to create the link list
	 * @param item = add item to link list
	 */
	void createLinkedList(int item) {
		Node newNode = new Node(item, null);
		Node temp;
		if (start == null) {
			start = newNode;
		} else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size = +1;
	}

	
	/**
	 * Method to insert node at particular location
	 * @param item = element to be inserted
	 * @param index = location at which to be inserted
	 */
	public void insertAtParticularPosition(int item, int index) {
		Node newNode = new Node(item, null);
		Node temp = start;
		int count;
		if (size < index) {
			System.out.println("Enter valid position ");
			return;
		}
		if (index == 0) {
			newNode.setNext(start);
			start = newNode;
		}
		else{


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
		size = +1;
	}

	/**
	 * Method to print the linked list
	 */
	void traversalLinkedList() {
		Node temp = start;
		System.out.println("The linked list is.. ");
		while (temp != null) {
			System.out.print(temp.getValue() + "\t");
			temp = temp.getNext();
		}
	}

	/**
	 * Method to get element at particular index
	 * @param index = element's location
	 */
	void retrievalAtIndex(int index) {
		Node temp = start;
		int count;
		if(index > size){
			System.out.println("Invalid location");
		}
		else{
			try {
				for (count = 1; count <= index; count++) {
					temp = temp.getNext();
				}
			} catch (Exception ex) {
				ex.getMessage();
			}
			System.out.println("The value at index is " + temp.getValue());
		}

	}

	/**
	 * Method to delete element from a particular location
	 * @param index = element's location
	 */
	public void deleteItemOnIndex(int index) {
		Node temp = null, current = start;
		int count;
		if (size < index) {
			System.out.println("Enter valid index position ");
			return;
		}
		if (index == 0) {
			start = current.getNext();
		} else {
			for (count = 1; count <= index; count++) {
				temp = current;
				current = current.getNext();
			}
			System.out.println("Node deleted " + current.getValue());
			temp.setNext(current.getNext());
			size = -1;
		}
	}

	int size() {
		return size;
	}

	/**
	 * Method to delete element based on the value
	 * @param value = element to be deleted
	 */
	public void deleteItemOnValue(int value) {
		Node temp = start;
		Node previous = temp;
		while (temp != null) {
			if (temp.getValue() == value) {
				if (temp == start) {
					start = temp.getNext();
					return;
				} else {
					previous.setNext(temp.getNext());
					return;
				}
			}
			previous = temp;
			temp = temp.getNext();

		}
		size = -1;
	}

	/**
	 * Method to reverse the linked list
	 */
	void reverse() {
		Node prevNode = null;
		Node temp = start;
		Node nextNode = temp.getNext();
		while (temp != null) {
			if (nextNode == null)
				break;
			temp.setNext(prevNode);
			prevNode = temp;
			temp = nextNode;
			nextNode = nextNode.getNext();
		}
		temp.setNext(prevNode);
		start = temp;

	}

	/**
	 * Method to sort the linked list
	 */
	void sortLinkedList() {
		Node temp, current = start;
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
		LinkedList linkList = new LinkedList();
		int ch, item, loc;
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n 1. Create Linked List"
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
				linkList.createLinkedList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.insertAtParticularPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				linkList.deleteItemOnValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.deleteItemOnIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				linkList.retrievalAtIndex(loc);
				break;
			case 6:
				linkList.reverse();
				break;
			case 7:
				linkList.sortLinkedList();
				break;
			case 8:
				linkList.traversalLinkedList();
				break;
			case 9:
				System.exit(0);
			}
		}
	}

}
