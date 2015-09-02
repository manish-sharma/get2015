import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MainClassConcordance {
	
	public static void main(String args[])
	{
		String input="";
		ConcordanceString concordance = new ConcordanceString();
		if(args.length == 0)
		{
			System.out.println("String is empty");
			System.exit(1);
		}
		for(String str : args)
		{
			input+=str;
		}
		Map<Character, String> charOccurrence =concordance.doConcordance(input);
			Set<Character> keySet = charOccurrence.keySet();
		Iterator<Character> iterator = keySet.iterator();
		while (iterator.hasNext()) 
		{
			Character character = (Character) iterator.next();
			String occurence = (String)charOccurrence.get(character);
			System.out.println(character+" : "+ occurence);
		}
	}
	

}
