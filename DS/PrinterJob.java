import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * class to print the jobs according to the priority
 * @author Ankur
 *
 */
public class PrinterJob{

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Initialization */
		Scanner scan = null;
		PriorityQueue<Integer> priorityQueueObj = null;
		int numberOfJobs, jobPriority, size, choice;
		try
		{
	
			priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder()); //Priority Queue initialization
			scan =  new Scanner(System.in);
			
			System.out.println("Enter number of jobs: "); // Inputting number of jobs
			do {
				System.out.println("Please Enter Positive integer Number");
			while(!scan.hasNextInt()) {
				System.out.println("Please Enter Integer Number");
				scan.next();
			}
			numberOfJobs = scan.nextInt();
			} while(numberOfJobs <= 0);
			System.out.println("Priorities are : "); // Showing priorities
			System.out.println("4. Chair Person (Highest Priority)\n3. Professor\n2. Graduates\n1. Under Graduates (Lowest Priority)");
			
			/* Inputting priorities of jobs */
			for(int i = 0; i < numberOfJobs; i++)
			{
				System.out.println("Enter Priority of Job "+(i+1));
				do {
					System.out.println("Please Enter Positive integer Number(Less than or equal to 4)");
				while(!scan.hasNextInt()) {
					System.out.println("Please Enter Integer Number");
					scan.next();
				}
				jobPriority = scan.nextInt();
				} while(jobPriority <= 0 || jobPriority >= 5);
				priorityQueueObj.add(jobPriority); //Adding job to the priority queue
			}

			do
			{
				/* Showing menu */
				System.out.println("Enter your choice: ");
				System.out.println("1. Add one more job");
				System.out.println("2. Show the current job to be serviced");
				System.out.println("3. Service the current job");
				System.out.println("4. Exit");
				do {
					System.out.println("Please Enter Positive integer Number");
					while(!scan.hasNextInt()) {
						System.out.println("Please Enter Integer Number");
						scan.next();
					}
					choice = scan.nextInt();
					} while(choice <= 0 || choice >= 5);
				switch(choice)
				{	
					case 1: //a new job will be added to the queue
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
					
					case 2: //current job will be displayed
						size = priorityQueueObj.size();
						if(size == 0) {
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current job to be serviced is: "+priorityQueueObj.peek());
						break;
						
					case 3: // current job will be serviced and removed from the priority queue
						size = priorityQueueObj.size();
						if(size == 0) {
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current Serviced Job is: "+priorityQueueObj.poll());
						break;
					case 4: //Exit Case
						System.out.println("System Exited");
						System.exit(0);
						break;
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
