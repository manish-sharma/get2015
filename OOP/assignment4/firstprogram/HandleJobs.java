package firstprogram;
import java.util.Scanner;
/**
 * Class that handles all printing operations
 * @author Riddhi
 *
 */
public class HandleJobs {

	PrintQueue pr;

	// function to detect if their is no jobs in the array
	public boolean isEmpty() {
		return pr.getHeapSize() == 0;
	}

	// method to insert job according to their priority
	public void insert(Jobs newJob) {

		pr.arr[pr.getHeapSize()] = newJob; // assigning new job in the array of
											// job
		int position = pr.getHeapSize(); // position of the current element
		pr.setHeapSize(pr.getHeapSize() + 1); // updating size of array

		while (position != 0
				&& newJob.getPriority() > pr.arr[position / 2].getPriority()) {
			pr.arr[position] = pr.arr[position / 2]; // if position of the value to be inserted is greater than its parent than value is swapped with the parent value
			position = position / 2;
		}
		pr.arr[position] = newJob;
	}
	
   //method used to remove element from the top of a max heap or maximum priority job
	public Jobs remove() {
		if (isEmpty())
			return null;
		int parent, child;
		parent = 0;
		child = 1;
		Jobs item = pr.arr[0];
		Jobs temp = pr.arr[pr.getHeapSize() - 1];
		pr.setHeapSize(pr.getHeapSize() - 1);
		while (child < pr.getHeapSize()) {
			
			if (temp.getPriority() > pr.arr[child].getPriority())
				break;                      //if the priority of last element is greater than the priority of child than parent is assigned the value

			pr.arr[parent] = pr.arr[child];     //otherwise swapping of values take place to store the last element at correct position
			pr.arr[child]=temp;
			parent = child;
			child = child * 2 + 1;       
		}
		pr.arr[parent] = temp;              //finally temp value is stored at parent position

		return item;
	}

	//main function
	public static void main(String args[]) {
		HandleJobs hj = new HandleJobs();
		hj.pr = new PrintQueue();
		try {
			Scanner sc = new Scanner(System.in);
			//displays menu
			do {
				System.out.println("1. Insert Jobs ");
				System.out.println("2. Print");
				System.out.println("3. Exit");
				int choice = sc.nextInt();
				int pri;
				String name;
				switch (choice) {
				case 1:
					do
					{
					System.out.println("Enter the name and priority");
					name=sc.next();
					pri=sc.nextInt();
					}while(pri>4 || pri<0);            //if priority is not between 1-4 than enter again
					Jobs newJob = new Jobs(name, pri);
					hj.insert(newJob);
					break;
					
				case 2:
					if (hj.isEmpty()) {
						System.out.println("No More Jobs to print. Bye!!");
						System.exit(0);
					} else
						System.out.println("Printing job - " + hj.remove());
					break;

				case 3:
					System.exit(0);

				default:
					System.out.println("Enter a valid input");
				}

			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
