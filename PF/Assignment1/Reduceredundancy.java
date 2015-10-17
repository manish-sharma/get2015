/****
 * @author Girdhari
 * module to reduce the redundancy of element found in array
 * inputArray one is supplied array
 * resultArray is the array which will get the answer
 * Reduceredundancy class is used to reduce the 
 */

/*beginning of Reduceredundancy class*/
class Reduceredundancy
{	
	/*Beginning of main function*/
	public static void main(String args[])
	{
		Reduceredundancy rr = new Reduceredundancy();
		int []inputArray ={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int []resultArray = rr.removeDuplicate(inputArray);
		for(int value:resultArray)
			System.out.print(value+" ");	
	}
	/*end of main function*/
	
	/*beginning of removeDuplicate*/
	
	int[] removeDuplicate(int input[])
	{
		int inputSize;
		inputSize = input.length;
		for(int count = 0; count < inputSize; count++)
		{	
			for(int digitArray2 = count + 1 ; digitArray2 < inputSize ; digitArray2++)
			{
				if(input[count] == input[digitArray2])	//test one element with all other
				{
					inputSize--;
					for(int counter2 = digitArray2 ; counter2 < inputSize ; counter2++)
					{
						input[counter2] = input[counter2 + 1];
					}
					
					
				}
			}
		}
		int []reducedArray = new int[inputSize];
		for(int counter = 0 ; counter < inputSize ; counter++)
		{
			reducedArray[counter] = input [counter];
			System.out.println(reducedArray[counter]);
		}
		return reducedArray;
	}
	/*ending of reduceRedundancy function*/
}

/*ending of Reduceredundancy class*/
