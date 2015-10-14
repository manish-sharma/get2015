package puzzle;
import java.util.Scanner;

/**
 *
 * @author khemanshu rao
 */
public class Utility 
{	
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
