/*this program is to sort input array recursively
 * using quick sort algorithm
 */
import java.util.Scanner;


public class QuickSort1 {
	public static void main(String[] args) {
		QuickSort1 object=new QuickSort1();
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the lenght of array");
		int totalElements=sc.nextInt();
		if(totalElements==0){
			System.out.println("Please Enter positive value");
		}
		else{
			int[] array=new int[totalElements];

			System.out.print("Enter the Array Elements");//reading elements of array
			for(int i=0;i<totalElements;i++){
				array[i]=sc.nextInt();
			}
			int left=0;
			int right=array.length-1;
			object.quickSort(array,left,right);//call quickSort fn
			System.out.println("Sorted Elements are : ");
			for(int i=0;i<totalElements;i++){
				System.out.println(array[i]);
			}
		}
		
	}
	
	//this fn will divides the list ino 2 halves
	int partition(int arr[], int left, int right)
	{
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
	
	//this will call partition fn and it will return sorted array
	void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}


}
