import java.util.*;
// Program to use recursion and calculate remainder of given numbers 

public class Program1
{
	public static void main(String args[]) //main class definition
	{
		int remainder,dividend,divisor;
		Program1 object = new Program1();     //Object of class program1
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the divend");
		dividend=scan.nextInt();
		System.out.println("Enter the divisor");
		divisor=scan.nextInt();
		remainder=object.rem(dividend,divisor); //Calling function rem(int,int)
		if(remainder>0)
			System.out.println("Remainder is "+ remainder);
		else
			System.out.println("Cannot be divided");
	}

//Function to calculate remainder recursively
	int rem(int x,int y)
	{
		if(x>=0 && y>0)
		{
			if(x>y)              //if dividend is greater than divisor
			{
				return(rem(x-y,y)); //recursive calling
			} 
			else
				return x;
		}
		else
			return -1;
	}
}
