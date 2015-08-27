package secondProgram;
import java.util.Scanner;

public class MainLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of class linkedList */
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		char ch;
		/* Perform list operations */
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. Retrival at a particular position");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size");
			System.out.println("7. get reverse");
			System.out.println("8. Sorted Array");
			System.out.println("9. Delete item by value");
			System.out.println("10. Display linkedlist");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				list.insertAtStart(scan.next());
				break;
			case 2:
				System.out.println("Enter integer element to insert");
				list.retrievalAtIndex(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to insert");
				String num = scan.next();
				System.out.println("Enter position");
				int pos = scan.nextInt();
				if (pos < 1 || pos > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.insertAtParticularPosition(num, pos);
				break;
			case 4:
				System.out.println("Enter position");
				int p = scan.nextInt();
				if (p < 1 || p > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.deleteAtPos(p);
				break;
			case 5:
				System.out.println("Status = " + list.isEmpty());
				break;
			case 6:
				System.out.println("Size = " + list.getSize() + " \n");
				break;

			case 7:
				System.out.println("Reverse List");
				list.reverse();
				break;

				// case 8: System.out.println("Sorted linked List");
				// list.sortLinkedList();
				// list.display();
				// break;

			case 9:
				System.out.println("Enter the value of item to be deleted");
				num = scan.next();
				list.deleteItemOnValue(num);
				break;

			case 10:/* Display List */
				list.display();
				break;

			default:
				System.out.println("Enter a valid input \n ");
				break;
			}
			

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
