import java.util.*;

/**
 * @author Sumitra
 * this program is to calculate longest subsequnce from a sequence.
 * arraySize is used to insert the size of array.
 * longestSequence(input) will give the required array.
 */
public class GetLongestSequence {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int arraySize=scan.nextInt();
		int []input=new int[arraySize];
		System.out.println("enter the elemets in array");
		for(int i=0;i<arraySize;i++)
		{
			input[i]=scan.nextInt();
		}
		GetLongestSequence assign=new GetLongestSequence();
		 for(int i=0;i<assign.longestSequence(input).length;i++)
		 {
		 System.out.print(assign.longestSequence(input)[i]);
		 }
		scan.close();
	}

	int[] longestSequence(int input[])
	{
		int i,j,k=input.length,count=0,maxCount=0,state=0;
		for(i=1;i<k;i++)
		{
			if(input[i-1]<input[i])
			{
				count++;
			}
			else
				count=0;
			if(maxCount<count)
			{
				maxCount=count;
				state=i-count;
			}
		}
		
		maxCount=maxCount+1;
		
		/**maxcount will calculate the size of longest sequence.
		 * state will contain the index number of starting of longest sequence. 
		 * 
		 */
		int []arr=new int[maxCount];
		j=0;
		for(i=state;i<state+maxCount;i++)
		{
		 arr[j]=input[i];
		 j++;
		}
		return arr;
	}
	/**
	 * arr will return the array of longest sequence.
	 */
	
}
