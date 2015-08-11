package programing_fundamental;

import java.util.*;

public class Assignment_5 {
	public int checkArraySort(int[] input)
	{	
		    if(input.length==1)
			return 1;
			if(input[0]<input[1])
			{
				for(int i=1;i<input.length-1;)
				{
					if(input[i]>input[i+1])
						return 0;
					else
						i++;
				}
				return 1;
			}
				
				if(input[0]>input[1])
				{
					for(int i=1;i<input.length-1;)
					{
						if(input[i]<input[i+1])
							return 0;
						else
							i++;
					}
				}
					return 2;
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
		Assignment_5 a5=new Assignment_5();
		int result=a5.checkArraySort(a);
		if(result==1)
			System.out.print("\n Array is in ascending order..");
		else if(result==2)
			System.out.print("\n Array is in descending order..");
		if(result==0)
			System.out.print("\n Array is not in any order..");
	}

}

