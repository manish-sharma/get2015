package anshitaarya;

import java.util.*;



public class assignment1 {

	private static Scanner in;

	public static void main (String args[])
	{
		in = new Scanner(System.in);
		 int num,decimal,octal;
		 assignment1 obj=new assignment1();
		 System.out.println("enter binary number");
		 num=in.nextInt();
		 decimal= obj.convertTodecimal(num);
		 octal= obj. convertTooctale(decimal);
		 System.out.println("dec number is"+decimal);
		 System.out.println("Octal number is"+octal);
	
	}
	
	int convertTodecimal (int x)
	{
		
	int decimal=0,i=1,rem;
		while(x!=0)
		{
		rem= x%10;
		
		
		decimal=((rem*i)+decimal );
		
		x=x/10;
		
		i=i*2;
		
		}
		return (decimal);
	}
	
	int convertTooctale (int y)
	{
		int octal=0, rem,i=1 ;
		while(y!=0)
		{
		rem= y%8;
		

		octal=octal + (rem*i);
		y= y/8;
		i=i*10;
		}
		return (octal);
}
}
