
public class printPattern
{
	public static void main(String[] args)
	{
		int row,n=5;
		printPattern p=new printPattern();
		for(row=1;row<=5;row++)
		{
			// printng each row of pattern
			String output_array[]=p.pattern(row, n);
		    System.out.println(output_array[row]);
			  
		}
	}
	String spaces(int row,int n)
	{
		//define space string
		String string_spaces=new String();
		for(int index=1;index<row;index++)
		{
			string_spaces=string_spaces.concat(" ");
		}
		return string_spaces;
	}

	String numbers(int row,int n)
	{
		// define number string
		String string_numbers=new String();
		for(int index=1;index<=n-row+1;index++)
		{
		   string_numbers=string_numbers+index;
		}
		return string_numbers;
	}
	String[] pattern(int row,int n)
	{
		//addition of spaces string and number string 
		 
        String string_numbers_spaces[]= new String[n+1];
        for(int index=0;index<=n;index++)
        {
        	String space_string=spaces(index,n);
    		String number_string=numbers(index,n);
    		string_numbers_spaces[index]=space_string+number_string;
        }
        return string_numbers_spaces;
	}
}







