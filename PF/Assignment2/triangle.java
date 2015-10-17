/*******************************************
 * @author Girdhari
 * Program to make a pyramid module		   *
 * package contains the class Pyramid      *
 * Pyramid class is used to draw pyramid   *
 * 
 */
package triangle;

/*Start of Pyramid class*/

public class Triangle {
	
	/*Starting of main function*/
	public static String main(String []args)
	{
		String finalString="";
		Triangle obj = new Triangle();
		for(int loopCounter=1;loopCounter<=5;loopCounter++)
		{
			System.out.print(obj.space(5,loopCounter)); 
			System.out.print(obj.number(5,loopCounter));
			System.out.println();
		}
		return finalString;
		
	}
	/*end of main function*/

	/*Starting of returnString function*/
	String returnString(int row)
	{
		String finalString="";
		Triangle objPattern = new Triangle();
		for(int loopCounter=1;loopCounter<=5;loopCounter++)
		{
			finalString = finalString + objPattern.space(5,loopCounter);
			finalString = finalString + objPattern.number(5,loopCounter);
			finalString = finalString + "\n";
		}
		return finalString;
		
	}
	/*end of returnString function*/
	
	/*Start of space function*/
	String space(int row,int rowNumber)
	{
		String spaceString="";
		if(isValid(row,rowNumber))   	//condition to check whether the rowNumber for which space to be find is smaller than total number of rows
			return "Not Valid";
		else
		{
			for(int counter=0 ; counter < rowNumber-1; counter++)	//loop to concatenate total number of spaces
			{
				spaceString = spaceString + " ";
			}
			return spaceString;
		}
	}
	/*End of Space function*/
	
	/*start of number function */
	String number(int row, int rowNumber)
	{
		int number=0;
		if(isValid(row,rowNumber))					//condition to check whether the rowNumber for which space to be find is smaller than total number of rows
		{
			return "Not Valid";
		}
		else				
		{
			for(int counter=1 ; counter <= row - rowNumber + 1  ; counter++) //loop counter to generate number string in integer datatype
			{
				number = number * 10 + counter;
			}
			return Integer.toString(number);	//first convert integer into string then return
		}
	}
	boolean isValid(int row, int rowNumber)
	{
		if(row < rowNumber)
			return false;
		else 
			return true;
	}
	
	/*End of main function*/
}
