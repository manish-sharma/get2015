import java.util.*;
public class linearSearchUsingRecursion {
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		linearSearchUsingRecursion objectOfliLinearSearchUsingRecursion=new linearSearchUsingRecursion();
		int sizeOfArray;
		sizeOfArray=objectOfliLinearSearchUsingRecursion.getsizeOfArray();
		int inputArray[]=objectOfliLinearSearchUsingRecursion.inputArray(sizeOfArray);
		int number=objectOfliLinearSearchUsingRecursion.getNumberToSearch();
		int position;
		
		position=objectOfliLinearSearchUsingRecursion.linearSearch(number,inputArray,sizeOfArray-1);
		if(position>=0)
		{
			//number exist in array print its location

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
			//if size is not positive integer number repeat the loop

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
	
	int[] inputArray(int size)
	{
		//takes input elements of array from console

		int array[]=new int[size];
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
	
	int getNumberToSearch()
	{
		//takes input number to be searched 

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
	
	int linearSearch(int num,int[] array,int size)
	{
		//search number using linear search

		int location=-1;
		if(size<0)
		{
			//if number does not exist in array return location -1
			return -1;

		}
		
		if(size>=0)
		{
			//traversing array from last position to start
			if(array[size]==num)
			{
				//if number is same as array index location will be updated

				location=size+1;

			}
			
			else
			{
				//if number not matchesfunction will call itself with size-1

				location=linearSearch(num,array,size-1);

			}

		}

		return location;
	}

}
