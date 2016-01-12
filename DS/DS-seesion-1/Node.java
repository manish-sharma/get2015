/*
 * This is the node of singly linked list
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