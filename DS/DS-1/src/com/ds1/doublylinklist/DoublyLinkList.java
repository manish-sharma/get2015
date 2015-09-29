package com.ds1.doublylinklist;
/*This class implements the all the methods which perform all the operations in the doubly linked list
 * @author Shishir Pareek
 * Date 25th August 2015
 */

import com.ds1.linkedlist.Node;

public class DoublyLinkList {

	DoublyLinkListNode startNode;
	int value;
	//constructor to initialize the value 
	public DoublyLinkList()
	{
		startNode=null;
		value=0;
	}
	//function to create the linked list
	public void createDoubleLinkList(int value)
	{
       	DoublyLinkListNode newNode = new DoublyLinkListNode(null,null,value);
       	if(startNode==null)//if start is null then list is not created till now 
       	{
       		newNode.setPreviousNode(null);
       		newNode.setNextNode(null);
       		startNode=newNode;
       	}
       	
       	else
       	{
       		DoublyLinkListNode temporaryNode=startNode;
       		//DoublyLinkListNode previousNode=null;
       		while(temporaryNode.getNextNode()!=null)//loop to traverse the list
       		{
       			//previousNode=temporaryNode;
       			temporaryNode=temporaryNode.getNextNode();//moving the pointer to track the list 
       		}
       		/*updating the nodes pointer of previous node to point toward new node and new node pointer to point previous node*/
       		newNode.setPreviousNode(temporaryNode);
       		temporaryNode.setNextNode(newNode);      
       		newNode.setNextNode(null);
       		
       	}
       	
	}
	
	//function to insert node at particular position
	public void insertAtPosition(int value,int position)
	{ 
		DoublyLinkListNode newNode = new DoublyLinkListNode(null,null,value);
		DoublyLinkListNode temp = startNode;
		if (position == 0) { //if position is starting position then add new node and make start pointer point to this node
			newNode.setNextNode(startNode);
			newNode.setPreviousNode(null);
			startNode = newNode;
		} 
		else {
			for (int shift = 0; shift < position - 1; shift++) {//traversing the list
				temp = temp.getNextNode();
			}
			newNode.setNextNode(temp.getNextNode());//inserting the node at specified 
			newNode.setPreviousNode(temp);
			temp.setNextNode(newNode);
		}
		
	}
	//function to remove node at particular index
	public void removeByIndex(int index)
	{
		DoublyLinkListNode temporaryNode=null;
		temporaryNode=startNode;
		int counter=1;
		if(index==1)//if position is first node
		{
			startNode=startNode.getNextNode();
		}
		
		else 
		{
			while(temporaryNode!=null)//traverse the list
			{
				if(counter==index)//if the position is obtained 
				{
					/*removing the node and setting the values of previous and next nodes so that they both point to
					 * each other
					 */
					temporaryNode.getPreviousNode().setNextNode(temporaryNode.getNextNode());
					temporaryNode.getNextNode().setPreviousNode(temporaryNode.getPreviousNode());
					break;

				}
				counter++;//increasing the counter
				temporaryNode=temporaryNode.getNextNode();//moving current node pointer 
			}
		}
     }
	//function to remove a node by the value
	public void removeByValue(int value)
	{
		DoublyLinkListNode temporaryNode=startNode;
		while(temporaryNode!=null)//traversing the list
		{
			if(temporaryNode.getValue()==value)//if the value in current node is equal to value we were searching
			{
				/*removing the node and setting the values of previous and next nodes so that they both point to
				 * each other
				 */
				temporaryNode.getNextNode().setPreviousNode(temporaryNode.getPreviousNode());
				temporaryNode.getPreviousNode().setNextNode(temporaryNode.getNextNode());
				break;
			}
			
			temporaryNode=temporaryNode.getNextNode();//updating the value of pointer to point to next node
	   }
	}
	
	//function to retrieve data of node at particular index
	int itemRetrieval(int index) {
		int data;
		DoublyLinkListNode temporaryNode = startNode;
		for (int shift = 0; shift < index; shift++) { //traversing the list
			temporaryNode = temporaryNode.getNextNode();
		}
		data = temporaryNode.getValue();//getting the data value
		return data;
	}
	//function to reverse the list
    public void reverseList() {
	DoublyLinkListNode temporaryNode = null;
	DoublyLinkListNode currentNode=startNode;
	while (currentNode!= null) { //traversing the list
         
		/*reversing the list*/
		temporaryNode=currentNode.getPreviousNode(); 
		currentNode.setPreviousNode(currentNode.getNextNode());
		currentNode.setNextNode(temporaryNode); 
		currentNode = currentNode.getPreviousNode();
	}
	if(temporaryNode!=null)//condition to check if the value is null or not
		startNode=temporaryNode.getPreviousNode();
   }
    //function to print list
    public void printLinkList()
	{
		DoublyLinkListNode temporaryNode;
		temporaryNode=startNode;
		while(temporaryNode!=null)//traversing the list
		{
			System.out.print(" " + temporaryNode.getValue());
			temporaryNode=temporaryNode.getNextNode();
		}
	}
    /*function to sort the value*/
    public void sort() {
    	DoublyLinkListNode temp, current = startNode;
    	int check;
    	while (current != null) // apply simple sorting to sort the elements of Linked list
    	{
    	    temp = startNode;
    	    while (temp.getNextNode() != null) {
    		if (temp.getValue() > temp.getNextNode().getValue()) {
    		    check = temp.getValue();
    		    temp.setValue(temp.getNextNode().getValue());
    		    temp.getNextNode().setValue(check);
    		}
    		temp = temp.getNextNode();
    	    }
    	    current = current.getNextNode();
    	}
        }
}
