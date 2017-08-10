import java.util.*;
/**
 * @author Sumitra
 * This program is to find remainder by using recursion function.
 *
 */
public class RemainderWithRecursion {

	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		System.out.println("Enter the no which you want to divide");
		int divisor=scan.nextInt();
		System.out.println("enter the divident and ");
		int divident=scan.nextInt();
		System.out.println("the result is"+remainder.rem(divisor,divident));
		scan.close();
	}
	/**
	 *  
	 * @param x one is divisor
	 * @param y other is divident
	 * @return will return the remainder by using recursion method.
	 */
	int rem(int x,int y)
	{
		if(x>=0 && y>0)
			//checked for the condition that both number are greater than zero.
		{
				if(x>=y)
				{
					return rem(x-y,y);
				}
				//if the divisor is greater than divident than it will return the divisor-divident and divident.
				else
				{
					return x;
				}
				//if divisor is less than divident than it will return the divisor as reminder.
		}
		else
		{
			return 0;
		}
	}
}
