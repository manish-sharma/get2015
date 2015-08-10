package assignment;
import java.util.*;
public class removeDuplicacy
{
	public int[] removeDuplicate(int input[])
	//function to remove duplicacy in the given array
	{
		int end = input.length;

	    for (int i = 0; i < end; i++) 
	    {
	        for (int j = i + 1; j < end; j++)
	        {
	            if (input[i] == input[j])
	            {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++)
	                {
	                    input[shiftLeft] = input[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    for(int i = 0; i < end; i++)
	    {
	        whitelist[i] = input[i];
	    }
	    return whitelist;
	}
	


	public static void main(String[] args)
	{
		
				Scanner sc=new Scanner(System.in);
				//scanner class to make input
				int input[]=new int[10];
				System.out.println("Enter the elements of array");
				for(int i=0;i<10;i++)
				{
					input[i]=sc.nextInt();
				}
				removeDuplicacy object1=new removeDuplicacy();
				// obj is removeDuplicat class
				int output[];
				output=object1.removeDuplicate(input);
				// function called to remove duplicacy
				for(int i=0;i<output.length;i++)
				{
					if(output[i]!='\0')
					System.out.print(output[i]);
					
			// to print new array without duplicacy
				}

			}
		

	}

