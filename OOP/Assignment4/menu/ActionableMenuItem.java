package menu;

public class ActionableMenuItem implements MenuItem
{
	Action action ;
	String displayText; 
	int choice;

	public ActionableMenuItem (String str)
	{
		displayText  = str;
	}
	
	@Override
	public void display() 
	{
		System.out.println(displayText);
	}

	@Override
	
	public void takeAction ( ) 
	{
		action.perform();
	}
}
