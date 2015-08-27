// program to sort an array in ascending order using quick sort

import java.util.Scanner;
public class QuickSort 
{
	public static void main(String[] args) 
	{
		int arr[]={}, arrSize, index, left=0, right;
		Scanner sc = new Scanner (System.in);
		QuickSort obj = null;
		try
		{
			System.out.println("Enter the size of array :");
		    arrSize = Integer.parseInt(sc.next());
		    if(arrSize==0)
		    	throw new ArrayIndexOutOfBoundsException();
		    
		    System.out.println("Enter the array :");
		    arr = new int[arrSize];
		    	
		    for(index=0; index<arrSize; index++)
		    	arr[index] = Integer.parseInt(sc.next());
		    right = arr.length - 1;
		    
		    obj = new QuickSort ();
		    
		    int arr1[] = obj.quickSort (arr, left, right);
		    
		    System.out.println("The sorted array is : ");
		    for(index=0;index<arr1.length;index++)
		    	System.out.println(arr1[index]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if( sc != null )
				sc = null;
			if( obj != null )
				obj = null;
			if( arr != null )
				arr = null;
		}
	}

	
	int [] quickSort ( int arr[], int left, int right )
	{
//		if( (left<0) && (right<0) )				   // used when empty array is entered
//			return arr; 
		if (arr.length=='\0')
			return arr;
		int index = creatingPartition( arr, left, right ); 
		
		if (left < index - 1)                      // Apply quick sort on left partition of array 
			quickSort( arr, left, index - 1 );  
		  
		if (right > index) 						   // Apply quick sort on right partition of array
			quickSort( arr, index, right ); 
		
		return arr;                                // Return final sorted array
	}
	
	
	int creatingPartition(int arr[], int left, int right)
	{
		int pivot = arr[left];              	   // first element is the pivot
		while(left <= right) 				       // left should not cross right
		{ 
			while ( arr[left] < pivot )            // finding number which is greater than pivot, in left partition
				left++; 
			while ( arr[right] > pivot )           // finding number which is less than pivot, in right partition 
				right--;  
			if (left <= right)        		       // swap the values, left should not cross right
			{ 
				int tmp = arr[left]; 
				arr[left] = arr[right]; 
				arr[right] = tmp; 
				left++; 					       // increment left index 
				right--; 					       // decrement right index 
			} 
		} 
		return left;
    }
}
