import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClassDoublyLinkedList {
	public static void main(String args[])
	{
	
		DoublyNode startNode=null;
		String choiceContinue="";
		do 
		{
			
			System.out.print("Menu:\n"
					+ "1. Create List\n"
					+ "2. Print List\n"
					+ "3. Insert Node at Postion\n"
					+ "4. Delete Node \n"
					+ "5. Delete Node by Position\n" 
					+ "6. Reverse of List\n");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int choice = DoublyLinkedList.readData();
			DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
			switch(choice) 
			{
				case 1:
					startNode=doublyLinkedList.createList();
					break;
				case 2:
					doublyLinkedList.displayList(startNode);
					break;
				case 3:
					System.out.println("Enter Position");
					int position=DoublyLinkedList.readData();
					DoublyNode head=doublyLinkedList.insertAtPosition(startNode,position);
					if(check(head))
						startNode=head;
					break;
				case 4:
					head=doublyLinkedList.deleteNode(startNode);
					if(check(head))
						startNode=head;
					break;
				case 5: 
					head=doublyLinkedList.deleteNodeByPosition(startNode);
					if(check(head))
						startNode=head;
					break;
				case 6 : 
					startNode=doublyLinkedList.reverseList(startNode);
					break;
			
				default:
					System.out.println("Please enter corrrect choice");
			}
			System.out.println("Do you want to perform more operations??(Y/N)");
			try
			{
				choiceContinue = bufferedReader.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.println("Error Occured Please enter again");
				continue;
			}
		} while(choiceContinue.equalsIgnoreCase("y"));
		
	}
	public static  boolean check(DoublyNode head)
	{
		if(DoublyLinkedList.isEmpty(head))
		{
			System.out.println("Position is incorrect or Node is empty");
			return false;
		}
		else
		{
		
		System.out.println("Operation successfully");
		return true;
		}
	}
		
	}


