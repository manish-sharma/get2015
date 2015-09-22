
import java.io.IOException;
/**
 * Name: ActionableMenuItem
 * @author Shishir Pareek
 * Since: 20 August,2015
 * Description: this class implements menuItem
 */
public class ActionableMenuItem implements MenuItem
{ 
	// object of Action class
	Action action ;
	// String  to display text
	String displayText; 
	/**
	 * Name: ActionableMenuItem
	 * @param displayText
	 * Description: Display the message and takes the action
	 */
	ActionableMenuItem(String displayText)
	{
		this.displayText = displayText;
	}
	/**
	 * Name: display
	 * Description: Display the text
	 */
	@Override
	public void display() 
	{
		System.out.println(displayText);
	}
	/**
	 *Name: takeAction
	 *Description: takes the choice and performs the action
	 */
	@Override
	public void takeAction(int choice) 
	{
		UserInput reservationObject = new UserInput();
		switch(choice)
		{
		case 1:
			reservationObject.reservation();
			break;
		case 2:
			try
			{
				reservationObject.chart();
				break;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}