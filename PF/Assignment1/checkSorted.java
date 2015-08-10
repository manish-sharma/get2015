package assignment;
import java.util.*;

public class checkSorted //class to check the sorting
{
	public  int isSorted(int[] a) //method to check the array is sorted or not
	{
		int flag=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<=a[i+1])
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			return 1;// return when array is ascending order
		else
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>=a[i+1])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			return 2;//return 2 when array is decending order
		else
			return 0;// when array is nor sorted
	}
		
			
			
	
	public static void main(String[] args)
	{
		
		int inputArray[]={21,22,23,25,25};//input array
		checkSorted ob=new checkSorted();
		int outputArray=ob.isSorted(inputArray);//method calling to check whether array is sorted or not
		System.out.print(outputArray);// print the vale 1 for ascending,2 for descending,0 for not sorted
	}

}
