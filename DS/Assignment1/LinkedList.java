package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinkedList {

	public static void main(String []args) throws IOException {
		String choiceContinue;
		BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
		Scanner scannerObject = new Scanner(System.in);
		Node start = null;
		int value;
		do {
			
			System.out.print("Menu:\n"
					+ "1. Create List\n"
					+ "2. Print List\n"
					+ "3. Insert Node\n"
					+ "4. Insert In between\n"
					+ "5. Insert At End\n"
					+ "4. Delete Node \n");
			int choice = scannerObject.nextInt();
			
			LinkedListOperation listOperationObject = new LinkedListOperation();
			switch(choice) {
			case 1:
				start = listOperationObject.createList();
				break;
			case 2:
				listOperationObject.printList(start);
				break;
			case 3:
				System.out.print("\nEnter a number to insert: ");
				int element = scannerObject.nextInt();
				listOperationObject.addElement(start, element);
				break;
			case 4:
				System.out.print("Enter number : ");
				value = scannerObject.nextInt();
				System.out.print("Enter Position : ");
				int position = scannerObject.nextInt();
				listOperationObject.insertInBetween(start, position, value);
				break;
			case 5:
				System.out.print("Enter number");
				value = scannerObject.nextInt();
				listOperationObject.insertAtEnd(start , value);
				break;
			
			default:
				System.out.println("Wrong Choice!");
			}
			System.out.println("Do you want to perform more operations?? (Y / N)");
			choiceContinue = bufferedReaderObject.readLine();
		} while(choiceContinue.equalsIgnoreCase("y"));
		
	}
}
