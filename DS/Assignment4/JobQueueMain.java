package ds4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JobQueueMain {

	/**takes input from user
	 * @return
	 */
	private static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
		try {
		number = sc.nextInt();
		return number;
		}
    	catch(InputMismatchException e) {
    		System.out.println("\n\tenter only integer");
    		number = userInput();
    	}
    	return number;
    }
	
	public static void main(String args[]) {
		
		JobQueue jobQueue = new JobQueue(null, 0);
		// isjobqueueinitialize checks that the job queue is initialize or not
		boolean isJobQueueInitialize = false;
		do{
			int choice;
			/* Showing menu */
			System.out.println("Enter your choice: ");
			System.out.println("1. Initialize the job queue of printer");
			System.out.println("2. Add one more job");
			System.out.println("3. Show the current job to be serviced");
			System.out.println("4. Service the currnet job");
			System.out.println("5. Exit");
			choice = userInput();
			switch(choice) {
			
			case 1:
				if(isJobQueueInitialize) {
					System.out.println("\n\tjob queue is already initialize. select option 2 to add more job to job queue");
				}
				else{
					jobQueue.jobInsertion();
					isJobQueueInitialize = true;
				}
				break;
			case 2:
				if(isJobQueueInitialize) {
					System.out.println(isJobQueueInitialize);
					jobQueue.addJob();
				}
				else{
					System.out.println("\n\tfirst initialize the job queue then add job to queue. select 1 option");
				}
				break;
			case 3:
				jobQueue.currentJob();
				break;
			case 4:
				jobQueue.serviceJob();
				break;
			case 5:
				System.exit(0);
				break;
				default:
					System.out.println("enter corret choice");
					break;
			}
		}while(true);
	}
	
}
