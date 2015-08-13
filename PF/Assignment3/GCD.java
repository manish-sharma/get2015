// program to find GCD of two numbers

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) 
	{
		int num1, num2, gcdOfNum;
		GCD obj = null;
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter 1st number  : ");
			num1 = Integer.parseInt( sc.next() );
			
			System.out.println("Enter 2nd number : ");
			num2 = Integer.parseInt( sc.next() );
			
			obj = new GCD ();
			gcdOfNum = obj.gcd( num1, num2 );		
			System.out.println("GCD is : "+gcdOfNum);
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
	
	int gcd( int num1, int num2 )
	{
		if( num2 != 0 )
			return gcd( num2, num1%num2 );
		else
			return num1;          // returns GCD of num1, num2
	}

}
