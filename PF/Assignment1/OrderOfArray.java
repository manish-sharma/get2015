import java.util.*;

/**
 * @author Sumitra
 *In this program we are checking that the given array is in accending order or decending order or the array is not sorted.
 * Method will return 1 if accending order
 * Method will return 2 if array is in decending order
 * Method will return 0 ifr array is not sorted.
 */
public class OrderOfArray {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int arraySize=scan.nextInt();
		int []input=new int[arraySize];
		System.out.println("enter the elemts of array");
		for(int i=0;i<input.length;i++)
		{
			input[i]=scan.nextInt();
		}
		OrderOfArray assign=new OrderOfArray();
		System.out.println("the order is"+assign.checkOrder(input));
		scan.close();
	}
int checkOrder(int input[])
{
	int i,countAccending=0,countDecending=0;
	
	for(i=0;i<input.length-1;i++)
	{
		
			if(input[i]<input[i+1] )
			{
				countAccending++;
			}
			else
				break;
			/**
			 * if the array is in acending than counter will increase other wise it will break.
			 */
	}
	for(i=0;i<input.length-1;i++)
	{
		if(input[i]>input[i+1])
		{
			countDecending++;
		}
		else break;
		/**
		 * if array is in decending order than counter will increase other wise will break.
		 */
	}
	
	if(countAccending==input.length-1)
		return 1;
	else if(countDecending==input.length-1)
	 return 2;
	else return 0;
	/**
	 * If counter is equal to the size of array than it is sorted otherwise unsorted.
	 */
	}

}

