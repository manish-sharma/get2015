import java.util.ArrayList;
import java.util.Scanner;

public class MainTreeSort 
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
				
				/* for loop to insert elements in itemArray */
				for(int i=0; i < numberOfElements; i++)
				{
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					itemArray[i] = sc.nextInt();	
					
				}
				
				/*Initialization*/
				TreeSort treeSort=new TreeSort();
				for(int i=0;i<itemArray.length;i++) {
					treeSort.root=treeSort.insert(itemArray[i],treeSort.root);
				}
				ArrayList<Integer> arr=new ArrayList<Integer>();
				arr=treeSort.DispalyInSortedOrder(treeSort.root,arr);
				System.out.println("Array After TreeSort");
				System.out.println(arr);
			}while(true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
