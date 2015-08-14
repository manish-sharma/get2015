package assignment3;
//program to calculate  greatest common digit
import java.util.Scanner;

public class GreatestCommon {
	private static Scanner in;
	public static void main (String args[])
	{
		 in = new Scanner(System.in);
		int a,b,c;
		System.out.println ("Enter number1");        //user inputs numbers
	    a=in.nextInt();                            
	   
	    System.out.println ("Enter number2");        
	    b=in.nextInt();
	    
	    GreatestCommon obj=new GreatestCommon();
	     
	    c= obj.gcd (a,b);
	    
	    c= obj.gcd (a,b);
	    System.out.println("GCD is="+c);
	     
	}
	
	//function to calculate GCD
	int gcd(int x, int y)
	{
	  
		 while(x!=y)
		 {
			 if(x>y)
			 {
				 return(gcd(x-y,y));
			 }
			 
			 else
			 {
				 return(gcd(y-x,x));
			 }
		 }
		
			 return x;
		 
	   }
	 
	}

