import java.io.*;
import java.util.*;
public class remainder {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		remainder remainderObject=new remainder();
		int diviser,dividend,remainderofnumber;
		dividend=remainderObject.getDividend();
		diviser=remainderObject.getDiviser();
		remainderofnumber=remainderObject.rem(dividend,diviser);
		System.out.println("When "+dividend+" divided by "+diviser+" give remainder "+remainderofnumber);
		
	}
	
	int getDiviser()
	{
		//takes number input from console

		int number;
		Scanner sc=new Scanner(System.in);
		do
		{ 
			//if number is less than zero repeats process
		
			System.out.println("Enter diviser :");
			number=Integer.parseInt(sc.nextLine());

		}while(number<0);
		
		return number;
		
	}
	
	int getDividend()
	{
		//takes number input from console

		int number;
		Scanner sc=new Scanner(System.in);
		do
		{ 
			//if number is less than zero repeats process
		
			System.out.println("Enter dividend :");
			number=Integer.parseInt(sc.nextLine());

		}while(number<0);
		
		return number;
		
	}
	
	int rem(int number1,int number2)
	{
		//find remainder when number1 is divided by number2

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

