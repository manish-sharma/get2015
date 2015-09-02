public class SortedLinkedList {
	
	public SinglyNode insertSortedLinkedList(SinglyNode startNode ,int data) 
	{
			if(startNode==null||startNode.getData()>data)// either list is empty or insert at first position
			{
				SinglyNode newNode=createNode(data);
				newNode.setNextNode(startNode);
				startNode=newNode;
			}
			
			else if(startNode.getData() < data && startNode.getNextNode()!=null) //move to next node
				startNode.setNextNode(insertSortedLinkedList(startNode.getNextNode(), data));//Recursive call
			
			else //data insert at middle or last position
			{
				SinglyNode newNode=createNode(data);
				newNode.setNextNode(startNode.getNextNode());
				startNode.setNextNode(newNode);
			}
			
		return startNode;
	}
	
	public SinglyNode createNode(int data)
	{
		return new SinglyNode(data);
	}
	
	public void displaySortedLinkedList(SinglyNode startNode)
	{
		if(startNode==null)
		{
			System.out.println("List is empty");
			return;
		}
		while(startNode!=null)
		{
			System.out.println(+startNode.getData());
			startNode=startNode.getNextNode();
		}
	}

}
