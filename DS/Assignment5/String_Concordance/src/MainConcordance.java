/**
 * Program to find concordance of characters in a given string through Command Line.
 */
import java.util.Map;

/**
 * @author Amit
 *
 */
public class MainConcordance {

	public static void main(String args[]) {
		try
		{
			/* Initialization */
			String inputString = "";
			Concordance concordanceObj = new Concordance();
			
			/* Iterating args[] of string */
			for(String s : args) {
				inputString += s;
			}
			
			boolean result = concordanceObj.findConcordance(inputString);
			if(result == false) {
				System.out.println("Input String is null or empty");
			}
			else
			{
				/* Iterating Map using Map.Entry */
				for(Map.Entry<Character, String> entry : Concordance.concordanceMap.entrySet()) {
					System.out.println(entry.getKey()+": "+entry.getValue());
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	
