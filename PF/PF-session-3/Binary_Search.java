/* this program is for searching an element
 * using binary search algorithm where 
 * input array must be sorted in asscending 
 * order .solve using recursion
 */
import java.util.Scanner;


public class Binary_Search {
	 int flag=0;
	public static void main(String args[])
	{
	 Scanner scan;
	 int n,i,element;
	 System.out.println("Enter total no. of elements in array");
	 scan = new Scanner(System.in);
	 n = Integer.parseInt(scan.nextLine());
	 int arr[]=new int[n];
	 System.out.println("Enter elements of array in SORTED MANNER");
	 for(i=0;i<n;i++)
	 {
		arr[i]=Integer.parseInt(scan.nextLine());//reading array elements 
	 }
	 
	 System.out.println("Enter element to be searched");
	 element = Integer.parseInt(scan.nextLine());
	 Binary_Search obj=new Binary_Search();
	 int low=0;
	 int high=n-1;
	 int res=obj.search(arr,element,low,high);//call search fn
	 if(res==0)
	 {
		 System.out.println("Element not found");
	 }
	 
	 else
	 {
		 System.out.println("Element found");
	 }
	}

	//this fn will return 1 if element found and return 0 if element not found
	public int search(int[] arr, int element, int low,int high) {
		// TODO Auto-generated method stub
		int mid;
		if(high<0 || low >arr.length-1){
			return 0;
		}
		
		if(low<=high)
		{
			mid=(low+high)/2;
			//this if -else if statement divides list ino 2 halves
			if(arr[mid]>element)
			{
				high=mid-1;;
			}
			else if(arr[mid]<element)
			{
				low=mid+1;
			}
			
			else 
			{
				flag=1;
				return flag;
			}
			
			
			
			
		}
		
		return search(arr, element, low, high);
		
	}

}
