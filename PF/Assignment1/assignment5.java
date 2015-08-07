package programing_fundamental;

import java.util.*;

public class assignment5 {
	public int checkArraySort(int[] input)
	{
		int i,j,flag=0;
		
		if(input.length==1)
			return 1;
		for(i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[j]<input[i])
					flag=1;
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			return 1;
		flag=0;
		for(i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[j]>input[i])
					flag=1;
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			return 2;
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("\n Enter Size of an array : ");
		size=sc.nextInt();
		int a[]=new int[size];
		int i;
		System.out.println("\n Enter Elements : ");
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		assignment5 a5=new assignment5();
		int b=a5.checkArraySort(a);
		if(b==1)
			System.out.print("\n Array is in ascending order..");
		else if(b==2)
			System.out.print("\n Array is in descending order..");
		if(b==0)
			System.out.print("\n Array is not in any order..");
	}

}

