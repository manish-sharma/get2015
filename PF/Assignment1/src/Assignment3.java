public class Assignment3 { 
	
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
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		Assignment3 assignment3=new Assignment3();
		int expetedOutput[]=assignment3.longestSequence(input);
		for(int i=0;i<expetedOutput.length;i++)
		System.out.print(expetedOutput[i]);


	}
	
}
