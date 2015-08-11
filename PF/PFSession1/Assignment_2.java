package programing_fundamental;

import java.util.*;

public class Assignment_2 {
	public int[] removeDuplicate(int input[])
	{
		int size=input.length-1;
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<=size;)
			{
				if(input[i]==input[j])
				{
					for(int k=j;k<size;k++)
						input[k]=input[k+1];
					size--;
				}
				else
				{
					j++;
				}
			}	
		}
		int b[]=new int[size+1];
		for(int i=0;i<=size;i++)
		{
			b[i]=input[i];
		}
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter an array");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
	
		Assignment_2 a2=new Assignment_2();
		int b[]=a2.removeDuplicate(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}
	

}

