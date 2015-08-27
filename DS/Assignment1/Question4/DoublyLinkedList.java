package Question4;

public class DoublyLinkedList
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
		newNode.setPrevious(null);
		
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
			newNode.setPrevious ( curr );
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
		newNode.setPrevious(null);
		
		if ( location == 0 )	// adding item at 1st position
		{
			newNode.setNext( start );   
			start = newNode;
		}
		else
		{
			int index = 1;
			Node prevNode = start;
			curr = start.getNext();
			
			while ( curr != null )
			{
				if ( index == location )
				{	
					newNode.setPrevious ( prevNode );
					prevNode.setNext ( newNode );
					curr.setPrevious ( newNode );
					newNode.setNext ( curr );
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
			{	
				if ( index == location )
				{
					newNode.setPrevious ( prevNode );
					prevNode.setNext( newNode );
				}
				else
					System.out.println("Please enter correct location");
			}
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
				curr = start.getNext();
				
				while ( curr.getNext() != null )
				{
					if ( curr.getNodeValue() == item )
					{	
						Node prevNode = curr.getPrevious();
						Node succNode = curr.getNext();
						succNode.setPrevious ( prevNode ); 
						prevNode.setNext ( succNode );
						break;
					}
					else
						curr = curr.next;
				}
				if ( curr.getNext() == null )
				{
					if ( curr.getNodeValue() == item )
					{
						Node prevNode = curr.getPrevious();
						prevNode.setNext( curr.getNext() );
					}
					else		// item not found in list
						System.out.println("Item not found in list");
				}
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
				curr = start.getNext();
				while ( curr.getNext() != null )
				{
					if ( index == location ) 
					{
						Node prevNode = curr.getPrevious();
						Node succNode = curr.getNext();
						succNode.setPrevious ( prevNode ); 
						prevNode.setNext ( succNode );
						break;
					}
					else
					{
						index++;
						curr = curr.next;
					}
				}
				if ( curr.getNext() == null )		
				{
					if ( index == location )
					{
						Node prevNode = curr.getPrevious();
						prevNode.setNext( curr.getNext() );
					}
					else	// item not found in list
						System.out.println("No Item found at this location");
				}	
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
	
	
	// reverses doubly linked list
	public void reverseDoublyLinkedList()
	{
		if ( start == null || start.getNext()== null ) // empty or just one node in the list
			return;
		
		Node second = start.getNext(); 
		Node third = second.getNext(); // store third node before we change
		
		second.setNext(start);   // second's next pointer now points to start
		second.setPrevious(third);		// second's previous pointer now points to third
		
		start.setNext(null);     // change start pointer to null
		start.setPrevious(second);
		// till now reversed only two nodes
		
		if ( third == null )
			return;
		
		Node curr = third;
		Node prevNode = second;
		
		while ( curr != null )
		{
			Node nextNode = curr.getNext();
			curr.setPrevious(third);
			third.setNext(second);
			curr.setNext(prevNode);
			prevNode.setPrevious(curr);
			// repeat this process, but have to reset prevNode & curr node
			prevNode = curr;
			curr = nextNode;
		}
		start = prevNode;    // reset the start node
	}
	
	
	// sorts linked list
	public void sortDoublyLinkedList()
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
