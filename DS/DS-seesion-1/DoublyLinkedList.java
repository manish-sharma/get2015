/*
 * This is a class contains all operation operate on Doubly Linked List
 * @author Banwari Kevat
 */

public class DoublyLinkedList {
		private DoublyNode first;
		private DoublyNode last;
		DoublyLinkedList() {
			this.first=null;
			this.last=null;
		}
		
	//This method create node and then return reference of that node
	public DoublyNode createNode(int item) {
		DoublyNode node = new DoublyNode(item);
		 return node;
	}
	/*
	 * This method insert the node at beginning
	 * @param item is the which will be inserted into linked list
	 */
	public void insertAtBegin( int item ) {
		if(first==null) {
			first = createNode(item);
			last = first;
		}
		else {
			DoublyNode node = createNode(item);
			node.next=first;
			first.previous=node;
			first=node;
		}
	}
	
	//This method insert the node at last
	public void insertAtLast(int item) {
		if(first==null) {
			first = createNode(item);
			last = first;
		}
		else {
			DoublyNode node = createNode(item);
			last.next = node;
			node.previous=last;
			last=node;
		}	      
	}
	
	//This method remove the item from list 
	public boolean removeItem( int item) {
		if(first==null) {
			return false;
		}
		else {
			DoublyNode traverse = first;
			while(traverse != null) {
				if(traverse.item == item) {
					//removed item is first then previous should be null
					if(traverse==first) {
						first = traverse.next;
						first.previous=null;
					}
					//removed item is last then next should be null
					else if(traverse == last) {
						last = traverse.previous;
						last.next=null;
					}
					else {
					    traverse.previous.next=traverse.next;
					    traverse.next.previous=traverse.previous;
					}    
				}
				traverse=traverse.next;
			}	
			return true;
		}		
	}
	
	//this method will reverse the list
	public void reverseList() {
		DoublyNode traverse, tempnode1, tempnode2;
		traverse= first;
		while(traverse!= null) {
			//interchange of previous and next references
			tempnode1 = traverse.next;
			tempnode2 = traverse.next;
			traverse.next = traverse.previous;
			traverse.previous = tempnode2;
			traverse = tempnode1;
		}
		//interchange first and last
		tempnode1 = first;
		first = last;
		last = tempnode1;
		
	}
	
	
	//This method sort the element of list
	public void sortList() {
		DoublyNode tempnode1 = first, tempnode2;
		int temp;
		 // apply simple sorting to sort the elements of Linked list
		while( tempnode1 != null ) {
			tempnode2 = first;
			while(tempnode2.next != null) {
				if( tempnode2.item > tempnode2.next.item ){
					temp = tempnode2.item;
					tempnode2.item = tempnode2.next.item;
					tempnode2.next.item = temp;
				}
				tempnode2 = tempnode2.next;
			}
			tempnode1 = tempnode1.next;
		}
	}
	
	
	//This method will display the list
	public void showList(){
		DoublyNode traverse = first;
	   while(traverse.next!=null) {
		   System.out.print(traverse.item+" <---> ");
		   traverse = traverse.next;
	   }
	   System.out.print(traverse.item);
	}
	
	
public static void main(String []  arg) {
	
	DoublyLinkedList obj = new DoublyLinkedList();
	obj.insertAtBegin(78);
	obj.insertAtBegin(18);
	obj.insertAtBegin(19);
	obj.insertAtLast(30);
	obj.insertAtLast(15);
	obj.insertAtBegin(88);
	obj.insertAtBegin(13);
	
	obj.showList();
	System.out.println();
	obj.removeItem(13);
    obj.showList();
	
}
	
	

}