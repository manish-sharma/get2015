import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
//class to convert in concordance
public class ConvertConcordance {
	HashSet<Character> characterSet =new HashSet<Character>();
	HashMap<Character, String> concordanceMap=new HashMap<Character, String>();
	
	public void readCharacter(String inputString) {//method to read character from input string
		char charList[]=inputString.toCharArray();
		for(char c:charList) {
			characterSet.add(c);
		}
		Iterator<Character> it=characterSet.iterator();
		while(it.hasNext()) {
			concordanceMap.put((char)it.next(),"");
		}
	}
	public void findConcordance(String inputString) {//method to convert in concordance
		readCharacter(inputString);
		Iterator<Character> it=characterSet.iterator();
		while(it.hasNext()) {
			int count = 0;
			char temp=it.next();
			int index=inputString.indexOf(temp);
			concordanceMap.put(temp, "[");
			while(index>=0) {
				if(count>0) {//for multiple occurrence of item
					concordanceMap.put(temp,concordanceMap.get(temp)+","+(index+1));
					index=inputString.indexOf(temp, index+1);
				}
				else {//for the first occurrence of an item
					concordanceMap.put(temp,concordanceMap.get(temp)+(index+1));
					index=inputString.indexOf(temp, index+1);
					count++;
				}
			}
			concordanceMap.put(temp, concordanceMap.get(temp)+"]");
		}	
	}
} 