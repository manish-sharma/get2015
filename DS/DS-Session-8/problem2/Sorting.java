/*
 * DS-Seeion-8 Assignment
 * @authhor Banwari kevat
 */
public class Sorting {

	//This method take parameter list of integer array and return sorted integer array
	public int[] bubbleSort( int[] list )
	{          //current size contains last index of unsorted  list
		   int currentSize = list.length;
		   while(currentSize > 1)
		   {   
			   for(int i = 0 ; i < currentSize-1 ; i++)
		              {  //if next element is greater than current element than swap
		          	  if(list[i] > list[i+1])
		         	  {	  //swapping without using third variable
		     		        list[i]=list[i]+list[i+1];
			                list[i+1]=list[i]-list[i+1];
			               list[i]=list[i]-list[i+1];
			          }  
		              }
		       // reduce  list size by one because last element is reach at actual position	   
		      currentSize--;
		   }
		   return list;
	}
	
	/*
	 * Recursive method for quick sort
	 * @param list is the list which will be sorted
	 * @param start is the starting index of unsorted list
	 * @param last is the ending index of unsorted list
	 */
	//This method take parameter list of integer array and return sorted integer array
    public int[] quickSort( int[] list , int start, int last  )
	{      //if list contains more than 1 elements than sort
	       if( start < last)
	       {  
    	         int  pivot = start;
    	         //stored index point the element after next element will be greater than pivot 
    	         //than swap current element i and stored element 
	             int stored = pivot + 1;
	           
	             for(int i = pivot + 1; i <=last ; i++)
	             {     //if current element less than pivot than swap stored index element and 
	                	if( list[i] < list[pivot])
	    	            {
	    	               int temp = list[i];
	    	               list[ i ] = list[stored];
	    	               list[stored] = temp;
	    	               stored++;
	                    }
	                	
	             }
	             //swap pivot element to middle position where list is divided into two half
	             //one half is less than pivot and another half is greater than pivot
	             int temp = list[pivot];
	             list[pivot] = list[stored-1];
	             list[stored-1] = temp;
	          	 //Again apply quick sort recursively between two partition              
	             quickSort(list,start,stored-2);
	             quickSort(list,stored,last);
			 	 
	       }	
	       return list;
	}
    
    /*
     * Method for quick sort 
     * @param list is the list which will be sorted
     */
    public int[] quickSort(int [] list) 
    {   System.out.println("q");
    	return quickSort( list , 0 , list.length-1);	
    }
    
    /*
     * Method for counting sort
     * @param list is which will be sorted
     * @return sorted list 
     * @param max is the maximum element
     */
    public int []  countingSort( int[] list , int max)
    {   
    
    	max++;
        int N = list.length;
        if (N <= 1)
        {
        	return list;
        }
 
        //create count array of size max range of elements
        int[] count = new int[max];
        // storing frequency of each elements of list into count array
        for (int i = 0; i < N; i++)
            count[list[i]]++;
        
        // change count so that positions in final list is obtained
         for (int i = 1; i < max; i++)
            count[i] += count[i - 1];
        
        // modify original list
        int j = 0;
        for (int i = 0; i < max; i++)
            while (j < count[i])
                list[j++] = i ;
        return list;
    }    
    
    
    /*
     * Method for Radix sort
     * @param list is which will be sorted
     * @param max is the maximum element in the list 
     * @return sorted list
     */
      public int [] radixSort( int[] list, int max)
       {    
    	  
            int exponential = 1;
            int[] tempBucket = new int[10];
            //repeat this loop number of digit present in max 
            while (max /exponential > 0)
            {
                int[] bucket = new int[10];
                
                for (int i = 0; i < list.length; i++)
                {	//storing frequency of digit
                    bucket[(list[i] / exponential) % 10]++;
                }    
                for (int i = 1; i<10; i++)
                { 	
                    bucket[i] += bucket[i-1];
                }   
                for (int i = list.length - 1; i >= 0; i--)
                { 	
                	tempBucket[--bucket[( list[i] / exponential ) % 10]] = list[i];
                }	
                for (int i = 0; i < list.length; i++)
                {	
                	list[i] = tempBucket[i];
                }	
                exponential *= 10;        
            }
            return list;
       }    
 
      /*
       * This method for decision of sorting
       * @param list is the list which will be sorted
       * @pram type is the type for sorting
       */
      public int[] sort(int [] list, String type )
      {
    	  if( type.equals("1") )
    	  {   //if list length is less than 10 than apply bubble sort else quicksort 
    		  if( list.length <= 10)
    		  {
    			  return bubbleSort(list);
    		  }
    		  else
    			  return quickSort(list);
    	  }
    	  else
    	  {
    		  int max = list[0];
    		  //if max element is less than 100 than apply counting sort else radixsort 
    		  for(int i: list)
    		  {
    			  if( i > max )
    				  max = i;
    		  }
    		  
    		  if( max < 100)
    		  {
    			  return countingSort(list , max);
    		  }
    		  else
    			  return radixSort(list , max);
    		  
    	  }
      }
}
