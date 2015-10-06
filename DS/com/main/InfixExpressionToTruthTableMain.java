/**
 * @author Pooja Khandelwal
 * @created date 10/06/2015
 * @name InfixExpressionToTruthTableMain
 * @description Main class to create truth table for a boolean expression
 */
package com.main;

import com.InfixExpressionToTruthTable.TruthTableGenerator;
import com.validate.Validation;

public class InfixExpressionToTruthTableMain {
	public static void main(String[] args) {
		java.util.Scanner sc = null;
		TruthTableGenerator truthTableObj = null;
		try {
			// choice will hold choice of user
			String choice;
			do {
				System.out.println("Enter a String");
				sc = new java.util.Scanner(System.in);
				// input will contain infix expression
				String input = sc.next();
				// converting whole expression to lower case
				input = input.toLowerCase();

				// validating the input expression
				if (Validation.isExpression(input)) {
					// If input is validated then it will be evaluated to
					// generate truth table

					truthTableObj = new TruthTableGenerator();
					truthTableObj.truthTableGenerator(input);
				} else {
					System.out.println("Enter Valid Expression");
				}
				System.out
						.println("Press Y ot y to continue and any other key to exit");
				// taking user's choice as input
				choice = sc.next();
				if (!(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y')) {
					System.out.println("System Exit");
					System.exit(0);
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
