// program to find largest digit in an array

import java.util.*;
public class LargestDigit 
{
	int maxDigit = 0, digit;
	public static void main(String[] args)
	{
		int num ;
		LargestDigit obj = null;
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter the number : ");
			num = Integer.parseInt( sc.next() );
			obj = new LargestDigit (); 
			System.out.println("Largest digit is : " + obj.largestdigit ( num ));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if( sc != null )
				sc = null;
			if( obj != null )
				obj = null;
		}
	}
	
	
	int largestdigit ( int num )
	{
		if(num>0)
		{
			digit = num % 10 ;           // finding last digit
			if( digit > maxDigit )
				maxDigit = digit ; 
			largestdigit ( num /10 );
			return maxDigit;             //  returns largest digit
		}
		else
			return 0;
	}
}










