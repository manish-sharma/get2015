package programing_fundamental;

import java.util.*;

public class assignment2 {
	public int[] removeDuplicate(int input[])
	{
		int n=input.length-1;
		
		int i,j,k;
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<=n;j++)
			{
				if(input[i]==input[j])
				{
					for(k=j;k<n;k++)
						input[k]=input[k+1];
					n--;
					j--;
				}
			}	
		}
		int b[]=new int[n+1];
		for(i=0;i<=n;i++)
		{
			b[i]=input[i];
		}
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array");
		int a[]=new int[14];
		for(int i=0;i<14;i++)
		{
			a[i]=sc.nextInt();
		}
	
		assignment2 a2=new assignment2();
		int b[]=a2.removeDuplicate(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}
	

}

