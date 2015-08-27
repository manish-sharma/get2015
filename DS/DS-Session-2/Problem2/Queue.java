import java.util.*;

/**
 * Implementation of Queue using array
 * @author Banwari Kevat
 *
 */
public class Queue {

	//object array to hold all type of values
	Object q[];	
	// front variable for starting index
	int front;
	// real variable for starting index
	int rear;		
	Queue() {
		q = new Object[10];
		front = -1;
		rear = 0;
	}
	/*
	 * This method insert item into queue
	 * @param item is the item which will be inserted to the rear of queue
	 */
	void enqueue( Object item ) {  
		// if queue length is maximum then resize queue 
		if(rear == q.length) {
			Object[] buffer = new Object[ q.length ];
			int i;
			for(i=0; i<q.length; i++) {
				buffer[i] = q[i];
			}
			q = new Object[q.length+10];
			for(i=0; i<buffer.length; i++) {
				  q[i] = buffer[i];
			}
		}
		// add item at rear index and increase rear
		q[rear++] = item;				
		if( front == -1 ) {
			front = 0;				// if front = -1 than make it is 0
		}
	}
	
	
	//This method remove element from from of queue
	Object dequeue()
	{
		 // is queue empty
		if( front == -1 ){
			return null;
		}
		else
		{   
			Object removedItem = q[front];		
			int i;
			// decrease rear
			rear--;	
			// removed item queue is empty than front = -1
			if( rear == 0 )		
			{
				front--;
			}
			//shift
			else				
			{
				for(i=0; i<rear; i++)
				{
					q[i] = q[i+1];
				}
			}
			return removedItem;
		}
	}
	
	
	 // This method make queue empty
	void makeEmpty()
	{
		front = -1;
		rear = 0;
		q = new Object[10];		
	}
	
	//This method returns the front of the queue
	Object getFront() {
		//Queue is empty or not
		if( front == -1 ) {
			Object t = null;		
			return t;
		}
		else {
			return q[front];
		}
	}
	//this method returns true if queue is empty else false
	public boolean isEmpty() 
	{
		return (front==-1);
	}
	
	//this method display the queue
	void display()			
	{
		if( front == -1 ) {
			System.out.print("\nQueue is empty");
		}
		else {
			System.out.print("\nQueue is: ");
			for(int i=0; i<rear; i++ ) {
				System.out.print(q[i]+" ");
			}
			System.out.print("\n");
		}
	}
	
	//Main method
	public static void main(String[] args) throws Exception {
		Queue queue = new Queue();
		
		queue.display();
		System.out.println();
		
		queue.enqueue(45);
		queue.enqueue(95);
		queue.enqueue(22);
		queue.enqueue(30);
		queue.enqueue(75);
		queue.enqueue(32);
		
		queue.display();
		
		queue.dequeue();
		queue.display();
		
		int front= (int) queue.getFront();
		
		System.out.println("\nFront element is: "+front);		
	}

}
