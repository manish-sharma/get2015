/****************************************************************************************
Name            : SinglyLinkList
Revision Log    : 2015-08-26: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform all opertion of singleLink list
                :
****************************************************************************************/

//@param int nodeValue :variable holds the node value
//@param SinglyLinkList next : It is a class type variable which holds address of next node
public class SinglyLinkList {

	
	int nodeValue;				
	SinglyLinkList next;			
	static SinglyLinkList first = null;		
	static int count = 0;	
	// constructor initialize the members of class
	SinglyLinkList()				
	{
		nodeValue = 0;
		next = null;
	}
	
	//addAtFirst method is for insert an item at first
	void addAtFirst(int item)
	{
		SinglyLinkList newnode = new SinglyLinkList();		
		newnode.nodeValue = item;		
		newnode.next = first;			
		first = newnode;			
		count++;			
	}
	
	//addAtLoc method is for insert an item at given location
	void addAtLoc(int location, int item)
	{
		if( location < count )							
		{
			SinglyLinkList newnode = new SinglyLinkList();
			newnode.nodeValue = item;
			int i;
			SinglyLinkList tempnode = first;
			// if location is zero than add the node at first
			if( location == 0 )			
			{
				newnode.next = tempnode;
				first = newnode;
				count++;
			}
			// otherwise go to that location-1
			else					
			{
				for(i=0; i<(location-1); i++)
				{
					tempnode = tempnode.next;
				}
				newnode.next = tempnode.next;		
				tempnode.next = newnode;
				count++;
			}
		}
		else
		{
			System.out.print("\n locationation not found ");
		}
	}
	
	//remove metohd is used for remove item from list
	void remove(int item)
	{
		SinglyLinkList previousnode = first;
		SinglyLinkList currnode = first;
		while( currnode != null )
		{	// go to that locationation in list where this node value is find
			if( currnode.nodeValue == item )
			{
				break;
			}
			previousnode = currnode;			
			currnode = currnode.next;			
		}
		if( currnode == null )
		{
			System.out.print("\n Item Not Found ");
		}
		else
		{
			previousnode.next = currnode.next;		// now create link between previous node to next node  
			currnode.next = null;	// remove links of current node
			count --;				// reduce the size of count
		}
	}
	
	//method is used for remove item of index 
	void removeAtIndex(int location)
	{
		if( location < count )			// this method is same as previous method
		{
			int i;
			SinglyLinkList previousnode = first;
			SinglyLinkList currnode = first;
			for(i=0; i<location; i++)
			{
				previousnode = currnode;
				currnode = currnode.next;
			}
			previousnode.next = currnode.next;
			currnode.next = null;
			count --;
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	//retrieval method is used to find item of given location
	void retrievel(int location)
	{
		if( location < count )	
		{
			int i;
			SinglyLinkList currnode = first;
			for(i=0; i<location; i++)
			{
				currnode = currnode.next;
			}
			System.out.print("\n Item at "+location+"th locationation is "+currnode.nodeValue);
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	//reverse is used to reverse the link list
	void reverse()
	{
		SinglyLinkList tempnode1 = first, tempnode2 = null, tempnode3;
		while( tempnode1 != null )
		{
			tempnode3 = tempnode2;			
			tempnode2 = tempnode1;			
			tempnode1 = tempnode1.next;		
			tempnode2.next = tempnode3;	
		}
		first = tempnode2; 
	}
	
	//Method is used for sort link list
	void sort()
	{
		SinglyLinkList tempnode1 = first, tempnode2;
		int temp;
		// apply simple sorting to sort the elements of Linked list
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
		SinglyLinkList currnode = first;			
		System.out.print("\n Linked list is : ");
		while( currnode != null )
		{
			System.out.print(currnode.nodeValue+" ");		
			currnode = currnode.next;
		}
	}
	
}
//End of SingleLinkList class
