package com;

import java.util.*;
/**
 * @author Sumitra
 * this class concordance  used to check index of all character in a string taken by user
 * using @main()method and @ concordanceStiring() method
 */
public class Concordance {
           
	                 static Scanner scan = new Scanner(System.in);
	
 /**
  * this is the main method to check concordance take string from user
  * @param args
  */
	 public static void main(String []args){
		              Set<Character> setCharacter = new HashSet<Character>();
                      String stringToConcordance =null;
                      int j=0;
		              System.out.println("Enter String to check concordance");
          try{
			          stringToConcordance = scan.nextLine();
			  		
             }catch(InputMismatchException p){
			
            	     System.out.println("enter valid value\n**Exit**");
		}
          char[] stringArray= new char[stringToConcordance.length()];
           for(int i =0; i < stringToConcordance.length() ; i++){
        	  
        	   if(stringToConcordance.charAt(i) != ' '){
        		   stringArray [j]=stringToConcordance.charAt(i);
        		   setCharacter.add(stringToConcordance.charAt(i));
	               j++;
        		
        	   }
        	   else{
        		  
        		   stringArray =Arrays.copyOf(stringArray, stringArray.length-1);

            }
           }
	               Concordance concordance = new Concordance();
	               concordance.concordanceString(stringArray, setCharacter);
          
 }           
 /**
 * 
* @param stringAarry array of String entered by user
* @param setCharacter set of unique characters in string given by user
* @return nothing
*/
 private void concordanceString(char[] stringAarry ,Set<Character> setCharacter) {
                   String match = setCharacter.toString();
	
           for(int count = 1; count < match.length()-1;count++){
		
        	    if(match.charAt(count)== ' '|| match.charAt(count)==','){}
		        else{
		           System.out.print(match.charAt(count)+" = {");
		   for(int i =0;i<stringAarry.length ; i++){
		 
			   if(stringAarry[i] == match.charAt(count)){
				   System.out.print(i+",");
			  }
			}
		          System.out.print("}\n");
		}
		
		}
}


}

