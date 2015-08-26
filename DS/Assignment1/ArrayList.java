
import java.util.Arrays;

public class ArrayList 
{
	private final int SIZE=10;
	private int numbers[];
	private int arraySize=SIZE;
	
	public ArrayList() 
	{
		numbers=new int[SIZE];
	}

	void displayArrayList(ArrayList arrayList)
	{
		if(arrayList.numbers==null)
		{
			System.out.println("Array is empty");
		}
		else 
		{
			System.out.println("List is: ");
			for(int counter=0;counter<arrayList.numbers.length-1;counter++)
				System.out.print(arrayList.numbers[counter]+ " ");
			
		}
	}
	
	void insertItem(int element, int position)
	{
		if(position>=arraySize) 
		{
			increaseSizeOfArray();
		}
		numbers[position]=element ;
	}
	
	//it will increase the size of array list
	private void increaseSizeOfArray() 
	{
		arraySize*=2;
		numbers=Arrays.copyOf(numbers, arraySize);
		
	}
	
	int []reverseArray(ArrayList arrayList) 
	{ 
		
		int arraySize=arrayList.numbers.length -1;
		int reversedArray[]=new int[arraySize+1];
		System.out.println();
		for(int counter=arraySize;counter>=0;counter--) 
			reversedArray[arraySize-counter]=arrayList.numbers[counter];
				return reversedArray;
	}
	
	
	
	int [] sortingOfArray() 
	{	
		int arraySize =numbers.length-1;  
		int sortedArray[]=numbers;
		for(int outerCounter=0;outerCounter<arraySize-1;outerCounter++) 
		{
			for(int innerCounter=0;innerCounter<arraySize-outerCounter-1;innerCounter++) 
			{
				if(sortedArray[innerCounter]>sortedArray[innerCounter+1] ) 
				{
					int temp=sortedArray[innerCounter];
					sortedArray[innerCounter]=sortedArray[innerCounter + 1];
					sortedArray[innerCounter+1]=temp;
				}
			}
		}
		return sortedArray;
	}
	
	
	void clearArrayList(ArrayList arrayObject) 
	{
		arrayObject.numbers=null;
	}
	
	int firstOccurence(int element) //First Occurrence of element by 0 position
	{
		int counter;
		for( counter=0;counter<numbers.length-1;counter++)
		{
			if(this.numbers[counter]==element) 
			{
				break;
			} 
			else 
				continue ;
		}
		return counter;
	}
	
	int firstOccurence(int element, int position) //First Occurrence by given position
	{
		int counter;
		for(counter=position;counter < this.numbers.length-1 ;counter++) {
			if( this.numbers[counter]==element) {
				break;
			} else continue ;
		}
		return counter;
	}
	
	void insertAtLocation(int element,int position) 
	{
		int size=numbers.length-1;
		if(size+1>arraySize) 
		{
			increaseSizeOfArray();
		}
		for(int counter=size;counter>position;counter-- ) 
		{
			numbers[counter + 1] = numbers[counter];
		}
		numbers[position] = element ;
	}
	
	void removeElementOnLocation(int location) 
	{
		int count;
		for(count=location;count<numbers.length-1;count++) 
		{
			numbers[count]=numbers[count+1];
		}
		numbers[count-1]=0;
	}

	void removeElement(int element)
	{
		int position=firstOccurence(element);
		if(position==-1)
		{
			System.out.println("Element Doesn't Exist in the array!!");
		} 
		else 
			removeElement(position);
	}
	
}
