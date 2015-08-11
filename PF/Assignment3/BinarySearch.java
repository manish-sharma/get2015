
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
	public static void  main(String args[]) {
		int no = 0, low = 0, high = 0, size1=0;
		int[] arr = null;
		try
		{
			System.out.println("Enter Array Size");
			Scanner sc = new Scanner(System.in);
			size1 = sc.nextInt();
			System.out.println("Enter the sorted Array ");
			arr = new int[size1];
			//array should be sorted;
			for(int i = 0; i < size1; i++){
				arr[i]= sc.nextInt();
			}	
			
			System.out.println(" Enter  Number ");	
			no = sc.nextInt();
			sc.close();
		}	
		catch(InputMismatchException e)// STRING EXCEPTION HENDLING;
		{ 
			System.out.println("Please Enter Only Integer Values");	
			main(args);	
		}
		
	// to print output is array present or not
		
		high = size1 - 1;
	    BinarySearch B= new BinarySearch();	
	    int out=B.binarySearch(arr, no, high, low);
	    
	    if(out != -1){
	    	System.out.println(" Number at position =" + out);
	    } else {
	    	System.out.println(" Number is not persent in array");
	    }
}
	
//method for binary search
	
	public int binarySearch(int[] arr, int no, int high, int low) {  
		// use  the logic of split array from mid point

		int mid = (high + low) / 2;
		if(low < high) {
			if( no == arr[mid]) {
				return mid + 1;
			} else if(no > arr[mid]){
				return binarySearch(arr, no, high, mid + 1);
			} else {
				return binarySearch(arr, no, mid - 1, low);
			}
		} else {
			return -1;
		}
	}
}