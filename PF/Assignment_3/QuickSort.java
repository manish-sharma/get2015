import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		QuickSort object = new QuickSort();
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the lenght of array");
		int size1 = sc.nextInt();
		if(size1 == 0){
			System.out.println("Please Enter positive value");
		}
		else{
			int[] array = new int[size1];

			System.out.print("Enter the Array Elements");
			for(int i = 0; i < size1; i++){
				array[i] = sc.nextInt();
			}
			int left = 0;
			int right = array.length - 1;
			object.quickSort(array, left, right);
			System.out.println("Sorted Elements are : ");
			for(int i = 0; i < size1; i++){
				System.out.println(array[i]);
			}
		}
		sc.close();
	}
	
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
	 
	void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}

}