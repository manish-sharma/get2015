package firstprogram;
import java.util.Scanner;
/**
 * Class that handles all printing operations
 * @author Riddhi
 *
 */
public class HandleJobs {
	
	//main function
	public static void main(String args[]) {
		PrintQueueUsingHeap pr = new PrintQueueUsingHeap();
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
					pr.insert(newJob);
					break;
					
				case 2:
					if (pr.isEmpty()) {
						System.out.println("No More Jobs to print. Bye!!");
						System.exit(0);
					} else
						System.out.println("Printing job - " + pr.remove());
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
