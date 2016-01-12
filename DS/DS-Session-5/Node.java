/*
 * This class contains the information about node of a singly linked list 
 */
public class Node {
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