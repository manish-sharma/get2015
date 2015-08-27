import java.util.InputMismatchException;
import java.util.Scanner;
public class MainClassStack 
{
	public static void main(String []args)
	{
			char continueChoice=0;
			StackNode<Character> startNode=null;
			Scanner scanner =  new Scanner(System.in);
			do 
			{
				System.out.print("Menu: \n1.Insert Element\n"+ "2.Remove Element\n"+"3.Display Stack\n");
				try
				{
					StackOperation<Character> stackOperation = new StackOperation<Character>();
					System.out.println("Enter your choice(1,2,3)");
					int choice = scanner.nextInt();
					
					switch (choice) 
					{
					
					case 1:
							System.out.println("Enter A Number: ");
							char data =readData(scanner);
							System.out.println("data is"+data);
							startNode=stackOperation.pushData(startNode,data);;
							break;
					case 2:
							startNode=stackOperation.popData(startNode);
							break;
					case 3:
							stackOperation.display(startNode);
							break;
					default:
							System.out.println("Kindly Enter Correct Choice!!");
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


}
