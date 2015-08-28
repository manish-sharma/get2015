/**
 * @author Dheeraj
 * This is Main class of Data Structure 3 Assignment
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClassBinarySearchTree 
{
	public static Node<Integer> root1=null;
	public static Node<Integer> root2=null;
	public static void main(String []args) 
	{
		char continueChoice=0;
		
		BinarySearchTree<Integer> binarySearch =new BinarySearchTree<Integer>();
		Node<Integer> root1=null;
		Node<Integer> root2=null;
		Scanner scanner =  new Scanner(System.in);
		do 
		{
			System.out.print("Menu: \n1.Press 1 for Insert Element in tree\n"
								+"2.Press 2 for PreOrder Traversal of Tree\n"
								+"3.Press 3 for PostOrder Traversal of Tree\n"
								+"4.Press 4.Check if they are mirror of each Other\n");
			try
			{
				System.out.println("Enter your choice(1,2,3,4)");
				int choice = scanner.nextInt();
				switch (choice) 
				{
				
				case 1:	
						System.out.println("Press 1 for Tree 1 and Press 2 for Tree 2");
						choice=scanner.nextInt();
						if(choice==1)
							root1=insertElement(scanner,1,binarySearch);
						else
							root2=insertElement(scanner,2,binarySearch);
						break;
				case 2:
						binarySearch.preOrderTraversal(root1);
						break;
				case 3:
						binarySearch.postOrderTraversal(root1);
						break;
				case 4: 
						boolean isMirror=binarySearch.isMirror(root1, root2);
						if(isMirror)
							System.out.println("Both are Mirror");
						else 
							System.out.println("Both are not Mirror");
						break;
				default:
						System.out.println("Please Enter Correct Choice!!");
				}
			}
			catch(InputMismatchException exception) 
			{
				System.out.println("You had entered a incorrect number!!");
				
			}
			System.out.println("Do You Want to perform more operations (Y / N)?");
			continueChoice = readData(scanner);
			
		}while(continueChoice=='y'||continueChoice=='Y');
		scanner.close();
		
	}

	public static char readData(Scanner scanner)
	{
		char data = 0;
		do 
		{
			try 
			{
				data=scanner.next(".").charAt(0);
			}
			catch(InputMismatchException io)
			{
				System.out.println("Error occurred please enter again");
				continue;
			}	
			break;
		}while(true);
		
		return data;
	}
	
	public static Node<Integer> insertElement(Scanner scanner, int choice, BinarySearchTree<Integer> binarySearch) {
		
		int data;
		do
		{
			System.out.println("Enter A Number: ");
			data=scanner.nextInt();
			if(choice==1)
				root1=binarySearch.insertData(root1, data);
			else
				root2=binarySearch.insertDataMirror(root2, data);
			
			System.out.println("Do you want to insert more data press 1 for continue otherwise press 0");
			System.out.println("root data is"+root1.getData());
			data=scanner.nextInt();
			if(data!=1)
				break;
		}while(true);
		if(choice==1)
			return root1;
		else
			return root2;
	
	}

}

