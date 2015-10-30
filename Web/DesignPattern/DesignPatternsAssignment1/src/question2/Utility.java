package question2;

import java.util.Scanner;

public class Utility 
{
	public static int getintegerInput(String message)
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if(isNumeric(inputStr) && (Integer.parseInt(inputStr)>0))
			{
				number=Integer.parseInt(inputStr);
				return number;
			}
			else
			{
				System.out.println("Enter positive integer value");
			}
		}while(true);
	}
	
	public static boolean isNumeric(String input) 
	{
		try 
		{
			Integer.parseInt(input);
		} 
		catch (NumberFormatException e) 
		{
			return false;
		}
		
		return true;	
	}
	
}
