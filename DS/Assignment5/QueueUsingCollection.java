/**
 * @author Girdhari
 * Program to implement queue using best option from collection class in java
 */

package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* Starting of Main class */
public class QueueUsingCollection {

	/* Starting of main function */
	public static void main(String[] args) {
		BufferedReader bufferedReaderObject = new BufferedReader( new InputStreamReader(System.in));
		LinkedList<Integer> linkedListObject = new LinkedList<Integer>();
		String continueChoice = "";
		int choice ;
		do{
			try {
				//Menu
				System.out.println("Enter Your Choice: \n"
						+ "1. Add Element\n"
						+ "2. Remove Element\n"
						+ "3. Print Queue\n"
						+ "4. Clear Queue\n"
						+ "5. Exit");
				choice = Integer.parseInt(bufferedReaderObject.readLine());
				switch(choice) {	//switch the choice
				case 1:		//enter a element in queue
					System.out.println("Enter a element: ");
					int element = Integer.parseInt(bufferedReaderObject.readLine());
					linkedListObject.add(0, element);;
					break;
				case 2:		// delete the element of queue
					System.out.println("Element Deleted is: "+ linkedListObject.pollLast());
					break;
				case 3:		// prints the queue
					System.out.println("Queue is:");
					if(linkedListObject.size() == 0)
						System.out.print("No Element in Queue");
					for(int value : linkedListObject) {
						System.out.print(value+ " -> ");
					}
					System.out.println();
					break;
				case 4:		//clears the queue
					linkedListObject.clear();
					System.out.println("Queue is empty now");
					break;
				case 5:
				default:
					System.exit(0);
				}
				System.out.println("Do you want to perform more operation? (Y/N)");
				continueChoice = bufferedReaderObject.readLine();
			} catch(NumberFormatException exception) {
				System.out.println("You had entered a wrong type of number!!");
			}
			catch(IOException exception) {
				System.out.println("Some Input/Output related error occured!!");
			}
		} while(continueChoice.equalsIgnoreCase("y"));
	}
	/* Ending of main function */
}
/* Ending of Main class */
