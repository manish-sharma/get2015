import java.util.Arrays;

public class ArrayListMerged 
{
	private final int SIZE = 10;
	private int array[] ;
	private int arraySize = SIZE;
	
	public ArrayListMerged() 
	{
		this.array = new int[SIZE];
	}

	void displayArrayList(ArrayListMerged arrayList) 
	{
		if(arrayList.array==null)
		{
			System.out.println();
			System.out.println("Array is empty");
		}
		else 
		{
			System.out.println("List is: ");
			for(int counter=0;counter<arrayList.array.length-1;counter++) 
			{
				System.out.print(arrayList.array[counter]+ " ");
			}
			System.out.println();
		}
	}
	
	void insertItem(int element, int position) 
	{
		if(position>=arraySize) 
		{
			increaseSizeOfArray();
		}
		array[position]=element ;
	}
	
	private void increaseSizeOfArray() 
	{
		arraySize*= 2;
		array=Arrays.copyOf(array,arraySize);
		
	}
	int[] mergeList(ArrayListMerged arrayList)
	{
		int sizeOfArray1=array.length - 1;
		int sizeOfArray2=array.length - 1;
		int mergedList[]= new int[arraySize + arraySize +1 ] ;
		for(int count=0;count<sizeOfArray1;count++) 
		{
			mergedList[count]=array[count] ;
		}
		for(int count=0;count<sizeOfArray2;count++) 
		{
			mergedList[count+sizeOfArray1]=array[count];
		}
		return mergedList;
	}
}
