package binarysearch;


/*starting of Binarysearch class*/
public class Binarysearch {
	/*starting of main function*/
	public static void main(String args[]){
		
	}
	/*ending of main function*/
	
	/*starting of binarySearch function*/
	int binarySearch(int []array, int lower, int upper, int number){
		
		if(lower <= upper){		//checks if lower is less then upper
			int middle = (lower + upper) / 2;	//count middle of array
			if(array[middle] == number)	//checks if element at middle is equal to the number searching for
				return middle;
			else if(array[middle] < number)	//if element at middle index is less then number then
				return binarySearch(array, middle+1 , upper, number);	//set lower equal to middle + 1
			else
				return binarySearch(array, lower , middle-1, number); //otherwise set upper equal to middle - 1
		}
		else			//if lower is greater than or equal to upper then return -1 
			return -1;
	
	}
	/*ending of binarySearch function*/

}
/*ending of Binarysearch class*/
