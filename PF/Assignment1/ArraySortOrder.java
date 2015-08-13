// program to find sorting order of the array
import java.util.Scanner;

public class ArraySortOrder
{
	public static void main(String[] args) 
	{
		int arrSize, index, sortingOrder, arr[]=null;
	    Scanner sc = new Scanner(System.in);
	    ArraySortOrder obj = null;
        try
        {
        	System.out.println("Enter the size of array :");
    	    arrSize = Integer.parseInt(sc.nextLine());
    	    System.out.println("Enter the array :");
    	    arr = new int[arrSize];
    	    for(index=0; index<arrSize; index++)
    	    	arr[index] = Integer.parseInt(sc.next());
    	    obj = new ArraySortOrder();
    	    sortingOrder = obj.sortOrderOfArray(arr);
    	    switch(sortingOrder)
    	    {
    	    	case 1: System.out.println("Array is in ascending order");
    	                break;
    	        case 2: System.out.println("Array is in descending order");
                        break;
    	        case 0: System.out.println("Array is not sorted in any order");
                        break;
                default:System.out.println("Please enter the correct values in array");
                        break;
    	     }
	    }
        catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
			if(arr!=null)
				arr = null;
		}
        
	}
	
	
	
	int sortOrderOfArray(int arr[])
	{
		int sortOrder=0, index;
		
		if(arr==null)
			return 3;
		
		for(index=1; index<arr.length; index++)
		{
			if(arr[index-1]>arr[index])        // finds if array is decreasing
			{
				if(sortOrder==1)
				{
					sortOrder=0;
					break;
			    }
			    sortOrder=2;
		    }
		    else if(arr[index-1]<arr[index])   // finds if array is increasing
		    {
		    	if(sortOrder==2)
		    	{
		    		sortOrder=0;
				    break;
			    }
			    sortOrder=1;
		    }
		}
		return sortOrder;                      // returns sort order
	}
}
