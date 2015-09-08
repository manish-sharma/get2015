
public class LeftMostBinarySearch {
	
	public int leftMostBinarySearch(int inputArray[] , int searchNumber , int startIndex , int endIndex)
	{
			
			if(inputArray==null||inputArray.length==0) // if array is empty or null
			{
				System.out.println("Array is empty or null");
				return -1;
			}
			int middleIndex = ( startIndex + endIndex ) / 2 ; //Find the index of  middle element
			int tempIndex = middleIndex;
			
			if( startIndex >=endIndex )//if number is not found in an array
			{
				if(inputArray[startIndex]==searchNumber)
					middleIndex=tempIndex;
				else
					middleIndex=-1;
				
				return middleIndex;
			}
			
			if(inputArray [middleIndex] == searchNumber)//if number is found at middleIndex
			{
				if(middleIndex==0||middleIndex==inputArray.length-1)	
					return middleIndex;
				
				if(inputArray[middleIndex-1]==searchNumber)
					return leftMostBinarySearch(inputArray, searchNumber, startIndex, middleIndex-1);
				
				else
					return middleIndex;
			}
			
			if(inputArray [middleIndex] >=searchNumber)
			{
				tempIndex=middleIndex;	
				return leftMostBinarySearch(inputArray, searchNumber, startIndex, middleIndex-1);
			}
			
			else
				return leftMostBinarySearch(inputArray, searchNumber, middleIndex+1, endIndex);
		
			
	}

}
