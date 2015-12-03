import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Amit
 *
 */
public class Queue_Implementation {

	public static void main(String args[]) {
		
		/* Initialization */
		Scanner scan = null;
		LinkedList<Integer> queueList = null;
		try
		{
			scan  = new Scanner(System.in);
			int choice, number, result;
			queueList = new LinkedList<Integer>();
			do
			{
				/* Displaying Menu */
				System.out.println("Enter your choice: ");
				System.out.println("1. Add an element to queue");
				System.out.println("2. Remove an element from queue");
				System.out.println("3. Get front element of queue");
				System.out.println("4. Display the queue");
				System.out.println("5. clear the queue");
				System.out.println("6. Exit");
				
				/* Inputting user's choice */
				choice = Validation.isInteger();
				
				switch(choice) {
				
					/* If choice is 1, then user will be asked to enter an integer
					 * and that integer will be added to the queue
					 */
					case 1:
						System.out.println("Enter a numebr: ");
						number = Validation.isInteger();
						queueList.addLast(number);
						break;
						
					/* If choice is 2, then Front element of queue will be removed */
					case 2:
						if(!queueList.isEmpty()) {
							result = queueList.poll();
							System.out.println("Removed Element is: "+result);
						}
						else
							System.out.println("Queue is Empty");
						break;
						
					/* If choice is 3, then front element will be retrieved but not removed */
					case 3:
						if(!queueList.isEmpty()) {
							result = queueList.peek();
							System.out.println("Front Element is: "+result);
						}
						else
							System.out.println("Queue is Empty");
						break;
					
					/* If choice is 4, then queue will be displayed */
					case 4:
						if(!queueList.isEmpty()) {
							Iterator<Integer> listIterator = queueList.listIterator();
							System.out.print("Queue is: ");
							while(listIterator.hasNext()) {
								System.out.print(listIterator.next()+" ");
							}
							System.out.println();
						}
						else
							System.out.println("Queue is Empty");
						break;
					
					/* If choice is 5, then queue will be cleared */
					case 5:
						if(queueList.size() == 0) {
							System.out.println("Queue is already Empty");
							break;
						}
						queueList.clear();
						System.out.println("Queue is cleared");
						break;
						
					/* If choice is 6, then system will be exit */
					case 6:
						System.out.println("System Exit");
						System.exit(0);
						break;
					
					/* Default Case, if none of the case value matches */
					default:
						System.out.println("Enter correct choice");
				}
			} while(true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}
