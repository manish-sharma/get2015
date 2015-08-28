package secondprogram;



/**
 * Main class that class Queue to perform operations on it
 */
import java.util.Scanner;

public class MainQueue {
	public static void main(String args[]) {
		Queue object = new Queue();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1.Push element");
			System.out.println("2.Pop element");
			System.out.println("3.Check if empty");
			System.out.println("4.Traverse");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element to be inserted");
				object.enqueue(sc.nextInt());
				break;

			case 2:

				int ans = (Integer) object.dequeue();
				System.out.println("Element removed is :" + ans);
				break;
			case 3:
				System.out.println("Stack Status :" + object.isEmpty());
				break;
			case 4:
				object.traverse();
				break;

			case 5:
				System.exit(0);
			default:
				System.out.println("Enter a valid input");

			}

		} while (true);
	}
}
