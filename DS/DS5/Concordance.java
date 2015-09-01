import java.util.Map;
//class to take input and to show output
public class Concordance {
	public static void main(String[] args) {
		String inputString="";//for taking input from command line
		for(int i=0;i<args.length;i++) {
			inputString=inputString+args[i];	
		}
		ConvertConcordance concordanceObject=new ConvertConcordance();
		concordanceObject.findConcordance(inputString);
		for(Map.Entry<Character, String>entry:concordanceObject.concordanceMap.entrySet()) {//to show output
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
}
