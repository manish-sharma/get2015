import java.util.*;
public class binarySearchUsingRecursion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		binarySearchUsingRecursion objectOfbiBinarySearchUsingRecursion=new binarySearchUsingRecursion();
		int sizeOfArray,number;		
		sizeOfArray=objectOfbiBinarySearchUsingRecursion.getsizeOfArray();
		int []inputArray=objectOfbiBinarySearchUsingRecursion.inputArray(sizeOfArray);
		number=objectOfbiBinarySearchUsingRecursion.getNumberToSearch();
		int position,lowerBound=0,upperBound=sizeOfArray-1;
		position=objectOfbiBinarySearchUsingRecursion.binarySearch(inputArray,number,lowerBound,upperBound);
		if(position>=0)
		{
			System.out.println(number+" is found at "+position);
		}
		
		else
		{
			System.out.println("Number does not exist in array");
		}
				
	}
	
	int getsizeOfArray()
	{
		//takes input size of array from console
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Size of Array :");
			number=sc.nextInt();
		}
		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
		
	}
	
	int[] inputArray(int size)
	{
		//takes array input from console

		int array[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements in sorted order : ");
		try
		{
			for(int i=0;i<size;i++)
			{
				array[i]=Integer.parseInt(sc.next());
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return array;
	}
	
	int getNumberToSearch()
	{
		//takes input a number to searcch in array

		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter number to be searched :");
			number=Integer.parseInt(sc.nextLine());

		}
		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
		
	}
	
	int binarySearch(int[] array,int num,int lowerBound,int upperBound)
	{
		//search element in array using binary search

		int mid=-1;
		if(lowerBound<=upperBound)
		{

			mid=(lowerBound+upperBound)/2; // find middle index of array
			if(num==array[mid])
			{
				// if middle element is same as number return its location

				return mid+1;
			}

			if(array[mid]>num)
			{
				//if number is greater then middle element then lower bound is pointed next to middle index

				upperBound=mid-1;
				return binarySearch(array,num,lowerBound,upperBound);
			}

			else
			{
				//if number is smaller then middle element then lower bound is pointed one before middle index

				lowerBound=mid+1;
				return binarySearch(array,num,lowerBound,upperBound);
			}
		}

		else 
		{
			//return location of number

			return mid;
		}

	}

}
