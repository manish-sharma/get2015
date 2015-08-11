package programing_fundamental;

import java.util.*;

public class assignment3 {
	public int[] longestSequence(int input[])
	{
		int n=input.length;
		int buff1[]=new int[n];
		int buff2[]=new int[n];
		int count1=1,count2=1;
		int k=0;
		int i,j,l;
		buff1[k]=input[0];
		for(i=0;i<n;)
		{
			k=0;
			buff2[k++]=input[i];
			for(j=i;j<n-1;j++)
			{
				if(input[j]>=input[j+1])
				{
					
					break;
				}
				buff2[k++]=input[j+1];
				count2++;
			}
			if(count2>count1)
			{
				for(l=0;l<count2;l++)
					buff1[l]=buff2[l];
				count1=count2;
			}
			i=i+count2;
			count2=1;
		}
		int b[]=new int[count1];
		for(i=0;i<count1;i++)
			b[i]=buff1[i];
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array");
		int a[]=new int[25];
		for(int i=0;i<25;i++)
		{
			a[i]=sc.nextInt();
		}
		assignment3 a3=new assignment3();
		int b[]=a3.longestSequence(a);
		int i;
		for(i=0;i<b.length;i++)
			System.out.print(b[i]);
	}

}

