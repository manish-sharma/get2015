
public class BinarySearch {
/**This class implement the binary search functionality using recursion and implements a new function 
 * which looks for the leftmost and rightmost occurence of the key in a sorted array which can contain duplicate elements 
 * and if no such element exists then -1 
 * @param arr
 * @param start
 * @param end
 * @param key
 * @return mid element or -1
 * 
 *@author Shishir Pareek
 *Date 2nd September 2015
 */
	/**This function implements binary search recursively
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @param key
	 * @return elements position if found or -1 if not found
	 */
	public static int binarySearch(int arr[],int start,int end,int key)
	{
		if(start>end)//loop exceeds
		{
			return -1;
		}
		
		int mid=(start+end)/2;//finding mid element
		
		if(arr[mid]==key)//if mid element is equal to key 
		{
			return mid;
		}
		
		else if(arr[mid]>key)//if the key is smaller than mid element
		{
			return binarySearch(arr,start,mid-1,key);//recursive call to search in left sub-array
		}
		
		else
		{
			return binarySearch(arr,mid+1,end,key);//recursive call to search in right sub-array
		}
	}   
	    /*function to calculate right or left occurrence in the array*/
		public static int[]  leftRightOccurence(int arr[],int key)
		{
			if(arr == null)//if array is null
			{
				return null;
			}
		
			int firstMatch=binarySearch(arr,0,arr.length-1,key);
			int resultArray[] = {-1,-1};
			if(firstMatch == -1) //condition if value exists or not 
			{
				return resultArray;
			}
			
			int leftmost=firstMatch;
			int rightmost=firstMatch;
			/*result is initialized with the mid position of the left sub-array
			 * result is incremented by dividing every sub-array in more 
			 * Sub-array and calculating their mid positions 
			 * loop terminates when the value is not found and function return
			 * -1 
			 */
			for(int result = binarySearch(arr,0,leftmost-1,key);result!= -1;)
			{
				leftmost = result;
				result = binarySearch(arr,0,leftmost-1,key);
			}
			
			/*result is initialized with the mid position of the left sub-array
			 * result is incremented by dividing every sub-array in more 
			 * Sub-array and calculating their mid positions 
			 * loop terminates when the value is not found and function return
			 * -1 
			 */
			for(int result = binarySearch(arr,rightmost+1,arr.length-1,key);result!=-1;)
			{
				rightmost = result;
				result = binarySearch(arr,rightmost+1,arr.length-1,key);
			}
			
			resultArray[0]=leftmost;
			resultArray[1]=rightmost;
			
			return resultArray;
		}
	}