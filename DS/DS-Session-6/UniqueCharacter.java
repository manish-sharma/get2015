/*
 * DS-Session-6 assignment
 * @author Banwari kevat
 */
import java.awt.Choice;
import java.util.*;

public class UniqueCharacter { 
	// create a Hash Set to store the character uniquely
	private Set<Character> characterSet; 
	// holds final concordance of characters
	private Map< Character, String > concordanceMap;
	// create a hash map which holds input strings as key and their concordance as value
	static public Map<String, String> cacheMap = new HashMap<String, String>();
	private void readCharacters( String string )
	{   
		try
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
		
		    // create a iterator for characterSet
		     Iterator<Character> setIterator = characterSet.iterator();
		    while(setIterator.hasNext())
		     {  
		     	// initially set the null concordance of each character
		     	concordanceMap.put((char)setIterator.next(), "");
		     }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
    public String findConcordance( String string )
	 {    
    	     readCharacters( string );
		     // take a iterator for characterSet
		     Iterator<Character> setIterator = characterSet.iterator();
		     // cacheMap has entry then check for entered string 
		 
		    if( cacheMap.size() != 0) 
		     {  
			      // take all keys uniqueMap in a keys set
			     Set<String> keys = cacheMap.keySet(); 
			     // take a iterator for keys set
			     Iterator<String> iterator = keys.iterator(); 
			
			     while( iterator.hasNext() ) 
			     {
			     	// any key is equal to string than return value of this key
			     	if( string.equals( (String)iterator.next()) ) 
				     {   System.out.println("use of chache");
				     	return cacheMap.get(string);
				     }
			      }
	
		     }
		
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
		     cacheMap.put(string, result);
		     return result;
		
     }


	public static void main(String args[])
	{   
		try
		{		
		    Scanner sc =  new Scanner(System.in);
		    UniqueCharacter obj = new UniqueCharacter();
		    String choice;
	        do
	        {  
		       //User input of String
		        System.out.print("Enter String: ");
		        String string = sc.next();
		        String result = obj.findConcordance(string);
		        System.out.println(result);	
		        System.out.print("Press 1 for Exit or Any key for next string: ");
		        choice = sc.next();
	        }while(!choice.equals("1"));
		}
		catch (Exception e) {
			  System.out.println(e.getMessage());
		}

   }

}
