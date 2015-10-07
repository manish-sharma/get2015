/*this program is to search an 
 * element into given array using 
 * linear search algorithm
 */
import java.util.Scanner;


public class Linear_Search {
	
	
	public static void main(String args[])
	{
	 Scanner scan;
	 int n,i,element;
	 System.out.println("Enter total no. of elements in array");
	 scan = new Scanner(System.in);
	 n = Integer.parseInt(scan.nextLine());
	 int arr[]=new int[n];
	 System.out.println("Enter elements of array");
	 for(i=0;i<n;i++)
	 {
		arr[i]=Integer.parseInt(scan.nextLine());//reading array elements 
	 }
	 
	 System.out.println("Enter element to be searched");
	 element = Integer.parseInt(scan.nextLine());
	 Linear_Search obj=new Linear_Search();
	 int res=obj.search(arr,element,n-1);//call search fn
	 if(res==0)
	 {
		 System.out.println("Element not found");
	 }
	 
	 else
	 {
		 System.out.println("Element found");
	 }
	 
    }

	//this fn will return 0 if element not found and 1 if element found
	public int search(int[] arr,int element,int m) {
		// TODO Auto-generated method stub
		if (m < 0 ) 
	    {
	          return 0;
	    }
	    if(element == arr[m])
	    {
	           return 1;
	    } 
	   return search(arr,  element,m-1); 
	    
	}
}
