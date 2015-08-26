import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * @author Dheeraj
 * Program to  interfaces using shape example 
 */


public class Assignment3Main
{
	
	public static void main(String []args)
	{
		int sideSquare=0,sideCircle=0;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		try
		{  
			System.out.println("Enter side of square\t");
			sideSquare=Integer.parseInt(input.readLine());
			System.out.println("Enter radius of cirle\t");
			sideCircle=Integer.parseInt(input.readLine());
		}
		catch(IOException ioException)
		{
			System.out.println("Error in Reading");
			System.exit(1);
		}
		catch(NumberFormatException nfException)
		{
			System.out.println("Please enter no in integer format");
			System.exit(1);
		}
		Assignment3Square squareObj = new Assignment3Square(sideSquare);
		Assignment3Circle circleObj = new Assignment3Circle(sideCircle);
 		System.out.println("Area of Square is "+squareObj.getArea());
 		System.out.println("Area of Circle is "+circleObj.getArea());
		
	}

}
