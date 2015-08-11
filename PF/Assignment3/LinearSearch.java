package pf_assignment_3;

import java.util.Scanner;
/*java code to search an element recursively by linear search algorithm*/
public class LinearSearch 
{
	public int linearSearch(int[] data,int key,int startingIndex)
	
	{ 
		/*method to search element lineraly
		 * @data input array
		 * @key element which is to be find
		 * @starting index starting index*/
		//int length=data.length;
		if(key==data[startingIndex])
			return startingIndex;//return index value
		else if (startingIndex+1 < data.length)
			return linearSearch(data, key, startingIndex+1);//recursively method calling
		return -1;//return -1 if element is not found
	}

	public static void main(String[] args) 
	{
		/*main method to search an element by linear search algorithm*/
		// TODO Auto-generated method stub
		LinearSearch ob=new LinearSearch();//class object
		Scanner sc=new Scanner(System.in);
		int[] linearArray=new int[7];
		System.out.println("enter the elements of array:");
		for(int i=0;i<7;i++)
		{
			linearArray[i]=sc.nextInt();//user array
		}
		System.out.println("enter the number which you have to find:");
		int key=sc.nextInt();//key element
		int output=ob.linearSearch(linearArray,key,0);//method calling
		if(output!=-1)
			System.out.println("The number is present at index:"+output);
		else
			System.out.println("The number is not present in the given array");
		
	}

}
