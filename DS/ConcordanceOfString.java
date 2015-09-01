import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
/**
 * class for the concordance of string
 * @author Ankur
 *
 */
public class ConcordanceOfString {
  public static Hashtable<Character,Set<Integer>> concordance=new Hashtable<Character,Set<Integer>>();
   /**
    * main method
    * @param args
    */
   public static void main(String args[]){
	   String arg[]={"hello james","hey"};   
	   int length=arg.length;
	   int index=0;
   
	   for(int i=0;i<length;i++){
		   for(int j=0;j<arg[i].length();j++){
			   char character=arg[i].charAt(j);  
			   if(!(concordance.containsKey(character))){
				   Set<Integer> indexValue=new HashSet<Integer>();
				   indexValue.add(index);
				   index++;
				   concordance.put(character,indexValue);
			   }
			   else{
				   ///indexValue.add(i);
				   //concordance.put(character,indexValue);
				   Set<Integer> indexValue=concordance.get(character);
				   indexValue.add(index);
				   index++;
				   concordance.put(character,indexValue);
			   }    
		   } 
       }
       System.out.println(concordance);
   }
   
}