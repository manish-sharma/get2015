package com.Menu;

public class ActionableMenuItem implements MenuItem {

	Action action=new Action();

	@Override
	public void display(String displayText) {
		System.out.println(displayText);
	}
	public void display(int displayText) {
		System.out.println(displayText);
	}

	@Override
	public void takeAction(int choice,int operand1,int operand2) {
		
		switch (choice) {
		    case 1: display("Addition is: "+action.addition(operand1, operand2));
			break;
		    case 2: display("Substraction is: "+action.substraction(operand1, operand2));
			break;
		    case 3: display("Multiplication is: "+action.multipliaction(operand1, operand2));
			break;
		    case 4: display("Division: "+action.division(operand1, operand2));
			break;
		    case 5: return;
			
            default:  display("Wrong Input");
			break;
		}
	}

	

}
