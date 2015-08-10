// program to find longest increasing sequence in an array

import java.util.*;
public class LongSeq 
{
	public static void main(String[] args) 
	{
		int inputArr[] = new int[25];	
		int index;
		LongSeq obj = null;
		Scanner sc = new Scanner(System.in);
		try
		{
			for(index=0; index<25; index++)
				inputArr[index] = Integer.parseInt(sc.next());
			obj = new LongSeq();
			int outputArr[] = obj.longestSequence(inputArr);
			for(index=0; index<outputArr.length; index++)
				System.out.print(outputArr[index]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
			if(inputArr!=null)
				inputArr = null;
		}
	}
	
	int[] longestSequence(int arr[])
	{
		//1 2 3 2 3 4 5 3 4 2 2 3 4 5 6 7 8 1 2 4 5 6 7 8 9
		// sequenceStart = gives starting position of each sequence
		// maxSizeOfSequence = stores size of largest sequence
		// index and count are used to traverse array
		// numOfElements = counts number of elements in each class
		int maxSizeOfSequence=0, numOfElements=0, count=0, sequenceStart=0, index;
		for(count=0; count<=arr.length-1; count++)
		{
			if((count==arr.length-1)||((arr[count]>arr[count+1])))
			{
				numOfElements = numOfElements+1; 
				if(numOfElements > maxSizeOfSequence)
				{
					maxSizeOfSequence = numOfElements;           
					sequenceStart = count+1-maxSizeOfSequence;
				}
				numOfElements = 0;
			}
		    else if((arr[count]<arr[count+1]))
			{
		    	numOfElements = numOfElements+1;
			}
		}
		
		
		// arr1 is assigned largest sequence found in array
		int arr1[] = null;
		try
		{
			arr1 = new int[maxSizeOfSequence];
			for(index=0, count=sequenceStart; count<=sequenceStart+maxSizeOfSequence-1; count++,index++)
			{
				arr1[index] = arr[count];
			}
			return arr1;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(arr1!=null)
				arr1 = null;
		}
		return arr1;
	}
}
