import java.util.*;

/**
 * @author Sumitra
 *this program is to search a number in array by using binary search with recursion.
 *Search method is made to search in it.
 */
public class BinarySearch {

	int mid;
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		BinarySearch binaryObj=new BinarySearch();
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements of array in sorted order");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element you want to search");
		int searchValue=scan.nextInt();
		System.out.println("it will return -1 if array is not sorted");
		System.out.println("it will return 0 if value is not present in array");
		System.out.println("it will return a index number if value is present");
		System.out.println("the value is at "+binaryObj.search(searchValue,0,size-1,arr));
		scan.close();
	}
	/**
	 * 
	 * @param value is the number that is to be searched in array
	 * @param small the smallest index number from where we have to start searching.
	 * @param large is the largest index number till that number should be present.
	 * @param arr is the array in which we have to find.
	 * @return will return index number or if value is not present than will send zero.
	 */
	int search(int value,int small,int large,int arr[])
	{
		for(int i=1;i<large;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return -1;
			}
		}
		mid=(small+large)/2;
		if(small==large && value!=arr[mid])
			//if small and lagre are equal and still number is not present than that number is not in array
		{
			return 0;
		}
		else
		{
			if(value==arr[mid])
				//if value is equal to array [mid] that it will return value of mid.
			{
				return mid+1;
			}
			else
				if(value>arr[mid])
					//if value is greater than arr[mid] than small will be mid+1
				{
					return search(value,mid+1,large,arr);
				}
				else
					//if value is small than arr[mid] than large will be mid.
				{
					return search(value,0,mid-1,arr);
				}
			}
	}
}
