package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack {

	public static void main(String []args) {
		String continueChoice ;
		Node start = null;
		Scanner scannerObject =  new Scanner(System.in);
		do {
			System.out.print("Menu: \n"
					+ "1. Print Stack\n"
					+ "2. Enter Element\n"
					+ "3. Remove Element\n");
			try {
				LinkedList linkedListObject = new LinkedList();
				int choice = scannerObject.nextInt();
				switch (choice) {
				case 1:
					linkedListObject.printList(start);
					break;
				case 2:
					System.out.println("Enter A Number: ");
					int value = scannerObject.nextInt();
					start = linkedListObject.insertAtEnd(value, start);
					break;
				case 3:
					start = linkedListObject.deleteElement(start);
					break;
				default:
					System.out.println("Kindly Enter Correct Choice!!");
					break;
				}
			} catch(InputMismatchException exception) {
				System.out.println("You had entered a incorrect number!!");
			}
			System.out.println("Do You Want to perform more operations (Y / N)?  ");
			continueChoice = scannerObject.next();
		}while(continueChoice.equalsIgnoreCase("y"));
		scannerObject.close();
	}
}
