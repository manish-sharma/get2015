/****************************************************************************************
Name            : LargestDigit
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to find largest digit in a number.
                :
****************************************************************************************/
import java.util.Scanner;

public class LargestDigit {
	
	//largestdigit method take one input and return largestdigit
	//@param: Integer firstvalue:Specify value as input
	int largestdigit(int value)
	{
		if(value<0) 
		{
			System.out.println("value should be > 0 ");
			return -1;
		}
		else if(value==0)
		{
		return 0;
		}
		else if(value%10>largestdigit(value/10))
		{
		return value%10;
		}
		else
		{
		return largestdigit(value/10);
		}
	}
	//End of method
	
	//start of main
	//@param: Integer value:Specify second value as input
	//@param: Integer output:Specify output return by largestdigit method
	public static void main(String arf[])
	{
		
		int value;
		int output;
		LargestDigit object= new LargestDigit();
		
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter number"); 
			value=scan.nextInt();
			output=object.largestdigit(value);
			System.out.print("largest digit is ="+output);
			scan.close();
		} 
		//end of try
		catch(Exception e)
		{
		System.out.print("please enter numbers ");
		}
		//End of catch
	}
	//end of main

}
//End of class
