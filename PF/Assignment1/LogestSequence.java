import java.util.Scanner;


public class LogestSequence
{
	static int[] longestSequence(int input[])
	{
		
		int output[]=new int[25];
		int max=0,count=0,pos=0,p=0;
		for(pos=0;pos<=input.length-1;pos++)
		{
			if((pos==input.length-1)||((input[pos]>input[pos+1])))
			{
			    count=count+1; 
				if(count>max)
				{
				   max=count;
				   p=pos+1-max;
				}
				count=0;
			}
		    else if((input[pos]<input[pos+1]))
			{
				count=count+1;
			}
		}
		int i;
		for(i=0,pos=p;pos<=p+max-1;pos++,i++)
		{
			output[i]=input[pos];
		}
		return output;
	}


	public static void main(String[] args) 
	{
	int input[]={1,2,3,4,5,6,5,4,3,1,7};
	int output[]=new int[25];
	int i;
   
    
    output=longestSequence(input);
    
    for(i=0;output[i]!=0;i++)
    	System.out.println(output[i]);
	}
	

}
