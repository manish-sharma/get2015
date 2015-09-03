import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters 
{
	// for storing the string and its no of unique characters
	private static Map<String, Integer> cache = new HashMap<String, Integer>(); 
	
	public Integer countUniqueCharacters(String inputString) 
	{
		
		Set<Character> characterSet = new HashSet<Character>();
		
		if(cache.containsKey(inputString)) //if string is already exist in cache
		{
			return cache.get(inputString);
		}
		else //otherwise calculate unique character in string 
		{
			char[] charArray = inputString.toCharArray();
			for(char c : charArray)
				characterSet.add(c);
			
			int size = characterSet.size();
			cache.put(inputString, size);
			return size;
		}
	}
}
