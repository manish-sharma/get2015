package com.Menu;

import java.util.Scanner;

public class Action {
	
	private Scanner sc;
	public int addition(int operand1,int operand2) {
		
		return operand1+operand2;
		
	}
	public int substraction(int operand1,int operand2) {
		return operand1-operand2;
		
	}
	public int multipliaction(int operand1,int operand2) {
		return operand1*operand2;
		
	}
	public int division(int operand1,int operand2) {
		if(operand2==0){
			System.out.print("Devide by zero exception");
			System.out.print("Please enter somthing else ");
			sc = new Scanner(System.in);
			operand2=sc.nextInt();
			return operand1/operand2;
		}
		 return operand1/operand2;
		
	}
	
	
}
