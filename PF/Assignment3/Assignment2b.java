import java.util.Scanner;


public class Assignment2b 
{
	 static int binarySearch(int arr[],int element,int start,int end)    /*Recursive Function used For Binary Search  */
		{
		    
		    int mid=(start+end)/2;                                    //Finding middle element of array
		   if(start>end)                                              
		    {
				   return -1;
				   
			}
		   else if(element == arr[mid])                     // Searched  element found 
		   {
			   
			   return mid;
			  
		   }
		  else if(element < arr[mid])                    /* Recursively call BinarySearch to perform searching at left part of the array*/
		   {    
			   return binarySearch(arr,element,start,mid-1);
		
		   }
		   else if(element > arr[mid])                       /* Recursively call BinarySearch to perform searching at right part of the array*/
		   { 
			   return binarySearch(arr,element,mid+1,end);
			   
		   }
		   
		     return -1;
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
		   
		   int element,end,count;
		   		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.print("Enter number of elments in array: ");
		   end=sc.nextInt();
		   
		   int arr[] =new int[end];
		   
		   System.out.print("Enter values of array in acending order: ");
		   
		   for(count=0;count<end;count++)
		   {
		      arr[count]=sc.nextInt();
		   	   
		   }
		   
		   //Condition if user enter unsorted array 
		   
		 /*  for(count=0;count<end-1;count++)
		   {
		      if(arr[count]>arr[count+1])
		      {
			      System.out.print("Please Enter sorted  array Only");
			      return;
		      }
		   }*/
		   
		   System.out.print("Enter element which you want to search: ");
		   element=sc.nextInt();
		   
		   int status=binarySearch(arr,element,0,arr.length-1);
		   		   
		   if(status>=0)
		   {
		   System.out.print("Searched element "+element+" found at position: "+(status+1));
		   }
		   else
		   {
			   System.out.print("Searched element not found in given array ");
		   }
		   
		   sc.close();

		}

		
}
