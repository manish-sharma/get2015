package queueByCollection;

import java.util.Scanner;

public class QueueMainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue queue = new Queue();
		String choice;
		String element;

		while (true) {
			System.out.println("\n1. Insert Element(enqueue)"
					+ "\n2. Delete Element(dequeue)" + "\n3. exit ");
			choice = scanner.nextLine();

			switch (choice) {
			case "1":
				// Inserting element in queue
				System.out.println("Enter element ");
				element = scanner.nextLine();
				queue.enqueue(element);
				break;

			case "2":
				// Deleting element from queue
				try {
					System.out.println("deleted element : " + queue.dequeue());
				} catch (Exception e) {
					System.out.println(e);
				}
				break;

			case "3":
				System.exit(0);

			default:
				System.out.println("Please enter vaild input ");
				scanner.close();
				break;

			}
		}
	}

}
