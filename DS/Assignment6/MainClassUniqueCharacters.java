
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClassUniqueCharacters 
{

	public static void main(String args[]) 
	{
		Scanner scan=null;
		BufferedReader bufferedReader=null;
		String inputString="";
		int noOfUniques, choice;
		UniqueCharacters uniqueCharacters=null;;
		scan = new Scanner(System.in);
		uniqueCharacters = new UniqueCharacters();
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Enter a String: ");
			inputString =readString(bufferedReader);
			noOfUniques = uniqueCharacters.countUniqueCharacters(inputString);
			System.out.println("Number of Unique characters in " +inputString+" : " + noOfUniques);
			System.out.println("press 1 to continue and any other numebr for exit");
			while(!scan.hasNextInt()) 
			{
				System.out.println("Please Enter a number only");
				scan.next();
			}
			choice = scan.nextInt();
		}while(choice == 1);
		if(choice != 1) 
		{
			scan.close();
			System.out.println("System Exit");
			System.exit(1);
		}
	}
	
	
	public static String readString(BufferedReader bufferedReader)
	{
		String input="";
		do
		{
			try
			{
				input=bufferedReader.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.println("Error occured please enter input again");
				continue;
			}
			if(!input.equals(""))
				break;
			System.out.println("Please enter correct input");
		}while(true);
	
		return input;
	}
}
	
