package com.doubly.linked.list;



public class Node<T> {
   // data held by the node
   T nodeValue;
   // next node in the list
   Node<T> start;
   Node<T> next;
   Node<T> pre;
   // default constructor with no initial value
   public Node() {
  	nodeValue = null;
  	next = null;
  	pre=null;
   }
 // initialize nodeValue to item and set next to null
   public Node(T item) {
  	nodeValue = item;
  	next = null;
  	pre=null;
   }
   
   boolean add(T ele)
   {
	  
	   Node<T> newNode1 = new Node<T>(ele);
	   Node<T> current=new Node<T>();
	   if(start== null)
	   {
		   start = newNode1;
		   newNode1.pre=start;
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
		 newNode1.pre=current;
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
		   System.out.print(current.nodeValue + "<-> ");
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
		newNode1.pre=start;
		start=newNode1;
	}
	
	else{count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		  newNode1.next=current.next;
		  newNode1.pre=current;
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
			// current.next.pre=current;
			 			 return true;
		 }
		 if(current.next!= null){
		 if(current.next.nodeValue == value)
		 {
			 if(current.next.next!=null){
				 current.next.next.pre=current;}
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
		current.next.pre=start;
		//current = start;
	}
	else{
	 count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		 current.next=current.next.next;
		 current.next.next.pre=current;
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
	Second.pre=start;
	// store third node before we change
	Node<T> Third = Second.next;
	Third.pre=Second;
	// Second's next pointer
	Second.next = start; // second now points to head
	
	start.next = null; // change head pointer to NULL
	// only two nodes, which we already reversed
	if (Third == null)
		return;
	Node<T> CurrentNode = Third;
	Node<T> PreviousNode = Second;
	while (CurrentNode != null) {
		Node<T> NextNode = new Node<T>();
		NextNode=CurrentNode.next;
       // NextNode.pre=CurrentNode;
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
	pointer.pre=start;

	// loop through each element in the list
	while (pointer != null) {
		// insert this element to the new list

		Node<T> innerPointer = newHead;
		Node<T> next = pointer.next;
       // next.pre=pointer;
		if ((int) pointer.nodeValue <= (int) newHead.nodeValue) {
			Node<T> oldHead = newHead;
			newHead = pointer;
			newHead.next = oldHead;
			oldHead.pre=newHead;
		} else {
			while (innerPointer.next != null) {

				if ((int) pointer.nodeValue > (int) innerPointer.nodeValue
						&& (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) {
					Node<T> oldNext = innerPointer.next;
					
					innerPointer.next = pointer;
					pointer.pre=innerPointer;
					pointer.next = oldNext;
					oldNext.pre=pointer;
				}

				innerPointer = innerPointer.next;
			}

			if (innerPointer.next == null
					&& (int) pointer.nodeValue > (int) innerPointer.nodeValue) {
				innerPointer.next = pointer;
				pointer.pre=innerPointer;
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

