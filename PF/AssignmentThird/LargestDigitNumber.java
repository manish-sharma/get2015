import java.util.*;

/**
 * @author Sumitra
 *This program is to get the largest digit in given number by using recusion.
 */
public class LargestDigitNumber {
	int value=0;
	// declared globally to be used in recusive method largestDigit as if we declare that in method than it will always be initalised by zero.
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		LargestDigitNumber digit=new LargestDigitNumber();
		System.out.println("enter the number in which you want to find greatest digit");
		int number=scan.nextInt();
		System.out.println("the greatest digit is"+digit.largestDigit(number));
		scan.close();
	}

	/**
	 * 
	 * @param x the value for which we have to find greatest value
	 * @return will return greatest value.
	 */
	int largestDigit(int x)
	{
		
		if(x>0)
			// if the digit in number is available
		{
			if(value<x%10)
				//if the value is smaller than the result will be obtained.
			{
				value=x%10;
				
			}
			 return largestDigit(x/10);
			 
		}
		else
		{
			return value;
		}
	}
}
