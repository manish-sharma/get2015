package com.ds1.doublylinklist;
/*this class forms the basic structure of type node as abstract data type
 * @author Shishir Pareek
 * Date 25th August 2015
 */

public class DoublyLinkListNode {

	DoublyLinkListNode nextNode;//pointer to next node
	DoublyLinkListNode previousNode;//pointer to previous node
	int value;//variable to hold value 
	//constructor to initialize the attributes
	public DoublyLinkListNode()
	{
		this.nextNode = null;
		this.previousNode = null;
		this.value=0;
		
	}
	//constructor to initialize and assign the values whenever new node is created
	public DoublyLinkListNode(DoublyLinkListNode nextNode,DoublyLinkListNode perviousNode, int value) {
		this.nextNode = nextNode;
		this.previousNode = previousNode;
		this.value = value;
	}
	//getter for next node
	public DoublyLinkListNode getNextNode() {
		return nextNode;
	}
	//setter for next node
	public void setNextNode(DoublyLinkListNode nextNode) {
		this.nextNode = nextNode;
	}
	//getter for previous node
	public DoublyLinkListNode getPreviousNode() {
		return previousNode;
	}
	//setter for previous node
	public void setPreviousNode(DoublyLinkListNode previousNode) {
		this.previousNode = previousNode;
	}
	//getter for value
	public int getValue() {
		return value;
	}
	//setter for value
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
