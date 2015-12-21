import java.util.Scanner;


public class Assignment1c
{

	static  int largestDigit(int num,int large)   /*Function used For calculating Largest Digit of a n digit number using recursion*/
	{
		int digit;
				
		if(num>0)
		{
			if((digit=num%10)> large)           /*calculating largest digit*/
				large = digit;
				
		    return largestDigit(num/10,large);     /* Recursive call to function largestDigit() for finding largest digit */
		}
		else 
			return large;
	}			
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   int num,large=0;
	   
	   Scanner sc=new Scanner(System.in);    
	   
	   System.out.print("Enter a number: ");   //Taking Input from user
	      
	   num=sc.nextInt();
	   
	   large=largestDigit(num,large);
	   
	   System.out.print("Largest digit of number "+num+" is: "+large);
       
	   sc.close();
	}

}
