import java.util.*;

/**
 * @author Sumitra
 *This program is to find a number in array by using linear search approach by recusion. 
 */
public class LinearSearch {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		LinearSearch linearValue=new LinearSearch();
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element you want to search");
		int searchValue=scan.nextInt();
		System.out.println("it will return 0 if value is not present in array");
		System.out.println("if value is present it will return the index number");
		System.out.println("the element is at position "+linearValue.search(searchValue,0,arr));
		scan.close();
	}
	/**
	 * 
	 * @param searchValue the value to be searched in array.
	 * @param index index value from where we have to search.
	 * @param arr array from which we have to find.
	 * @return will return index value if digit is available else will return zero
	 */
	int search(int searchValue, int index, int arr[])
	{
		if(index==arr.length-1 && searchValue!=arr[index])
			//if the whole array is traversed and yet the number is not present in array than it will return zero to show that number is not available.
		{
			return 0;
		}
		else
			
		if(searchValue==arr[index])
			//if the number is present it will return the index number of value.
		{
			return index+1;
		}
		else
			//if yet number is not present than it will call the method again with increment in index.
		{
			index++;
			return search(searchValue,index,arr);
		}
	}

}
