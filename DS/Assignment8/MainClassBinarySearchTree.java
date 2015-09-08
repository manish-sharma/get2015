import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassBinarySearchTree 
{
	public static Node<Integer> root=null;
	
	public static void main(String []args) 
	{
		int continueChoice=0;
		
		BinarySearchTree<Integer> binarySearch =new BinarySearchTree<Integer>();
	
		do 
		{
			System.out.print("Menu: \n1.Press 1 for Insert Element \n"
								+"2.Press 2 for perform Tree Sort And display\n"
								+"3.Press 3 Exit\n");
		
				System.out.println("Enter your choice(1,2,3)");
				int choice = readData();
				switch (choice) 
				{
				
				case 1:	
						insertElement(binarySearch);
						break;
				case 2:
						System.out.println("Tree sort traversal is ");
						binarySearch.inOrderTraversal(root);
						break;
				case 3:
						System.out.println("System Exit");
						System.exit(1);
					
				default:
						System.out.println("Please Enter Correct Choice!! press(1,2,3)");
						
				}
			
			System.out.println("Press 1 for continue operation otherwise any other number");
			continueChoice = readData();
			
		}while(continueChoice==1);
		
	}

	public static int readData()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data =0;
		do
		{
			try
			{
				data=Integer.parseInt(br.readLine());
			}
			catch(IOException io)
			{
				System.out.println("Error occured please enter input again");
				continue;
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter correct input");
				continue;
			}
			break;
		}while(true);
	
		return data;
	}
	
	public static void  insertElement(BinarySearchTree<Integer> binarySearch) 
	{
		
		int data;
		do
		{
			System.out.println("Enter A Number: ");
			data=readData();
			root=binarySearch.insertData(root, data);
			System.out.println("Do you want to insert more data press 1 for continue otherwise press 0");
			data=readData();
			if(data!=1)
				break;
			
		}while(true);
	
	}

}

