import java.util.Scanner;

/**
 *
 * @author Sanjay
 */
public class Utility 
{
	
	/** Method to get Integer value from the given
	 * message.
	 * @param message
	 * @return number
	 */
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
	
	
	/** Method to check whether he given input string
	 * has integer values or not
	 * @param input : input string
	 * @return true if string contains only numeric data, false otherwise */
	private static boolean isNumeric(String input) 
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
	
	/** Method to get String input from user 
	 * 
	 * @param message
	 * @return inputStr
	 */
	public static String getStringInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}
	
	/** Method to get character input from user
	 * 
	 * @param message
	 * @return input : first character of input string
	 */
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
	
	/** Method to get array input
	 * 
	 * @param message
	 * @return : integer array
	 */
	public static int[] getArrayInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		int array[] = new int[9];
		for(int i = 0; i < (array.length-1) ; i++)
		{
			array[i] = sc.nextInt();
		}
		return array;
	}
	
}
