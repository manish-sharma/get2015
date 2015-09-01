/**
 * @author : Pooja Khandelwal
 * @created Date : 01/09/2015
 * @Name : ConcordanceOfStringCharacters class
 * @description : this class will take string from user and use function of ConcordanceOfStringCharacters class to create concordance of given string
 */

package com.string.concordanceOfCharacters;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]){
		ConcordanceOfStringCharacters concordanceOfStringCharacters=new ConcordanceOfStringCharacters();// ConcordanceOfStringCharacters class object
		String string;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Write any string");
		string=scanner.nextLine();
		concordanceOfStringCharacters.createConcordance(string); //call createConcordance() function of ConcordanceOfStringCharacters class
		}
}
