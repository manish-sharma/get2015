/**node for singly linked list
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015 
 */

public class SinglyLinkedListNode<T> {
	
	T value;
	SinglyLinkedListNode<T> start;
	SinglyLinkedListNode<T> next;
	
	public SinglyLinkedListNode() {										//create empty new node
		value = null;
		next = null;
	}
	
	public SinglyLinkedListNode(T item) {								//create new node with some value
		value = item;
		next = null;
	}

	//method to add a new element
	boolean addElement(T element)
	{
		SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<T>(element);
		SinglyLinkedListNode<T> current = new SinglyLinkedListNode<T>();

		if (start == null) {						//if start is null then set new node as start
			start = newNode;
			return true;
		}
		else {
			current = start;						//add the new node to the last of linked list
			while (current.next != null) 
				current = current.next;
			current.next = newNode;
		}
		return true;
	}

	//method to show the linked list
	boolean display() {
		SinglyLinkedListNode<T> current = new SinglyLinkedListNode<T>();
		current = start;
		System.out.println("Singly Linked List:");

		while (current != null) {					//showing the linked list
			System.out.print(current.value + "  ");
			current = current.next;
		}
		System.out.println();
		return true;
	}

	//method to add item at given index
	boolean addAtIndex(int index, T value) {
		SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<T>(value);
		SinglyLinkedListNode<T> current = new SinglyLinkedListNode<T>();

		current = start;
		int count = 1;
		
		if (index == 1) {						//adding node at start of linked list
			newNode.next = current;
			start = newNode;
		}
		else {
			count = 2;
			while (current != null) {
				if (count == index) {			//adding new node at given index
					newNode.next = current.next;
					current.next = newNode;
				}
				count++;
				current = current.next;
			}
			if (count < index)
				return false;
		}
		return true;
	}

	//method to remove a given item from linked list
	boolean deleteByValue(T value) {
		int flag = 0;
		SinglyLinkedListNode<T> current = start;
		
		if (current == null)						//if list is empty
			return false;
		
		while (current != null) {
			if (current.value == value) {
				start = current.next;
				return true;
			}
			if (current.next != null) {
				if (current.next.value == value) {
					current.next = current.next.next;
					flag = 1;
					return true;
				}
			}
			current = current.next;
		}
		
		if ((flag == 0) && (current == null))
			return false;

		return false;
	}

	//method to remove item at given index from linked list
	boolean deleteByIndex(int index) {
		SinglyLinkedListNode<T> current = new SinglyLinkedListNode<T>();
		current = start;
		int count = 1;
		
		if (index == 1)
			start = current.next;
		else {
			count = 2;
			while (current != null) {
				if (count == index) 
					current.next = current.next.next;
				count++;
				current = current.next;
			}
			if (count < index) 
				return false;
		}
		return true;
	}

	//method to get item at given index
	T getItem(int index) {
		SinglyLinkedListNode<T> current = new SinglyLinkedListNode<T>();
		current = start;
		int count = 1;

		while (current != null) {
			if (count == index)
				return current.value;
			count++;
			current = current.next;
		}
		return null;
	}
	
	//method to reverse the linked list
	public void reverseLinkedList() {
		
		if (start == null || start.next == null)
			return;
		
		SinglyLinkedListNode<T> temp1 = start.next;
		SinglyLinkedListNode<T> temp2 = temp1.next;
		temp1.next = start;
		start.next = null;
		
		if (temp2 == null)
			return;

		SinglyLinkedListNode<T> CurrentNode = temp2;
		SinglyLinkedListNode<T> PreviousNode = temp1;
		while (CurrentNode != null) {
			SinglyLinkedListNode<T> NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		start = PreviousNode;
		SinglyLinkedListNode<T> current = start;
	}
	
	//method to sort the linked list
    public boolean sortList() {
		if (start == null || start.next == null)
			return true;

		SinglyLinkedListNode<T> newHead = new SinglyLinkedListNode<T>(start.value);
		SinglyLinkedListNode<T> pointer = start.next;
		while (pointer != null) {
			SinglyLinkedListNode<T> innerPointer = newHead;
			SinglyLinkedListNode<T> next = pointer.next;

			if ((int) pointer.value <= (int) newHead.value) {
				SinglyLinkedListNode<T> oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} 
			else {
				while (innerPointer.next != null) {
					if ((int)pointer.value > (int)innerPointer.value && (int)pointer.value <= (int)innerPointer.next.value) {
						SinglyLinkedListNode<T> oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
					innerPointer = innerPointer.next;
				}
				if (innerPointer.next == null&& (int) pointer.value > (int) innerPointer.value) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
			pointer = next;
	    }
	    start = newHead;
	    return true;
    }
}