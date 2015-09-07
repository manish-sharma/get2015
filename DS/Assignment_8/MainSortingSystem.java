
import java.util.Scanner;

public class MainSortingSystem 
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[])
	{
		Scanner sc = null;
		try
		{
			
			sc=new Scanner(System.in);	
			int choice;
			int LargestElement=0;
			//SortingSystem sortingSystem=new SortingSystem();
			int numberOfElements=0;
			do
			{
				System.out.println("\n\nEnter No of Elements: ");	
				/* Inputting number of elements */
				do
				{
					System.out.println("(Enter Positive Integer(>0)");
					while(!sc.hasNextInt()) 
					{
						System.out.println("Enter Integer only");
						sc.next();
					}
					numberOfElements = sc.nextInt();
					
				} while(numberOfElements <= 0);
				
				/* itemArray is array of numbers */
				int[] itemArray = new int[numberOfElements];
				
				
				System.out.println("Enter elements of Array: ");
				
				/* for loop to insert elemets in itemArray */
				for(int i=0; i < numberOfElements; i++)
				{
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					itemArray[i] = sc.nextInt();	
					/*It will store the largest element of array*/
					if(LargestElement<itemArray[i])   
						LargestElement=itemArray[i];
				}
				
				/*Initialization*/
				SortingSystem sortingSystem=new SortingSystem(itemArray, itemArray.length,LargestElement);
				System.out.println("Enter Choice: ");
				System.out.println("1. Comparison Sorting");
				System.out.println("2. Linear Sorting");
				
				/* Inputting choice of user */
				do
				{
					System.out.println("\n(Enter Positive Integer(>0 and <3)");
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					choice = sc.nextInt();
				}while(choice <= 0 || choice >= 3);
				
				int sortedArray[];
				switch(choice)
				{
				case 1:
					sortedArray=sortingSystem.comparisionSort();
					break;
				case 2:
					sortedArray=sortingSystem.linearSort();
					break;
				}
			    
			    String method="";
			    
			    
			    switch(choice)
			    {
			    case 1:
			    	if(itemArray.length<=10)
			    	{
			    		method="Bubble Sort";
			    	}
			    	else
			    	{
			    		method="Quick Sort";
			    	}
			    	break;
			    case 2:
			    	if(LargestElement<=99)
			    	{
			    		method="Counting Sort";
			    	}
			    	else
			    	{
			    		method="Radix Sort";
			    	}
			    	
			    }
				
				System.out.println("\nSorting Method applied :"+method);
				System.out.println("\nElement after Sorting is");
				sortingSystem.show();
				
			} while(true);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
