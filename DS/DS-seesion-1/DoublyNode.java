/*
 * This is Node of doubly linked list
 * @author Banwari Kevat
 */
 class DoublyNode {
	int item;
	DoublyNode next;
	DoublyNode previous;
	
	DoublyNode(){
	   next=null;
	   previous=null;
	}
	
	DoublyNode(int item) {
		this.item = item;
		this.next = null;
		this.previous=null;
	}
}
