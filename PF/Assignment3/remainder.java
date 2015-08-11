import java.io.*;
import java.util.*;
public class remainder {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		remainder remainderObject=new remainder();
		int diviser=0,dividend=0,remainderofnumber=0;
		try
		{
		dividend=remainderObject.getDividend();
		diviser=remainderObject.getDiviser();
		remainderofnumber=remainderObject.rem(dividend,diviser);
		}
		catch(Exception e)
		{
			System.out.println(e+" Sorry!! invalid input");
			System.exit(0);
		}
		System.out.println("When "+dividend+" divided by "+diviser+" give remainder "+remainderofnumber);
		
	}
	
	int getDiviser()
	{
		//takes number input from console

		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{ 
			
			System.out.println("Enter diviser :");
			number=Integer.parseInt(sc.nextLine());
		
		}
		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
		
	}
	
	int getDividend()
	{
		//takes number input from console

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
	
	int rem(int number1,int number2)
	{
		//find remainder when number1 is divided by number2
		if(number2==0)
		{
			System.out.println("infinite case");
			throw new ArithmeticException();
		}
		

		if((number1>=number2)&&(number2>0))
		{
			//to divide number diviser is subtracted dividend

			number1=number1-number2;

			//for updated dividend function call itself

			return rem(number1,number2);
		}
		
		else
		{	
			return number1;	
		}
		
	}
}

