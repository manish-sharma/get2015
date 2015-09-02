package assignmentDS_5;
/**
 * Here we are are implementing Singly Linked List in sorted order
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-2
 * 
**/
//class Node 
class Node{
	//data held by the node
	public int nodeValue;
	//next node in the list
	public Node next;
	
	
	//default constructor with no initial value
	public Node() {
		super();
		this.nodeValue = 0;
		this.next = null;
	}

	
	//initialize node value to the item and set next to null
	public Node(int item) {
		super();
		this.nodeValue = item;
		this.next = null;
		
	}
	
}

/*
 * class SortedSinglyLinkedList
 */
public class SortedSinglyLinkedList
{
	Node start;
	Node  end;
	
	//default constructor
	public SortedSinglyLinkedList() {
		super();
		start=null;
		end=null;
	}
	
	
	/**
	 * below method is used to insert node in sorted linked list
	 * @param val : value of current Node
	 * @param start : start node of linked list
	 * @return start node of linked list
	 */
	
	public Node insertNode(int val,Node start)
	{
		if(start==null)
		{
			Node  newNode=new Node(val);
			return newNode;
		}
			
		if(val<=start.nodeValue)
		{
			Node  newNode=new Node(val);
			newNode.next=start;
			return newNode;
			
		}
		start.next=insertNode( val,start.next);
		return start;
	}
	
	/**
	 * Below method is use to show all elements of linked list
	 */
	
	public void show()
	{
		Node ptr=start;
		while(ptr!=null)
		{
			System.out.println(ptr.nodeValue);
			ptr=ptr.next;
		}
		
	}
	
	
	public static void main(String args[])
	{
		SortedSinglyLinkedList singlyLinkedList=new SortedSinglyLinkedList();
		
		singlyLinkedList.start=singlyLinkedList.insertNode(1,singlyLinkedList.start);
		singlyLinkedList.start=singlyLinkedList.insertNode(5,singlyLinkedList.start);
		singlyLinkedList.start=singlyLinkedList.insertNode(2,singlyLinkedList.start);
		singlyLinkedList.start=singlyLinkedList.insertNode(8,singlyLinkedList.start);
		singlyLinkedList.start=singlyLinkedList.insertNode(19,singlyLinkedList.start);
		singlyLinkedList.start=singlyLinkedList.insertNode(14,singlyLinkedList.start);
		singlyLinkedList.show();
	}
	
}

