public class Assignment2 {
	/**
	 * @param array
	 * @param lowerBound of array
	 * @param upperBound of array
	 * @param searchValue(Value to be searched)
	 * @return the index of the value 
	 */
	int linearSearch(int array[],int lowerBound, int upperBound, int searchValue){

		if(lowerBound > upperBound){
			return -1;
		}
		else{ if(array[lowerBound]== searchValue){
			return lowerBound;
		}
		}
		return linearSearch(array,lowerBound+1,upperBound,searchValue);
	}




	/**
	 * @param array
	 * @param lowerBound of array
	 * @param upperBound of array
	 * @param searchValue Value to be searched
	 * @return the index of the value
	 */
	int binarySearch(int array[],int lowerBound,int upperBound,int searchValue){
		int mid=(lowerBound+upperBound)/2;
		if(lowerBound <= upperBound){
			if(array[mid] == searchValue)
				return mid;
			else{ 
				if(array[mid] > searchValue)
					return binarySearch(array,lowerBound,mid-1,searchValue);
				else
					return binarySearch(array,mid+1,upperBound,searchValue);
			}
		}	
		else
			return -1;
		
	}

}
