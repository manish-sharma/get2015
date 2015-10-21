import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CharactersOccurringInString {
	public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
     String string=scanner.nextLine();
     calculteCharactersOccurringInString(string);
	}
	/**
	 *  calculteCharactersOccurringInString function which is determine the each index of every character in a string.
	 *
	 */
	public static void calculteCharactersOccurringInString(String string) {
		Set<String> set = new HashSet<String>();
		
		string = string.replaceAll("\\s", "");//remove white spaces from string
	
		for (int count = 0; count < string.length(); count++) {
			set.add("" + string.charAt(count)); //add each character in the set

		}
		String string2[] = new String[set.size()];
		int val = 0;
		for (String str : set) {
			for (int count = 0; count < string.length(); count++) 
			{  //check indexes of every character
				
				if (str.equals(string.charAt(count) + "")) 
				{
					if (string2[val] != null)
						string2[val] = string2[val] + ","
								+ string.indexOf(str, count);
					else
						string2[val] = str + "      =    "
								+ string.indexOf(str, count);
				}

			}
			val++;

		}

		for (int count = 0; count < string2.length; count++)
			System.out.println(string2[count]);//print all character with it's indexes 

	}
}
