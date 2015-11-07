package doublylinklist;

import java.util.InputMismatchException;
import java.util.Scanner;

/**this class holds all functionality of doubly link list
 * @author Khemanshu
 *
 */
public class DoublyLinkedList {

	public DoublyNode start;
	int size=0;
	private static Scanner sc;

	/**
	 * @param item value to be added to the doublylinked list
	 */
	void addItemInLinkList(int item) {
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
		size=size+1;
	}

	/**
	 * @param item value to be inserted
	 * @param index position for insertion of e=item
	 */
	public void insertAtParticularPosition(int item, int index) {
		DoublyNode newNode = new DoublyNode(item, null, null);
		DoublyNode temp = start;
		int count;
		if(index> size){
			System.out.println("Invalid position");
			return;
		}
		if (index == 0) {
			newNode.setNext(start);
			newNode.setPrev(null);
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
		newNode.setPrev(temp);
		temp.setNext(newNode);
		temp.setPrev(newNode.getPrev());
		}
		size=size+1;
	}

	/**
	 * method to print doubly linked list
	 */
	void traversalDoublyLinkedList() {
		if(size == 0){
			System.out.println("list is empty firstly add and then traverse list");
		}
		else{
			DoublyNode temp = start;
			System.out.println("The linked list is.. ");
			while (temp != null) {
				System.out.print(temp.getValue() + "\t");
				temp = temp.getNext();
			}
		}
	}

	/** retrieve of a element at a given position
	 * @param index position for print the value
	 */
	void retrievalAtIndex(int index) {
		DoublyNode temp = start;
		int count;
		System.out.println(size);
		if(index> size){
			System.out.println("Invalid position");
		}
		else {
			for (count = 1; count <= index; count++) {
				temp = temp.getNext();
			}
			System.out.println("The value at index is " + temp.getValue());
		}
	}

	/** deletion of a element a t a particular index
	 * @param index position for deletion
	 */
	public void deleteItemOnIndex(int index) {
		DoublyNode current = start;
		int count;
		if(index> size){
			System.out.println("Invalid position");
			return;
		}
		if (index == 0) {
			start = current.getNext();
		} 
		else {
			for (count = 1; count <= index; count++) {
				current = current.getNext();
			}
			current.getNext().setPrev(current.getPrev());
			current.getPrev().setNext(current.getNext());
		}
		size=size-1;
	}

	/** deletion of node on the basis of a its value
	 * @param item value that to be deleted
	 */
	public void deleteItemOnValue(int item) {
		DoublyNode current = start;
//		DoublyNode temp = current;
		boolean isValueFound = false;
		if (start == null) {
			System.out.println("Empty List");
			return;
		}
		else {
			while (current != null) {
				if (current.getValue() == item) {
					isValueFound = true;
					if (current.getNext() == null) {
						current.getPrev().setNext(null);
						
					}
					
					else if (current != start){
						current.getNext().setPrev(current.getPrev());
						current.getPrev().setNext(current.getNext());
						
					}
					else {
						start=start.getNext();
						start.setPrev(null);
					}
					size=size-1;
					return;
				}
			}
			if(isValueFound == false)
				System.out.println("item not found");
		}
		
	}

	/**
	 * method for reversing the doubly linked list
	 */
	void reverse() {
		if(size==0){
			System.out.println("list is empty nothing to reverse");
		}
		else if(size ==1){
			System.out.println("there is only one element in list so, no effect of reverse");
		}
		else{
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
	}

	/**
	 * sort the doubly linked list
	 */
	void sortLinkedList() {
		if(size==0){
			System.out.println("list is empty nothing to reverse");
		}
		else if(size ==1){
			System.out.println("there is only one element in list so, no effect of reverse");
		}
		else{
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
	}

	/** this method takes input from user of type integer only
	 * @return
	 */
	private static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("enter only integer");
    		number = userInput();
    	}
    	return number;
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
			ch = userInput();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = userInput();
				doublyLinkList.addItemInLinkList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = userInput();
				System.out.print("\n Enter Location : ");
				loc = userInput();
				doublyLinkList.insertAtParticularPosition(item, loc);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = userInput();
				doublyLinkList.deleteItemOnValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = userInput();
				doublyLinkList.deleteItemOnIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = userInput();
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