/**
 * Class to implement Queue
 * @author Sanjay
 */
import java.util.*;
public class Queue {
	Object queue[];
	int front;
	int rear;
	
	/**
	 * Queue Constructor
	 */
	Queue() {
		queue = new Object[10];
		front = -1;
		rear = 0;
	}
	
	/**
	 * Method to add object to the queue
	 * @param queuInformation
	 */
	void enqueue(Object queuInformation) {
		if(rear==queue.length) { 
			Object[] queueBuffer = new Object[queue.length];
			int i;
			for(i=0; i<queue.length; i++) {
				queueBuffer[i] = queue[i];
			}
			queue = new Object[queue.length+10];
			for(i=0; i<queueBuffer.length; i++) {
				queue[i] = queueBuffer[i];
			}
		}
		queue[rear++] = queuInformation;				
		if( front == -1 ) {
			front = 0;				
		}
	}
	
	
	/**
	 * Method to remove object from the queue
	 * @return
	 */
	Object dequeue() {
		if( front == -1 ) {  
			return null;
		}
		else {
			Object frontInformation = queue[front];		
			int i;
			rear--;				
			if( rear == 0 )	{ 
				front--;
			}
			else { 
				for(i=0; i<rear; i++) {
					queue[i] = queue[i+1];
				}
			}
			return frontInformation;				
		}
	}
	
	/**
	 * Method to empty the queue
	 */
	void makeEmpty() {
		front = -1;
		rear = 0;
		queue = new Object[10];			
	}
	
	/**
	 * Method to retrieve the first element
	 * @return
	 */
	Object getFront() {
		if( front == -1 ) {
			Object t = null;		
			return t;
		}
		else {
			return queue[front];		
		}
	}
	
	/**
	 * Method to display the queue
	 */
	void display() {			
		if( front == -1 ) {
			System.out.print("\n Queue is Empty ");
		}
		else {
			int i;
			System.out.print("\n Queue is: ");
			for(i=0; i<rear; i++ ) {
				System.out.print(queue[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int choise;
		Object queueInformation;
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		try {
			while(true) {				
				System.out.print("\n 1. Enqueue\n 2. Dequeue\n 3. Make Empty\n 4. Get Front Item\n 5. Display Queue\n 6. Exit");
				System.out.print("\n Enter your choise : ");
				choise = sc.nextInt();
				switch(choise) {
				case 1:
					System.out.print("\n Enter Item value : ");
					queueInformation = sc.nextInt();
					queue.enqueue(queueInformation); 
					break;
				case 2:
					queueInformation = queue.dequeue();
					if( queueInformation == null ) {
						System.out.print("\n Queue is Empty ");
					}
					else {
						System.out.print("\n Dequeue Item is : "+queueInformation);
					}
					break;
				case 3:
					queue.makeEmpty(); 
					break;
				case 4:
					queueInformation= queue.getFront();
					if( queueInformation == null ) {
						System.out.print("\n Queue is Empty ");
					}
					else {
						System.out.print("\n Front Item is : "+queueInformation);
					}
					break;
				case 5:
					queue.display(); 
					break;
				case 6:
					System.exit(0);
				}
			}	
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}

}
		
