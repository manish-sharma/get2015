// program to search location of a number in an array using Binary search
import java.util.Scanner;

public class BinarySearch 
{
	int position = 0;
	public static void main(String[] args)
	{
		int arr[]={}, arrSize, index, location = -2, item ,begin = 0, end = 0, mid = (begin+end)/2; 
		Scanner sc = new Scanner (System.in);
		BinarySearch obj = null;
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
		    end = arr.length-1 ;       // contains end location of array
		    
		    System.out.println("Enter the item to be searched :");
		    item = Integer.parseInt(sc.next());
		    
		    obj = new BinarySearch ();
		    
		    location = obj.binarySearch (arr, item, begin, end, mid);
		    //System.out.println("The item is found at position : "+location);
		    switch ( location )
		    {
		    	case -1 : System.out.println("The item is not found in the array.");
		    			  break;
		    	case -2 : System.out.println("The input array is empty.");
  			  			  break;
		    	default : System.out.println("The item is found at position : "+location);
  			  			  break;
		    }	    	
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
	

	int binarySearch ( int arr[], int item, int begin, int end, int mid )
	{	
		if(arr.length=='\0')
		{
			//throw new ArrayIndexOutOfBoundsException();
			return -2;
		}
		if( begin <= end )
		{
			mid = (begin+end)/2;           // set mid according to new begin or start
			if( item == arr[mid] )
				return mid+1;              // item is found at mid position
			else if ( item < arr[mid] )	   // used if item is present in left half
				return binarySearch (arr, item, begin, mid-1, mid);
			else                           // used if item is present in right half i.e   item > arr[mid]
				return binarySearch (arr, item, mid+1, end, mid);
		}
		else
			return -1;   // reached end of array but not found the item 
	}
}




