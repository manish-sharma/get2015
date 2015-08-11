import java.util.InputMismatchException;
import java.util.Scanner;
public class LinearSearch {
	int index = 0;
	public static void  main(String args[]) {		
		int no = 0, n = 0;
		int [] arr = null;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Array Size");			
			n= sc.nextInt();
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
		finally{
			sc.close();
		}
		LinearSearch L = new LinearSearch();		
		int out=L.linearSearch(arr, no);		
		if(out != -1){
			System.out.println(" Number at position =" + out);
		} else {
			System.out.println(" Number is not persent in array");
		}
	}
	
	int linearSearch(int[] arr, int no) {		
			 if(index == arr.length) {
				 return -1;
			} else {
				 if(arr[index] == no){
					return  index + 1;
				 } else {
					 index++;				
					 return linearSearch(arr, no);
				 }
			}
	}
}
	