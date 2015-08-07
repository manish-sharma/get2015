package assignment;
import java.util.*;

public class checkSorted 
{
	public  int isSorted(int[] a)
	{
		int flag=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
				flag=1;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			return 1;
		else
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			return 2;
		else
			return 0;
	}
		
			
			
	
	public static void main(String[] args)
	{
		
		int a[]={23,23,23,21,21};
		checkSorted ob=new checkSorted();
		int c=ob.isSorted(a);
		System.out.print(c);
	}

}
