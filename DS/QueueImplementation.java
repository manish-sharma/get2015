import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Sumitra
 *Write a program to implement the Queue functionality using the java collections. 
 *Look for the best collection to meet this requirement. Provide some points justifying your collection choice. 

 */
public class QueueImplementation {
	@SuppressWarnings("unchecked")
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		LinkedList arr = new LinkedList();
		Character ch = null;
		do {
			System.out.println("Enter 1 for insertion in queue");
			System.out.println("enter 2 for deletion in queue");
			System.out.println("enter 3 for display");
			System.out.println("enter 4 for clear");
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the number");
				String e = scanner.next();
				arr.addLast(e);
				break;
			case 2:
				arr.removeFirst();
				break;
			case 3:
				System.out.println(arr.getFirst());
				break;
			case 4:
				arr.clear();
				break;
			default:
				System.out.println("entered wrong choice");
				break;

			}

			System.out.println("enter Y to continue");
			System.out.println("enter n for exit");
			System.out.println("enter your choice");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		scanner.close();
	}
}
