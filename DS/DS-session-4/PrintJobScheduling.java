/**class for scheduling printer jobs based on priority
 * 
 * @author Gaurav Saini
 * Date : 31/08/2015
 */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrintJobScheduling {

	//main method
	public static void main(String[] args) {
		Scanner scan = null;
		PriorityQueue<Integer> priorityQueue1 = null;
		int numberOfJobs;						//number of jobs to be processed
		int jobPriority;						//priority of each job
		int size;								//number of jobs present in the queue
		int choice;
		
		try {
			priorityQueue1 = new PriorityQueue<Integer>(10, Collections.reverseOrder());			//new priority queue
			scan =  new Scanner(System.in);
			
			System.out.println("Enter number of jobs: ");
			do {
				System.out.println("Please Enter Positive integer Number");						//accepting valid number of jobs from user
				while(!scan.hasNextInt()) {
					System.out.println("Please Enter Integer Number");
					scan.next();
				}
				numberOfJobs = scan.nextInt();
			} while(numberOfJobs <= 0);
			
			System.out.println("Priorities are : (4 is max, 1 is min)");						//showing priority of jobs
			System.out.println("4. Chair Person\n3. Professor\n2. Graduates\n1. Under Graduates");
			
			for(int i = 0; i < numberOfJobs; i++) {
				System.out.println("Enter Priority of Job " + (i + 1));							//accepting priority of each job
				do {
					while(!scan.hasNextInt()) {
						System.out.println("Enter valid input");
						scan.next();
					}
					jobPriority = scan.nextInt();
				} while(jobPriority <= 0 || jobPriority >= 5);
				priorityQueue1.add(jobPriority);
			}

			do {
				System.out.println("Enter your choice: ");				//showing the menu
				System.out.println("1. Add more jobs in the queue");
				System.out.println("2. Process the next job in the queue");
				System.out.println("3. Exit");
				
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
					case 1:											//adding new job to the queue
						System.out.println("Priorities are : (4 is max, 1 is min)");
						System.out.println("4. Chair Person\n3. Professor\n2. Graduates\n1. Under Graduates");
						System.out.println("Enter Priority of Job: ");
						do {
							System.out.println("Enter valid value for priority");
							while(!scan.hasNextInt()) {
								System.out.println("Enter valid input");
								scan.next();
							}
							jobPriority = scan.nextInt();
						} while(jobPriority <= 0 || jobPriority >= 5);
						priorityQueue1.add(jobPriority);
						break;
						
					case 2:											//processing the next job in the queue
						size = priorityQueue1.size();
						if(size == 0) {
							System.out.println("Queue is empty");				//if queue is empty
							break;
						}
						System.out.println("Job serviced is: " + priorityQueue1.poll());		//process the next job in the queue and remove from priority queue
						break;
						
					case 3:											//exit case
						System.exit(0);
						break;
						
					default:										//default case
						System.out.println("Enter valid Choice");
				}
			} while(true);
		}
		catch(Exception e) {
			System.out.println("exception caught.");
			scan.close();
		}
	}
}
