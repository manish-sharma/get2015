import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * purpose : to create a concordance of characters occurring in a string
 * @author Ravika
 * @since 1/9/2015
 */
public class Concordance {
	static Scanner scanner = new Scanner(System.in);
	public Concordance() {
		// TODO Auto-generated constructor stub
	} 
	/**
	 *  purpose : to create a concordance of characters occurring in a string
	 * @param hashMap = to store the characters and it's frequency
	 * @param input 
	 */
	public void concordance(HashMap<Character, Integer> hashMap , String input) {
		int count = 0; 
			while (count < input.length()) {
				if(hashMap.containsKey(input.charAt(count))) {
					hashMap.put(input.charAt(count), (Integer)hashMap.get(input.charAt(count))+1);
					count++;
				} else {
					hashMap.put(input.charAt(count), 1);
					count++;
				}
			}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		String input = scanner.nextLine();
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		Concordance concordance1 = new Concordance();
		concordance1.concordance(hashMap, input);
		hashMap.remove(' ');
		for(Map.Entry ch : hashMap.entrySet()) {
			System.out.println(ch.getKey() + " - " + ch.getValue());
		}
	}
}
