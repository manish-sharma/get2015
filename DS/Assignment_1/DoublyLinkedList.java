
/*
 * this program is for implementing Doubly linked list
 */

class Node<T>{
	//data held by the node
	public T nodeValue;
	//previous node in the list
	public Node<T> previous;
	//next node in the list
	public Node<T> next;
	
	
	
	//default constructor with no initial value
	public Node() {
		super();
		this.nodeValue = null;
		this.previous = null;
		this.next = null;
	}

	
	//initialize node value to the item and set next to null
	public Node(T item) {
		super();
		this.nodeValue = item;
		this.previous = null;
		this.next = null;
		
	}
	
}

/*
 * class DoublyLinkedList
 */

public class DoublyLinkedList<E> {
	Node <E>start;
	Node <E>end;
	
	//default constructor
		public DoublyLinkedList() {
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
				newNode.previous=end;
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
			
			int i=0;
			for(i=1;i<position&&ptr!=null;i++)
			{
				ptr=ptr.next;
			}
			if(ptr!=null)
			{
				
				if(ptr==start)
				{
					start=newNode;
				}
				else
				{
					newNode.previous=ptr.previous;
					ptr.previous.next=newNode;
				}
				newNode.next=ptr;
				ptr.previous=newNode;
				
			}
			else if(ptr==null&&position==1)
			{
				start=end=newNode;
			}
			else if(ptr==null&&i==position){
				end.next=newNode;
				newNode.previous=end;
				end=newNode;
			}
			
		}
		
		/*
		 * below function is used to remove node based on value
		 */
		public void removeByValue(E val)
		{
			Node<E>ptr=start;
			
			while(ptr!=null&&ptr.nodeValue!=val)
			{
				ptr=ptr.next;
			}
			if(ptr!=null)
			{
				
				if(ptr==start)
				{
					
					start=start.next;
					if(start!=null)
						start.previous=null;
				}
				else if(ptr==end)
				{
						end=end.previous;
						if(end!=null)
							end.next=null;
				}
				else
				{
					ptr.next.previous=ptr.previous;
					ptr.previous.next=ptr.next;
					
				}
			}
			
			
		}
		
		/*
		 * below function is use to remove node based on index
		 */
		
		public void removeByIndex(int position )
		{
			
			Node<E>ptr=start;
			int i=1;
			for(i=1;i<position&&ptr!=null;i++)
			{
				ptr=ptr.next;
			}
			if(ptr!=null)
			{
				
				if(ptr==start&&position==1)
				{
					
					start=start.next;
					if(start!=null)
						start.previous=null;
				}
				else if(ptr==end)
				{
						end=end.previous;
						if(end!=null)
							end.next=null;
				}
				else if(position==i)
				{
					ptr.next.previous=ptr.previous;
					ptr.previous.next=ptr.next;
					
				}
			}
		}
		
		
		/*
		 * below function is use to reversing a link list
		 */
		public void reverse()
		{
			
			Node<E> temp=start;
			Node<E> ptr=null;
			while(temp!=null)
			{
				
				ptr=temp.previous;
				temp.previous=temp.next;
				temp.next=ptr;
				temp=temp.previous;
				
				
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
		
		public static void main(String args[])
		{
			DoublyLinkedList<String> doublyLinkedList=new DoublyLinkedList<String>();
			doublyLinkedList.insertNode("neha");
			doublyLinkedList.insertNode("nidhi");
			doublyLinkedList.insertNode("chetna");
			doublyLinkedList.insertNode("sakshi");
			doublyLinkedList.show();
			doublyLinkedList.reverse();
			doublyLinkedList.removeByValue("neha");
			
			doublyLinkedList.show();
		}
		
}
