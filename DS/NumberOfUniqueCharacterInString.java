import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * Purpose :  to check Number of Unique Character in String
 * store the data previously encountered string
 * @author Ravika
 * @since 2/9/2015
 */

public class NumberOfUniqueCharacterInString {
	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
	/**
	 * to retrieve the stored result
	 * to check Number of Unique Character in String
	 * @param input
	 * @return
	 */
	public int numberOfUniqueCharacterInString( String input) {
		if(hashMap.containsKey(input)) {
			return hashMap.get(input);
		}
		Set<Character> setOfUniqueCharacters = new HashSet<Character>();
		for(int count = 0; count < input.length() ; count++) {
			setOfUniqueCharacters.add(input.charAt(count));
		}
		hashMap.put(input, setOfUniqueCharacters.size());
		return setOfUniqueCharacters.size();
	}
	
	/**
	 * to print the stored data
	 */
	public void printList() {
		if(hashMap.isEmpty()) {
			System.out.println("there is no string ,checked by function ");
		}
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("number of unique characters in \"" + entry.getKey() + "\" -" + entry.getValue());
		}
			
	}
	
	/**
	 * to display menu
	 * @return choice
	 */
	int displayMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		
			try {
				System.out.println("Enter 1 to check Number of Unique Character in String \n 2 for print the list of strings checked by function \n 3 for exit");
				choice = scanner.nextInt();
				if(choice <1 && choice >3) {
					throw new InputMismatchException();
				}
				
			} catch(InputMismatchException ie) {
				scanner.close();
				System.out.println("Enter 1/2/3");
			}
		
		return choice;
	}
	
	
	public static void main(String[] args) {
		NumberOfUniqueCharacterInString object = new NumberOfUniqueCharacterInString();
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		while(true)  {
			boolean flag = true;
			while(flag){
				try {
					choice = object.displayMenu();
					flag = false;
				} catch(InputMismatchException ie) {
					System.out.println("Enter 1/2/3");
				}
			}
						
			switch (choice) {
			case 1:
				System.out.println("Enter the String ");
				String input = scanner.next();
				int count = object.numberOfUniqueCharacterInString(input);
				System.out.println("number of unique characters in \"" + input + "\" is " + count);
				break;
			case 2:
				System.out.println(" list of strings checked by function \n ");
				object.printList();
				break;
			case 3:
				scanner.close();
				System.exit(0);
			default:
				break;
			}
		}
		
	}

}
