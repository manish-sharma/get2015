package com.linked.list;

public class Node<T> {
   // data held by the node
   T nodeValue;
   // next node in the list
   Node<T> start;
   Node<T> next;
   // default constructor with no initial value
   public Node() {
  	nodeValue = null;
  	next = null;
   }
 // initialize nodeValue to item and set next to null
   public Node(T item) {
  	nodeValue = item;
  	next = null;
   }
   
   boolean add(T ele)
   {
	  
	   Node<T> newNode1 = new Node<T>(ele);
	   Node<T> current=new Node<T>();
	   if(start== null)
	   {
		   start = newNode1;
		  //System.out.println(start.nodeValue);
		   return true;
	   }
	   else{
		   current = start;
		   while(current.next!= null)
		   {
			   //System.out.println(current.nodeValue);
			 current=current.next;
		   }
		 current.next=newNode1;
	   }
	   return true;
   }
boolean display()
{
	Node<T> current=new Node<T>();
	current = start;
	System.out.println("Singly Linked List:");
	   while(current!= null)
	   {
		   System.out.print(current.nodeValue + "-> ");
		   current=current.next;
	   }
	   System.out.println();
	return true;
}
/*@Override
public String toString() {
	
	return "Node [nodeValue=" + nodeValue + "]";
}*/
boolean addAtPostion(int position,T value)
{
	Node<T> newNode1=new Node<T>(value);
	Node<T> current=new Node<T>();
	
	current = start;
	int count=1;
	if(position==1){
		newNode1.next=current;
		start=newNode1;
	}
	
	else{count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		  newNode1.next=current.next;
		  current.next=newNode1;
		  // break;
		 }
		 count++;
		 current=current.next;
	   }
	 if(count < position)
	 {
		 return false;
	 }
	}
   return true;
	
	
}
boolean deleteByValue(T value)
{
	int flag=0;
	Node<T> current = start;
	if(current == null)
		return false;
	 while(current!= null)
	   {
		 if(current.nodeValue == value){
			 start = current.next;
			 return true;
		 }
		 if(current.next!= null){
		 if(current.next.nodeValue == value)
		 {
			 current.next=current.next.next;
			 flag=1;
			 return true;
		 }
		 }
		 current=current.next;
	   }
		 if((flag==0)&&(current==null))
				 {
			 return false;
				 }
		
		 
	 
	 return false;
	
}
boolean deleteByIndex(int position)
{
	Node<T> current=new Node<T>();
	current = start;
	int count=1;
	if(position==1){
		//newNode1.next=current;
	//	start=newNode1;
		start=current.next;
		//current = start;
	}
	else{
	 count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		 current.next=current.next.next;
		 
		 }
		 count++;
		 current=current.next;
	   }
	 if(count < position)
	 {
		 return false;
	 }
	}
	return true;
	
}
T getitem(int position)
{
	Node<T> current=new Node<T>();
	current = start;
	int count=1;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		 return current.nodeValue;
		 
		 }
		 count++;
		 current=current.next;
	   }
	return null;
}
public void reverseLinkedList() {
	if (start == null || start.next == null)
		return;
	Node<T> Second = start.next;
	// store third node before we change
	Node<T> Third = Second.next;
	// Second's next pointer
	Second.next = start; // second now points to head
	start.next = null; // change head pointer to NULL
	// only two nodes, which we already reversed
	if (Third == null)
		return;
	Node<T> CurrentNode = Third;
	Node<T> PreviousNode = Second;
	while (CurrentNode != null) {
		Node<T> NextNode = CurrentNode.next;
		CurrentNode.next = PreviousNode;
		PreviousNode = CurrentNode;
		CurrentNode = NextNode;
	}
	start = PreviousNode; // reset the head node
	Node<T> current = start;

}

public boolean sortList() {
	if (start == null || start.next == null)
		return true;

	Node<T> newHead = new Node<T>(start.nodeValue);
	Node<T> pointer = start.next;

	// loop through each element in the list
	while (pointer != null) {
		// insert this element to the new list

		Node<T> innerPointer = newHead;
		Node<T> next = pointer.next;

		if ((int) pointer.nodeValue <= (int) newHead.nodeValue) {
			Node<T> oldHead = newHead;
			newHead = pointer;
			newHead.next = oldHead;
		} else {
			while (innerPointer.next != null) {

				if ((int) pointer.nodeValue > (int) innerPointer.nodeValue
						&& (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) {
					Node<T> oldNext = innerPointer.next;
					innerPointer.next = pointer;
					pointer.next = oldNext;
				}

				innerPointer = innerPointer.next;
			}

			if (innerPointer.next == null
					&& (int) pointer.nodeValue > (int) innerPointer.nodeValue) {
				innerPointer.next = pointer;
				pointer.next = null;
			}
		}

		// finally
		pointer = next;
	}
	start = newHead;
	return true;
}
}

