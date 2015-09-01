/**
 * @author Girdhari
 * Program to implement Job Scheduling algorithm using heap
 */
package heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Starting of JobScheduling Class */
public class JobScheduling {

	/* Starting of main function */
	public static void main(String[] args) {
		JobScheduling jobSchedulingObject = new JobScheduling();
		jobSchedulingObject.takeJob();
		jobSchedulingObject.performJob();
	}
	/* Ending of main function */
	
	/* Starting of takeJob function */
	public void takeJob() {
		BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
		Job jobObject ;
		String choice = "" ;
		Heap heapObject = new Heap();
		try {
			do {
				jobObject = new Job();
				System.out.print("Select Your Department\n"
						+ "1. Undergraduate Student\n"
						+ "2. Graduate Student\n"
						+ "3. Professor\n"
						+ "4. Chairperson\n");
				int priority = Integer.parseInt(bufferedReaderObject.readLine());
				jobObject.setJobPriority(priority);		//set job priority
				
				System.out.print("Enter Data to Print: ");
				String jobData = bufferedReaderObject.readLine();
				
				jobObject.setJobData(jobData);		//sets job data
				heapObject.addElement(jobObject);	//add element to heap
				System.out.println("Do you want to add more element(Y/N)? ");
				choice = bufferedReaderObject.readLine();
			} while(choice.equalsIgnoreCase("y"));
			performJob();
		}
		catch(IOException exception) {
			System.out.println("An input Output Related Error Occured!!");
		}
	}
	/* Ending of takeJob function */
	
	/* Starting of performJob function */
	private void performJob() {
		if(Heap.getHeap().size() == 0)
			return ;
		int size = Heap.getHeap().size();
		int counter = 0;
		while(counter < size) {
			Job jobObject = Heap.getHeap().get(0);	//removes the root node
			
			Heap.getHeap().remove(0);
			System.out.println("Printing...\n "+jobObject.getJobData()+" with priority "+jobObject.getJobPriority());	//print job
			counter++;
		}
	
	}
	/* Ending of performJob function */
}

/* Ending of JobScheduling Class */
