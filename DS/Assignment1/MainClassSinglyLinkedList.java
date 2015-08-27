import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClassSinglyLinkedList 
{

	public static void main(String []args)
	{
		String choiceContinue = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		SinglyNode start = null;
		int value;
		do 
		{
			System.out.print("Welcome to Singly Linked List\n"
								+ "1. Create List\n"
								+ "2. Display List\n"
								+ "3. Insert Node\n"
								+ "4. Insert In between\n"
								+ "5. Insert At the End\n"
								+ "6. Delete Node \n"
								+ "7. Delete By Index\n"
								+ "8. Reverse List\n");
			int choice = scanner.nextInt();
			SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
			switch(choice) {
			case 1:
				start = singlyLinkedList.createList();
				break;
			case 2:
				singlyLinkedList.printList(start);
				break;
			case 3:
				System.out.print("\nEnter a number to insert: ");
				int element = scanner.nextInt();
				singlyLinkedList.addElement(start,element);
				break;
			case 4:
				System.out.print("Enter Number : ");
				value = scanner.nextInt();
				System.out.print("Enter Position : ");
				int position = scanner.nextInt();
				start=singlyLinkedList.insertInBetween(start, position, value);
				break;
			case 5:
				System.out.print("Enter Number");
				value = scanner.nextInt();
				singlyLinkedList.insertAtEnd(start,value);
				break;
			case 6:
				System.out.print("Enter Number");
				value = scanner.nextInt();
				singlyLinkedList.deleteElement(start, value);
				break;
			case 7:
				System.out.print("Enter Index: ");
				value = scanner.nextInt();
				singlyLinkedList.deleteIndex(start, value);
				break;
			case 8: 
				start=singlyLinkedList.reverseList(start);
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			
			System.out.println("Do you want to perform more operations?? (Y / N)");
			try
			{
				choiceContinue = bufferedReader.readLine();
			}
			catch(IOException io)
			{
				System.out.println("Error Occured please enter input again");
				continue;
				
			}
		}while(choiceContinue.equalsIgnoreCase("y"));
		
		scanner.close();
	}
}
