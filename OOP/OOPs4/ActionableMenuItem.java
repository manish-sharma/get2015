import java.io.IOException;

public class ActionableMenuItem implements MenuItem
{ 
	// object of Action class
	Action action ;
	// String  to display text
	String displayText; 
	/**
	 *  Display the message and takes the action
	 */
	ActionableMenuItem(String displayText)
	{
		this.displayText = displayText;
	}
	/**
	 *  Display the text
	 */
	@Override
	public void display() 
	{
		System.out.println(displayText);
	}
	/**
	 **takeAction is function which is used to takes the choice and performs the action
	 */
	@Override
	public void takeAction(int choice) 
	{
		
		Participant participant = new Participant();
		Questions questions = new Questions();
		
		
			switch (choice)
			{
			case 1: 
			{
				questions.readQuestions();
				participant.AnswerOfQuestion();
				break;
			}
			case 2:
			{

				participant.CalculatedTotalPercentageDistribution();
				break;
			}

			case 3:
			{
				participant.PrintParticipantResponse();
				break;
			}
			case 4:
				choice = 4;
			}

		}

	
	}


