import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClassQueueImplementation 
{

	public static void main(String args[])
	{
		
		Scanner scan = null;
		LinkedList<Integer> queueList = null;
		try
		{
			scan  = new Scanner(System.in);
			int choice, number, result;
			queueList = new LinkedList<Integer>();
			do
			{
				System.out.println("1. Add an element to queue");
				System.out.println("2. Remove an element from queue");
				System.out.println("3. Get front element of queue");
				System.out.println("4. Display the queue");
				System.out.println("5. clear the queue");
				System.out.println("6. Exit");
				System.out.println("Enter your choice: ");
				
				do 
				{
					System.out.println("Please Enter positive integer(less than 7)");
					while(!scan.hasNextInt()) 
					{
						System.out.println("Please Enter Integer Only");
						scan.next();
					}
					choice = scan.nextInt();
					
				} while(choice <= 0 || choice >= 7);
				
				switch(choice) 
				{
				
					
					case 1:
							System.out.println("Enter a numebr: ");
							while(!scan.hasNextInt()) 
							{
								System.out.println("Please Enter Integer Only");
								scan.next();
							}
							number = scan.nextInt();
							queueList.addLast(number);
							break;
						
					case 2:
							if(!queueList.isEmpty()) 
							{
								result = queueList.poll();
								System.out.println("Removed Element is: "+result);
							}
							else
								System.out.println("Queue is Empty");
							break;
						
					case 3:
							if(!queueList.isEmpty())
							{
								result = queueList.peek();
								System.out.println("Front Element is: "+result);
							}
							else
								System.out.println("Queue is Empty");
							break;
					
					case 4:
							if(!queueList.isEmpty()) 
							{
								Iterator<Integer> listIterator = queueList.listIterator();
								System.out.print("Queue is: ");
								while(listIterator.hasNext()) 
								{
									System.out.print(listIterator.next()+" ");
								}
								System.out.println();
							}
							else
								System.out.println("Queue is Empty");
							break;
					
					case 5:
							queueList.clear();
							System.out.println("Queue has been Cleared");
							break;
						
					case 6:
							System.out.println("System Has Exit");
							System.exit(1);
							break;
					
					default:
							System.out.println("Enter correct choice");
				}
				
			} while(true);
		}
		catch(InputMismatchException ipe) 
		{
			System.out.println("Exception occured ");
			scan.close();
		}
	}
}
