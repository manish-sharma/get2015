package pf_assignment_3;

import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;
/**
* Java code to Sort integer array using QuickSort algorithm through recursion.
* Recursive QuickSort algorithm, partitioned list into two parts by a pivot element,
* and then recursively sorts each list.

*/
public class QuickSort
{
	/*
	 * partition method to sort the partition list by pivot element
	 * @pivotvalue pivot element
	 * @left lower bound of array	
	 * @right upper bound of array
	 * return partition index*/
	public static int partition(int[] array, int left, int right) 
	{
	    int pivotValue = array[(left+right)/2]; //first element as pivot
	    while (left <= right) 
	    {
	        while (array[left] < pivotValue)//search element less than pivot
	        {
	            left++;
	        }
	        while (array[right] > pivotValue) //search element greater than pivot
	        {
	            right--;
	        }
	        if (left <= right) 
	        {
	            /* swap code */
	            int temporary = array[left];
	            array[left] = array[right];
	            array[right] = temporary;

	            left++;
	            right--;
	        }
	    }
	    return left;
	}
	/*
	 * quickSort method to sort the input array by recursively calling partition method
	 * @start startindex of array	
	 * @end last end of array*/
	public  void quickSort(int[] array, int start, int end)
	{
		
	    
	   
	        int partition = partition(array, start, end);//calling partition method
	        if(start<partition-1)//check start index is smaller than partition-1
	        	 quickSort(array, start, partition - 1);
	        	
	        if(partition<end)//check last index is greater than partition index
	            quickSort(array, partition, end);
	    
	   
	}
/*
 * main method which sorts the input array*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			 {
					QuickSort object=new QuickSort();//class object
					Scanner sc =  new Scanner(System.in);
					System.out.println("Enter the length of array:");//input length of array
					int totalElements=sc.nextInt();
					if(totalElements==0)
					{
						System.out.println("Please Enter positive value");
					}
					else
					{
						int[] array=new int[totalElements];

						System.out.print("Enter the Array Elements");
						for(int i=0;i<totalElements;i++)
						{
							array[i]=sc.nextInt();// scan user array
						}
						int left=0;
						int right=array.length-1;
						object.quickSort(array,left,right);//method calling
						System.out.println("Sorted Elements are : ");
						for(int i=0;i<totalElements;i++)
						{
							System.out.print(array[i]+" ");//print sorted array
						}
					}
					
				}
	}}


