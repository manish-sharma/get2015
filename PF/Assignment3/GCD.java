/****************************************************************************************
Name            : GreatestCommanDivisor
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to find gcd of two number.
                :
****************************************************************************************/
import java.util.Scanner;

public class GCD 
{
	//greatestcommondivisor method take two input and return greatestcommondivisor of that numbers
	//@param: Integer firstvalue:Specify first value as input
	//@param: Integer secondvalue:Specify second value as input
	int greatestcommondivisor(int firstvalue,int secondvalue)
	{
		if(firstvalue<0||secondvalue<0) 
		{
			System.out.println("firstvalue should be > 0 and secondvalue should be >= 0");
			return -1;
		}
		else if(secondvalue==0)
		{
			return firstvalue;
		}
		else
		{
			//recursive calling of method greatestcommondivisor
			return(greatestcommondivisor(secondvalue,firstvalue%secondvalue));
		}
	}
	// End of greatestcommondivisor method
	
	/*Starting of main method */
	//@param: Integer firstvalue:Specify first value as input
	//@param: Integer secondvalue:Specify second value as input
	//@param: Integer output:Specify output return by greatestcommondivisor method
	public static void main(String arg[])                                                      
	{
		int firstValue;
		int secondValue;
		int output;
		
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter first number"); 
			firstValue=scan.nextInt();
			System.out.println("Enter second number");
			secondValue=scan.nextInt();
			GCD objectGcd=new GCD();  
			//Calling of greatestcommondivisor method with two input value
			output=objectGcd.greatestcommondivisor(firstValue,secondValue); 
			System.out.print(output);
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
//end of class
