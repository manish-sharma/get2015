package SocialNetwork;



public class ActionableMenuItem implements ImenuItem{
	String displayText;
	ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}
	@Override
	public void display() {
		System.out.println(displayText);
		
	}
}

