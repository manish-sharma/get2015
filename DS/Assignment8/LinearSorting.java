public  class LinearSorting  extends Sorting{

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
		int max=inputArray[0];
		for(int data : inputArray)
		{
			if(max<data)
				max=data;
		}
		if(max<10) 
			countSort();
		else
			radixSort();
	}
	
	public void countSort() 
	{
		int size =inputArray.length;
		int index,counter;
		int frequency[]=new int[10];
		int sortedArray[]=new int[size+1];
		
		for(int data : inputArray) //counting frequency of each no
			frequency[data]++;
		
		for(index=1;index<10;index++) 
			frequency[index] +=frequency[index - 1];

		for (index=size-1; index>=0;index--) 
		{
			sortedArray[frequency[inputArray[index]]] = inputArray[index];
			frequency[inputArray[index]]--;
		}
		
		for(counter=1,index=0;counter<=size;counter++)
			inputArray[index++]=sortedArray[counter];
	}

	public void radixSort() {
		int max = inputArray[0];
		int size = inputArray.length, remainder = 1, counter;
		int digit[] = new int[size];
		for (int data : inputArray)
			if (data > max)
				max = data;
		
		int countDigit = max;
		int noOfDigit = 1;
		while ((countDigit /= 10) > 0)
			noOfDigit++;
		
		while (countDigit != noOfDigit) { 
			counter = 0;
			for (int data : inputArray)
				digit[counter++] = (data / remainder) % 10; //finding digit of the number
			performRadixSort(digit);
			countDigit++;
			remainder = remainder * 10;
		}
	}

	public void performRadixSort(int digit[])  // every digit perform count sort in radix sort 
	{ 
		int size = digit.length;
		int index, counter;
		int frequency[] = new int[10];
		int sortedArray[] = new int[size + 1];
		for (int data : digit)
			frequency[data]++;
		
		for (index = 1; index < 10; index++)
			frequency[index] += frequency[index - 1];
		
		for (index = size - 1; index >= 0; index--) {
			sortedArray[frequency[digit[index]]] = inputArray[index];
			frequency[digit[index]]--;
		}
		
		for (counter = 1, index = 0; counter <= size; counter++)
			inputArray[index++] = sortedArray[counter];
	}
	
}
