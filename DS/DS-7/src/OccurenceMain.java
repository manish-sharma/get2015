import java.util.Scanner;
/**This class implements main  method and ask user for 
 * size of elements and the elements for array and 
 * returns the array showing the left most and right most 
 * Occurrence 
 * Note-Please enter elements in sorted way
 * 
 * @author Shishir
 *Date 2nd September 2015
 */

public class OccurenceMain {

	//main function
	public static void main(String agrs[])
	{
		try
		{
		System.out.println("Enter the number of elements");
		int size;
		Scanner sc=new Scanner(System.in);
		size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int index=0;index<size;index++)
		{
			arr[index]=sc.nextInt();
		}
		int key;
		System.out.println("Enter the key to search");
		key=sc.nextInt();
		int result[]=BinarySearch.leftRightOccurence(arr, key);
		System.out.print(" { " + result[0] + "," + result[1] + " } ");
	 }
		catch(Exception e)
		{
			System.out.println("Some exception occcured please");
		}
    }
}
