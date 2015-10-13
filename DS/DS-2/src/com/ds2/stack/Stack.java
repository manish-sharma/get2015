package com.ds2.stack;



/*This class implements stack using linked list it conatins pop,push method and top pointer to keep track of last element on top
 * of stack
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class Stack<T> {
      
	protected StackNode<T> top=null;
	protected T value;
	protected StackNode<T> start=null;
	//function to add value in stack
    public void push(T value)
	{
		StackNode<T> node=new StackNode<T>(null,value);
		if(top==null)//stack is not created
	   	{   
			/*creating stack and setting value of top to node*/
			node.setValue(value);
			top=node;
		}
		
		else
		{
			/*inserting the value on top*/
			node.setValue(value);
			node.setNextNode(top);
			top=node;
		}
	}
    
    /*function to delete data from stack*/
    public T pop()
    {
    	T deletedElement=null;
    	if(top==null)//stack is empty
    	{
    		System.out.println("Strck Underflow");
    	}
    	
    	else
    	{   //getting the stack top value and removing it and decreasing the value of top
    		StackNode<T> temporaryTop=top;
    		deletedElement=temporaryTop.getValue();
    		temporaryTop=temporaryTop.getNextNode();
    		top=temporaryTop;
    	}
    	return deletedElement;
    }
    /*function to display stack*/
    public void display()
    {
    	StackNode<T> temporaryNode=top;
    	while(temporaryNode!=null)
    	{
    		System.out.print(" " + temporaryNode.getValue());
    		temporaryNode=temporaryNode.getNextNode();
    	}
    }
    /*function to get value from top of stack*/
    public T peek()
    {
    	return top.getValue();
    }
}
