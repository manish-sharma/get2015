import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		
		/*Initialization*/ 
		Scanner scan = null;
		BufferedReader bufferedReaderObj = null;
		int choice = 0, repeatChoice = 0, numberOfStudents;
		boolean result;
		String tempName;
		Queue queueObj = new Queue();
		try
		{
			scan = new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			do
			{
				/* Printing Menu */
				System.out.println("Menu: ");
				System.out.println("Press 1 to Insert a name in queue");
				System.out.println("Press 2 to remove front element from the queue");
				System.out.println("Press 3 make the queue empty");
				System.out.println("Press 4 to get front Element of queue");
				System.out.println("Press 5 to display queue");
				System.out.println("Press 6 for Student Councelling");
				System.out.println("Press 7 to exit");
				
				/* Taking user's choice as input with validation */
				choice = Validation.isInteger();

				switch(choice)
				{
					/* Case for adding an element to the list */
					case 1:
						System.out.println("Enter Name to insert in the queue: ");
						while(true) {
							System.out.println("name : ");
							tempName = bufferedReaderObj.readLine();
							if(Validation.isName(tempName))
								break;
							else
								System.out.println("Please Enter a valid Name");
						}
						result = queueObj.enqueue(tempName);
						if(result)
							System.out.println("Name added Successfully");
						else
							System.out.println("Name is not added Successsfully");
						break;
						
						/* Case for adding an element to the list at specified index */
					case 2:
						Object removedItem;
						removedItem = queueObj.dequeue();
						if(removedItem == null) {
							System.out.println("There is nothing in the queue currently");
							break;
						}
						System.out.println("Removed Item is: "+removedItem);
						break;
						
						/* case for find first occurrence of an element after specified index */
					case 3:
						result = queueObj.makeEmpty();
						if(result == false) 
							System.out.println("Queue is already Empty");
						else
							System.out.println("Queue is cleared Successfully");
						break;
						
						/* case to find front element of the queue */
					case 4:
						Object frontItem;
						frontItem =	queueObj.getFront();
						if(frontItem == null) {
							System.out.println("There is nothing in the queue currently");
							break;
						}
						System.out.println("Front of Queue is: "+frontItem);
						break;
						
						/* case to display the queue */
					case 5:
						queueObj.show();
						System.out.println();
						break;
					
					case 6:
						System.out.print("Enter number of students eligible for counseling : ");
						
						/* Inputting number of students from user */
						do {
							System.out.println("(Enter number greater than zero)");
							numberOfStudents = Validation.isInteger();
							} while (numberOfStudents <= 0);	
						CollegeCounselling counseling = new CollegeCounselling();
						counseling.counselling(numberOfStudents);
						break;
						/* Exit Case */
					case 7:
						System.out.println("System Exits");
						System.exit(0);
						
						/*default case */
					default:
						System.out.println("Enter correct Choice");

				} 
				System.out.println("Do you want to continue press 1 for YES and any other number for NO");
					System.out.println("Enter Positive Number");
					repeatChoice = Validation.isInteger();
					
			} while(repeatChoice == 1);
			scan.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(repeatChoice != 1)
		{
			System.out.println("System Exited");
			System.exit(0);
		}
	}
}



