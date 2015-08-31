import java.util.*;

/**
 * @author Sumitra
 *This Program is to merge to sorted array in a single third array.
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort one=new MergeSort();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of First array");
		int sizeOfFirst=scan.nextInt();
		System.out.println("enter the size of second array");
		int sizeOfSecond=scan.nextInt();
		int firstSortedArray[]=new int[sizeOfFirst];
		int secondSortedArray[]=new int[sizeOfSecond];
		System.out.println("Enter elements of first sorted array: ");
		for(int i=0;i<sizeOfFirst;i++)
		 {
			firstSortedArray[i]=scan.nextInt();
		 }
		System.out.println("Enter elements of second sorted array: ");
		for(int i=0;i<sizeOfSecond;i++)
		 {
			secondSortedArray[i]=scan.nextInt();
		 }
		int mergedArray[]=new int[sizeOfFirst+sizeOfSecond];
		mergedArray=one.join(firstSortedArray,sizeOfFirst,secondSortedArray,sizeOfSecond,mergedArray);
		System.out.println("Joined array is: ");
		for(int i=0;i<mergedArray.length;i++)
		{
			System.out.print(mergedArray[i]+" ");
		}
		scan.close();
	}
	public int[] join(int firstArray[], int firstArraySize, int secondArray[],int secondArraySize, int mergedArray[])
	{
		int k=0;
		for(int i=0;i<firstArraySize;)
		{
			for(int j=0;j<secondArraySize;)
			{
				if(firstArray[i]<=secondArray[j])
				{
					mergedArray[k]=firstArray[i];
					i++;
					k++;
					/**
					 * if element of first array is smaller than it will insert that to third array.
					 */
				}
				else
				{
					mergedArray[k]=secondArray[j];
					j++;
					k++;
					/**
					 * otherwise it will insert the element of second array to third.
					 */
				}
				if(i==firstArraySize)
				{
					for(int count=k;count<firstArraySize+secondArraySize;count++)
					{
						mergedArray[count]=secondArray[j];
						j++;
						/**
						 * if first array finished than it will copy the remaining second array to third array.
						 */
					}
				}
				else if(j==secondArraySize)
				{
					for(int count=k;count<firstArraySize+secondArraySize;count++)
					{
						mergedArray[count]=firstArray[i];
						i++;
						/**
						 * if second array is finished than it will copy the remaining first array to third array.
						 */
					}
				}
			}
		}
		return mergedArray;
	}

}
