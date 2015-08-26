/**
 * This method perform operations on doubly linked list
 * 
 * @author Ankur 
 * @Since: 25 August,2015
 * @param <T>
 **/
public class NodeDoubly<T> 
{
	// data held by the node
	T nodeValue;
	// next node in the list
	NodeDoubly<T> start;
	NodeDoubly<T> next;
	NodeDoubly<T> previous;
    // default constructor with no initial value
	public NodeDoubly() {
		nodeValue = null;
		next = null;
		previous = null;
	}
	// initialize nodeValue to item and set next to null
	public NodeDoubly(T item)
	{
		nodeValue = item;
		next = null;
		previous = null;
	}
	/**
	 * This method add the elements in doubly linked list
	 * 
	 * @param element
	 * @return 
	 * @return Description: Adds the element to Linked List
	 **/
	
	 boolean addElement(T element)
	{
		// New node to accept value
		NodeDoubly<T> newNode = new NodeDoubly<T>(element);
		// To point values
		NodeDoubly<T> current = new NodeDoubly<T>();
		if (start == null)
		{
			start = newNode;
			newNode.previous = start;
			// System.out.println(start.nodeValue);
			return true;
		} 
		else 
		{
			current = start;
			while (current.next != null) 
			{
				// System.out.println(current.nodeValue);
				current = current.next;
			}
			current.next = newNode;
			newNode.previous = current;
		}
		return true;
	}
	 /**
     *this method is used to display list
     * @return
     * Description: display the Linked List
     **/
	boolean display()
	{
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		System.out.println("Doubly Linked List:");
		while (current != null)
		{
			System.out.print(current.nodeValue + "<-> ");
			current = current.next;
		}
		System.out.println();
		return true;
	}
	/**
	 * Name: addAtPosition
	 * @param position
	 * @param value
	 * @return
	 **/
	boolean addAtPostion(int position, T value)
	{
		NodeDoubly<T> newNode = new NodeDoubly<T>(value);
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		int count = 1;
		if (position == 1) {
			newNode.next = current;
			newNode.previous = start;
			start = newNode;
		}
		else
		{
			count = 2;
			while (current != null)
			{
				if (count == position) 
				{
					newNode.next = current.next;
					newNode.previous = current;
					current.next = newNode;
				}
				count++;
				current = current.next;
			}
			if (count < position)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Name: deleteByValue
	 * @param value
	 * @return
	 * Description: Deleting the value by finding the position
	 **/
	boolean deleteByValue(T value)
	{
		int flag = 0;
		// start is copied
		NodeDoubly<T> current = start;
		if (current == null)
		{
			return false;
		}
		while (current != null) 
		{
			if (current.nodeValue == value)
			{
				start = current.next;
				current.next.previous = start;
				return true;
			}
			if (current.next != null)
			{
				if (current.next.nodeValue == value) 
				{
					current.next = current.next.next;
					current.next.next.previous = current;
					flag = 1;
					return true;
				}
			}
			current = current.next;
		}
		if ((flag == 0) && (current == null))
		{
			return false;
		}
		return false;
	}
	/**
	 * Name: deleteByIndex
	 * @param position
	 * @return
	 * Description: Deleting the value at index
	 **/
	boolean deleteByIndex(int position)
	{
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		int count = 1;
		if (position == 1) 
		{
			start = current.next;
			current.next.previous = start;
		} 
		else
		{
			count = 2;
			while (current != null) 
			{
				if (count == position)
				{
					current.next = current.next.next;
					current.next.next.previous = current;
				}
				count++;
				current = current.next;
			}
			if (count < position)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Name: getItem
	 * @param position
	 * @return
	 * Description: Get value at the position
	 **/
	T getItem(int position)
	{
		NodeDoubly<T> current = new NodeDoubly<T>();
		current = start;
		int count = 1;
		while (current != null) {
			if (count == position) {
				return current.nodeValue;

			}
			count++;
			current = current.next;
		}
		return null;
	}
	/**
	 * Name: reverseLinkedList
	 * Description: Reverse the linked list
	 */
	public void reverseLinkedList() 
	{
		if (start == null || start.next == null)
			return;
		NodeDoubly<T> Second = start.next;
		Second.previous = start;
		// store third node before we change
		NodeDoubly<T> third = Second.next;
		third.previous = Second;
		// Second's next pointer
		Second.next = start; 
		// second now points to head
		start.next = null; 
		// change head pointer to NULL
		if (third == null)
			return;
		NodeDoubly<T> CurrentNode = third;
		NodeDoubly<T> PreviousNode = Second;
		while (CurrentNode != null)
		{
			NodeDoubly<T> NextNode = new NodeDoubly<T>();
			NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		start = PreviousNode; // reset the head node
		NodeDoubly<T> current = start;
	}
	/**
	 * Name: sortList
	 * @return
	 * Description: Sorts the value of the linked List
	 **/
	public boolean sortList()
	{
		if (start == null || start.next == null)
			return true;
		NodeDoubly<T> newHead = new NodeDoubly<T>(start.nodeValue);
		NodeDoubly<T> pointer = start.next;
		pointer.previous = start;
		// loop through each element in the list
		while (pointer != null)
		{
			// insert this element to the new list
			NodeDoubly<T> innerPointer = newHead;
			NodeDoubly<T> next = pointer.next;
			// next.pre=pointer;
			if ((int) pointer.nodeValue <= (int) newHead.nodeValue) 
			{
				NodeDoubly<T> oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
				oldHead.previous = newHead;
			} 
			else 
			{
				while (innerPointer.next != null)
				{
					if ((int) pointer.nodeValue > (int) innerPointer.nodeValue && (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) 
					{
						NodeDoubly<T> oldNext = innerPointer.next;

						innerPointer.next = pointer;
						pointer.previous = innerPointer;
						pointer.next = oldNext;
						oldNext.previous = pointer;
					}
					innerPointer = innerPointer.next;
				}
				if (innerPointer.next == null && (int) pointer.nodeValue > (int) innerPointer.nodeValue)
				{
					innerPointer.next = pointer;
					pointer.previous = innerPointer;
					pointer.next = null;
				}
			}
			pointer = next;
		}
		start = newHead;
		return true;
	}
}
