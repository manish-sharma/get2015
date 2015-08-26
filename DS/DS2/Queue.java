
import java.util.*;
public class Queue {
	Object queue[];// make a object type of array to hold all type of values
	int front;// front variable keep starting index of queue
	int rear;// real variable keep last index of queue
	Queue() {
		queue = new Object[10];
		front = -1;
		rear = 0;
	}
	void enqueue(Object queuInformation) {
		if(rear==queue.length) { // if rear is reached at queue length than resize the queue
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
		queue[rear++] = queuInformation;				// put item at rear index and increase rear by one
		if( front == -1 ) {
			front = 0;				// if front = -1 than make it is 0
		}
	}
	Object dequeue() {
		if( front == -1 ) {  // check whether queue is empty
			return null;
		}
		else {
			Object frontInformation = queue[front];		// make a remove object to hold the dequeue item
			int i;
			rear--;				// reduce rear by one
			if( rear == 0 )	{ // if after remove item queue is empty than set front = -1
				front--;
			}
			else { // otherwise shift element one by one
				for(i=0; i<rear; i++) {
					queue[i] = queue[i+1];
				}
			}
			return frontInformation;				// return the remove item
		}
	}
	void makeEmpty() {
		front = -1;
		rear = 0;
		queue = new Object[10];			// reassign queue
	}
	Object getFront() {
		if( front == -1 ) {
			Object t = null;		// check whether queue is empty
			return t;
		}
		else {
			return queue[front];		// return the item at front index
		}
	}
	void display() {			// display the queue items 
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
			while(true) {				// make a menu for select particular operations
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
		
