
import java.util.Scanner;
/*This class find greatest common divisor of two number using recursive approach*
 * @parul joshi
 */
public class greatestCommonDivisor 
{
	public static void main(String[] args)
	{
		greatestCommonDivisor objectOfgcd=new greatestCommonDivisor();
		int number1,number2,gratestcommonDiviser;
		/*Input from user.*/
		number1=objectOfgcd.getNumber();
		number2=objectOfgcd.getNumber();
		gratestcommonDiviser=objectOfgcd.getgreatestcommondiviser(number1,number2);
		/*Print greatest common divisor of two numbers.*/
		System.out.println("Gratest Common Diviser of "+number1+" and "+number2+" is "+gratestcommonDiviser);		
	}
	
	/*Function takes number as input from user.*/
	int getNumber()
	{
		int number = 0;
		Scanner sc = new Scanner(System.in);
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
	
	/*Function find greatest common divisor of two number using recursion.
	 * It takes num1 and num2 as parameter.*/
	int getgreatestcommondiviser(int number1,int number2)
	{		
		if(number1 != number2)
		{
			/*when both the number are not same.*/
			if(number1>number2)
			{
				/*to equalize the number if number1 is grater than number2 reduce number1 by number 2*/
				number1=number1-number2;
				return getgreatestcommondiviser(number1,number2); /*function calling itself*/
			}			
			else 
			{
				/*to equalize the number if number2 is grater than number1 reduce number2 by number 1*/
				number2=number2-number1;
				return getgreatestcommondiviser(number1,number2);//function calling itself
			}	
		}
		else
		{
			/*return number when both numbers are become equal*/
			return number1;
		}
	}
}
