import java.util.*;
/*This class perform binary search using recursive approach*
 * @parul joshi
 */
public class binarySearchUsingRecursion
{
	public static void main(String[] args) 
	{
		/*Initialze object of class to call function of class.*/
		binarySearchUsingRecursion objectOfbiBinarySearchUsingRecursion=new binarySearchUsingRecursion();
		int sizeOfArray,numberToSearch;		
		/*Input array size from user.*/
		sizeOfArray=objectOfbiBinarySearchUsingRecursion.getsizeOfArray();
		/*Input array elements from user.*/
		int []inputArray=objectOfbiBinarySearchUsingRecursion.inputArray(sizeOfArray);
		/*Input number to be search from user.*/
		numberToSearch=objectOfbiBinarySearchUsingRecursion.getNumberToSearch();
		int position,lowerBound=0,upperBound=sizeOfArray-1;
		position=objectOfbiBinarySearchUsingRecursion.binarySearch(inputArray,numberToSearch,lowerBound,upperBound);
		/*If number exist in array print its location.*/
		if(position>0)
		{
			System.out.println("Number"+numberToSearch+" is found at location "+position);
		}
		/*Element does not exist in array.*/
		else
		{
			System.out.println("Number does not exist in array");
		}		
	}
	
	/*Function takes input size of array from console.*/
	int getsizeOfArray()
	{
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
	
	/*Function takes input array elements from console.
	 * It contain size as parameter*/
	int[] inputArray(int size)
	{
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
	
	/*Function takes a number as input to search in array from user.It contain size as parameter.*/
	int getNumberToSearch()
	{
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
	
	/*Function has to perform binary search using recursion.
	 * It contains array, number,lowerBound and upperBound as
	 * parameter.*/
	int binarySearch(int[] array,int numbertosearch,int lowerBound,int upperBound)
	{
		int mid=0;/*If element does not exist return location 0.*/ 
		if(lowerBound<=upperBound)
		{
			/*Calculating middle element of array.*/
			mid=(lowerBound+upperBound)/2; 
			if(numbertosearch==array[mid])
			{
				/*If middle element is same as number return its location.*/
				return mid+1;
			}
			
			if(array[mid]>numbertosearch)
			{
				/*If number is greater then middle element then lower bound is pointed next to middle index.*/				upperBound=mid-1;
				return binarySearch(array,numbertosearch,lowerBound,upperBound);//Recursion.
			}
			else
			{
				/*If number is smaller then middle element then lower bound is pointed one before middle index.*/
				lowerBound=mid+1;
				return binarySearch(array,numbertosearch,lowerBound,upperBound);//Recursion.
			}
		}
		else 
		{
			/*Return location of number.*/
			return mid;
		}
	}
}
