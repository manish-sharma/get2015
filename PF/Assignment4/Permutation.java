/****
 * @author Girdhari
 * @since 8/ 12 / 2015
 * Program to find all the permutations of a given string 
 * Total number of permutations will be n!
 */

package permutation;

import java.util.ArrayList;
import java.util.List;

/*starting of Permutation class*/
public class Permutation {
	List<String> resultString  = new ArrayList<String>();
	
	/*Starting of main function*/
	public static void main(String args[]) {
		Permutation permutationObj = new Permutation();
		List<String> output= permutationObj.generatePermutations("", "abc");
		System.out.println(output);
	}
	/*Ending of main function*/
		
  /*starting of permutation function*/
	List<String> generatePermutations(String prefixString, String sufixString){
	  if (sufixString.length() <= 1)
		  resultString.add(prefixString + sufixString);
	  else
		  for (int counter = 0; counter < sufixString.length(); counter++) {
			  try {
				  String newString = sufixString.substring(0, counter) + sufixString.substring(counter + 1);
				  generatePermutations(prefixString + sufixString.charAt(counter), newString);
			  } 
			  catch (StringIndexOutOfBoundsException exception) {
				  exception.printStackTrace();
			  }
		  }
	  return resultString;
  }
  /*Ending of permutation function*/
}
/*Ending of permutation class*/
