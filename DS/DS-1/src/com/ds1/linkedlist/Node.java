package com.ds1.linkedlist;
/*this class forms the basic structure of type node as abstract data type
 * @author Shishir Pareek
 * Date 25th August 2015
 */
public class Node {

	public Node nextNode;//variable to point next node
	public int value;//variable to hold value
	//constructor of class
	public Node()
	
	{
		this.nextNode=null;
		value=(Integer) null;
	}
     //Parameterized constructor to initialize the value whenever a new node is created
	public Node(Node nextNode,int value)
	{
		this.nextNode=nextNode;
		this.value=value;
	}
  //getter to get node
	public Node getNextNode() {
		return nextNode;
	}
    //setter for node type
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
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
