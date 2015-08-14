/****************************************************************************************
Name            : PrintShape
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This is a interface that conains two method 
                :
****************************************************************************************/

import java.util.Scanner;
public class PrintSpace {
	
	//Start of main method
	//@param int radious contain radious of circle
	//@param int size specify size of square
	public static void main(String[] args)
	{
		int radious;
		int size;
		try{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter circle radious");
			radious=scan.nextInt();
			Circle cirObject=new Circle(radious);
			System.out.println("Enter square size");
			size=scan.nextInt();
			Square sqObject=new Square(size);
			cirObject.draw();
			System.out.println("Area ="+cirObject.getArea());
			sqObject.draw();
			System.out.println("Area ="+sqObject.getArea());
			scan.close();
		}
		//End of try
		catch(Exception e)
		{
			e.printStackTrace();
		}//End of catch
		
	}
	//End of main 

}
//End of PrintSpace class

