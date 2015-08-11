import java.util.Scanner;


public class largestDigitInNumber {
	
	int largest=0;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		largestDigitInNumber objectOflargestdigitInNumber=new largestDigitInNumber();
		int number,digit;
		number=objectOflargestdigitInNumber.getNumber();
		digit=objectOflargestdigitInNumber.largestdigit(number);
		System.out.println("Largest Digit in number "+number+" is "+digit);
		
	}
	
	int getNumber()
	{
		//takes input number from console

		int number=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter number :");
			number=Integer.parseInt(sc.nextLine());

		}
		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
		
	}
	
	int largestdigit(int number)
	{
		//find largest digit in number

		int max=number%10; 

		//divide number in unit digit and assumed maximum

		number=number/10;
  
		//remove last digit of number

		if(number!=0)
		{
			//function call itself

			largest=largestdigit(number);

		}
		
		if(max>largest)
		{
			//if assumed maximum digit is greater than largest digit largest will be updated

			largest=max;
			
		}

		return largest;
	}

}
