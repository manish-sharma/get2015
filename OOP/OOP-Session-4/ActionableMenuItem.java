/*
 * This class implements the MenuItem
 * @author Banwari
 */
import java.io.IOException;
public class ActionableMenuItem implements MenuItem
{ 
	// object of Action class
	Action action ;
	// String  to display text
	String displayText; 
	/*
	 * parameterized constructor
	 * @param dsplayText is the text which will display on console
	 */
	ActionableMenuItem(String displayText)
	{
		this.displayText = displayText;
	}
	//display text of option
	public void display() 
	{
		System.out.println(displayText);
	}
	
	 // takes the choice and performs the action
	public void takeAction(int choice) 
	{
		Trains trains = new Trains();
		switch(choice)
		{
		case 1: {
			trains.totalTrains();
			break;
		}
		case 2:
		    {
				trains.totalTrains("Good");
				break;
		    }	
		case 3:{
			trains.totalTrains("Passanger");
			break;
		}
		case 4:{
			System.exit(0);
		}
			}
		
		}
		
	}


