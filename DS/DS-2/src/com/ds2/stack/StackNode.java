package com.ds2.stack;
/*This class defines structure for StackNode
 * @author Shishir Pareek
 * Date 26th August 2015
 */


public class StackNode<T> {

	protected StackNode<T> nextNode;//variable to store pointer of next node 
	protected T value;//variable to store value 
	
	//constructor to initialize the value of variable 
	public StackNode()
	{
		nextNode=null;
		value=null;
	}
	//constructor to initialize the value of variable when node is created 
	public StackNode(StackNode<T> nextNode,T value)
	{
		this.nextNode=nextNode;
		this.value=value;
	}

	//getter for node
	public StackNode<T> getNextNode() {
		return nextNode;
	}
     //setter for node 
	public void setNextNode(StackNode<T> nextNode) {
		this.nextNode = nextNode;
	}
    //getter for value
	public T getValue() {
		return value;
	}
     //setter for value 
	public void setValue(T value) {
		this.value = value;
	}
}
