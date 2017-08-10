import java.util.*;

/**
 * @author Sumitra
 * This program is about to find greatest common divisor of two numbers by recursion.
 *
 */
public class GreatestCommonDivisor {

	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		GreatestCommonDivisor commonDivisor=new GreatestCommonDivisor();
		System.out.println("enter first value should be greater than zero");
		int firstNumber=scan.nextInt();
		System.out.println("enter second value should be greater than zero");
		int secondNumber=scan.nextInt();
		System.out.println("greatest common divisor is"+commonDivisor.gcd(firstNumber,secondNumber));
		scan.close();
	}
	/**
	 * 
	 * @param x value for which we have to find gcd
	 * @param y another value 
	 * @return will return gcd
	 */
	int gcd(int x,int y)
	{
			if(y==0)
				//if we got remainder zero than the result will be divisor of that turn.
			{
				return x;
			}
			else
				//if not than again the method is called.
			{
				return gcd(y,x%y);
			}
	}
}
