package pf_assignment_3;

import java.util.Scanner;
/*java code to search an element recursively by binary search algorithm*/
public class BinarySearch 
{
	public int recursiveBinarySearch(int[] array,int startIndex,int lastIndex,int key)
	{
		/*method to search element by binary search algorithm
		 * @array input array
		 * @startIndex starting index
		 * @lastIndex last index value
		 * @key element which is to be found
		 * @mid middle value of starting and the last index*/
		int mid;
		if(startIndex<lastIndex)//check startindex is smaller than last index
		{
			mid=(startIndex+lastIndex)/2;
			if(key==array[mid])
				return mid;
			else if(key<array[mid])
				return recursiveBinarySearch(array, startIndex, mid, key);//method calling recursively if key element is smaller than middle element
			else if (key>array[mid])
				return recursiveBinarySearch(array, mid+1, lastIndex, key);//method calling recursively if key element is greater than middle element
		
		}
		return -1;//return -1 if element is not to found
	}

	public static void main(String[] args) 
	{
		/*main method to call binary search method*/
		// TODO Auto-generated method stub
		BinarySearch ob=new BinarySearch();//class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array:");
		int[] inputArray=new int[7];
		for(int i=0;i<7;i++)
		{
			inputArray[i]=sc.nextInt();//scan the user array
		}
		System.out.println("enter the key you want to search:");//scan the key element
		int key=sc.nextInt();
		int index=ob.recursiveBinarySearch(inputArray, 0, inputArray.length, key);//method calling
		if(index!=-1)
			System.out.println("The number is present at index:"+index);
		else
			System.out.println("The number is not present in the given array");
		

	}

}
