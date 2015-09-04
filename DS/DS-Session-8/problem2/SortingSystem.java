import java.util.Scanner;


public class SortingSystem {
	public static void main( String [] arg ) 
	{  
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of unsorted List: ");
			int size = sc.nextInt();
			int [] list = new int[size];
			System.out.println("Enter integer elements: ");
			for(int i = 0; i < size ; i ++)
			{
				list[i] = sc.nextInt(); 
 			}
			System.out.println("\n Press 1 for comparison sorting\n Press any key for Linear sorting");
			String type = sc.next();
			Sorting sorting = new Sorting();
			list = sorting.sort(list , type);
			
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
