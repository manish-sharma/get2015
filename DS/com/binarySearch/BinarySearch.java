/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : BinarySearch class
 * @Description : this class will searched the element into array using binary search algorithm and return leftmost index of that element in array(if element exist in array);otherwise return -1
 */
package com.binarySearch;

public class BinarySearch {
	private int mid;
	private int searchedElement_s_LeftMostIndex;

	/**
	 * @Name : findLeftMostOccuranceOfElement() method
	 * @param : array(input array in which element has to be searched)
	 * @param : arraySize(total no. of elements in array)
	 * @param : low(leftmost index of sub list in which element will be searched
	 *        )
	 * @param : high(rightmost index of sub list in which element will be
	 *        searched )
	 * @param : searchedElement(element which is to be searched in array)
	 * @Description : recursive function, which uses binary search algorithm to
	 *              search the element into array(first find the mid index of
	 *              list ,in which element has to be searched;then if searching
	 *              element is less than the element at mid then next time it
	 *              will search in left sublist (low to mid-1) and if element is
	 *              greater than the element at mid then next time it will
	 *              search in right sublist (mid+1 to high) and if element is
	 *              found at mid position then again it will search in left
	 *              sublist (low to mid-1) to serach if that element is also
	 *              present in left sublist or not .and then return the leftmost
	 *              index of searching element in array
	 * @return : return leftmost index of searching element in array(if it exist
	 *         in array);otherwise return -1
	 */
	public int findLeftMostOccuranceOfElement(int[] array, int arraySize,
			int low, int high, int searchedElement) {
		if (high < 0 || low > arraySize - 1) {
			return -1;
		}
		if (low <= high) {
			mid = (low + high) / 2;
			if (searchedElement < array[mid]) {
				high = mid - 1;
				return findLeftMostOccuranceOfElement(array, arraySize, low,
						high, searchedElement);
			} else if (searchedElement > array[mid]) {
				low = mid + 1;
				return findLeftMostOccuranceOfElement(array, arraySize, low,
						high, searchedElement);
			}

			else {
				searchedElement_s_LeftMostIndex = mid;
				findLeftMostOccuranceOfElement(array, arraySize, low, mid - 1,
						searchedElement);
				return searchedElement_s_LeftMostIndex;
			}
		} else {
			return -1;
		}
	}

}
