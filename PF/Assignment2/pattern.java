// Program to display a pattern using modular approach

public class pattern
{
	public static void main(String[] args)
	{
		int row, col=5;
		pattern obj = new pattern();
		try
		{
			for(row=0; row<5; row++)
			{
				String output[] = obj.printPattern(row, col);
				for(int index=0; index<output.length; index++)
					System.out.print(output[index]);   // displays complete pattern using values of all rows
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
		String arrSpaces[] = new String[row];
		try
		{
			for(int index=0; index<arrSpaces.length; index++)
			{
				arrSpaces[index] = " ";
			}
			return arrSpaces;
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
		String arrNumbers[] = new String[col-row];
		try
		{
			for(int index=0; index<arrNumbers.length; index++)
			{
				arrNumbers[index] = index+1+""; 
			}
			return arrNumbers; 
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
	String [] printPattern(int row, int col)   
	{
		String strSpaces[] = spaces(row,col);	  
		String strNumbers[] = numbers(row,col);
        String strPattern[] = new String[strSpaces.length + strNumbers.length];
        try
        {
        	// inserts spaces in a row of pattern
            for(int index=0; index<strSpaces.length; index++)   
            {
            	strPattern[index] = strSpaces[index];
            }
            
            // inserts numbers in a row of pattern
            for(int index=0; index<strNumbers.length; index++)  
            {
            	strPattern[index+strSpaces.length] = strNumbers[index];
            }
            return strPattern;   // returns a row of pattern containing spaces & numbers
        }
        catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(strPattern!=null)
				strPattern = null;
		}
        return strPattern;   // returns a row of pattern containing spaces & numbers
        
	}
	
	
}







