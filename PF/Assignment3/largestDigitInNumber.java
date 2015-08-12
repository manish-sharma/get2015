import java.util.Scanner;
/*This class find greatest common divisor using recursive approach*
 * @parul joshi
 */
public class largestDigitInNumber 
{
	public static void main(String[] args)
	{
		/*Initialize object of class to access its methods.*/
		largestDigitInNumber objectOflargestdigitInNumber=new largestDigitInNumber();
		int number,digit;
		/*Input from user.*/
		number=objectOflargestdigitInNumber.getNumber();
		digit=objectOflargestdigitInNumber.getlargestdigit(number);
		/*Print largest digit in number of two number*/
		System.out.println("Largest Digit in number "+number+" is "+digit);	
	}
	
	/*Function takes number as input from user*/
	int getNumber()
	{
		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter number :");
			number=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}
	
	/*Function find largest digit using recursion. It takes number as input.*/
	int getlargestdigit(int number)
	{
		int max;
		/*Take last digit of number.*/
		int presentDigit=number%10; 
		/*Condition to check number having unit digit.*/
		if(number<10)
		{
			return presentDigit;
		}
		else
		{
			/*Remove last digit.*/
			number=number/10;
			int nextDigit=getlargestdigit(number);
			/*If present digit is smaller than next digit return.*/
			max=nextDigit>presentDigit?nextDigit:presentDigit;
			return max;
		}
		
	}
}
