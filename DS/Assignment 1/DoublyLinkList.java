/****************************************************************************************
Name            : DoublyLinkList
Revision Log    : 2015-08-26: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform all opertion of DoublyLink list
                :
****************************************************************************************/
//@param int nodeValue :variable holds the node value
//@param DoublyLinkList next : It is a class type variable which holds address of next node
public class DoublyLinkList {

	
	int nodeValue;
	DoublyLinkList previous;
	DoublyLinkList next;
	static DoublyLinkList first = null;
	static int count = 0;
	
	// constructor initialize the members of class
	DoublyLinkList()
	{
		nodeValue = 0;
		previous = null;
		next = null;
	}
	
	//addAtFirst method is for insert an item at first
	void addAtFirst(int item)
	{
		DoublyLinkList newnode = new DoublyLinkList();
		newnode.nodeValue = item;
		newnode.next = first;
		newnode.previous = null;
		if( first != null)
		{
			first.previous = newnode;
		}
		first = newnode;
		count++;
	}
	
	//addAtLoc method is for insert an item at given location
	void addAtLoc(int location, int item)
	{
		if( location < count )
		{
			DoublyLinkList newnode = new DoublyLinkList();
			newnode.nodeValue = item;
			int i;
			DoublyLinkList tempnode = first;
			if( location == 0 )
			{
				newnode.next = tempnode;
				newnode.previous = null;
				first.previous = newnode;
				first = newnode;
				count++;
			}
			else
			{
				for(i=0; i<(location-1); i++)
				{
					tempnode = tempnode.next;
				}
				newnode.next = tempnode.next;
				newnode.previous = tempnode;
				tempnode.next.previous = newnode;
				tempnode.next = newnode;
				count++;
			}
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	//remove metohd is used for remove item from list
	void remove(int item)
	{
		DoublyLinkList previousiousnode = first;
		DoublyLinkList currnode = first;
		while( currnode != null )
		{
			if( currnode.nodeValue == item )
			{
				break;
			}
			previousiousnode = currnode;
			currnode = currnode.next;
		}
		if( currnode == null )
		{
			System.out.print("\n Item Not Found ");
		}
		else
		{
			previousiousnode.next = currnode.next;
			currnode.next.previous = previousiousnode;
			currnode.next = null;
			currnode.previous = null;
			count --;
		}
	}
	
	//method is used for remove item of index 
	void removeAtIndex(int loc)
	{
		if( loc < count )
		{
			int i;
			DoublyLinkList previousiousnode = first;
			DoublyLinkList currnode = first;
			for(i=0; i<loc; i++)
			{
				previousiousnode = currnode;
				currnode = currnode.next;
			}
			previousiousnode.next = currnode.next;
			currnode.next.previous = previousiousnode;
			currnode.next = null;
			currnode.previous = null;
			count --;
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	//retrieval method is used to find item of given location
	void retrievel(int loc)
	{
		if( loc < count )
		{
			int i;
			DoublyLinkList currnode = first;
			for(i=0; i<loc; i++)
			{
				currnode = currnode.next;
			}
			System.out.print("\n Item at "+loc+"th location is "+currnode.nodeValue);
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	//reverse is used to reverse the link list
	void reverse()
	{
		DoublyLinkList tempnode1 = first, tempnode2 = null, tempnode3;
		while( tempnode1 != null )
		{
			tempnode3 = tempnode2;
			tempnode2 = tempnode1;
			tempnode1 = tempnode1.next;
			tempnode2.next = tempnode3;
			tempnode2.previous = tempnode1;
		}
		first = tempnode2;
	}
	
	//Method is used for sort link list
	void sort()
	{
		DoublyLinkList tempnode1 = first, tempnode2;
		int temp;
		while( tempnode1 != null )
		{
			tempnode2 = first;
			while( tempnode2.next != null )
			{
				if( tempnode2.nodeValue > tempnode2.next.nodeValue )
				{
					temp = tempnode2.nodeValue;
					tempnode2.nodeValue = tempnode2.next.nodeValue;
					tempnode2.next.nodeValue = temp;
				}
				tempnode2 = tempnode2.next;
			}
			tempnode1 = tempnode1.next;
		}
	}
	
	//Display link list
	void display()
	{
		if(count==0){
			System.out.print("\n Linked list empty : ");
		}
		else{
			DoublyLinkList currnode = first;
			System.out.print("\n Linked list is : ");
			while( currnode.next != null )
			{
				System.out.print(currnode.nodeValue+" ");
				currnode = currnode.next;
			}
			System.out.print(currnode.nodeValue);
			System.out.print("\n Linked list is : ");
			while(currnode.previous != null )				// Display the elements of list from last to front using previous
			{
				System.out.print(currnode.nodeValue+" ");
				currnode = currnode.previous;
			}
			System.out.print(currnode.nodeValue);
		}
	}
	
}
//End of class
