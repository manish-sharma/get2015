package SlidingPuzzle;

import java.util.Scanner;
public class Utility 
{
	public static int getIntegerValue(String message)
	{
		
		Scanner sc=new Scanner(System.in);
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
	
	public static String getStringInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}
	
	public static char getCharacterInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		char input = sc.next().charAt(0);
		if((input == 'y' || input == 'Y') || (input == 'n' || input == 'N'))
		{
			return input;
		}
		else
		{	
			return getCharacterInput(message);
		
		}
		
	}
	public static int[] getArrayInput(String message,int n)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		int size = n*n;
		int array[] = new int[size];
		for(int i = 0; i < array.length ; i++)
		{
			array[i] = sc.nextInt();
		}
		return array;
	}
	
}
