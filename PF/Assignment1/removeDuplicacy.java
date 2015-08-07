package assignment;
import java.util.*;
public class removeDuplicacy
{
	public int[] removeDuplicate(int input[])
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
				int input[]=new int[10];
				System.out.println("Enter the elements of array");
				for(int i=0;i<10;i++)
				{
					input[i]=sc.nextInt();
				}
				removeDuplicacy object1=new removeDuplicacy();
				int output[];
				output=object1.removeDuplicate(input);
				for(int i=0;i<10;i++)
				{
					if(output[i]!='\0')
					System.out.print(output[i]);
				}

			}
		

	}

