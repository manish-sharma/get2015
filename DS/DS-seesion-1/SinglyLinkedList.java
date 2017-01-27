/*
 * This is a class contains all operation operate on Singly Linked List
 * @author Banwari Kevat
 */
 class Node {
	int item;
	Node next;
	
	Node(){
	   next=null;	
	}
	
	Node(int item) {
		this.item = item;
		this.next = null;
	}
}
 // This class contains the Linked list operation
public class SinglyLinkedList {
		private Node first;
		
		SinglyLinkedList() {
			this.first=null;
		}
		
	//This method create node and then return refrence of that node
	public Node createNode(int item) {
		 Node node = new Node(item);
		 return node;
	}
	/*
	 * This method insert the node at beginning
	 * @param item is the which will be inserted into linked list
	 */
	public void insertAtBegin( int item ) {
		if(first==null) {
			first = createNode(item);
		}
		else {
			Node node = createNode(item);
			node.next=first;
			first=node;
		}
	}
	
	//This method insert the node at last
	public void insertAtLast(int item) {
		if(first==null) {
			first = createNode(item);
		}
		else {
			Node traverse=first;
			while(traverse.next!=null) 
				traverse=traverse.next;
				Node node = createNode(item);
				traverse.next=node;			
		}	      
	}
	
	//This method remove the item from list 
	public boolean removeItem( int item) {
		if(first==null) {
			return false;
		}
		else {
			Node traverse = first;
			Node previous = null;
			while( traverse.next != null) {
				if(traverse.item != item) {
					previous = traverse;
				     traverse = traverse.next;
				} 
				else {
					    //remove that item
					    if(traverse==first) {
						   first=traverse.next;
						    traverse=first;
					    }
					    else  {
					      previous.next=traverse.next;
					      traverse=traverse.next;
					   }   
					}	  
			} 
			
			if(traverse.item == item) {
				previous.next=null;
			}
			return false;
		}
	}
	
	//this method will reverse the list
	public void reverseList() {
		Node tempnode1,tempnode2,traverse;
		traverse=first;
		tempnode1=null;
		tempnode2=traverse.next;
		while(traverse.next!=null) {
			traverse.next=tempnode1;
			tempnode1=traverse;
			traverse=tempnode2;
			tempnode2=tempnode2.next;
		}
		traverse.next=tempnode1;
		first=traverse;
	}
	
	
	//This method sort the element of list
	public void sortList() {
		Node tempnode1 = first, tempnode2;
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
	   Node traverse = first;
	   while(traverse.next!=null) {
		   System.out.print(traverse.item+" ---> ");
		   traverse = traverse.next;
	   }
	   System.out.print(traverse.item);
	}

	public static void main(String [] arg) {
		
		SinglyLinkedList obj = new SinglyLinkedList();
		
		obj.insertAtBegin(78);
		obj.insertAtBegin(18);
		obj.insertAtBegin(19);
		obj.insertAtLast(30);
		obj.insertAtLast(15);
		obj.insertAtBegin(88);
		obj.insertAtBegin(13);
		
		obj.showList();
		System.out.println();
		obj.removeItem(15);
	    obj.showList();
		
	}


}