/**class to implement queue functionality using java collections
 * 
 * @author Gaurav Saini
 * Date : 31/08/2015
 */

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImplementation {
	
	static Scanner scan = new Scanner(System.in);
	static Queue<String> myQueue = new LinkedList<String>();
    
	//main method
	public static void main(String []args) {
		int choice;
		QueueImplementation queueObject = new QueueImplementation();
		do {
			choice =  queueObject.displayMenu();
			
			switch (choice) {
		    	
			case 1:									// to insert elements in queue
					System.out.println("how many elements you want to insert?");
					int count = scan.nextInt();
					for (int i = 0; i < count; i++)
						myQueue.add(scan.next());
					break;
		    	
			case 2:									//to remove element from queue
					if(!myQueue.isEmpty())
						myQueue.remove();			//if queue is not empty then remove front element
					else 
						System.out.println("Queue is Empty");		//if queue is empty then print message
					break;

			case 3:									// to remove all elements from queue
					if(!myQueue.isEmpty())
						myQueue.removeAll(myQueue);			//if queue is not empty then remove all elements
					else 
						System.out.println("Queue is Empty");		//if queue is empty then print message
					break; 
		    	
			case 4:									//to get rear element from queue
					if(!myQueue.isEmpty())
						System.out.println(myQueue.element());
					else 
						System.out.println("Queue is Empty");
					break;
		    	
			case 5:									//to display the queue
					if(!myQueue.isEmpty())
						System.out.println(myQueue);
					else 
						System.out.println("Queue is Empty");
					break;
		    	
			case 0:									//exit case
					System.exit(0);
					break;
				
			default:								//default case
					System.out.println("Enter valid option");
					break;

			}
		} while(choice != 0);
	}
	   
	//method to show menu
	public int displayMenu() {
		int choice = 0;
		System.out.println("choose your option\n1. add item in queue\n2. delete front element from queue\n"+
				"3. delete all elements\n4. get rear item\n5. show the queue\n0. exit");
		
		try {
			choice = scan.nextInt();
		}
		catch(InputMismatchException p) {
			System.out.println("enter valid input.");
		}
		return choice;
	}
}