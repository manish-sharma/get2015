package programingFundamental3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchElement
{
	/** is a recursive function used to search element from given array
	 * 
	 * @param searchArray is the array from which element is to be find.
	 * @param searchElement is the element which is to be find.
	 * @param firstIndex is the firstIndex of array.
	 * @param lastIndex is the last index of array.
	 * @return the index of search element in array.
	 */
	public int linearSearchElement(int searchArray[] ,int searchElement,int firstIndex,int lastIndex)
	{
		
		if(firstIndex>lastIndex)         // when element is not found then return -1.
			return -1;
		else if(searchArray[firstIndex]==searchElement)
			return firstIndex+1;          // when element is found then return its index+1.
		
		return linearSearchElement(searchArray,searchElement,firstIndex+1,lastIndex);  //search with index increment.
	}
	
	/**
	 * is a recursion function used to search element by binary search algorithm.
	 * @param searchElement is the element which is to be find.
	 * @param firstIndex is the firstIndex of array.
	 * @param lastIndex is the last index of array.
	 * @return the index of search element in array.
	 */
	public int binarySearchElement(int searchArray[] ,int searchElement,int firstIndex,int lastIndex)
	{
		int mid=(firstIndex+lastIndex)/2;
		if(firstIndex>lastIndex)      //when firstindex is greater than lastindex than element is not found and it returns -1.
			return -1;
		
		if(searchArray[mid]==searchElement)     //if element is found than return the mid index.
		{
			return mid+1; 
		}
		else if(searchArray[mid]<searchElement)    //recursively call first half of array.
			return binarySearchElement(searchArray,searchElement,mid+1,lastIndex);
		else if(searchArray[mid]>searchElement)    // recursively call second half of array.
			return binarySearchElement(searchArray,searchElement,firstIndex,mid-1);
		return 0;
		
	}
	/** used to read input from user.
	 */
	public void readInput()
	{
		Scanner input=new Scanner(System.in);
		SearchElement obj=new SearchElement();
		int response = 0,result=0;
		int searchElement=0;
		System.out.println("enter 1 for linear search and 2 for binary search");
		try
		{
			response=input.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("only integer are acepted");
		}
		if(response==1)
		{
			System.out.println("enter the length of array");
			int length=input.nextInt();
			int[] array=new int[length];
			System.out.println("enter the elements of array");
			try
			{
				for(int count=0;count<length;count++)
				array[count]=input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integer are acepted");
			}
			System.out.println("enter the search element ");
			try
			{
				searchElement=input.nextInt();
				result=obj.linearSearchElement(array,searchElement,0,array.length-1);
				if(result==-1)
					System.out.println("Element is not found");
				else
					System.out.println("element found at location "+result);
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integer are acepted");
			}
			
		}
		if(response==2)
		{
			System.out.println("enter the length of array");
			int length=input.nextInt();
			int[] array=new int[length];
			System.out.println("enter the elements of array in sorted manner");
			try
			{
				for(int count=0;count<length;count++)
				array[count]=input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integer are acepted");
			}
			try
			{
				int flag=1;
				for(int count=1;count<array.length;count++)
				{
					if(array[count]<array[count-1])
						flag=0;
				}
				if(flag==0)
					System.out.println("enter sorted array next time while using binary search");
				else
				{
					System.out.println("enter the search element ");
					searchElement=input.nextInt();
					result=obj.linearSearchElement(array,searchElement,0,array.length-1);
					if(result==-1)
						System.out.println("Element is not found");
					else
						System.out.println("element found at location "+result);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integer are acepted");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		SearchElement obj=new SearchElement();
		int option=1;
		while(option==1)
		{
			obj.readInput();
			System.out.println("enter 1 to continue");
			try
			{
				option=input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integer are acepted");
				option=0;
			}
		}	
	}
}
