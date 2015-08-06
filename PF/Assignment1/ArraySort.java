import java.util.Scanner;

public class ArraySort
{
	public static void main(String[] args) 
	{
	   int size,i,status;
	   Scanner sc= new Scanner(System.in);	
	   System.out.println("Enter the size of array :");
	   size = Integer.parseInt(sc.nextLine());
	   System.out.println("Enter the array :");
	   int ip[]=new int[size];
	   for(i=0;i<size;i++)
	    	ip[i]=Integer.parseInt(sc.next());
	   ArraySort aso=new ArraySort();
	   status=aso.getVal(ip);
	   switch(status)
	   {
	      case 1: System.out.println("Array is in ascending order");
	              break;
	      case 2: System.out.println("Array is in descending order");
                  break;
	      case 0: System.out.println("Array is not sorted in any order");
                  break;
	   }
	}
	
	int getVal(int arr[])
	{
		int s=0,i;
		for(i=1;i<arr.length;i++)
		{
		   if(arr[i-1]>arr[i])
		   {
			   if(s==1)
			   {
				   s=0;
				   break;
			   }
			   s=2;
		   }
		   else if(arr[i-1]<arr[i])
		   {
			   if(s==2)
			   {
				   s=0;
				   break;
			   }
			   s=1;
		   }

		}
		return s;
	}
}

