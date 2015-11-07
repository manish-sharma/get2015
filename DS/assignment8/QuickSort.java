package ds8;

import java.util.List;

/**this class holds the function of quick sort
 * @author Khemanshu
 *
 */
public class QuickSort {

	/**is used to make partition of array the left sub-array contains element less than that of right sub-array. 
	 * @param array is to be sorted.
	 * @param left index of array.
	 * @param right index of array.
	 * @return index by which array is partitioned.
	 */
	public int partition(List<Integer> list, int left, int right)
	{
		int pivot=list.get(left);                //pivot is the first element of array through out the function it remains unchanged.
		
		while(left<=right)                    //check if left index does not cross right index.
		{
			while(list.get(left)<pivot)          //check left of array is less than pivot element.
				left++;
			while(list.get(right)>pivot)         // check right of element is grater than pivot element.
				right--;
			if(left<=right)                   //check for swapping of elements.
			{
				int temp=list.get(left);
				list.set(left, list.get(right));
				list.set(right, temp);
				left++;
				right--;
				
			}
		}
		return left;
	}
	
	/** recursively call itself until the array is sorted.
	 * @param array which is to be sorted.
	 * @param left  index of array.
	 * @param right index of array.
	 */
	public List<Integer> quickSort(List<Integer> list,int left,int right)
	{
		if(right==-1)         //in case of empty array.
			return list;
		
		int index=partition(list, left, right);
		
		if(left<index-1)
			quickSort(list,left,index-1);
		if(index<right)
			quickSort(list,index,right);
		
		return list;
		
	}
}
