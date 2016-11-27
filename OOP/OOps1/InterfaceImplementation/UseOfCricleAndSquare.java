package InterfaceImplementation;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UseOfCricleAndSquare {	
	

	/**
	 * ChoseOneOperation a function which is use to select one operation 
	 *
	 * 
	 * @return It return a value of that function which we chose it.
	 */
	private int ChooseOneOperation() {
		int chooseFunction;

		System.out.println("what you do want to calculate.  press 1 for Area of Cricle. press 2 for Area of Square.  press 3 to Exit");
		chooseFunction = (int)UserInput();
		while (chooseFunction > 3 || chooseFunction == 0) {
			System.out.println("the number you entered is not correct");
			chooseFunction =(int)UserInput();
		}

		return chooseFunction;

	}
	/**
	 * UserInput is a function which is use take input from user
	 * 
	 * @return It return a number
	 */
	private double UserInput() {
		double number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number be negative");
				number = UserInput();

		   	}
			return number;
		   } 
		catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		 }

	}
	
	
	public static void main(String args[])
	{
		int ChooseFunction=0;
		double number;
		UseOfCricleAndSquare cricleAndSquare=new UseOfCricleAndSquare();
		
		while(ChooseFunction!=3)
		{	
		  ChooseFunction=cricleAndSquare.ChooseOneOperation();
		  if(ChooseFunction==1)
		    {  System.out.println("Enter the radius");
			  
		     number=cricleAndSquare.UserInput();  
		     
		     Circle circle=new Circle(number);
			  System.out.println(circle.draw()+"   "+circle.getArea());
		  
		  
		   }
		  else if(ChooseFunction==2)
		   {
			  System.out.println("Enter the side");
			  
			     number=cricleAndSquare.UserInput();  
			     Square square=new Square(number);
			      System.out.println(square.draw()+"   "+square.getArea());
			  
			  
			  
		   }
		 
		
		}
		

   }
}