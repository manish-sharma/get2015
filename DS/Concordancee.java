import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * purpose : to create a concordance of characters occurring in a string
 * @author Ravika
 * @since 1/9/2015
 */
public class Concordancee {
	static Scanner scanner = new Scanner(System.in);
	public Concordancee() {
		// TODO Auto-generated constructor stub
	} 
	/**
	 *  purpose : to create a concordance of characters occurring in a string
	 * @param hashMap = to store the characters and it's frequency
	 * @param input 
	 */
	public void concordance(HashMap<Character, ArrayList<Integer>> hashMap , String input) {
		int count = 0; 
			while (count < input.length()) {
					ArrayList<Integer> arrayList =  hashMap.get(input.charAt(count));
					if(arrayList == null) {
						arrayList = new ArrayList<Integer>();
					}
					arrayList.add(count);
					hashMap.put(input.charAt(count), arrayList);
					count++;
				
			}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		String input = scanner.nextLine();
		
		HashMap<Character, ArrayList<Integer>> hashMap = new HashMap<Character, ArrayList<Integer>>();
		Concordancee concordance1 = new Concordancee();
		concordance1.concordance(hashMap, input);
		hashMap.remove(' ');
		for(Map.Entry ch : hashMap.entrySet()) {
			System.out.println(ch.getKey() + " - " + ch.getValue());
		}
	}
}
