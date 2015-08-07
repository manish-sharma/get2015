// Program to display a pyramid using modular approach

public class pyramid 
{
	public static void main(String[] args) 
	{
		int row, col = 5;
		pyramid obj = new pyramid();
		try
		{
			for(row=0; row<=8; row++)
			{
				String output[] = obj.printPyramid(row, col);
				for(int index=0; index<output.length; index++)
					System.out.print(output[index]);    // displays complete pattern using values of all rows
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(obj!=null)
				obj = null;
		}
	}
	
	
	// returns spaces in given row of pattern.
	String[] spaces(int row, int col)        
	{
		String arrSpaces[]=null; ;
		try
		{
			if(row < col)
			{
			    arrSpaces = new String[col-row-1];
			    for(int index=0; index<arrSpaces.length; index++)
			    {
			    	arrSpaces[index] = " ";
			    }
			    return arrSpaces;
			}	
			else
			{
				arrSpaces = new String[row-col+1];
				for(int index=0; index<arrSpaces.length; index++)
				{
					arrSpaces[index] = " ";
				}
				return arrSpaces;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(arrSpaces!=null)
				arrSpaces = null;
		}
		return arrSpaces;
	}
	
	
	// returns numbers in given row of pattern.
	String[] numbers(int row, int col)       
	{	
		String arrNumbers[] = null;
		try
		{
			if(row < col)
			{    
				arrNumbers = new String[2*row+1];
				for(int index=0; index<=row; index++)
					arrNumbers[index] = index+1+"";		
			    for(int index=row+1; index<arrNumbers.length; index++)
			    	arrNumbers[index] = arrNumbers.length-index+"";
				return arrNumbers;
		    } 
			else
			{   
				row	= 8-row;   // 8 = max no. of rows in pyramid - 1
				arrNumbers = new String[2*row+1];
				for(int index=0; index<=row; index++)
					arrNumbers[index]	= index+1+"";		
				for(int index=row+1; index<arrNumbers.length; index++)
					arrNumbers[index] = arrNumbers.length-index+"";
				return arrNumbers;		   
			}
		}
	
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(arrNumbers!=null)
				arrNumbers = null;
		}
		return arrNumbers;
	}
	
	
	// returns spaces & numbers in given row of pattern.
	String[] printPyramid(int row, int col)  
	{
		String strSpaces[] = spaces(row, col);	
		String strNumbers[] = numbers(row, col);
		String strPyramid[] = new String[strSpaces.length + strNumbers.length];
		try
		{
			// inserts spaces in a row of pattern
			for(int index=0; index<strSpaces.length; index++)   
			{
				strPyramid[index] = strSpaces[index];
			}
			
			// inserts numbers in a row of pattern
			for(int index=0; index<strNumbers.length; index++)   
			{
				strPyramid[index+strSpaces.length] = strNumbers[index];
			}
			
			return strPyramid;   // returns a row of pattern containing spaces & numbers
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(strPyramid!=null)
				strPyramid = null;
		}
		return strPyramid;
	}
}
	

