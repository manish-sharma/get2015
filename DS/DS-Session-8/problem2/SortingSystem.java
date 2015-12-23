/*
 * DS-Seeion-8 Assignment
 * @authhor Banwari kevat
 */
import java.util.Scanner;
public class SortingSystem {
	public static void main( String [] arg ) 
	{  
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of unsorted List: ");
			//read size of list
			int size = sc.nextInt();
			//create a list of given size
			int [] list = new int[size];
			//read one by one element
			System.out.println("Enter integer elements: ");
			for(int i = 0; i < size ; i ++)
			{
				list[i] = sc.nextInt(); 
 			}
			System.out.println("\n Press 1 for comparison sorting\n Press any key for Linear sorting");
			//read choice from user side for which type of sorting required
			String type = sc.next();
			Sorting sorting = new Sorting();
			list = sorting.sort(list , type);
			//Display sorted list
			System.out.println("Sorted List is: ");
			for( int i : list)
			{
				System.out.print(i+" ");;
			}
		}
		catch(Exception e) 
		{
			System.out.print(e.getMessage());
		}
		
	}

}
