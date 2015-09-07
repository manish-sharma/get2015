
/**
 *  This is a sorting system, which takes input from user and provide a sorted list.
 *  Here User could choose if he want to go with Comparison Sorting Or Linear Sorting.
 *  Given Conditions: 
 *     1 - For comparison sorting system will use Bubble Sort or Quick Sort techniques 
 *            (When less number of inputs (input elements <= 10) use Bubble Sort else Quicksort)
 *     2 - For linear sorting system will use Counting Sort or Radix Sort techniques 
 *            (When large inputs(more than 2 digit) use Radix Sort else Counting Sort)
 

 */
import java.util.LinkedList;
import java.util.Queue;



public class SortingSystem 
{ 
	int elementArray[];
	int sizeOfArray;
	int LargestElementInArray;
	final int DATA_VALUE_LIMIT_FOR_LINEARSORT = 99;
	final int DATA_VALUE_LIMIT_FOR_COMPARISIONSORT = 10;
	
	/**
	 * Constructor which initialize class level variable
	 * @param elementArray : array of numbers which is to be sorted
	 * @param size : size of array of numbers
	 * @param LargestElementInArray : largest element of array
	 */
	public SortingSystem(int[] elementArray, int size,int LargestElementInArray) {
		super();
		this.elementArray = elementArray;
		this.sizeOfArray = size;
		this.LargestElementInArray=LargestElementInArray;
		
	}
	
	
	
/**
 * This method sort the array of numbers using comparison Sort technique
 * @return : return sorted array
 */
	public int[] comparisionSort()
	{
		/* If itemArray is null or length of itemArray is zero
		 * then return -1
		 */
		if(elementArray == null || elementArray.length == 0)
			return null;
		
		/*
		 * if size of array is less then or equal to 10 then 
		 * use bubble sort to sort array of numbers
		 * otherwise use quick sort
		 */
		if(sizeOfArray <= DATA_VALUE_LIMIT_FOR_COMPARISIONSORT)
		{
			//call bubbleSort method
			bubbleSort();
		}
		else
		{
			//call quickSort method
			quicksort( 0, sizeOfArray-1);
		}
		
		return elementArray;
		
	}
	
	
	
	
    /**
     * Here we sort the array of numbers using linear sort technique.
     * @return
     */
	public int[] linearSort()
	{
		/* If itemArray is null or length of itemArray is zero
		 * then return -1
		 */
		if(elementArray == null || elementArray.length == 0)
			return null;
		/*
		 * if largest element of array is less then or equal to two digit number 
		 * then use counting sort to sort the array
		 * otherwise we use radix sort .
		 */
		if(LargestElementInArray <= DATA_VALUE_LIMIT_FOR_LINEARSORT)
		{
			countingSort();
		}
		else
		{
			radixSort();
		}
		return elementArray;
		
	}
	
	
	
	
	/**
	 * This method sort the array of numbers using Quick Sort Technique.
	 * @param lowerIndex : lower index of array of number
	 * @param higherIndex : higher index of array of number
	 */
	public void quicksort(int lowerIndex,int higherIndex)
	{
		 int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number as middle index number
	        int pivot = elementArray[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which 
	             * is greater then the pivot value, and also we will identify a number 
	             * from right side which is less then the pivot value. Once the search 
	             * is done, then we exchange both numbers.
	             */
	            while (elementArray[i] < pivot) {
	                i++;
	            }
	            while (elementArray[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	            	exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quicksort(lowerIndex, j);
	        if (i < higherIndex)
	            quicksort(i, higherIndex);
		
	}
	
	
	
	/**
	 * 
	 * @param i : the index of one element to be swapped.
	 * @param j : the index of the other element to be swapped. 
	 */
	private void exchangeNumbers(int i, int j) {
        int temp = elementArray[i];
        elementArray[i] = elementArray[j];
        elementArray[j] = temp;
    }
	
	
	
	
	/**
	 * This method is to sort the array of numbers using Bubble Sorting Technique
	 */
	public void bubbleSort()
	{
		/*
		 * compares each pair of adjacent items and swaps them if they are in the wrong order.
		 */
		
		int i=0,j=0;
		for (i=0 ; i < sizeOfArray ; i++)
		{
			for (j=0 ; j < sizeOfArray-i-1 ; j++)
			{
				if(elementArray[j] > elementArray[j+1])
				{
					exchangeNumbers(j, j+1);
				}
			}
		}
	}
	
	
	
	

	/**
	 * below method is to sort array of numbers using counting sort
	 */
	public void countingSort()
	{
		LargestElementInArray++;
		/*
		 * initialize count array whose size is equal to largest Element of given array
		 * and it will store count of each unique number of array
		 */
		int countArray[] = new int[LargestElementInArray];
		int i=0;
		
		/*
		 *set the value zero to all index of count array 
		 */
		for (i=0 ; i < LargestElementInArray ; i++)
		{
			countArray[i] = 0;
		}
		
		/*
		 * here for each element of given array we increase the value 
		 * of array at this index in count array by one
		 */
		
		for (i=0 ; i < sizeOfArray ; i++)
		{
			countArray[elementArray[i]]++;
		
		}
		i=0;
		int j=0;
		/*
		 * here we check for each index of count array,
		 * for each positive value we add the index number of countArray to given array
		 * and decrease the value at that index in count array by one
		 */
		while(i<LargestElementInArray)
		{
			while(countArray[i]!=0)
			{
				elementArray[j++]=i;
				countArray[i]--;
			}
			i++;
		}
		LargestElementInArray--;
	}
	
	
	
	
	
	/**
	 * below method is used to sort the array of numbers using radix sort
	 */
	public void radixSort()
	{
		
		int count=0;
		//store largest no of array in temp variable
		int temp=LargestElementInArray;
		//initialize array of queue
		Queue <Integer>[ ] buckets = (Queue<Integer>[])new Queue[10];
		
		for (int i = 0; i < 10; i++)
			buckets[i] = new LinkedList<Integer>();
		
		//here we count the no of digit in highest number of given array of numbers 
		//and store it in count variable
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		/*
		 * here we check the digit at ith position of each number of array 
		 * and store this number in ith bucket
		 * loop will execute for count no of times
		 */
		int i=0;
		for(i=1;i<=count;i++)
		{
			//for each value of i store numbers from array to buckets
			 buckets=toBucket(buckets,i);
			 //again store then in array
			 fromBucket(buckets);
		}
	}
	
	
	
	
	/**
	 * below method is use to store the no of array in given 
	 * bucket on basis of the number at ith position of each element of array
	 * @param buckets : its array of queue where element is to store
	 * @param i : this is for i th position of each element of array
	 * @return : return array of queue
	 */
	Queue <Integer>[ ] toBucket(Queue <Integer>[ ] buckets,int i)
	{
		//loop execute for each element of array
		for(int j=0;j<sizeOfArray;j++)
		{
			
			int digitAtIthPosition;
			//if the value of i is equal to one then we have to find right most digit of each number
			//then we calculate it by get remainder after divide by 10 
			if(i==1)
			{
				digitAtIthPosition=elementArray[j]%10;
			}
			else
			{
			//if the value of i is greater then one then we find the ith digit by
			//removing all digit at right side of this digit
			//and then finding remainder when it get divided by 10	
				int factor=(int) Math.pow(10, i-1);
				int no=elementArray[j]/factor;
				digitAtIthPosition=no%10;
				
			}
			//store the element in bucket
			buckets[digitAtIthPosition].add(elementArray[j]);
		}
		return buckets;
	}
	
	
	
	
	/**
	 * below method is use to retrieve value from buckets and store them in given array
	 * @param bucket : array of queue whose element is to be retrieved
	 */
	public void fromBucket(Queue <Integer>[ ]bucket)
	{
		int j=0;
		//here we remove value from each bucket and store them in array
		for(int i=0;i<10;i++)
		{
			//we retrieve numbers until buckets becomes empty
			while(!bucket[i].isEmpty())
			{
				elementArray[j++]=bucket[i].remove();
			}
			
		}
	}
    
	
	
	
	/**
	 * below method is to print the value of array 
	 */
	public void show()
	{
		int i=0;
		for(i=0;i<sizeOfArray;i++)
			System.out.print(elementArray[i]+"  ");
	}
	
}
