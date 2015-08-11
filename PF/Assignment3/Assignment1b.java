import java.util.Scanner;


public class Assignment1b 
{
	static int gcd(int x, int y)    /* Function used For calculating GCD using recursion*/
	{
		x=Math.abs(x);
		y=Math.abs(y);
		
		if(y==0 || x==0)       /* Condition for handling zero input*/
			return 0;
		
		else if((x=x%y)==0)      
			return y;
		else               
		   return gcd(y,x);    /* Recursive call to function gcd() for calculating GCD*/
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   int num1, num2;
	   
	   System.out.print("Enter two number for calculating GCD: ");
	   
	   Scanner sc=new Scanner(System.in);
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   
	   int gcd=gcd(num1,num2);
	   if(gcd!=0)
	   {
	   System.out.print( "GCD("+num1+","+num2+") = "+ gcd);
	   }
	   else
		   System.out.print("Please Enter valid non-zero value between -2147483648 and 2147483647");
      
	   sc.close();
	}


}
