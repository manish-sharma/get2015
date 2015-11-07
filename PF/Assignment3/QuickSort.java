package programingFundamental3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort
{
	/**is used to make partition of array the left sub-array contains element less than that of right sub-array. 
	 * @param array is to be sorted.
	 * @param left index of array.
	 * @param right index of array.
	 * @return index by which array is partitioned.
	 */
	public int partition(int array[], int left, int right)
	{
		int pivot=array[left];                //pivot is the first element of array through out the function it remains unchanged.
		
		while(left<=right)                    //check if left index does not cross right index.
		{
			while(array[left]<pivot)          //check left of array is less than pivot element.
				left++;
			while(array[right]>pivot)         // check right of element is grater than pivot element.
				right--;
			if(left<=right)                   //check for swapping of elements.
			{
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
				
			}
		}
		return left;
	}
	
	/** recursively call itself until the array is sorted.
	 * @param array which is to be sorted.
	 * @param left  index of array.
	 * @param right index of array.
	 */
	public int[] quickSort(int array[],int left,int right)
	{
		if(right==-1)         //in case of empty array.
			return array;
		
		int index=partition(array, left, right);
		
		if(left<index-1)
			quickSort(array,left,index-1);
		if(index<right)
			quickSort(array,index,right);
		
		return array;
		
	}
	
	/** used to read input from user.
	 */
	public void readInput()
	{
		Scanner input=new Scanner(System.in);
		QuickSort obj=new QuickSort();
		int length=0;
		try
		{
			System.out.println("enter the length of array");
			length=input.nextInt();

			int[] array=new int[length];
			System.out.println("enter the elements of array");
		
			for(int count=0;count<length;count++)
			array[count]=input.nextInt();
			int[] result=new int[length];
			result=obj.quickSort(array, 0, array.length-1);
			System.out.println("the sorted array is ");
			for(int count=0;count<length;count++)
				System.out.print(result[count]+", ");
		
		}
		catch(InputMismatchException e)
		{
			System.out.println("only integer are acepted");
		}
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		QuickSort obj=new QuickSort();
		int option=1;
		while(option==1)
		{
			obj.readInput();
			System.out.println("\n enter 1 to continue");
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
