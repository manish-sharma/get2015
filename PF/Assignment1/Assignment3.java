
public class Assignment3 {
	int []longestSequence(int input[])
	{ 
	  int firstindex=0;
	  int prefirstindex=0;
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
			  prefirstindex=firstindex;
			  prelastindex=i-1;
			  firstindex=i;
				
			}
		 else
		  {
			 firstindex=i;
	 	  }
		 
			count=0;
		}
		  
		  
	  }
	   int j=0;
		if(count<preCount)
		{ output=new int[prelastindex-prefirstindex+1];
		  
			for(int i=prefirstindex;i<=prelastindex;i++)
		{ output[j++]=input[i];
		
		}

	}
		else
		{   output=new int[input.length-firstindex]; 
			for(int i=firstindex;i<=input.length-1;i++)
				output[j++]=input[i];
			
			
			}
		return output;
	}

}
