package Question3;

public class LinkedList 
{
	Node start = null;
	int size = 0;
	
	Node<Object> curr = new Node<Object>();
	
	// adds values in list
	public void addValueInList ( Object item )
	{
		Node<Object> newNode = new Node <Object> ();
		newNode.setNodeValue(item);
		newNode.setNext(null);
		
		if ( start == null )	// if list is empty
		{
			start = newNode ;
			curr = start;
		}
		else
		{
			curr = start;
			while ( curr.getNext() != null )
			{	
				curr = curr.next;
			}
			newNode.setNext(curr.getNext());
			curr.setNext( newNode );
			curr = newNode;
		}
	}
	
	
	// adds item at given location
	public void addValueAtGivenLocation ( Object item, int location )
	{
		Node<Object> newNode = new Node <Object> ();
		newNode.setNodeValue(item);
		newNode.setNext(null);
		if ( location == 0 )	// adding item at 1st position
		{
			newNode.setNext( start );   
			start = newNode;
		}
		else
		{
			int index = 1;
			Node<Object> prevNode = new Node <Object> ();
			prevNode = start;
			curr = start.getNext();
			while ( curr != null )
			{
				if ( index == location )
				{	
					newNode.setNext( prevNode.getNext() );
					prevNode.setNext( newNode );
					break;
				}
				else
				{
					index++;
					prevNode = curr;
					curr = curr.next;
				}
			}
			if ( curr == null )		// adding item at position after last location in list
				prevNode.setNext( newNode );
		}
	}
	
	
	// removes given item
	public void removeItemBasedOnvalue ( Object item )
	{
		if ( start == null )
			System.out.println ("Underflow");
		else
		{
			if ( start.getNodeValue() == item )    // item is present at start location
				start = start.getNext();
			else
			{
				Node<Object> prevNode = new Node <Object> ();
				prevNode = start;
				curr = start.getNext();
				while ( curr != null )
				{
					if ( curr.getNodeValue() == item )
					{	
						prevNode.setNext( curr.getNext() );
						break;
					}
					else
					{
						prevNode = curr;
						curr = curr.next;
					}
				}
				if ( curr == null )		// item not found in list
					System.out.println("Item not found in list");
			}
		}
	}
	
	
	// removes item at given location
	public void removeItemBasedOnLocation( int location )
	{
		if ( start == null )
			System.out.println ("Underflow");
		else
		{
			if ( location == 0 )	// adding item at 1st position
				start = start.getNext();
			else
			{
				int index = 1;
				Node<Object> prevNode = new Node <Object> ();
				prevNode = start;
				curr = start.getNext();
				while ( curr != null )
				{
					if ( index == location ) 
					{
						prevNode.setNext( curr.getNext() );
						break;
					}
					else
					{
						prevNode = curr;
						curr = curr.next;
					}
				}
				if ( curr == null )		// item not found in list
					System.out.println("Item not found in list");
			}
		}
	}
	
	
	// retrieve item at given location
	public void retrieveItemAtGivenLocation( int location )
	{
		int index = 0;
		curr = start;
		while ( curr != null )
		{
			if ( index == location ) 
			{
				System.out.println ("The item is : "+curr.getNodeValue());
				break;
			}
			else
			{
				index++;
				curr = curr.getNext();
			}
		}
		if ( curr == null )		// item not found in list
			System.out.println("No Item exist at this position in list");
	}
	
	
	// reverses linked list
	public void reverseLinkedList()
	{
		if ( start == null || start.getNext()== null ) // empty or just one node in the list
			return;
		Node second = start.getNext(); 
		Node third = second.getNext(); // store third node before we change
		second.setNext(start);   // second's next pointer now points to start
		start.setNext(null);     // change start pointer to null
		// till now reversed only two nodes
		
		if ( third == null )
			return;
		Node curr = third;
		Node prevNode = second;
		
		while ( curr != null )
		{
			Node nextNode = curr.getNext();
			curr.setNext(prevNode);
			// repeat this process, but have to reset prevNode & curr node
			prevNode = curr;
			curr = nextNode;
		}
		start = prevNode;    // reset the start node
	}
	
	
	// sorts linked list
	public void sortLinkedList()
	{
		curr = start;
		while ( curr != null )
		{
			Node newNode = curr.getNext();
			while ( newNode != null )
			{
				if ( Integer.parseInt(curr.getNodeValue().toString()) > Integer.parseInt(newNode.getNodeValue().toString()) )
				{
					Object temp = curr.getNodeValue();
					curr.setNodeValue(newNode.getNodeValue());
					newNode.setNodeValue(temp);
				}
				newNode = newNode.next;
			}
			curr = curr.next;
		}
	}
	
	
	// traverses linked list
	public void traverseList ()
	{
		curr = start;
		while ( curr != null )
		{
			System.out.println (curr.nodeValue);
			curr = curr.next;
		}
	}
}
