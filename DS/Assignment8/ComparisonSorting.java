public  class ComparisonSorting extends Sorting
{
	
	public boolean checkValidity()
	{
		if(inputArray==null||inputArray.length==0)
			return false;
		return true;
	}
	

	@Override
	public void performSorting() 
	{
		boolean isvalid=checkValidity();
		if(!isvalid)
		{
			System.out.println("Array is empty");
			return ;
		}
		int size=inputArray.length-1;
		if(size<=10) 
			bubbleSort();
		else 
			quickSort(0, size-1);
	}
	
	public void  bubbleSort() 
	{
		
		int size=inputArray.length;
		for(int outer=0;outer<size;outer++)
			for(int inner=0;inner<size-outer-1;inner++)
				if(inputArray[inner]>inputArray[inner+1])
					swap(inputArray, inner, inner+1);
	}
	
	public void quickSort(int lowerIndex,int higherIndex) 
	{
		int leftIndex = lowerIndex;
		int rightIndex = higherIndex;
		int pivot = inputArray[lowerIndex+(higherIndex-lowerIndex)/2];
		// Divide into two arrays
		while (leftIndex <= rightIndex) 
		{
			while (inputArray[leftIndex] < pivot) 
				leftIndex++;

			while (inputArray[rightIndex] > pivot) 
				rightIndex--;

			if (leftIndex <= rightIndex)
			{
				inputArray = swap(inputArray, leftIndex, rightIndex);
				//move index to next position on both sides
				leftIndex++;
				rightIndex--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < rightIndex)
			quickSort(lowerIndex, rightIndex);
		if (leftIndex < higherIndex)
			quickSort(leftIndex, higherIndex);
	}
	
	public int[] swap(int[] array, int firstIndex, int secondIndex) 
	{
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp ;
		return array;
	}
}
