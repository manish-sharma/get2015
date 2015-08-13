// Program to calculate remainder of x divided by y using recursion

import java.util.*;
public class remainderByRecursion 
{
	public static void main(String[] args) 
	{
		int num1, num2, remainder;
		remainderByRecursion obj = null;
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter 1st number  : ");
			num1 = Integer.parseInt( sc.next() );
			
			System.out.println("Enter 2nd number : ");
			num2 = Integer.parseInt( sc.next() );
			
			obj = new remainderByRecursion (); 
			remainder = obj.rem(num1,num2);		
			System.out.println("Remainder is : "+remainder);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
		}
	}
	
	
	int rem (int num1, int num2)
	{
		if( num2 == 0 )
			throw new ArithmeticException("Divide by Zero");
		if( ( num1 >= num2 ) && ( num2 !=0 ) )
		{
			num1 = num1 - num2;
			return rem ( num1 , num2 );
		}
		else                  
		    return num1;		// returns remainder of num1 / num2
	}
}


