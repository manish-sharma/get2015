import java.util.InputMismatchException;
import java.util.Scanner;
public class Linear_search {
	 int index=0;
	public static void  main(String args[]) {
		
		int no = 0,n=0;
		int [] arr = null;
		// try block to handle exception
		try
		{
			System.out.println("Enter Array Size");
			
			Scanner sc=new Scanner(System.in); //object of Scanner class
			
				n= Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Array ");
				
				arr=new int[n];
				
				for(int i=0;i<n;i++){
					
					arr[i]= Integer.parseInt(sc.nextLine());
				}
		
		
		System.out.println(" Enter  Number ");// no to be searched;
		
		no=sc.nextInt();
				}
		// catch to handle exception;
		catch(InputMismatchException e)
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		// print output element found or not
		Linear_search L = new Linear_search();
		
		int out=L.linear_search(arr,no);
		
		if(out!=-1)
		System.out.println(" Number at position =" + out);
		else
			System.out.println(" Number is not persent in array");
	}
	// method for linear searching;
	
	  int linear_search(int[] arr, int no)
	 {
			 if(index == arr.length)
			 {
		    return -1;
			}
			 
			 else 
			 {
				 if(arr[index]==no)
						return  index+1;
				 else
			 { index++;
				
			   return linear_search(arr, no);
		 }
			 
	 }
}
}
	
