import java.util.*;
/*This class perform quick sort using recursive approach*
 * @parul joshi
 */
public class quickSort
{
	public static void main(String[] args) 
	{
		/*Initialize object of class to access methods of class in main.*/
		quickSort objectQuickSort=new quickSort();
		int arraySize;
		/*Input array size from user.*/
		arraySize=objectQuickSort.getSize();
		int[] inputArray=new int[arraySize];
		/*Input array elements from user.*/
		inputArray=objectQuickSort.inputArray(arraySize);
		int lowerBound=0,upperBound=arraySize-1;
		int sortedArray[]=objectQuickSort.quickSortUsingRecursion(inputArray,lowerBound,upperBound);
		/*Print sorted array. */
		System.out.println("Sorted Array is : ");
		for(int index=0;index<sortedArray.length;index++)
		{
			System.out.print(sortedArray[index]+"\t");
		}
	}
	
	/*Function takes array size as input from console.*/
	int getSize()
	{
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{ 		
			System.out.println("Enter size of array :");
			number=Integer.parseInt(sc.next());
		}
		catch(Exception e)
		{	
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}

	/*Function takes array element as input from user.It contains sise as parameter.*/
	int[] inputArray(int size)
	{
		int array[]=new int[size];
		if(size==0)
		{
			System.out.println("Array Size can not be zero");
			System.exit(0);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements  : ");
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

	/*Function perform quick sort using recursion.It contains 
	 * array,lowerBound and upperBound as parameter.*/
	int[] quickSortUsingRecursion(int[] array,int lowerBound,int upperBound)
	{
		if((lowerBound<0)&&(upperBound<0))
		{
					return array;
		}
		
		int index=partition(array,lowerBound,upperBound);
		
		/*For left partition.*/
		if(lowerBound<index-1)
		{	
			quickSortUsingRecursion(array, lowerBound, index-1);/*Recursion.*/
		}
		
		/*For right partition.*/
		if(upperBound>index)
		{	
			quickSortUsingRecursion(array, index, upperBound);/*Recursion.*/
		}
		
		return array;
	}
    
	/*Function partitons the array into smaller array so as to perform sorting among them using approach of
    * divide and conquor.Input array,left index and right index is passed as argument*/
	int partition(int[] array,int left,int right)
	{
		
		int pointer=array[left];
	    while(left<=right)
		{
			if(array[left]<pointer)
			{
				left++;
			}
			
			if(pointer<array[right])
			{
				right--;
			}
		
			if(left<=right)
			{
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
			
			}
		}
	    
		return left;
	}
}
