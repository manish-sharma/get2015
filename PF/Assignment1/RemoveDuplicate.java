 package RemoveDuplicate;

//import java.util.Scanner;
class RemoveDuplicate
{
	int[] removeDuplicate(int input[])
	{
		int flag[]=new int[10];
		int size=0;
		int output[]=new int[10];
		//System.out.println("Reduced array is \n");
		for(int index=0;index<input.length;index++)
		{
			if(flag[input[index]]==0)
			{
			
				output[size]=input[index];
				//System.out.println(output[index]+"\n");
				flag[input[index]]=1;
				size++;
			}
		}
		
		return output;
		
		
	}
 
	public static void main(String args[])throws Exception
	{  
  		  
		
	
 	}  
} 
