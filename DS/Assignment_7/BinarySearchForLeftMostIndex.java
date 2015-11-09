package assignmentDS_7;
/**
 * program the binary search function and its loop invariants in a way so that it will always 
 * find the leftmost occurrence of x in the array in case the occurrences are not unique 
 * (if it is actually in the array, -1 as before if it is not).
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-3
 */


public class BinarySearchForLeftMostIndex
{
	/**
	 * below method is used to search the left most occurrence of element in a series using binary search
	 * @param arr : given array of numbers
	 * @param element : given element whose index is to find
	 * @param min : minimum index of array
	 * @param max : maximum index of array
	 * @return : position of the given element 
	 */
	public int binarySearch(int arr[],int element,int min,int max)
	{
		int index=0;  
		
		if(min>max)
		{
			return -1;
		}
		
		int mid=(min+max)/2;
		
		if(element<arr[mid])
		{
			index=binarySearch(arr,element,min,mid-1);
		}
		
		else if(element>arr[mid])
		{
			index=binarySearch(arr,element,mid+1,max);
		}
		
		else
		{
		    while(mid-1>0&&mid<arr.length&&element==arr[mid-1])
				  mid--;
		    return mid;
			
		}
		return index;
		
	}
	
	//main function
	public static void main(String args[])
	{
		BinarySearchForLeftMostIndex binarySearch=new BinarySearchForLeftMostIndex();
		int arr[]=new int[]{1,3,4,4,4,5,6,7,8,8,8};
		int index=binarySearch.binarySearch(arr, 8, 0, arr.length);
		System.out.println(" index is "+index);
	}
			
}
