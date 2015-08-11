import java.util.InputMismatchException;
import java.util.Scanner;
public class Binary_search {
	
	public static void  main(String args[]) {
		
		int no = 0,low=0,high=0;
		int [] arr = null;
		
		
		try
		{
			System.out.println("Enter Array Size");
			
			Scanner sc=new Scanner(System.in);//object of Scanner class
			
				high= Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Array ");
				
				arr=new int[high];
				
				for(int i=0;i<high;i++){
					
					arr[i]= Integer.parseInt(sc.nextLine());
				}
		
		
		System.out.println(" Enter  Number ");
		
		no=sc.nextInt();
				}
		
		catch(InputMismatchException e)// STRING EXCEPTION HENDLING;
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		// to print output is array present or not
		
     Binary_search B= new Binary_search();
		
		int out=B.binary_search(arr,no,high,low);
		if(out!=-1)
		System.out.println(" Number at position =" + out);
		else
			System.out.println(" Number is not persent in array");
	}
	//method for binary search
	public int binary_search(int [] arr,int no ,int high,int low)
	{ /* use  the logic of split array from mid point*/
		//array should be sorted;
		int mid=(high+low)/2;
		if(low<high)
		{
		if( no==arr[mid])
			return mid+1;
		else
		{
			if(no>arr[mid])
				return binary_search(arr,no,high,mid+1);
			else
				return binary_search(arr,no,mid-1,low);
		}
		
	}
		else
			return -1;
}
}