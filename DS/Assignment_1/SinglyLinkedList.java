package assignmentDS_1;

/*
 * this program is for implementing singly linked list
 */

class Node<T>{
	//data held by the node
	public T nodeValue;
	//next node in the list
	public Node<T> next;
	
	
	//default constructor with no initial value
	public Node() {
		super();
		this.nodeValue = null;
		this.next = null;
	}

	
	//initialize node value to the item and set next to null
	public Node(T item) {
		super();
		this.nodeValue = item;
		this.next = null;
		
	}
	
}

/*
 * class SinglyLinkedList
 */
public class SinglyLinkedList<E>
{
	Node <E>start;
	Node <E> end;
	
	//default constructor
	public SinglyLinkedList() {
		super();
		start=null;
		end=null;
	}
	
	/*
	 * below function is used to insert node at last position
	 */
	public void insertNode(E val)
	{
		Node <E> newNode=new Node<E>(val);
		if(start==null)
		{
			start=newNode;
			end=newNode;
		}
		else
		{
			end.next=newNode;
			end=newNode;
		}
	}
	
	
	/*
	 * below function is used to insert node at specified location
	 */
	public void insertNodeAtLocation(int position,E val)
	{
		Node <E> newNode=new Node<E>(val);
		Node<E>ptr=start;
		Node<E>previous=start;
		int i=0;
		for(i=1;i<position&&ptr!=null;i++)
		{
			previous=ptr;
			ptr=ptr.next;
		}
		
		if(ptr!=null)
		{
			newNode.next=ptr;
			if(ptr==start)
			{
				start=newNode;
			}
			else
			{
				previous.next=newNode;
			}
			
		}
		else if(ptr==previous&&position==1)
		{
			start=end=newNode;
		}
		else if(previous==end&&i==position){
			previous.next=newNode;
			end=newNode;
		}
		
		
	}
	
	
	
	/*
	 * below function is used to remove node based on value
	 */
	public void removeByValue(E val)
	{
		Node<E>ptr=start;
		Node<E>previous=start;
		while(ptr!=null&&ptr.nodeValue!=val)
		{
			previous=ptr;
			ptr=ptr.next;
			
		}
		if(ptr!=null)
		{
			previous.next=ptr.next;
			if(ptr==start)
				start=start.next;
			if(ptr==end)
			{
				end=previous;
				if(start==null)
					end=null;
			}
		}
		
		
	}
	/*
	 * below function is use to remove node based on index
	 */
	
	public void removeByIndex(int position )
	{
		
		Node<E>ptr=start;
		Node<E>previous=start;
		for(int i=1;i<position&&ptr!=null;i++)
		{
			previous=ptr;
			ptr=ptr.next;
		}
		if(ptr!=null)
		{
			previous.next=ptr.next;
			if(ptr==start)
				start=start.next;
			if(ptr==end)
			{
				end=previous;
				if(start==null)
					end=null;
			}
		}
	}
	
	/*
	 * below function is use to retrieve value of node at specified position
	 */
	public E get(int position)
	{
		Node<E>ptr=start;
		for(int i=1;i<position&&ptr!=null;i++)
		{
			ptr=ptr.next;
		}
		if(ptr!=null)
			return ptr.nodeValue;
		return null;
		
	}
	
	/*
	 * below function is use to reversing a link list
	 */
	public void reverse()
	{
		Node<E> previous=null;
		Node<E> temp=null;
		Node<E> ptr=start;
		while(ptr!=null)
		{
			temp=ptr.next;
			ptr.next=previous;
			previous=ptr;
			ptr=temp;
		}
		temp=start;
		start=end;
		end=start;
		
		
	}
	
	/*
	 * below function is use to show all element of linked list
	 */
	
	public void show()
	{
		Node<E> ptr=start;
		while(ptr!=null)
		{
			System.out.println(ptr.nodeValue);
			ptr=ptr.next;
		}
		
	}
	
	public static void main(String args[])
	{
		SinglyLinkedList<String> singlyLinkedList=new SinglyLinkedList<String>();
		singlyLinkedList.insertNode("neha");
		singlyLinkedList.insertNode("chetna");
		singlyLinkedList.insertNode("riddhi");
		singlyLinkedList.insertNode("sakshi");
		singlyLinkedList.show();
		System.out.println();
		singlyLinkedList.insertNodeAtLocation(1, "aa");
		singlyLinkedList.removeByValue("hh");;
		
		singlyLinkedList.reverse();
		singlyLinkedList.show();
		
		
		
	}
	
}
