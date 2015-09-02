import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ConcordanceString {


	public Map<Character, String> doConcordance(String input)
	{
		String occur="[";
		if(input.equals(""))
			return null;
		char charInput[]=input.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		
		for(int index=0;index<charInput.length;index++)
			charSet.add(charInput[index]);
		
		Map<Character, String> charOccurrence = new HashMap<Character, String>();
		
		for(Character ch : charSet)
		{
			charOccurrence.put(ch, "");
		}
	
		for(Character ch : charSet)
		{
			for(int index=0;index<charInput.length;index++)
				if(ch==charInput[index])
					occur+=index + "," ;
			occur=occur.substring(0,occur.length()-1);
			charOccurrence.replace(ch , occur+"]");
			occur="[";
		}
		return charOccurrence;
	}
}
