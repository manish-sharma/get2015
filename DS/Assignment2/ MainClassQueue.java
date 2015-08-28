import java.util.InputMismatchException;
import java.util.Scanner;


public class MainClassQueue {
	
	public static void main(String args[])
	{
		char continueChoice=0;
		Queue<Integer> queueOperation= new Queue<Integer>(Integer[].class);
	
		boolean isCorrect=false;
		Scanner scanner =  new Scanner(System.in);
		do 
		{
			System.out.print("Menu: \n1.Insert Element\n"+ "2.Remove Element\n"+"3.Display Queue\n"+"4.Clear Queue\n"+"5.Get Front and Rear\n");
			try
			{
				
				System.out.println("Enter your choice(1,2,3,4,5)");
				int choice = scanner.nextInt();
				switch (choice) 
				{
				
				case 1:
						System.out.println("Enter A Number: ");
						int data =scanner.nextInt();
						isCorrect=queueOperation.insertElement(data);
						if(isCorrect)
							System.out.println("Element inserted");
						else
							System.out.println("Element not inserted");
						break;
				case 2:
						int frontData=queueOperation.deleteElement();
						if(frontData!=-1)
							System.out.println("Element deleted");
						else
							System.out.println("Element not deleted");
						break;
				case 3:
						queueOperation.displayQueue();
						break;
				case 4:
						queueOperation.clearAll();
						break;
				case 5:
						System.out.println("Front="+queueOperation.getFront()+" and Rear="+queueOperation.getRear());
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
				data = scanner.next(".").charAt(0);
			} 
			catch (InputMismatchException io) 
			{
				System.out.println("Error occurred please enter again");
				continue;
			}
			break;
		} while (true);

		return data;
	}


}
