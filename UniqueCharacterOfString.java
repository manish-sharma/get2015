package com;
import java.util.*;
import java.util.Map.Entry;
/**
 * @purpose this class named uniqueCharacterOfString is used to Calculate total number of unique characters in a given string 
 *  if same string is repeat then no calculation is performed again it just take previous result using chase
 * @author Sumitra
 * this class contain three methods 
 * @main(),@ UniqueChars(),@ result
 */

public class UniqueCharacterOfString {

	 static Scanner scan = new Scanner(System.in);
		
    /**
     * this is the main method of class UniqueCharacterOfString 
     * this take string from user to calculate number of unique characters in string
     * @param args
     */
	public static void  main(String args[]) {
	
    	 UniqueCharacterOfString uniqueCharaterOfString = new UniqueCharacterOfString();
	        System.out.println("Enter the String:");
	        String userInput = scan.nextLine();
	      uniqueCharaterOfString.result(userInput);
}
    /**
     * this method is calculate all unique characters in a string and substring and store them in to set
     * @param substring it is substring of main string for which we check unique character
     * @return it return set of unique characters in string
     */
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Set UniqueChars(String substring) {
 		Set set = new HashSet();
 		char[] array = substring.toCharArray();
 		for (char c : array) {
 			set.add(c);
 		}
 		return  set;
 	}

	/**
	 * this method is use to perform all operation on a given string 
	 * @param userInput string taken from user
	 * print no of unique characters and unique characters also
	 * 
	 */
	
     @SuppressWarnings({ "unchecked", "rawtypes" })
	public void result(String userInput){
    	 HashMap<String, Set> hash = new HashMap<String, Set>();
         Set  set = new HashSet();
       String[] str = userInput.split(" ");
       for(int i =0;i< str.length; i++){
       	 if(!(hash.containsKey(str[i]))) {
       	set.add(str[i]);
       	hash.put(str[i],UniqueChars(str[i]));
       	 }
       }
       System.out.println("Unique Character in each sub string of entered string \""+userInput+"\" are:");
       for(int i =0;i< str.length; i++){
    	   System.out.println(str[i]+" " +hash.get(str[i]));
       }
      
		Set<Character> set1 = new HashSet<Character>();
		
       for (Entry<String, Set> e : hash.entrySet()) {
			for (Object c : e.getValue()) {
				set1.add((Character)c);
			}
		}
		
		System.out.println("number of unique characters in given string is : " + set1.size());
		System.out.println("unique characters are : " + set1);

     }

}
