package Heap_jobSorting;

import java.util.Scanner;

public class MainClassHeapPrinter {
	public static void main(String args[]) {
		Queue priorityQueue = new Queue(20);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("1. Printing Request of Under Graduate"
						+ "\n2. Printing Request of Graduate"
						+ "\n3. Printing Request of Professor"
						+ "\n4. Printing Request  of Chairman" + "\n5. Print"
						+ "\n6. Exit" + "\nEnter your choice : ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					//Case for printing Request of Under Graduate
					priorityQueue.enQueue("underGraduate", choice);
					break;
				case 2:
					//Case for printing Request of Graduate
					priorityQueue.enQueue("graduate", choice);
					break;
				case 3:
					//Case for printing Request of Professor
					priorityQueue.enQueue("professor", choice);
					break;
				case 4:
					//Case for printing Request  of Chairman
					priorityQueue.enQueue("chairman", choice);
					break;
				case 5:
					//printing all documents
					priorityQueue.displayQueue();
					break;
				case 6:
					System.exit(0);

				default:
					System.out.println("Please enter valid choice");
					scanner.close();
					break;

				}
			} catch (Exception e) {
				System.out.print(e);
				System.exit(0);
			}

		}

	}

}
