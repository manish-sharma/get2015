import java.io.*;
import java.util.*;
/*This class find remainder when one number is divided by other using recursive approach*
 * @parul joshi
 */
public class remainder 
{
	public static void main(String[] args) 
	{	
		/*Initialize object of class to access methods of class in main.*/
		remainder remainderObject=new remainder();
		int divisor=0,dividend=0,remainderofnumber=0;
		/*Input divisor and dividend from user.*/
		dividend=remainderObject.getDividend();
		divisor=remainderObject.getDivisor();
		try
		{
			remainderofnumber=remainderObject.getremainder(dividend, divisor);
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		/*Print Remainder*/
		System.out.println("When "+dividend+" divided by "+divisor+" give remainder "+remainderofnumber);
	}
	
	/*Function takes divisor as input from console.*/
	int getDivisor()
	{
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{ 		
			System.out.println("Enter divisor :");
			number=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}
	
	/*Function takes dividend as input from console.*/
	int getDividend()
	{
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{ 			
			System.out.println("Enter dividend :");
			number=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{	
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}
	
	/*Function find remainder using recursion.It takes dividend and divisor as parameter.*/
	int getremainder(int dividend,int divisor)
	{
		/*Condition to check infinite case*/
		if(divisor==0)
		{
			System.out.println("infinite case");
			throw new ArithmeticException();
		}		

		/*Condition to check dividend is greater than divisor subtract divisor from dividend*/
		if(dividend>=divisor)
		{
			dividend=dividend-divisor;
			return getremainder(dividend,divisor);
		}		
		else
		{	
			return dividend;	
		}		
	}
}

