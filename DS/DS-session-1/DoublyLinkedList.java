/**all the methods are defined in this class for the doubly linked list
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015 
 */

public class DoublyLinkedList {

	int nodeValue;
	DoublyLinkedList previous;
	DoublyLinkedList next;
	static DoublyLinkedList first = null;
	static int count = 0;
	
	public DoublyLinkedList() {				//create an empty new node
		nodeValue = 0;
		previous = null;
		next = null;
	}
	
	//method to add new node at start
	public void addAtFirst(int item) {
		DoublyLinkedList newNode = new DoublyLinkedList();
		newNode.nodeValue = item;
		newNode.next = first;
		newNode.previous = null;
		
		if( first != null)					//if list is empty
			first.previous = newNode;

		first = newNode;
		count++;
	}
	
	//method to add new node at given index
	public void addAtIndex(int location, int item) {

		if( location < count ) {
			DoublyLinkedList newNode = new DoublyLinkedList();
			newNode.nodeValue = item;
			int i;
			DoublyLinkedList tempNode = first;
			
			if( location == 0 ) {				//to add the new node at start
				newNode.next = tempNode;
				newNode.previous = null;
				first.previous = newNode;
				first = newNode;
				count++;
			}
			else {
				for(i = 0; i < (location - 1); i++)			//to add the new node at given index
					tempNode = tempNode.next;

				newNode.next = tempNode.next;
				newNode.previous = tempNode;
				tempNode.next.previous = newNode;
				tempNode.next = newNode;
				count++;
			}
		}
		else						//if the index is not found
			System.out.print("\n Location not found ");
	}
	
	//method to remove  given item from the linked list
	public void remove(int item) {
		try {
			DoublyLinkedList previousNode = first;
			DoublyLinkedList currNode = first;
			
			while( currNode != null ) {
				if( currNode.nodeValue == item )		//traversing up to the node to be deleted
					break;
				
				previousNode = currNode;
				currNode = currNode.next;
			}

			if( currNode == null )
				System.out.print("\n Item Not Found ");			//item not found case
			else {
				previousNode.next = currNode.next;				//deleting the node
				currNode.next.previous = previousNode;
				currNode.next = null;
				currNode.previous = null;
				count --;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//method to remove item at given index from the linked list
	public void removeFromIndex(int location) {
		if( location < count ) {
			int i;
			DoublyLinkedList previousNode = first;
			DoublyLinkedList currNode = first;
			
			for(i = 0; i < location; i++) {			//traversing up to the given index
				previousNode = currNode;
				currNode = currNode.next;
			}
			previousNode.next = currNode.next;		//removing the node at given index
			currNode.next.previous = previousNode;
			currNode.next = null;
			currNode.previous = null;
			count --;
		}
		else
			System.out.print("\n Location not found ");		//index not found case
	}
	
	//method to get item at given index
	public void retrieve(int location) {
		if( location < count ) {
			int i;
			DoublyLinkedList currNode = first;
			for(i = 0; i < location; i++)			//finding the item
				currNode = currNode.next;
			System.out.print("\n Item at " + location + " location is " + currNode.nodeValue);
		}
		else
			System.out.print("\n Item not found ");		//item not found case
	}
	
	//method to reverse the linked list
	public void reverse() {
		DoublyLinkedList tempNode1 = first, tempNode2 = null, tempNode3;
		
		while( tempNode1 != null ) {			//using 3 temporary nodes to swap nodes and move forward
			tempNode3 = tempNode2;
			tempNode2 = tempNode1;
			tempNode1 = tempNode1.next;
			tempNode2.next = tempNode3;
			tempNode2.previous = tempNode1;
		}
		first = tempNode2;
	}

	//method to sort the linked list
	public void sort() {
		DoublyLinkedList tempNode1 = first, tempNode2;
		int temp;

		while( tempNode1 != null ) {
			tempNode2 = first;
			while( tempNode2.next != null ) {				//logic for sorting the linked list
				if( tempNode2.nodeValue > tempNode2.next.nodeValue ) {
					temp = tempNode2.nodeValue;
					tempNode2.nodeValue = tempNode2.next.nodeValue;
					tempNode2.next.nodeValue = temp;
				}
				tempNode2 = tempNode2.next;
			}
			tempNode1 = tempNode1.next;
		}
	}
	
	//method to show the linked list in forward and reverse direction
	public void display()
	{
		DoublyLinkedList currNode = first;
		System.out.print("\n Linked list is : ");
		
		while( currNode.next != null ) {						//showing in forward direction
			System.out.print(currNode.nodeValue+" ");
			currNode = currNode.next;
		}
		System.out.print(currNode.nodeValue);
		System.out.println();
		System.out.print("\n Linked list is : ");
		
		while(currNode.previous != null ) {						//showing in reverse direction
			System.out.print(currNode.nodeValue+" ");
			currNode = currNode.previous;
		}
		System.out.print(currNode.nodeValue);
		System.out.println();
	}
}