package Question2;

import java.util.Scanner;

public class TruthTableMain {

	public static void main(String[] args) {
		String booleanExpressionInfix = "";
		Scanner sc = new Scanner(System.in);

		TruthTable objTruthTable = new TruthTable();
		
		System.out.println ("Enter the boolean expression : ");
		booleanExpressionInfix = sc.next();
		String booleanExpressionPostfix = objTruthTable.infixConversion (booleanExpressionInfix);
		String str = objTruthTable.getVariablesInExpresssion(booleanExpressionPostfix);
		System.out.println ( "\nTruth table : ");
		objTruthTable.generateTruthTable(booleanExpressionPostfix, str);
	}

}
