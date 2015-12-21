package surveyApplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Participant 
{

	private int singleChoice;
	private String multipleChoice;
	private String feedBack;
	private List<Answer> ParticipantAnswer = new ArrayList<Answer>();
	
	
	
	/**
	 * UserInput is a function which is use take input from user
	 * 
	 * @return It return a number
	 */
	
	private int UserInput() {
		int length;
		try 
		{
			Scanner sc = new Scanner(System.in);

			length = sc.nextInt();
			if (length < 1 || length > 4) {
				System.out.println("enter the correct input");
				length = UserInput();

			}
			return length;
		}
		catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			length = UserInput();
			return length;
		}

	}
	/**
	 *UserInputForMultipleQuestion is a function which is use take multiple input from user and combine it into one string.
	 * 
	 * @return It return a String
	 */
	private String UserInputForMultipleQuestion() 
	{

		String mulString = "";
		int count = 2;
		
		boolean ServiceQuality = false, Communication = false, DeliveryProcess = false;
		
		Scanner scanner = new Scanner(System.in);

		while (count == 2)
		{
			

			String Input = scanner.nextLine();
			System.out.println(Input);

			if (Input.equals("Service Quality") && ServiceQuality == false)
			{
				if(!mulString.equals(""))
					mulString=mulString+",";
				
				mulString = mulString + Input; 
				ServiceQuality = true;
				
				if (ServiceQuality && Communication && DeliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return mulString;
				}
				
				System.out.println("if you want to add one more option than press 2 othewise 1");
				count = UserInput();

			}

			else if (Input.equalsIgnoreCase("Communication")&& Communication == false)
			{
				if(!mulString.equals(""))
				    mulString=mulString+",";
			
				mulString = mulString + Input;
				Communication = true;
				
				if (ServiceQuality && Communication && DeliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return mulString;
				}
			
				System.out.println("if you want to add one more option than press 2 othewise 1");
				count = UserInput();
			}

			else if (Input.equalsIgnoreCase("Delivery Process")	&& DeliveryProcess == false)
			{
				if(!mulString.equals(""))
				   mulString=mulString+",";
			
				mulString = mulString + Input;
				DeliveryProcess = true;
			
				if (ServiceQuality && Communication && DeliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return mulString;
				}
			
				System.out.println("if you want to add one more option than press 2 othewise 1");
				count = UserInput();
			} 
			else 
			{
				System.out.println("Enter the correct input");

			}

		}

		return mulString;
	}

	private int readSurvey()
	{
		int answer;//store the choice of user
				
		System.out.println("Enter your choice:");
		System.out.println("1. Give Feedback");
		System.out.println("2. Total Percentage Distribution");
		System.out.println("3. Final Output");
		System.out.println("4. Exit");
		answer = UserInput();
		return answer;
	}
	
	/**
	 *UserInputForMultipleQuestion is a function which is used to store the answer of every participant.
	 * 
	  */
	private void AnswerOfQuestion()
	{
		Questions questions = new Questions();
		Scanner scanner = new Scanner(System.in);

		System.out.println(questions.SingleChoice());
		singleChoice = UserInput();

		System.out
				.println("this is mulitiple type Question You can Select one of more choice");

		System.out.println(questions.MultipleChoice());
		multipleChoice = UserInputForMultipleQuestion();

		System.out.println(questions.FeedBack());
		feedBack = scanner.next();

		ParticipantAnswer.add(new Answer(singleChoice, multipleChoice, feedBack));

	}
	/**
	 *CalculatedTotalPercentageDistribution is a function which is used to calculate the TotalPercentageDistribution of single choice question.
	 * 
	 * 
	 */
	private void CalculatedTotalPercentageDistribution()
	{
		int percentageDistribution[] = new int[4];// store the TotalPercentageDistribution of participants

		int TotalParticipant = ParticipantAnswer.size();//store total number of participant
		
		if(TotalParticipant==0)
		{
			for(int singleChoiceOption=0;singleChoiceOption<4;singleChoiceOption++)
			System.out.println((singleChoiceOption+1)+" ->  "+percentageDistribution[singleChoiceOption]+"%");
					
			return;
		}
		int AnswerChoice = 1;

		while (AnswerChoice != 5)
		{

			int count = 0;

			for (int participant = 0; participant < ParticipantAnswer.size(); participant++) {
				if (ParticipantAnswer.get(participant).SingleChoice == AnswerChoice)
					count++;

			}
			percentageDistribution[AnswerChoice - 1] = (count / TotalParticipant) * 100;
			System.out.println(AnswerChoice + "  ->  "
					+ percentageDistribution[AnswerChoice - 1] + "%");
			AnswerChoice++;

		}

	}
	/**
	 *PrintParticipantResponse is a function which is used to print the answer of all three types question.
	 * 
	 */

	private void PrintParticipantResponse() {
		Questions questions = new Questions();

		for (int answer = 0; answer < ParticipantAnswer.size(); answer++)

		{
			System.out.println("Participant " + (answer + 1) + " Response");

			System.out.println(questions.SingleChoice());
			System.out.println("     "+ ParticipantAnswer.get(answer).SingleChoice);

			System.out.println(questions.MultipleChoice());
			System.out.println("  "+ ParticipantAnswer.get(answer).MultipleChoice);

			System.out.println(questions.FeedBack());
			System.out.println("  " + ParticipantAnswer.get(answer).Feedback);

		}

	}
	
	

	public static void main(String[] args)
	{

		int choice = 0;
		
		Participant participant = new Participant();
		Questions questions = new Questions();
		
		while (choice != 4)
		{
			choice = participant.readSurvey();
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
}
