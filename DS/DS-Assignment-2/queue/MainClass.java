package queue;

import java.util.Scanner;


public class MainClass {
	public static void main(String args[]) {
		QueueOperation queueOperation = new QueueOperation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n1. Add Element in queue"
					+ "\n2. Delete Element from Queue"
					+ "\n3. Get front"
					+ "\n4. Empty Queue(delete all element)"
				    + "\n5. Display Queue" 
					+ "\n6. Exit");
			System.out.println("\nEnter Your choice : ");
			int ch = sc.nextInt();
		Object item;
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\nEnter item value : ");
				item = sc.next();
				queueOperation.enQueue(item);
				break;
			
			case 2:
				queueOperation.deQueue();
				break;
			case 3:
				Object frontElement=queueOperation.getFront();
				System.out.println(frontElement);
				break;
			case 4:
				queueOperation.makeEmpty();
				System.out.println("Empty Queue");
				break;
			case 5:
				queueOperation.displayQueue();
				break;
			case 6:
				sc.close();
				System.exit(0);
			}
		}
	}

}
