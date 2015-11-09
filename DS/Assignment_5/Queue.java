package assignmentDS_5;
/**
 * This program is to implement the Queue functionality using the java collections.
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-2
 * 
**/

import java.util.LinkedList;
import java.util.Scanner;

public class Queue 
{
	LinkedList<Object> queue = new LinkedList<Object>();

	
	/**
	 * below method is use to insert element at rear position
	 * @param element : element that is to be inserted in queue
	 */
	public void enqueue(Object element) {
		queue.addLast(element);
		
	}

	// Remove element from front 
	/**
	 * below method is use to remove element from queue at front position
	 * @return the element at front position of queue
	 */
	public Object dequeue() {
		if (queue.size() > 0) {
			Object element = queue.removeFirst();
			return element;
		} else {
			// throw underflow exception
			throw new ArrayIndexOutOfBoundsException(
					"Queue is empty");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue queue = new Queue();
		String choice;
		String element;

		String ans="yes";
		
		do
		{
			System.out.println("\n1. Insert Element(enqueue)"
					+ "\n2. Delete Element(dequeue)");
			choice = scanner.next();

			switch (choice) {
			case "1":
				// Inserting element in queue
				System.out.println("Enter element ");
				element = scanner.next();
				queue.enqueue(element);
				break;

			case "2":
				// Deleting element from queue
					System.out.println("deleted element : " + queue.dequeue());
				break;

			default:
				System.out.println("Please enter vaild input ");
			}
			System.out.println("\n\nDo you want to continue(press yes for continue)");
	    	ans=scanner.next();
		}while(ans.equalsIgnoreCase("Yes"));
		scanner.close();
	}


}
