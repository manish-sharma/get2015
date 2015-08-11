import java.util.Scanner;


public class Assignment1a 
{
	static int rem(int x, int y) /* Function used For calculating remainder using recursion*/
	{
		if(y<=0)     /* Condition for handling zero input*/
		{
			return -1;
		}
		else if(x>=y)       
		{
			x=x-y;
			return rem(x,y);    /* Recursive call to function rem() for calculating remainder*/
		}
		else
		return x;
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   int dividend,divisor;
	   
	   System.out.print("Enter values of dividend and divisor: "); 
	   
	   Scanner sc=new Scanner(System.in);
	   dividend=sc.nextInt();
	   divisor=sc.nextInt();
	   
	   int remainder=rem(dividend,divisor);
	   
	   if(remainder>=0)
	   {
	   System.out.print("Remainer of "+dividend+" / "+divisor+" is "+remainder);
	   }
	   else
	   {
		   System.out.print("Please Enter a valid value");
	   }
	   sc.close();
	}


}
