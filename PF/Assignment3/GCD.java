import java.util.InputMismatchException;
import java.util.Scanner;
public class GCD{
	
	public static void  main(String args[]) {
		
		int no1,no2;
		
		try
		{
			
		Scanner sc=new Scanner(System.in);//object of Scanner class
		
		System.out.println(" Enter First Number ");
		
		no1=sc.nextInt();
		
		if(no1<=0) //condition if dividend less then zero;
		{
			System.out.println("Number should be  greater then zero ");
			
			System.out.println(" Enter  first number again ");
			
			no1=sc.nextInt();
			
		}
		
		System.out.println(" Enter Second number ");
		
		no2=sc.nextInt();
		
		if(no2<=0)// if no negative or zero;
			
		{ System.out.println("Number should be  greater then zero ");
		
		}
		
		GCD G =new GCD(); 
		// max of both no ;
		int max=0;
		if(no2>no1)
		{max=no1;
		no1=no2;
		no2=max;
			
		}
		
		int Gcd = G.gcd(no1, no2);
		// method call to print result
		
		 System.out.println(Gcd);
		}
		catch(InputMismatchException e)// exception handling if string entered;
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		
	}
	public int  gcd(int no1,int no2) 
	// method to find greatest common divisor;
	{
		int rem;
		rem=no1%no2;
		if( rem!=0)
		{
			return gcd(no2,rem);
		}
		else
		return  no2;
	}
}