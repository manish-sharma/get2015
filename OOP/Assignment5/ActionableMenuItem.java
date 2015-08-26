package SocialNetwork;
public class ActionableMenuItem implements MenuItem{
	String displayText; 
	Action action ;
	ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}
	@Override
	public void display() {
		System.out.println(displayText);
		
	}
}
