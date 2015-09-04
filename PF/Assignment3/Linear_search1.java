import java.util.InputMismatchException;
import java.util.Scanner;
public class Linear_search1 {
	
	public static void  main(String args[]) {
		
		int no = 0;
		int [] arr = null;
		
		try
		{
			System.out.println("Enter Array Size");
			
			Scanner sc=new Scanner(System.in);//object of Scanner class
			
				int n= Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Array ");
				
				arr=new int[n];
				
				for(int i=0;i<n;i++){
					
					arr[i]= Integer.parseInt(sc.nextLine());
				}
		
		
		System.out.println(" Enter  Number ");
		
		no=sc.nextInt();
				}
		
		catch(InputMismatchException e)
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		Linear_search1 L = new Linear_search1();
		
		int out=L.linear_search(arr,no);
		if(out!=-1)
		System.out.println(" Number at position =" + out);
		else
			System.out.println(" Number is not persent in array");
	}
	 public int linear_search(int[] arr, int no)
	 {int i=0;
		 if(arr[i]==no)
		 return i;
		 else
			{
			 if(i<arr.length)
			 {
				i++;
		 linear_search(arr,no);
			}
		 else
			 return -1;
	 }
}
}
	