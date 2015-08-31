import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityPrinter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>( 10, Collections.reverseOrder() );// make a priority queue which holds job in descending order according to job priority
		int numberOfJobs; 
		int jobPriority;	// holds particular job priority entered by user
		try
		{
			System.out.println("Enter number of jobs: ");
			do {
				System.out.println("Please Enter Positive integer Number");
				while( !sc.hasNextInt() ) {							// to check value entered by user is integer or not
					System.out.println("Please Enter Integer Number");
					sc.next();
				}
				numberOfJobs = sc.nextInt();
			} while( numberOfJobs <= 0 );		// continue the loop if it is not an positive integer
			System.out.println("Priorities are : ");
			System.out.println("4. Chair Person (Highest Priority)\n3. Professor\n2. Graduates\n1. Under Graduates");// show priorities to user 
			for(int i = 0; i < numberOfJobs; i++)
			{
				System.out.println("Enter Priority of Job "+(i+1));
				do {
					System.out.println("Please Enter Positive integer Number(Less than or equal to 4)"); // take the priority of job from user which he wants to execute
					while( !sc.hasNextInt() ) {				// check whether number is integer or not
						System.out.println("Please Enter Integer Number");
						sc.next();
					}
					jobPriority = sc.nextInt();// take priority in job priority
				} while( jobPriority <= 0 || jobPriority >= 5 );
				priorityQueueObj.add(jobPriority); // add this priority in priority queue
			}
			int size;
			int choice;
			do
			{					// create a menu for user options
				System.out.println("1. Add one more job");
				System.out.println("2. Show the current job to be serviced");
				System.out.println("3. Service the currnet job");
				System.out.println("4. Exit");
				System.out.println("Enter your choice: ");
				do {
					System.out.println("Please Enter Positive integer Number");
					while( !sc.hasNextInt() ) {					// check whether number is positive or not 
						System.out.println("Please Enter Integer Number");
						sc.next();
					}
					choice = sc.nextInt();
					} while(choice <= 0 || choice > 5);		// continue the loop until number should be 1 to 4
				switch(choice)
				{
					case 1:		// same as previous add priority in priority queue
						System.out.println("Priorities are : ");
						System.out.println("4. Chair Person (Highest Priority)\n3. Professor\n2. Graduates\n1. Under Graduates");
						System.out.println("Enter Priority of Job: ");
						do {
							System.out.println("Please Enter Positive integer Number(Less than or equal to 4)");
							while(!sc.hasNextInt()) {
								System.out.println("Please Enter Integer Number");
								sc.next();
							}
							jobPriority = sc.nextInt();
						} while(jobPriority <= 0 || jobPriority >= 5);
						priorityQueueObj.add(jobPriority);
					case 2:
						size = priorityQueueObj.size(); // take a size of priority queue
						if( size == 0 ) {  // is size is zero than print queue is empty
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current job to be serviced is: "+priorityQueueObj.peek());// else print the first element in queue
						break;
					
					case 3:
						size = priorityQueueObj.size();	// take a size of priority queue
						if( size == 0 ) {		// is size is zero than print queue is empty
							System.out.println("Queue is empty");
							break;
						}
						System.out.println("Current Serviced Job is: "+priorityQueueObj.poll()); // else serviced the top priority job and print it
						break;
						
					case 4:
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
			sc.close();
		}
	}
}
