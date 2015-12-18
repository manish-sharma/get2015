import java.util.Scanner;


public class Assignment3
{
	
	static int[]  quickSort(int [] arr,int left,int right)   /* Function used For Perform Quick Sorting using recursion   */
	{
		
		int pv = partition(arr, left, right);

        
        if (left < pv - 1)                              /* Recursively call Quick sort to sort left part of the array*/
        {
        	quickSort(arr, left, pv - 1);
        }

        if (right > pv)                                  /* Recursively call Quick sort to sort right part of the array*/
        {
        	quickSort(arr, pv, right);
        }
		
        return arr;
	}
	
	static int partition(int[] arr,int left,int right)   /* Function Performing partitioning on array for Qui using recursion*/
	{
		int pivot=arr[left];
		
			
		while (left <= right) 
		{
			
            while (arr[left] < pivot)                 /*searching number which is greater than pivot from left side*/
            {
                left++;
            }
            
            while (arr[right] > pivot)            /*searching number which is greater than pivot from left side*/
            {
                right--;
            }

            
            if (left <= right)                      /* swap left and right side elements*/
            {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   int end;
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.print("Enter number of elments in array: ");
		   end=sc.nextInt();
		   
		   int unsortedArr[] =new int[end];
		   
		   System.out.print("Enter values of Unsorted array: ");
		   
		   for(int count=0;count<end;count++)
			   unsortedArr[count]=sc.nextInt();
		       
		   		   
		   int [] sortedArr=quickSort(unsortedArr,0,end-1);
		   
		   System.out.print("Sorted array is: ");
		   
		  for(int count=0;count<end;count++)
			 System.out.print(sortedArr[count]+"\t");
		   		  
		  sc.close(); 
		   
    }

}
