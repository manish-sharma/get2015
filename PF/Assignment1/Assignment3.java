import java.util.Scanner;

public class Assignment3 { 
	
	/**longestSequence is a function which return the longest sequence in the given array.
	 * 
	 * @param input is an array of integer elements.
	 * @return This function return an integer array which consist of the longest sequence of given input array.
	 */
	int []longestSequence(int input[])
	{ 
		int fristindex=0;
		int prefristindex=0;
		int prelastindex=0;
		int count=0;
		int preCount=0;
		int output[];
	    for(int i=1;i<input.length;i++)
	    {		 
	    	if(input[i-1]<input[i])
	    	{
	    		count++;
		
	    	}
	    	else
	    	{    
	    		if(preCount<count)
	    		{
	    			preCount=count;
	    			prefristindex=fristindex;
	    			prelastindex=i-1;
	    			fristindex=i;
				
	    		}
	    		else
	    		{
	    			fristindex=i;
	    		}
	    		count=0;
	    	} 
	    }
	    int j=0;
		if(count<preCount)
		{ 
			output=new int[prelastindex-prefristindex+1];
			for(int i=prefristindex;i<=prelastindex;i++)
			{ 
				output[j++]=input[i];
			}
		}
		else
		{   
			output=new int[input.length-fristindex]; 
			for(int i=fristindex;i<=input.length-1;i++)
				output[j++]=input[i];
			}
		return output;
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int input[]=new int[20];
		System.out.println("enter the elements in array");
		for(int count=0;count<20;count++)
		{
			input[count]=sc.nextInt();
		}
		Assignment3 assignment3=new Assignment3();
		int expetedOutput[]=assignment3.longestSequence(input);
		System.out.println("longest sequence in array is");
		for(int i=0;i<expetedOutput.length;i++)
		System.out.print(expetedOutput[i]+",");


	}
	
}
