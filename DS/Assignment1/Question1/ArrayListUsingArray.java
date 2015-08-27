
package Question1;

public class ArrayListUsingArray 
{

		static int sizeIncreasedByValue = 5;
		Object data[];
		int index;
		int size;
		
		public ArrayListUsingArray()
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
		
		
		// Add an item at particular location
		public void addValueAtGivenLocation( Object item, int location )
		{
			//overflow, increase the size of data[]
			if( index == size )
				increaseSizeAndReallocate();
			
			for(int count = index; count>location ; count--)
				data[count] = data[count-1];
			
			data[location] = item;	
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
		
		
		// Retrieving the first index of particular item
		public int findFirstIndexOfItem ( Object item )
		{
			int count;
			for ( count = 0; count < data.length; count++ )
			{
				if ( data[count].toString().equals(item.toString()) )
					break;
			}
			return count+1;
		}
		
		
		// Retrieving the first occurrence of an item based on its given location
		public int firstOccurenceAfterGivenLocation( int location, Object item )
		{
			int count;
			for ( count = location-1; count < data.length; count++ )
			{
				if ( data[count].toString().equals(item.toString()) )
					break;
			}
			return count+1;
		}
		
		
		// Removing an item based on particular location
		public void removeItemFromGivenLocation (int location) 
		{
			if(location > size-1)
				System.out.println("Location out of bound");
			
			if(location<0)
				System.out.println("Negative index");
			
			System.out.println("Item removed : "+data[location]);
			for(int count = location; count < data.length-1; count++)
				data[count] = data[count+1];
			
			index--;
			
			printArrayList();
		}
		
		
		// Remove given particular item from the array list
		public void removeItemFromList (Object item) 
		{
			for(int count = 0; count <= index; count++)
			{
				if(data[count].toString().equals(item.toString()))
				{
					for(int count1 = count; count1 < index-1 ; count1++)
					{
						data[count1] = data[count1+1];
					}
					index -- ;
				}
			}
			
			printArrayList();
			
		}
		
		
		// reverse array list
		public void reverseArrayList()
		{
			for( int count1 = 0, count2 = index-1; count1<=count2; count1++, count2-- )
			{
				Object temp = data[count1];
				data[count1] = data[count2] ;
				data[count2] = temp;
			}
			printArrayList();
		}
		
		
		// Sorts the elements of array list
		public void sortArrayList()
		{
			for(int count1 = 0; count1 < index ; count1++)
			{
				for(int count2 = 0; count2 < index ; count2++)
				{
					if ( Integer.parseInt(data[count1].toString()) < Integer.parseInt(data[count2].toString()) )
					{
						Object temp = data[count1];
						data[count1] = data[count2] ;
						data[count2] = temp;
					}
				}
			}
			printArrayList();
		}
		
		
		// Clear the array list
		public void clearArrayList()
		{
			for(int count = 0; count < size ; count++)
				data[count] = null;
			size = 0;
			index = 0;
		}
		
		
		public Object getItemFromList(int location) 
		{
			if(location > size-1)
				System.out.println("Location out of bound");
			
			if(location<0)
				System.out.println("Negative index");
			
			return data[location];
		}
		
		
		public void printArrayList()
		{
			for(int count1 = 0; count1 < index ; count1++)
				System.out.println(data[count1]);
		}


}
