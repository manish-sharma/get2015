/****************************************************************************************
Name            : Remainder
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to find remainder of two number.
                :
****************************************************************************************/
import java.util.Scanner;


//Start of remainder class 
public class Remainder {
	
	//findremainder method take two input firstvalue and secondvalue and return remainder of firstvalue and secondvalue
	//@param: Integer firstvalue:Specify first value as input
	//@param: Integer secondvalue:Specify second value as input
	//@param: Integer output:Specify output return by findremainder method
	int findremainder(int firstvalue,int secondvalue)
	{   
		//condition is for firstvalue>=0 and secondvalue>0
		if(firstvalue<0||secondvalue<=0) 
		{
			System.out.println("firstvalue should be > 0 and secondvalue should be >= 0");
			return -1;
		}
		else
		{  
			if(firstvalue>=secondvalue)
			{
				return findremainder(firstvalue-=secondvalue,secondvalue);//recursive calling
			}
			return firstvalue;
		}
		 
	} 
	//End of findremainder method
	
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
			Remainder object=new Remainder();
			output=object.findremainder(firstValue, secondValue);
			System.out.println(output);
			scan.close();
		} 
		//end of try
		catch(Exception e)
		{
			System.out.print("please enter numbers ");
		}
		//End of catch
		
	}
	//End of main method 

}
//End of class
