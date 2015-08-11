package programingFundamental3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFunction
{
	/** calculates the remainder of a number when divided by another one 
	 * 
	 * @param x  is a  number which is to be divided.
	 * @param y  is a number by which x is divided.
	 * @return   remainder of the two numbers.
	 */
	public  int rem(int x, int y) 
	{
		if(y<=0)
			return -1;
		if(x<0)
		{
			return x+y;
		}
		else if(x==0)
		{
			return 0;
		}
		return rem(x-y,y);
		
	}
	/** calculates the gcd of two parameters.
	 * 
	 * @param x is first number of which gcd is to be calculated.
	 * @param y is second number of which gcd is to be calculated. 
	 * @return the gcd of above two numbers.
	 */
	public int gcd(int x, int y)
	{
		NumberFunction obj=new NumberFunction();
		if(x>0 && y>0)                       // recursively calling of function until one of the two number become 0.
			return gcd(y,obj.rem(x,y));
		return x;
	}
	/**calculates largest digit of the parameter.
	 * @param x  is a number of which largest digit is to be found.
	 * @return the largest digit of the parameter.
	 */
	public int largestDigit(int x)
	{
		if (x<0)                       // if the number is negative then change it to positive.
			x=x*(-1);
		if(x==0)                       // if the number equals to zero then return zero.
			return x;
		int max=x%10;                  // max stores the last digit of given number.
		x=largestDigit(x/10);          // recursive call of function without the last digit.
		if(max>x)
			x=max;                     
		return x;
	}
	
	/**
	 * is use to read input from user.
	 */
	public void readInput()
	{
		NumberFunction obj=new NumberFunction();
		Scanner input=new Scanner(System.in);
		int result,response = 0;
		System.out.println("enter 1 for calculating remainder, 2 for GCD, 3 for largestdigit");
		try
		{
			response=input.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("only integer are excepted");
		}
		if(response==1)      
		{
			System.out.println("enter the two numbers to calculate remainder");
			try
			{
				int firstNo=input.nextInt();
				int secondNo=input.nextInt();
				if(firstNo<0 || secondNo<=0)
					System.out.println("first number not be less than 0 and second number must be greater than zero");
				else 
				{
					result=obj.rem(firstNo, secondNo);
					System.out.println("remainder when"+firstNo+"is divided by"+secondNo+"= "+result);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integers are acepted");
			}
		}
		else if(response==2)
		{
			System.out.println("enter the two numbers to calculate GCD");
			try
			{
				int firstNo=input.nextInt();
				int secondNo=input.nextInt();
				if(firstNo<0 || secondNo<=0)
					System.out.println("first number not be less than 0 and second number must be greater than zero");
				else 
				{
					result=obj.gcd(firstNo, secondNo);
					System.out.println("Greatest Common Divisor of "+firstNo+" and "+secondNo+" is "+result);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integers are acepted");
			}
		}
		else if(response==3)
		{
			System.out.println("enter a number to calculate largest digit");
			try
			{
				int number=input.nextInt();
				if(number<0)
					System.out.println("number not be less than 0.");
				else 
				{
					result=obj.largestDigit(number);
					System.out.println("Largest digit of "+number+" is= "+result);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("only integers are acepted");
			}
		}
		else
		{
			System.out.println("kindly enter only correct option");
		}
	}
	
	
	public static void main(String args[])
	
	{
		NumberFunction obj=new NumberFunction();
		Scanner input=new Scanner(System.in);
		int flag=1;
		while(flag==1)
		{
			obj.readInput();
			System.out.println("enter 1 to try one more time");
			flag=input.nextInt();
		}
		
	}
}
