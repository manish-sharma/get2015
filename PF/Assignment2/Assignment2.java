package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Class for finding permutation of elements of string
public class Assignment2 {
	static List<String> result; // Object of List String type is declared

	public static void main(String[] args) {
		Assignment2 permutation = new Assignment2();
		result = new ArrayList<String>();
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		result = permutation.generatePermutations("", str);
		Iterator<String> itr = result.iterator(); // getting Iterator from
													// arraylist to traverse
													// elements
		while (itr.hasNext()) { // hasNext() gives value true if next string is
								// present in the list
			System.out.println(itr.next()); // next() returns the next string in list
		}

	}

	List<String> generatePermutations(String prefix, String input) // Function for finding permutation of elements of string
	{
		int n = input.length();
		if (n == 0)
			result.add(prefix);
		else {
			for (int i = 0; i < n; i++)
				generatePermutations(prefix + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, n));
		}
		return result;

	}
}
