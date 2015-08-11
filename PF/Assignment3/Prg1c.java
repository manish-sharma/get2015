package assignment3;
//program to calculate largest digit
import java.util.Scanner;

public class Prg1c {
	private static Scanner in;
	int max=0;
	public static void main (String args[])
	{
		 in = new Scanner(System.in);
		System.out.println("enter number");
		int a= in.nextInt();
		Prg1c obj = new Prg1c();
		if(a>0)
		{
			System.out.println("largest digit is="+obj.largestdigit(a));
		}
		else
		{
			System.out.println("-1");
		}
		
	}
	//function to calculate largest digit
	 int largestdigit(int x) 
	 {
		 int a;
		
			 while(x!=0)
			 {
				 a= x%10;
				 if(a>max)
				 {
					 max=a;
				 }
				 return(largestdigit (x/10));
			 }
			return max;
		 }
		
}
