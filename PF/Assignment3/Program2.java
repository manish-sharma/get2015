import java.util.Scanner;
// Program to use recursion and calculate GCD of given numbers 

public class Program2
{
	public static void main(String args[]) //main class definition
	{
		int result,num1,num2;
		Program2 object = new Program2();     //Object of class program2
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number greater than 0");
		num1=scan.nextInt();
		System.out.println("Enter the second number greater than 0");
		num2=scan.nextInt();
		result=object.gcd(num1,num2); //Calling function gcd(int,int)
		if(result>0)
			System.out.println("GCD is "+ result);
		else
			System.out.println("Please enter numbers > 0");	
	}

//Function to calculate remainder recursively
	int gcd(int x,int y)
	{
		if(x>0 && y>0)
		{
			while(x!=y)
			{
				if(x>y)              //If number1>number2
					return(gcd(x-y,y)); 
				else                 //If number2>number1 
					return(gcd(y-x,x));
			}
			return x;                //Return final calculated GCD
		}
		else
			return -1;       //If user input is a negative number
	}
}

