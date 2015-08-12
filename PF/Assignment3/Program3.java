import java.util.*;
//Program to find the largest digit of a number recursively
public class Program3 
{
	int max=0;
	public static void main(String args[]) //main class definition
	{
	int number,result;
	Program3 object = new Program3();     //Object of class program3
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number");
	number=scan.nextInt();
	result=object.largestDigit(number); //Calling function largestDigit(int)
	System.out.println("Result is "+ result);
	}	

	
	int largestDigit(int x)
	{
		int a;
		while(x>0)
		{
		a=x%10;
		if(a>max)
			{
			max=a;
			return(largestDigit(a/10));
			}
		}
			return max;
	}
}

