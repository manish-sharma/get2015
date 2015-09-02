/*
 * DS-Session-6 assignment
 * @author Banwari
 *
 */
import java.util.*;

public class UniqueCharacter {
	// create a Hash Set to take the character uniquely
	private Set<Character> characterSet; 
	
	// holds final concordance of characters
	private Map< Character, String > concordanceMap;
	private void readCharacters( String string )
	{   
		// initialize charcterSet
		characterSet = new HashSet<Character>();  
		// initialize concordanceMap
		concordanceMap = new HashMap< Character, String >(); 
		// take string is in character array
		char[] charArray = string.toCharArray(); 
		
		for( char c: charArray )
		{  // add each character in characterSet
			characterSet.add(c); 
		}
		
		// take a iterator for characterSet
		Iterator<Character> setIterator = characterSet.iterator();
		while(setIterator.hasNext())
		{  
			// initially set the null concordance of each character
			concordanceMap.put((char)setIterator.next(), "");
		}
	}
	
     public String findConcordance( String string )
	  {
		readCharacters( string );
		// take a iterator for characterSet
		Iterator<Character> setIterator = characterSet.iterator();
		
		while( setIterator.hasNext() )
		{
			int count = 0;
			// take one by one character in temp
			char temp = (char)setIterator.next();
			// find first index for character in temp
			int index = string.indexOf(temp);
			concordanceMap.put(temp, "[");
			// if index is find for character
			while( index >= 0 )
			{  // check for another index
				index = string.indexOf(temp, index+1);
				count++; 
			}
			concordanceMap.put(temp, concordanceMap.get(temp)+count+"]");
		}
		
		String result = "";
		for( Map.Entry< Character, String > entry : concordanceMap.entrySet() )
		{
			result = result+entry.getKey()+": "+entry.getValue()+"\n";
		}
		return result;
	}


	public static void main(String args[])
	{   
		try
		{
		
		Scanner sc =  new Scanner(System.in);
	    //User input of String
		System.out.print("Enter String: ");
		String string = sc.next();
		
		UniqueCharacter obj = new UniqueCharacter();
		
		String result = obj.findConcordance(string);
		
		System.out.println(result+"hh");
		
		 }
		  catch (Exception e) {
			  System.out.println(e.getMessage());
		  }

   }

}
