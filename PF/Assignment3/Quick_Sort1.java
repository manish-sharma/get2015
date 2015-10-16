import java.util.InputMismatchException;
import java.util.Scanner;
public class Quick_Sort1 {

	public static void main(String[] args) {
		int [] array= null;
		int  totalElements=0;
		Quick_Sort1 object=new Quick_Sort1();
		try{
		
		Scanner sc =  new Scanner(System.in); // scanner class;
		
		System.out.print("Enter the lenght of array");
		 totalElements=sc.nextInt();
		
		if(totalElements==0){
			System.out.println("Please Enter positive value");// warning!!
		}
		
		else{
			 array=new int[totalElements];

			System.out.print("Enter the Array Elements");
			
			for(int i=0;i<totalElements;i++){
				array[i]=sc.nextInt();
			}
		}
		}
		catch(InputMismatchException e)// STRING EXCEPTION HENDLING;
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
			// to show output;
			int left=0;
			int right=array.length-1;
			
			object.quickSort(array,left,right);
			System.out.println("Sorted Elements are : ");
			
			for(int i=0;i<totalElements;i++){
				System.out.println(array[i]);
			}
		}
		
	
// method to divide array into subproblems and conquer;
	int partition(int arr[], int left, int right)
	{// to use swap to sort;
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	// Divide into sub array to sort; 
	
	void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}

}