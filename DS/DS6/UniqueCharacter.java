import java.io.*;
import java.util.*;
//class to convert in concordance
public class UniqueCharacter {
	static private HashMap<String,String> uniqueMap=new HashMap<String,String>();
	HashSet<Character> characterSet;
	HashMap<Character, Integer> concordanceMap;
	public void readCharacter(String inputString) {//method to read character from input string
		characterSet =new HashSet<Character>();
		concordanceMap=new HashMap<Character, Integer>();
		char charList[]=inputString.toCharArray();
		for(char c:charList) {//to copy all the character in set from char array
			characterSet.add(c);
		}
		Iterator<Character> it=characterSet.iterator();
		while(it.hasNext()) {
			concordanceMap.put((char)it.next(),0);
		}
	}
	public String findConcordance(String inputString) {//method to convert in concordance
		String result="";
		boolean isFoundKey=false;
		if(uniqueMap.size()!=0) {
			Set kyesOfUniqueMap=uniqueMap.keySet();
			Iterator<Set> iterator=kyesOfUniqueMap.iterator();
			while(iterator.hasNext()) {
				if(inputString.equals(iterator.next())) {
					isFoundKey=true;
					result=uniqueMap.get(inputString);
				}
			}
		}
		if(isFoundKey==false) {
			readCharacter(inputString);
			Iterator<Character> it=characterSet.iterator();
			while(it.hasNext()) {
				int count = 0;
				char temp=it.next();
				int index=inputString.indexOf(temp);
				while(index>=0) {
					count++;
					index=inputString.indexOf(temp, index+1);
					}
				concordanceMap.put(temp, count);
				}	
			result=concordanceMap.toString();
			uniqueMap.put(inputString, result);
			}	
		return result;
		}
	}
class Concordance {
	public static void main(String[] args) throws IOException {
		String inputString="";//for taking input from command line
		Scanner sc=new Scanner(System.in);
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int choise=0;
		try {
			do {
				System.out.println("Enter your choise");
				System.out.println("\n1:To enter a string\n2:exit");
				do {
					while(!sc.hasNextInt()) {
						System.out.println("Please enter integer value only");
						sc.nextInt();
					}
					choise=sc.nextInt();
				}while(choise<=0 || choise>2);
				switch(choise) {
				case 1:
					System.out.println("Enter string");
					inputString=input.readLine();
					UniqueCharacter uniqueCharacterObject=new UniqueCharacter();
					String result=uniqueCharacterObject.findConcordance(inputString);
						System.out.println(result);
					break;
				case 2:
					System.exit(0);
				}
			}while(true);
		}catch(InputMismatchException exception) {System.out.println("Please enter correct value");}
		sc.close();
	}	
}
