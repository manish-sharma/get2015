/**
 * @author: Pooja Khandelwal
 * @created Date : 01/09/2015
 * @@Name :ConcordanceOfStringDemo class
 * @Description : Main class that will take argument from command line and then create concordance of that string and print 
 */
package com.concordance.string;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class ConcordanceOfStringDemo {
	public static Hashtable<Character, Set<Integer>> concordance = new Hashtable<Character, Set<Integer>>();

	public static void main(String args[]) {
		String arg[] = { "hello Pooja", "hey" };
		System.out.println(new ConcordanceOfString().findConcordance(arg));
	}
}
