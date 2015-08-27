package Question2;

public class MergeArrayList
{
	static int sizeIncreasedByValue = 5;
	Object data[];
	int index;
	int size;
	
	public MergeArrayList()
	{
		data = new Object[sizeIncreasedByValue];
		size = sizeIncreasedByValue;
	}
	
	
	// Add an Item in the array list
	public void addValueInList(Object obj)
	{
		//overflow, increase the size of data[]
		if( index == size-1 )
			increaseSizeAndReallocate();
		data[index] = obj;
		index++;
	}
	
	
	// when size is full, this function allocates space into it
	public void increaseSizeAndReallocate()
	{
		size = size + sizeIncreasedByValue;
		Object newData[] = new Object[size];
		for(int count=0; count<data.length; count++)
			newData[count] = data[count];
		data = newData;
	}	
	
	
	// merge two lists
	public void mergeArrayLists ( MergeArrayList objMergeArrayList )
	{
		int count = 0;
		int size1 = index + objMergeArrayList.index ;
		Object newData[] = new Object[size1];
		
		for ( count = 0; count<index; count++ )   // add list 1 in new list
			newData[count] = data[count];
		
		for ( int count1 = 0; count1 < objMergeArrayList.index; count1++ )   // add list 2 in new list
			newData[count+count1] = objMergeArrayList.data[count1];
		
		data = newData;
		
		// prints list 
		for(int count1 = 0; count1 < size1 ; count1++)
			System.out.println(data[count1]);
	}
	
}
