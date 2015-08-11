/****************************************************************************************
Name            : QuickSort
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to sort an given array using quick sort .
                :
****************************************************************************************/

import java.util.*;

public class QuickSort
{
    //@param arr array which is to be sorted
	//@param start starting index of array
	//@param end last index of array
	void sort(int arr[],int start,int end)
	{
    	int first=start;
		int last=end;
		int pivot=start;
    
		if(end!=-1)
		{
			if(start<=end)
			{
				while(first<last)
				{
					//if arr[i] is small than arr[pivot] and first is less than last index
		           	while(arr[first]<=arr[pivot] && first<end)
		           	{
		           		first++;    
				    }
		           	// checking that arr[pivot] is smaller than arr[last] and last is greater than smallest index
			        while(arr[last]>arr[pivot] && last>=start)
			        {
			        	last--;    
			        }
			        if(first<last) 
			        {
			        	swap(arr,first,last);
			        }
				}
		        swap(arr,last,pivot);
		    	sort(arr,start,last-1); 
		        sort(arr,last+1,end);
			}
		}
        
    }

    //@param inputarray is array of value
    //@param firstvalue has index of firstvalue 
    //@param secondvalue has index of secondvalue
    void swap(int inputarray[],int firstvalue,int secondvalue)
    {
        int temp=inputarray[firstvalue];
        inputarray[firstvalue]=inputarray[secondvalue];
        inputarray[secondvalue]=temp;
    }
    
    //Start of main
    public static void main(String args[])
    {
    	int count;
    	int start=0;
    	int size;
    	QuickSort object= new QuickSort();  
    	Scanner scan= new Scanner(System.in);
	    System.out.println("Enter size of array");
	    size=scan.nextInt();
	    int[] arr=new int[size];
	    System.out.println("Enter elements of array");
	    
	    for(count=0;count<size;count++)
	        {
	        arr[count]=scan.nextInt();
	        }
	    //Calling quickSort function
	    object.sort(arr, start, size-1);
	    //Displaying sorted array
	    System.out.println("Sorted elements of array");
	    for(count=0;count<size;count++)
	    	{
	    		System.out.print(arr[count]+" ");
	     	}
	    scan.close();      
	}
    //End of main
}
//End of class