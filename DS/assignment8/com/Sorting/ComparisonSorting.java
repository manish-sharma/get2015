package com.Sorting;



/**
 * this class use to perform comparison sorting
 * @author Sumitra
 *
 */
public class ComparisonSorting  extends SortingSystem{
         /**
          * this method choose appropriate operation   to sort given array  
          * @return return sorted array
          * using either Quick Sort or Bubble Sort
          * if element are less than 10 then use bubble sort
          * Quick sort for large number of elements
          */
	public int[] sortComparison(int []arrayList1){
		int []arrayList = new int[arrayList1.length];
		arrayList = arrayList1;
		if(arrayList1.length<=10){
			arrayList =bubbleSort(arrayList1);
			flag=0;
		}
		else{
			arrayList=quickSort(arrayList1,0,arrayList1.length-1);
			flag=1;
		}
		return arrayList;
	}
/**
 * this method perform partition on given array to perform sorting according to pivot element
 * @param arr array to be sorted
 * @param low lowest index of array
 * @param high higher index of array
 * @return return next partition index
 */
	public int[] quickSort(int[] inputArray, int low, int high) {
       int  index = partition(inputArray, low, high);
        if (low < index - 1)
            quickSort(inputArray, low, index - 1);
        if (index < high)
            quickSort(inputArray, index, high);
        return inputArray;
    }

    /**
     * @Name : partition()
     * @Description : this function will divides the list into 2 halves and
     *              returns the index from where list is divided into 2 halves
     * @param : array(list of elements which has to be divided into 2 halves)
     * @param : low(index of leftmost element in list to be divided)
     * @param : high(index of rightmost element in list to be divided)
     * @return : i(index ,from where list is divided into 2 halves)
     */
    int partition(int array[], int low, int high) {
        int i = low, j = high;
        int tmp;
        int pivot = array[(low + high) / 2];

        while (i <= j) {
            while (array[i] < pivot && i<=high)
                i++;
            while (array[j] > pivot && j>=low)
                j--;
            if (i <= j) {
                array = swap(array, j, i);
                i++;
                j--;
            }
        }
        

        return i;
    }
    
    private int[] swap(int[] inputArray, int j, int k) {
        int temp;
        temp = inputArray[j];
        inputArray[j] = inputArray[k];
        inputArray[k] = temp;
        return inputArray;
    }

	/*	public int partition(int [] arr, int low,int high) {
			int pivot=arr[(low + high)/2];
			int i=low,j=high;
			while(i<=j)
			{
				while(arr[i]<pivot && i<=high)
				i++;
				while(arr[j] >pivot && j>=low)
					j--;
			
			if(i<=j)
			{
				int mid=arr[low];
				arr[low]=arr[high];
				arr[high]=mid;
			
			i++;
			j--;
			}
			}
			return i;
		}
		
	/**
	 * this method is use to perform Quick Sort recursively
	 * @param arrayList1 list of element to sort
	 * @param start start index of array
	 * @param end end index of array
	 * @return
	 */
	/*	public  int[] quickSort( int[] arrayList1 , int start, int end)
		{

		   if (start < end) //check if start index is smaller than last index
		   {
		       int partition = partition(arrayList1, start, end);//calling partition method
		       if(start<partition-1)//check start index is smaller than partition-1
		       	return quickSort(arrayList1, start, partition - 1);
		       //return array
		       if(end>partition)//check last index is greater than partition index
		          return quickSort(arrayList1, partition, end);
		   }
		   return arrayList1;
		}*/
		
	/**
	 * this method is used to small number of element
	 * this use bubble sort technique
	 * @return this return array in sorted form
	 */

	private int[] bubbleSort(int [] arrayList) {
		for(int i = 0; i<arrayList.length;i++){
			for(int k = 1; k < arrayList.length;k++){
				if(arrayList[k-1]>arrayList[k]){
					swapNumber(k-1,k,arrayList);
				}
			}
		}
		return arrayList;
	}
/**
 * this method interchange to value of array of given index
 * @param i first index
 * @param k second index
 */
	private void swapNumber(int i, int k,int[]arrayList) {
		int temp = arrayList[i];
		arrayList[i]=arrayList[k];
		arrayList[k]=temp;
	}
}
