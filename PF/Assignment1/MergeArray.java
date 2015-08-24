// program to merge two sorted arrays

import java.util.Scanner;

public class MergeArray 
{
	public static void main(String[] args) 
	{
		int lengthOfArr1=0, lengthOfArr2=0, lengthOfArr3=0, index, arr1[]={}, arr2[]={}, arr3[]={};
		MergeArray obj = null;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the length of I array :");
			lengthOfArr1 = Integer.parseInt(sc.next());
			
			System.out.println("Enter the I array :");
			arr1 = new int[lengthOfArr1];
			for(index=0; index<lengthOfArr1; index++)
			 	arr1[index] = Integer.parseInt(sc.next());
			
			System.out.println("Enter the length of II array :");
			lengthOfArr2 = Integer.parseInt(sc.next());
			
			System.out.println("Enter the II array :");
			arr2 = new int[lengthOfArr2];
			for(index=0; index<lengthOfArr2; index++)
				arr2[index] = Integer.parseInt(sc.next());
			
			lengthOfArr3 = lengthOfArr1 + lengthOfArr2;
			arr3 = new int[lengthOfArr3];
			
			obj = new MergeArray();
			arr3 = obj.join(arr1, lengthOfArr1, arr2, lengthOfArr2);
			
			for(index=0; index<lengthOfArr3; index++)
				System.out.println(arr3[index]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
			if(arr1!=null)
				arr1 = null;
			if(arr2!=null)
				arr2 = null;
			if(arr3!=null)
				arr3 = null;
		}
	}
	
	
	int[] join(int arr1[], int lengthOfArr1, int arr2[], int lengthOfArr2)
	{
		int  index1, index2, index3, lengthOfArr3=lengthOfArr1+lengthOfArr2;
		index1 = index2 = 0;
		int arr3[] = new int[lengthOfArr3]; // contains values merged from other arrays
		
		for(index3=0; index3<lengthOfArr3; )
		{
			if((index1<lengthOfArr1) && (index2<lengthOfArr2))
			{
				if(arr1[index1]<arr2[index2])    
				{
					arr3[index3] = arr1[index1];
					index1++;
				}
				else
				{
					arr3[index3] = arr2[index2];
					index2++;
				}
				index3++;
			}
			else if(index1==lengthOfArr1)    // if no elements are left in arr1 then insert all elements of arr2 in arr3
			{
				for( ; index3<lengthOfArr3; index3++)
				{
					arr3[index3] = arr2[index2];
					index2++;
				}
			}
			else   // if no elements are left in arr2 then insert all elements of arr1 in arr3
			{
				for( ; index3<lengthOfArr3; index3++)
				{
					arr3[index3] = arr1[index1];
					index1++;
				}
			}
		}
		return arr3;   
	}
}
