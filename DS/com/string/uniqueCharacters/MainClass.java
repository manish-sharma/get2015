package com.string.uniqueCharacters;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
   public static void main(String args[]){
	   System.out.println("*----Find total no. of unique characters in your String----*");
	   int exitFlag=1;
	   int userChoice;
	   String userChoice1;
	   String regix="[0-9]+";
        Scanner scanner=new Scanner(System.in);
        FindNoOfUniqueCharactersInString findNoOfUniqueCharactersInString=new FindNoOfUniqueCharactersInString();
	   while(exitFlag!=0)
		   {
		    
		    do{
		    	System.out.println("\npress 1 for new string,press 0 for exit");
		    	userChoice1=scanner.nextLine();
		    }while(!userChoice1.matches(regix));
		     userChoice=Integer.parseInt(userChoice1);
		     switch (userChoice) {
			case 1:
				System.out.println("put your string here");
				String string=scanner.nextLine();
				Set<Character> uniqueCharactersOfString=new LinkedHashSet<Character>();
				uniqueCharactersOfString=findNoOfUniqueCharactersInString.findNoOfUniqueCharacters(string);
				System.out.println("*----Unique Characters of Your String----*");
				System.out.println(uniqueCharactersOfString.size()+" distinct charaters in your String \n*--"+uniqueCharactersOfString+"--*");
				break;
			case 0:
				exitFlag=0;
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
		   }
	   
	   
   }
}
