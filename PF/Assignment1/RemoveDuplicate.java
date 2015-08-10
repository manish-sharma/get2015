// program to remove duplicates from an array
import java.util.Scanner;

public class RemoveDuplicate
 {
	public static void main(String[] args) 
	{
		int index, arrSize, arrInput[]=null, arrOutput[]=null;
	    Scanner sc = new Scanner(System.in);
	    RemoveDuplicate obj = null;
	    try
	    {
		    System.out.println("Enter the size of array :");   
			   arrSize = Integer.parseInt(sc.nextLine());
			   
			arrInput = new int[arrSize];	
			System.out.println("Enter the array :");
		    for(index=0; index<arrInput.length; index++)
		    	arrInput[index] = Integer.parseInt(sc.next());
		    
		    obj = new RemoveDuplicate();
			
		    arrOutput = obj.removeDuplicate(arrInput);
			for(index=0; index<arrOutput.length; index++)
			    System.out.println(arrOutput[index]);
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
			if(arrInput!=null)
				arrInput = null;
		}
	}
	
	
    int[] removeDuplicate(int input[])
    {
    	int index1, index2, countOfDuplicates=0, inputLength=input.length ;
	    for(index1=0; index1<input.length; index1++)
	    {
	    	for(index2=index1+1; index2<input.length; index2++)
		    {
	    		if( (input[index2]==input[index1]) && (input[index1]!=' ') )
	    		{	
	    			input[index2] = ' ';   // duplicate is replaced by space
	    			countOfDuplicates = countOfDuplicates + 1;  //when duplicate is found countOfDuplicates is increased by 1
	    		}
		    }
	    }

	    int output[] = new int[inputLength - countOfDuplicates];
	    for(index1=0, index2=-1; index1<inputLength; index1++)
	    {
	    	if(input[index1] != ' ') 
	    	{
	    		index2 = index2 + 1;
	    		output[index2] = input[index1];    
	        }
	    }
	    return output;
    }
}