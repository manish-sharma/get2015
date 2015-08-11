package pf_assignment_3;

import java.util.Scanner;
/*
 * java code to find remainder,greatest common divisor and the largest integer in the given integer*/
public class remGcd //class to find remainder,largest digit and gcd
{
	/*
	 * find remainder of dividend and divisor through recursive calling of function rem 
	 * @divedend number which is to be divided
	 * @divisor number who is divided*/
	public int rem(int divedend, int divisor)//method to find the remainder
	{
		if(divedend<divisor)//check divedend is smaller than divisor
		{
			return divedend;
		
		}
		else if (divisor == 0)
			return -1;
		else
			return rem(divedend-divisor, divisor);//return remainder value
		
		
		
	} 
	public int gcd (int x,int y)//method to find greatest common divisor
	{
		/*
		 * java code to find greatest common divisor
		 * @xfirst number
		 * @y second number*/
		if(y==0)
			return x;
		else
			return gcd(y,x%y );////function is calling recursively to find the gcd
		
	}
	public int largestdigit(int x)//method to find largest digit 
	{
		/*java code to find the largest integer
		 * @x number in whom largest integer is to be find
		 * @remainder to store remainder when x is divided by 10*/
		int remainder=x%10;
		
		
		if(x/10==0)
		{
			return x;////return the value
		}
		else 
		{ 
			x=x/10;
			int max= largestdigit(x);//method calling recursively
			if(remainder>max)
				return remainder;
			else
				return max;//return maximum integer

		}
		
	}

	public static void main(String[] args) 
	{
		//main method to find remainder,largest integer,and greatest common divisor
		// TODO Auto-generated method stub
		remGcd obj=new remGcd();//class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dividend");
		int dividend=sc.nextInt();
		System.out.println("enter the divisor");
		int divisor=sc.nextInt();//scan the divedend and divisor
		int remainder=obj.rem(dividend, divisor);//method calling to find remainder
		System.out.println("Remainder is:"+remainder);
		
		System.out.println("enter the first number to find gcd:");
		int firstNumber=sc.nextInt();
		System.out.println("enter the second number to find gcd:");
		int secondNumber=sc.nextInt();
		int gcd=obj.gcd(firstNumber, secondNumber);//method calling to find gcd
		System.out.println("gcd is:"+gcd);//print gcd
		
		System.out.println("enter the  number to find largest digit:");
		int largestDigit=sc.nextInt();
		int digit=obj.largestdigit(largestDigit);//method calling to find largest integer
		System.out.println("largest digit in number is:"+digit);//print largest integer
	}

}
