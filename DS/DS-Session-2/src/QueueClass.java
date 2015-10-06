/**class for performing queue operations
 * 
 * @author Gaurav Saini
 * Date : 27/08/2015
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueueClass {
	static Scanner scan = new Scanner(System.in);
	String[] queue = new String[10];
	int front = -1;
	int rear = -1;
	int max = 10;

	//main method
	public static void main(String []args) {
		String value;
		int choice = 0;
		QueueClass queueObject = new QueueClass();				//create new queue
		do {
			choice = queueObject.displayMenu();
			switch (choice) {
			
			case 1:				//insert values in queue
				int flag1;							//flag1 is for user to add more values in the queue
				do {
					System.out.println("Enter value:");
					value = scan.next();
					queueObject.enQueue(value);
					System.out.println("1. continue entering values\n2. stop");
					flag1 = scan.nextInt();
				} while(flag1 == 1);
				break;
				
			case 2:				//delete value from queue
				queueObject.deQueue();
				break;
				
			case 3:				//clear all values from queue
				queueObject.clearQueue();
				break;
				
			case 4:				//get rear element from queue
				queueObject.getRear();
				break;
				
			case 5:				//show the queue
				queueObject.display();
				break;
				
			case 0:				//exit
				System.exit(0);
		
			default:
				System.out.println("Enter valid option");
				break;
			}
		} while(true);
	}

	//method to get rear value from queue
	private void getRear() {
		System.out.println("Rear value is- " + queue[rear]);
	}

	//method to clear the queue
	public void clearQueue() {
		front = -1;
		rear = -1;
	}
	
	//method to delete item from queue
	public void deQueue() {
		if(front == -1)
			System.out.println("Queue is Empty");
		else {
			for(int i = front; i < rear; i++)
				queue[i] = queue[i + 1];
			rear = rear - 1;
		}
	}

	//method to show the queue operations menu
	public int displayMenu() {
		int choice = 0;
		System.out.println("1. add value in Queue\n2. delete value from Queue\n"+
				"3. clear allvalues from Queue \n4. get rear value\n5. show \n0. Exit");
		try {
			choice = scan.nextInt();
		}
		catch(InputMismatchException p) {
			System.out.println("enter integer value\n**Exit**");
		}
		return choice;
	}

	//method to show the queue
	public void display() {
		if(front == -1)
			System.out.println("Queue is Empty");
		else
			for(int i =front; i<=rear;i++)
				System.out.println(queue[i]);
	}
	
	//method to add values to queue
	public void enQueue(String string){
		if((rear == max - 1) && (front == 0))						// when space not available
			System.out.println("Queue Overflow");
		else {
			if(front == -1) {										// when queue is empty
				front = 0;
				rear = rear + 1;
				queue[rear] = string;
			}
			else if ((rear == max - 1) && (front != 0)) {			// temporary Queue is full
				rear = 0;
				queue[rear] = string;
			}
			else {
				rear++;
				queue[rear] = string;
			}
		}
	}
}