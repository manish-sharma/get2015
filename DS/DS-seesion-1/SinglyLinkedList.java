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
public class SinglyLinkedList {
		private Node first;
		
		SinglyLinkedList() {
			this.first=null;
		}
		
	
	public Node createNode(int item) {
		 Node node = new Node(item);
		 return node;
	}
	
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
	
	public boolean removeItem( int item) {
		if(first==null) {
			return false;
		}
		else {
			
		}
		
	}
	
	public void showList(){
	   Node traverse = first;
	   while(traverse!=null) {
		   System.out.print(traverse.item+" ---> ");
		   traverse = traverse.next;
	   }
	}
	
	
public static void main(String []  arg) {
	
	SinglyLinkedList obj = new SinglyLinkedList();
	obj.insertAtBegin(78);
	obj.insertAtBegin(77);
	obj.insertAtBegin(13);
	obj.insertAtLast(30);
	
	obj.showList();
		
}
	
	

}
 