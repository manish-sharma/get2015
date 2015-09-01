import java.util.Scanner;

/**
 * Main class that displays menu and perform all menu related operations
 * 
 * @author Riddhi
 *
 */
public class MainQueue {

	public static void main(String args[]) {
		Scanner sc;
		try {
			sc = new Scanner(System.in);
			Queue object = new Queue();
			do {
				System.out.println("1. Add element");
				System.out.println("2. Remove Element");
				System.out.println("3. Display");
				System.out.println("4. Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter value of element");
					int value = sc.nextInt();
					object.enqueue(value);
					break;

				case 2:
					System.out.println("Element removed is : "
							+ object.dequeue());
					break;

				case 3:
					System.out.println("Queue Contains");
					System.out.println(object.toString());
					break;

				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("Enter a valid input");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
