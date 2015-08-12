import java.util.*;
/*This class perform linear search using recursive approach*
 * @parul joshi
 */
public class linearSearchUsingRecursion 
{	
	public static void main(String[] args)
	{
		/*Initialize object of class to access methods of class in main.*/
		linearSearchUsingRecursion objectOfliLinearSearchUsingRecursion=new linearSearchUsingRecursion();
		int sizeOfArray;
		/*Input array size from user.*/
		sizeOfArray=objectOfliLinearSearchUsingRecursion.getsizeOfArray()
		/*Input array elements from user.*/;
		int inputArray[]=objectOfliLinearSearchUsingRecursion.inputArray(sizeOfArray); 
		/*Input number to be search from user.*/
		int number=objectOfliLinearSearchUsingRecursion.getNumberToSearch();
		int position;
		position=objectOfliLinearSearchUsingRecursion.linearSearch(number,inputArray,sizeOfArray-1);
		/*if number esist in array print its location.*/
		if(position>=0)
		{
			//number exist in array print its location
			System.out.println("Element "+number+" is found at location "+position);
		}
		/*Element is not present in array*/
		else
		{
			System.out.println("Element does not exist in array");
		}	
	}
	
	/*Function takes array size as input from console.*/
	int getsizeOfArray()
	{
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{	
			System.out.println("Enter Size of Array :");
			number=Integer.parseInt(sc.nextLine());	
		}
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}
	
	/*Function takes array elements as input from user.It contain size as parameter. */
	int[] inputArray(int size)
	{
		//takes input elements of array from console
		int array[]=new int[size];
		/*Condition to check array is empty.*/
		if(size==0)
		{
			System.out.println("Array Size can not be zero");
			System.exit(0);
		}
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
	
	/*Function takes number to be search as input from user.*/
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
	
	/*Function has to perform linear search using recursion.
	 * It contains number,array and size as
	 * parameter.*/
	int linearSearch(int num,int[] array,int size)
	{
		int location=-1;
		/*Condition to check size becomes smaller than lower bound of array that means 
		 * element is not present in array*/
		if(size<0)
		{
				return -1;
		}
		
		if(size>=0)
		{
			/*If number is same as last element of array return its location*/
			if(array[size]==num)
			{
				location=size+1;
			}
			else if(num<array[size])
			{
				/*for case of sorted array if number is smaller than 
				 * last element function calls itself otherwise exit.*/
				location=linearSearch(num,array,size-1);
			}
			else
			{
				return -1;
			}
		}
			
		return location;
	}
}
