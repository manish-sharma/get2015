

import java.util.Arrays;
 
public class LongestSequence 
{

	
	int k=0;

	int count = 1;  int max = 1;int start=0;int last=0;
String longest(int a[])
{
	
	for (int i = 1; i < a.length; i++) 
	{
	    if (a[i] >= a[i - 1]) 
	    {   
	        last=i;
	        count++;
	    } 
	    else {
	        if (count > max)
	        {
	            max = count;
	        }
	        count = 1;
	        start=i;
	    }
	}

	int[] b=new int[max];
	for(int i=start;i<=last;i++)
	{   b[k]=a[i];
	    k++;
		 
		
	}
	System.out.println(Arrays.toString(b));
	return Arrays.toString(b);
 }

}

 
