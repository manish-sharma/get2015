package com.ds1.linkedlist;
/*This class implements the all the methods which perform all the operations in the linked list
 * @author Shishir Pareek
 * Date 25th August 2015
 */


public class LinkList  {

	protected Node startNode;
	protected int value;
    //constructor for initializing the node 	
	public LinkList()
	{
		startNode=null;
		value=0;
	}
	
	//function to create and insert node in link list
	public void createLinkList(int value)
	{
		Node newNode=new Node(null,value);
		//condition to check if link list is already created or not 
		if(startNode==null)
		{
			startNode=newNode;
		}
		
		else
		{
		Node tempoaryNode=startNode;
		while(tempoaryNode.getNextNode()!=null)//loop to reach the end of the list
		{
			tempoaryNode=tempoaryNode.getNextNode();
		}
		tempoaryNode.setNextNode(newNode);//setting pointer to new node in previous node
		newNode.setNextNode(null);//updating new node pointer for next node to null
	   }
	}
	
	//function to insert the value at particular index
	public void insertAtPosition(int value,int position)
	{
		Node newNode=new Node(null,value);//creating new node
		Node temporaryNode=startNode;//Assigning temporary node starting node pointer 
		position=position-1;
		int counter=0;
		while(temporaryNode!=null)//loop to reach towards the end of the list
		{
			if(counter==position)//condition to check if we reached at the position we want to insert node
			{
				/*setting the pointer values so that the previous node 
				  next point to new node and new node next pointer to the 
				  node previously pointed by the node which is now pointing*/
				newNode.setNextNode(temporaryNode.getNextNode()); 
				temporaryNode.setNextNode(newNode); 
				break;
			}
			else
			{
				/*increasing the counter of nodes traversed and increasing the pointer at of which node travesred*/
			counter++;
			temporaryNode=temporaryNode.getNextNode();
			}
		}
	}
		
	//function to remove the node of particular data value
		public void removeByValue(int value)
		{
			Node temporaryNode=startNode;
			Node previousNode=null;
			while(temporaryNode!=null)//function to traverse the list
			{
				if(temporaryNode.getValue()==value)//checking if the current node is holding the required value or not 
				{
					/*removing the node by letting its previous node pointing to the node next node which she was pointing*/
					previousNode.setNextNode(temporaryNode.getNextNode());
					temporaryNode=null;
					break;
				}
				previousNode.setNextNode(temporaryNode);//getting keeping the current node value for future use
				temporaryNode=temporaryNode.getNextNode();//moving pointer for current node accessed by list
		   }
		}
		
		//function to remove node at particular position
		public void removeByIndex(int index)
		{
			Node temporaryNode=null;
			Node previousNode=null;
			temporaryNode=startNode;
			int counter=1;
			if(index==1)//if we want to remove the first node just update start pointer 
			{
				startNode=startNode.getNextNode();
			}
			
			else 
			{
				while(temporaryNode!=null)//traversing the list
				{
					if(counter==index)//if we have reached the position of node which we want to remove 
					{
						/*setting the pointers so that previous node of the node wen want ot ddete point to next node of the node 
						 * we want to delete
						 */
						previousNode.setNextNode(temporaryNode.getNextNode()); 
						temporaryNode=null;//removing the node
						break;

					}
					counter++;//increasing the no of node we have traversed
					previousNode.setNextNode(temporaryNode);//keeping value of current node for future use
					temporaryNode=temporaryNode.getNextNode();//updating the traversing pointer
				}
			}
	     }
		//function to retrive item at particular position 
		int itemRetrieval(int index) {
			int data;
			Node temporaryNode = startNode;
			for (int shift = 0; shift < index; shift++) { //traversing the list
				temporaryNode = temporaryNode.getNextNode();
			}
			data = temporaryNode.getValue();//getting the data and returning it 
			return data;
		}
    
		//function to sort the linked list
		void sortLinkedList() {
			Node temporaryNode, current=startNode;
			int check;
			while( current != null )  // apply simple sorting to sort the elements of Linked list
			{
				temporaryNode = startNode;
				while( temporaryNode.getNextNode()!= null )//traversing the list
				{
					if(temporaryNode.getValue() > temporaryNode.getNextNode().getValue())//condition to check if the value of current node is greater than next node value
					{
						check = temporaryNode.getValue();
						temporaryNode.setValue(temporaryNode.getNextNode().getValue()); //moving the nodes at proper position so that it forms increasing sequence 
						temporaryNode.getNextNode().setValue(check);
					}
					temporaryNode = temporaryNode.getNextNode();//moving current node accessed pointer 
				}
				current = current.getNextNode();
			}
			
		}
		//function to reverse the list
		public void reverseList() {
			Node previousNode = null;
			Node temporaryNode = startNode;
			Node nextNode = temporaryNode.getNextNode();
			while (temporaryNode != null) {//loop to traverse the list
				
				if (nextNode == null) 
					break;

				temporaryNode.setNextNode(previousNode); /*logic to reverse the next pointer so that no each next pointer will point to the previous node and star
				                                           node will point to null*/
				previousNode = temporaryNode;
				temporaryNode = nextNode;
				nextNode = nextNode.getNextNode();
			}
			temporaryNode.setNextNode(previousNode);
			startNode = temporaryNode;

		}
	   //function to traverse and  print list elements
		public void printLinkList()
		{
			Node temporaryNode;
			temporaryNode=startNode;
			while(temporaryNode!=null)
			{
				System.out.print(" " + temporaryNode.getValue());
				temporaryNode=temporaryNode.getNextNode();
			}
		}
		
		
}
