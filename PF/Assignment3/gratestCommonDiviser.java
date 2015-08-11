
import java.util.Scanner;


public class gratestCommonDiviser {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		gratestCommonDiviser objectOfgcd=new gratestCommonDiviser();
		int number1,number2,gratestcommonDiviser;
		number1=objectOfgcd.getNumber();
		number2=objectOfgcd.getNumber();
		gratestcommonDiviser=objectOfgcd.gcd(number1,number2);
		System.out.println("Gratest Common Diviser of "+number1+" and "+number2+" is "+gratestcommonDiviser);
		
	}

	int getNumber()
	{
		// takes input from console

		int number;
		Scanner sc=new Scanner(System.in);
		do
		{
			// if number is not positive integer repeats aganin

			System.out.println("Enter number :");
			number=Integer.parseInt(sc.nextLine());

		}while(number<0);
		
		return number;
		
	}
	
	int gcd(int num1,int num2)
	{
		//find gratest common diviser of two numbers
		
		if((num1!=num2))
		{
			//when both the number are not same

			if(num1>num2)
			{
				//to equalize the number if number1 is grater than number2 reduce number1 by number 2

				num1=num1-num2;
				return gcd(num1,num2); //function calling itself
			}
			
			else 
			{
				//to equalize the number if number2 is grater than number1 reduce number2 by number 1

				num2=num2-num1;
				return gcd(num1,num2);//function calling itself
			}
				
		}
		
		else
		{
			//return number when both numbers are become equal

			return num1;
		}
	}
}
