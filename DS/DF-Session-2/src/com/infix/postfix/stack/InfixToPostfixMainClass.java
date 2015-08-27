package com.infix.postfix.stack;

import java.util.Scanner;

import com.stack.linked.list.Stack;

public class InfixToPostfixMainClass {
	//static char topCharacter = '.';

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter expression in Infix Notation ");
		String infixExpression = scanner.nextLine();

		InfixToPostfixMainClass infixToPostfixMainClass = new InfixToPostfixMainClass();
		// char infix[]=new char[infixExpression.length()];
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> top1 = new Stack<Character>();
		top1=null;
		int i = 0;
		int topPrecedencyLevel = 0, inPrecedencyLevel;
		String postfix ="";
		for (i = 0; i < infixExpression.length(); i++) {
			// infix[i]=infixExpression.charAt(i);
			// System.out.println(infix[i]);
			if (infixExpression.charAt(i) == '(') {
				top1= stack.push(infixExpression.charAt(i));
				System.out.println(infixExpression.charAt(i)+" pushed into stACK");
			}

			else if (infixExpression.charAt(i) == '+'
					|| infixExpression.charAt(i) == '-'
					|| infixExpression.charAt(i) == '*'
					|| infixExpression.charAt(i) == '/'
					|| infixExpression.charAt(i) == '^') {
				int flag=0;
				inPrecedencyLevel = infixToPostfixMainClass
						.findPrecedencyOfOperator(infixExpression.charAt(i));
				if( top1!= null){
				while (top1.nodeValue != '(' ) {
					if (top1.nodeValue  == '+' || top1.nodeValue  == '-'
							|| top1.nodeValue  == '*' || top1.nodeValue  == '/'
							|| top1.nodeValue  == '^') {
						topPrecedencyLevel = infixToPostfixMainClass
								.findPrecedencyOfOperator(top1.nodeValue);

						if (topPrecedencyLevel >= inPrecedencyLevel) {
							System.out.println(top1.nodeValue
									+ " added in postfix string");
							postfix = postfix + top1.nodeValue;
							top1 = stack.pop();

							
						} else {
 
							top1 = stack.push(infixExpression.charAt(i));
							System.out.println(infixExpression.charAt(i)
									+ " pushed into stACK"); 
							flag=1;
							break;
						}
					} 
					else {

						top1 = stack.push(infixExpression.charAt(i));
						System.out.println(infixExpression.charAt(i)
								+ " pushed into stACK");
						flag=1;
						break;
					}
					if(top1==null){
						top1 = stack.push(infixExpression.charAt(i));
						System.out.println(infixExpression.charAt(i)
								+ " pushed into stACK");
						flag=1;
						break;
					}
				}
				if(flag==0){
				top1 = stack.push(infixExpression.charAt(i));
				System.out.println(infixExpression.charAt(i)
						+ " pushed into stACK");
				}
			} else {
				top1 = stack.push(infixExpression.charAt(i));
				System.out.println(infixExpression.charAt(i)
						+ " pushed into stACK");
			}
			}
			else if (infixExpression.charAt(i) == ')') {
				if(  top1!= null){
				while (top1.nodeValue != '(' ) {
					System.out.println(top1.nodeValue+" added into postfix string");
					postfix = postfix + top1.nodeValue;	
					top1= stack.pop();
					
				}
				top1 = stack.pop();
				}
			}
			else {
				postfix = postfix + (infixExpression.charAt(i));
				System.out.println(infixExpression.charAt(i)
						+ " added in postfix string");
			}
		}
		if(top1!=null){
			System.out.println(top1.nodeValue+" added into postfix string");
			postfix = postfix + top1.nodeValue;	
			top1= stack.pop();
		}
		System.out.println("Postfix String Is :\n" + postfix);

	}

	private int findPrecedencyOfOperator(char topCharacter2) {
		// TODO Auto-generated method stub
		int precedencyLevel ;
		if (topCharacter2 == '+' || topCharacter2 == '-') {
			precedencyLevel = 1;

		} else if (topCharacter2 == '*' || topCharacter2 == '/') {
			precedencyLevel = 2;
		} else {
			precedencyLevel = 3;
		}
		return precedencyLevel;
	}

}
