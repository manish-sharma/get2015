import java.util.Scanner;

/**
 * DS Session1 Assignment
 * DoublyList.java
 * @author Banwari
 *
 */
public class DoublyList {

	/**
	 * this assignment is same as previous SinglyList.java
	 * In this only one data member prev(holds address of previous node) is extra member.
	 * All the methods are approximately same as previous assignment methods 
	 */
	int nodeValue;
	DoublyList prev;
	DoublyList next;
	static DoublyList first = null;
	static int count = 0;
	DoublyList()
	{
		nodeValue = 0;
		prev = null;
		next = null;
	}
	void addAtFirst(int item)
	{
		DoublyList newnode = new DoublyList();
		newnode.nodeValue = item;
		newnode.next = first;
		newnode.prev = null;
		if( first != null)
		{
			first.prev = newnode;
		}
		first = newnode;
		count++;
	}
	void addAtLoc(int loc, int item)
	{
		if( loc < count )
		{
			DoublyList newnode = new DoublyList();
			newnode.nodeValue = item;
			int i;
			DoublyList tempnode = first;
			if( loc == 0 )
			{
				newnode.next = tempnode;
				newnode.prev = null;
				first.prev = newnode;
				first = newnode;
				count++;
			}
			else
			{
				for(i=0; i<(loc-1); i++)
				{
					tempnode = tempnode.next;
				}
				newnode.next = tempnode.next;
				newnode.prev = tempnode;
				tempnode.next.prev = newnode;
				tempnode.next = newnode;
				count++;
			}
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	void remove(int item)
	{
		DoublyList previousnode = first;
		DoublyList currnode = first;
		while( currnode != null )
		{
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
			previousnode.next = currnode.next;
			currnode.next.prev = previousnode;
			currnode.next = null;
			currnode.prev = null;
			count --;
		}
	}
	void removeAtIndex(int loc)
	{
		if( loc < count )
		{
			int i;
			DoublyList previousnode = first;
			DoublyList currnode = first;
			for(i=0; i<loc; i++)
			{
				previousnode = currnode;
				currnode = currnode.next;
			}
			previousnode.next = currnode.next;
			currnode.next.prev = previousnode;
			currnode.next = null;
			currnode.prev = null;
			count --;
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	void retrievel(int loc)
	{
		if( loc < count )
		{
			int i;
			DoublyList currnode = first;
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
	void reverse()
	{
		DoublyList tempnode1 = first, tempnode2 = null, tempnode3;
		while( tempnode1 != null )
		{
			tempnode3 = tempnode2;
			tempnode2 = tempnode1;
			tempnode1 = tempnode1.next;
			tempnode2.next = tempnode3;
			tempnode2.prev = tempnode1;
		}
		first = tempnode2;
	}
	void sort()
	{
		DoublyList tempnode1 = first, tempnode2;
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
	void display()
	{
		DoublyList currnode = first;
		System.out.print("\n Linked list is : ");
		while( currnode.next != null )
		{
			System.out.print(currnode.nodeValue+" ");
			currnode = currnode.next;
		}
		System.out.print(currnode.nodeValue);
		System.out.print("\n Linked list is : ");
		while(currnode.prev != null )				// Display the elements of list from last to front using prev
		{
			System.out.print(currnode.nodeValue+" ");
			currnode = currnode.prev;
		}
		System.out.print(currnode.nodeValue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, loc, item;
		Scanner sc = new Scanner(System.in);
		DoublyList list = new DoublyList();
		while(true)
		{
			System.out.print("\n 1. Add Element at First"
							+"\n 2. Add Element at Location"
							+"\n 3. Removal of an item based on its value "
							+"\n 4. Removal of an item based on its index"
							+"\n 5. Retrieval of an item of particular index"
							+"\n 6. Reversal of linked list"
							+"\n 7. Sorting of linked list"
							+"\n 8. Display linked list"
							+"\n 9. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				list.addAtFirst(item); break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				list.addAtLoc(loc, item); break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				list.remove(item); break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				list.removeAtIndex(loc); break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = sc.nextInt();
				list.retrievel(loc); break;
			case 6:
				list.reverse(); break;
			case 7:
				list.sort(); break;
			case 8:
				list.display(); break;
			case 9:
				System.exit(0);
			}
		}

	}

}
