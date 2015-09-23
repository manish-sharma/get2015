/******************************************************************
*     @author Girdhari						  *
*     -> Program to find a longest subsequence from an array      *
*     -> previousIndex store the last index number		  *
*     -> size contains the size of longest sequence		  *
*     -> count is looping counter				  *
      -> startIndex is the starting index of longest sequence 
*******************************************************************/
/*Starting of LongestSequence Class*/
public class LongestSequence {
	
	/*starting of main function*/
	public static void main(String[] args) 
	{
		
	}
	/*end of main function*/
	
	/*start of longestSequence function*/
	int[] longestSequence(int input[])
	{
		int previousIndex = 0,size = 0,count = 0,startIndex = 0;
		int index = 1;
		while(true)
		{
			/*loop to check whether the current index is less then length of array
			  and previous index is also less then length of array and the value of 
			  input array at index last index is less then or equal to input value 
			  at current index
			 */
			while(index < input.length && previousIndex < input.length && input[previousIndex] <= input[index] )
			{
				index++;
				count++;
				previousIndex++;
			}
			
			if(size < count)
			{
				size = count;
			}
			//condition to check base condition because loop is always true and we require a termination point
			if(index >= input.length || previousIndex >= input.length)
				break;
			previousIndex = index;
			startIndex = index;
			index = previousIndex+1;
			count = 0;
		}
		
		int output[] = new int[size + 1];
		int outputIndex = 0;
		
		System.out.println("size=" + size + "startIndex=" + startIndex);
		/*loop will intialise the array at startIndex and outputIndex at zero then it will store 
		  values from input array to output array
		*/
		for( index = startIndex , outputIndex = 0 ; index <= startIndex + size ; index++ , outputIndex++ )
		{
			output[outputIndex] = input[index];
			System.out.println( output[outputIndex] );
		}
		return output;
	}
}

/*end of LongestSequence class*/
