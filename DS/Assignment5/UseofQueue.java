package ds5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseofQueue {
	/**
	 * userInput is function which is take input from user and validate it.
	 *
	 */
	static int userInput() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number can't be negative");
				number = userInput();
			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("\n enter only integer");
			number = userInput();
		}
		return number;
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		/* Showing menu */
		while (choice != 6) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert Element in queue");
			System.out.println("2. Remove Element from queue");
			System.out.println("3. Get Frist Element from queue");
			System.out.println("4. Get size of queue");
			System.out.println("5. Display queue");
			System.out.println("6. Exit");
			choice = userInput();
			switch (choice) {
			case 1:
				System.out.println("Enter element");
				int element = userInput();
				queue.enqueue(element);//enqueue element in queue
				break;
			case 2:
				if (queue.size() == 0)
					System.out.println("queue is empty");
				else
					System.out.println("Element  is\n" + queue.dequeue());
				break;
			case 3:
				if (queue.peek() == null)
					System.out.println("queue is empty");
				else
					System.out.println("Element  is\n" + queue.peek());
				break;

			case 4:
				System.out.println("size of queue is");
				System.out.println(queue.size());
				break;
			case 5: 
				queue.display();
				break;
			case 6:
				choice = 6;
			default:
				System.out.println("Enter correct choice");
			}
		}

	}
}
