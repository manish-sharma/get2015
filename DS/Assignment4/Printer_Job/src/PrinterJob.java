import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class PrinterJob{

	public static void main(String[] args) {
		
		/* Initialization */
		Scanner scan = null;
		PriorityQueue<Integer> priorityQueueObj = null;
		int numberOfJobs, jobPriority, choice;
		try
		{
			/* Priority Queue initialization */
			priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
			scan =  new Scanner(System.in);
			
			/* Inputting number of jobs */
			System.out.println("Enter number of jobs: ");
			do {
				System.out.println("Please Enter Positive integer Number");
				numberOfJobs = Validation.isInteger();
			} while(numberOfJobs <= 0);
			
			/* Showing priorities */
			System.out.println("Priorities are : ");
			System.out.println("4. Chair Person (Highest Priority)\n3. Professor\n2. Graduates\n1. Under Graduates (Lowest Priority)");
			
			/* Inputting priorities of jobs */
			for(int i = 0; i < numberOfJobs; i++)
			{
				System.out.println("Enter Priority of Job "+(i+1));
				do {
					System.out.println("Please Enter Positive integer Number(Less than or equal to 4)");
					jobPriority = Validation.isInteger();
				} while(jobPriority <= 0 || jobPriority >= 5);
				
				/* Adding job to the priority queue */
				priorityQueueObj.add(jobPriority);
			}

			do
			{
				/* Showing menu */
				System.out.println("Enter your choice: ");
				System.out.println("1. Add one more job");
				System.out.println("2. Show the current job to be serviced");
				System.out.println("3. Service the current job");
				System.out.println("4. Exit");
				
				/* INputting choice */
				choice = Validation.isInteger();
				switch(choice)
				{
					/* When choice is 1, then a new job will be added to the queue */	
					case 1:
						System.out.println("Priorities are : ");
						System.out.println("4. Chair Person (Highest Priority)\n3. Professor\n2. Graduates\n1. Under Graduates");
						System.out.println("Enter Priority of Job: ");
						do {
							System.out.println("Please Enter Positive integer Number(Less than or equal to 4)");
						while(!scan.hasNextInt()) {
							System.out.println("Please Enter Integer Number");
							scan.next();
						}
						jobPriority = scan.nextInt();
						} while(jobPriority <= 0 || jobPriority >= 5);
						priorityQueueObj.add(jobPriority);
						break;
						
					/* If choice is 2, then current job will be displayed */
					case 2:
						
						if(priorityQueueObj.size() == 0) {
							
							/* If size is zero, then queue is empty */
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current job to be serviced is: "+priorityQueueObj.peek());
						break;
						
						/* If choice in 3, then current job will be serviced
						 * and removed from the priority queue 
						 */
					case 3:
	
						if(priorityQueueObj.size() == 0) {
							/* This code will be executed if queue is empty */
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current Serviced Job is: "+priorityQueueObj.poll());
						break;
						
						/* Exit Case */
					case 4:
						System.out.println("System Closed");
						System.exit(0);
						break;
						
						/* default Case */
					default:
						System.out.println("Enter Correct Choice");
				}
			} while(true);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}
