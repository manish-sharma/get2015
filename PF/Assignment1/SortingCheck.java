import java.util.Scanner;


public class SortingCheck 
{
	
	static int sortingCheck(int arr[])
	{
		int staus=0,count;
		for(count=1;count<arr.length;count++)
		{
		   if(arr[count-1]>arr[count])
		   {
			   if(staus==1)
			   {
				   staus=0;
				   break;
			   }
			   staus=2;
		   }
		   else if(arr[count-1]<arr[count])
		   {
			   if(staus==2)
			   {
				   staus=0;
				   break;
			   }
			   staus=1;
		   }
		}
		return staus;
	}
	
	public static void main(String[] args) 
	{
	   int size,i,status;
	   Scanner sc= new Scanner(System.in);	
	   System.out.println("Enter no of elements in array :");
	   size = Integer.parseInt(sc.nextLine());
	   
	   System.out.println("Enter array elements:");
	   int ip[]=new int[size];
	   
	   for(i=0;i<size;i++)
	    	ip[i]=Integer.parseInt(sc.next());
	   
	   
	   status=sortingCheck(ip);
	   
	   if(status==1)
	   {
		   System.out.println("Ascending order Array");
	   }
	   else if (status==2)
	   {
		   System.out.println("Descending order Array");
   	   }
	   else
	   {
		   System.out.println("Array is not sorted ");
	   }
	}

}
