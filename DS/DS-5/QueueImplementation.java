/**
 * Class to implement the queue functionality using Linked List
 * @author Sanjay
 */
import java.util.LinkedList;
import java.util.Scanner;


public class QueueImplementation {
	LinkedList<Integer> queue = new LinkedList<Integer>();
	int size = 0;
	
	/**
	 * Method to insert element at the end of the queue
	 * @param element
	 */
	private void insertElement(int element){
		queue.addLast(element);
		size++;
	}
	
	
	/**
	 * Method to delete element from the front of the queue
	 */
	private void deleteElement(){
		queue.removeFirst();
		size--;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		QueueImplementation object = new QueueImplementation();
		while(true){
			System.out.println("Enter 1 to add element to the queue");
			System.out.println("Enter 2 to delete element from the queue");
			int userInput = scan.nextInt();
			switch(userInput){
			case 1:
				System.out.println("Enter the element to be added");
				int element = scan.nextInt();
				object.insertElement(element);
				System.out.println("The element is added to the queue "+ object.queue.getLast());
				break;
			case 2:
				System.out.println("Element deleted is "+object.queue.getFirst() );
				object.deleteElement();
				break;
			}
		}
	}
}
