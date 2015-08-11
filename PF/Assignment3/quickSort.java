import java.util.*;
public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		quickSort objectQuickSort=new quickSort();
		int arraySize;
		arraySize=objectQuickSort.getSize();
		int[] inputArray=new int[arraySize];
		inputArray=objectQuickSort.inputArray(arraySize);
		int lowerBound=0,upperBound=arraySize-1;
		int sortedArray[]=objectQuickSort.quickSortUsingRecursion(inputArray,lowerBound,upperBound);
		System.out.println("Sorted Array is : ");
		for(int index=0;index<sortedArray.length;index++)
		{
			System.out.print(sortedArray[index]+"\t");
		}
	}
	
	int getSize()
	{
		//takes size input from console

		int number;
		Scanner sc=new Scanner(System.in);
		do
		{ 
			//if size is less than zero repeats process
		
			System.out.println("Enter size of array :");
			number=Integer.parseInt(sc.next());

		}while(number<0);
		
		return number;
		
	}

	int[] inputArray(int size)
	{
		//takes array input from console
		
		int array[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements  : ");
		for(int i=0;i<size;i++)
		{
			array[i]=Integer.parseInt(sc.next());
		}
		
		return array;
	}

	int[] quickSortUsingRecursion(int[] array,int lowerBound,int upperBound)
	{
		if((lowerBound<0)&&(upperBound<0))
		{
			//if array is empty return input
			return array;
		}
		
		int index=partition(array,lowerBound,upperBound);
		if(lowerBound<index-1)
		{
			//used for left partition
			
			quickSortUsingRecursion(array, lowerBound, index-1);
		}
		
		if(upperBound>index)
		{
			//uesd for right partition
			
			quickSortUsingRecursion(array, index, upperBound);
		}
		
		return array;
		
	}

	int partition(int[] array,int left,int right)
	{
		
		int pointer=array[left];
	    while(left<=right)
		{
			while(array[left]<pointer)
			{
				left++;
			}
			
			while(pointer<array[right])
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
