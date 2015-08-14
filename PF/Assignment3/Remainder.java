package assignment3;

import java.util.Scanner;

public class Remainder {
	
	
	private static Scanner in;
// program to calculate remainder
	public static void main (String args[])          //main class
	{
	     in = new Scanner(System.in);
	     int a,b;
	     System.out.println ("Enter dividend");
	     a=in.nextInt();                             //user inputs dividend
	   
	     System.out.println ("Enter divisor");        //user inputs divisor
	     b=in.nextInt();
	    
	     Remainder obj=new Remainder();                      // object created
	     int c= obj.rem(a, b);
	     System.out.println ("Remainder is" + c);
	    
	  
	}
// recursive function to calculate remainder
	int  rem(int x, int y)
	{
		int a;
	    a=x;
	    if( x>=0 && y>0)                                
	    {
	    	if(a>=y)
	    	{
	    		  a=a-y;
	    		  return   rem(a,y);
	    	}
	     
	    
	     else
	     {
	    	 return a;
	     }

	    }
	     else
	     {
	    	 return -1;
	     }
	    
	}
	    
}
