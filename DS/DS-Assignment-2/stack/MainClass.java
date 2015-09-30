package stack;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		StackOperation stackOperation = new StackOperation();
		int ch, item;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n1. Create Linked List"
					+ "\n2. Push Element"
					+ "\n3. Pop Element "
				    + "\n4. Display Stack" + "\n5. Exit");
			System.out.println("\nEnter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\nEnter node value : ");
				item = sc.nextInt();
				stackOperation.createLinkedList(item);
				break;
			case 2:
				System.out.print("\nEnter node value : ");
				item = sc.nextInt();
				stackOperation.push(item);
				break;
			case 3:
				stackOperation.pop();
				break;
			case 4:
				stackOperation.traversalStack();
				break;
			case 9:
				sc.close();
				System.exit(0);
			}
		}
	}
}
