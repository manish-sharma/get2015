package assignmentDS_Advance;

import java.util.Scanner;

public class MainList 
{
	public static void main(String args[])
	{
		List list = null;
		Scanner sc = new Scanner(System.in);
		String input = null;
		int choice = -1;
		do {
			
			System.out.println("Enter Input String: ");
			/* Inputting number of elements */
			input = sc.next();
			if (List.isInputValid(input)) 
			{
				list=new List(input);
				break;
			}
			System.out.println("Enter valid input");
		} while (true);
		
		
		
		do
		{
			List.printMenu();
			System.out.println("\n\nEnter Choice: ");
			
			do
			{
				System.out.println("(Enter Positive Integer(>0 and <5)");
				while(!sc.hasNextInt()) {
					System.out.println("Enter Integer only");
					sc.next();
				}
				choice = sc.nextInt();
			}while(choice <= 0 || choice >= 5);
			
			
			
			
			switch(choice)
			{
			case 1:
				System.out.println(list.first);
				break;
			case 2:
				int max=list.findMax(list.first);
				System.out.println("\nMaximum no in the list is: " +max);
				break;
			case 3:
				int sum=list.findSum(list.first);
				System.out.println("\nSum of the all the element in the list is: "+sum);
				break;
			case 4:
				int searchElement=0;
				System.out.println("\nEnter Element that you want to search");
				while(!sc.hasNextInt()) {
					System.out.println("Enter Integer only");
					sc.next();
				}
				searchElement = sc.nextInt();
				boolean found=list.find(searchElement, list.first);
				if(found)
				{
					System.out.println("Element is present in the list");
				}
				else
				{
					System.out.println("Element is not present in the list");
				}
			}
			
			
		}while(true);
		
	}

}
