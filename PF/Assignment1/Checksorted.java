/********************************************************************
 * @author Girdhari													*
 * module to check whether the array is sorted or not				*
 * 
 *
 ********************************************************************/
public class Checksorted {
	public static void main(String args[])
		{
		
		}
		
		int checkSortedArray(int inputArray[])
		{
			int status = 0, lengthOfArray;
			lengthOfArray = inputArray.length;
			for(int index = 0 ; index < lengthOfArray-1 ; index++)
			{
				if(inputArray[index] > inputArray[index+1])
				{
					status--;
				}
				else if(inputArray[index] < inputArray[index+1])
					status++;
			}
			if(status == lengthOfArray-1)
				return 1;
			else if(status * -1 == lengthOfArray-1)
				return 2;
			else 
				return 0;
		}
	}
