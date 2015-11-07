package oop5;

public class ActionableMenuItem implements MenuItem{
	String displayText;
	ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}
	@Override
	public void display() {
		System.out.println(displayText);
		
	}
}

