package oop2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Participant  {
	//singleChoice stores the value of single choice
	private int singleChoice=0;
	// multichoice stores the value of multiple choice
	private String multiChoice;
	// feedback stores the feedback from user.
	private String feedback;
	// answer list stores the answer of different participant.
	List <Answer> answer=new ArrayList<Answer>();
	/**
	 * reads the input from the console and check the input.
	 * @return returns the input by user
	 */
	int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number < 1 || number>4) {
				System.out.println("enter the correct value");
				number = UserInput();

			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}

	}
	/**
	 * reads the response from the user.
	 */
	public void readSurvey()
	{
		Question.readQuestions();
		int option;
		Scanner scanner=new Scanner(System.in);
		Question question= new Question();
		System.out.println("Enter your choice:");
		System.out.println("1. Give Feedback");
		System.out.println("2. Total Percentage Distribution");
		System.out.println("3. Final Output");
		System.out.println("4. Exit");
		option=UserInput();
		//This switch handle the users choice to for giving feedback, calculate percentage, final output AND EXIT.
		switch(option){
		//for taking feedback.
		case 1:{
			System.out.println(question.singleTypeQuestion());
			singleChoice=UserInput();
			System.out.println(question.multiTypeQuestion());
			multiChoice=inputMultipleChoice();
			System.out.println(question.feedbackQuestion());
			feedback=scanner.next();
			answer.add(new Answer(singleChoice,multiChoice,feedback));
			readSurvey();
			break;
		}
		//for calculating percentage
		case 2:{
			calculatePercentage();
			readSurvey();
			break;
		}
		//for displaying participant response.
		case 3:{
			participantResponse();
			readSurvey();
			break;
		}
		//to get exit from program
		case 4:{
			break;
		}
		default:{
			break;
		}
			
		}
	}
	/** takes the multiple choice input from the user and check its availability.
	 * @return the string of  user input.
	 */
	public String inputMultipleChoice(){
		Scanner scanner=new Scanner(System.in);
		// multiAnswer holds the answer of the user.
		String multiAnswer="";
		// serviceQuality, communication and deliveryProcess are boolean variable which holds the status of entry of multiple choice.
		boolean serviceQuality=false,communication=false,deliveryProcess=false;
		// count checks that input is taken only three times. and flags for taking another input.
		int flag=1,count=0;
		while(flag==1 && count<3){
			// temp will store user input temporary until input is checked.
			String temp=scanner.nextLine();                     
			if(temp.equalsIgnoreCase("Service Quality") && serviceQuality==false){        
				if(!multiAnswer.equals(""))
					multiAnswer=multiAnswer+",";
				multiAnswer=multiAnswer+temp;
				serviceQuality=true;
				if (serviceQuality && communication && deliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return multiAnswer;
				}
				System.out.println("enter 1 to enter one more choice");
				flag=UserInput();
				count++;
			}
			else if(temp.equalsIgnoreCase("communication") && communication==false){
				if(!multiAnswer.equals(""))
					multiAnswer=multiAnswer+",";
				multiAnswer=multiAnswer+temp;
				communication=true;
				if (serviceQuality && communication && deliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return multiAnswer;
				}
				System.out.println("enter 1 to enter one more choice");
				flag=UserInput();
				count++;
			}
			else if(temp.equalsIgnoreCase("Delivery Process") && deliveryProcess==false){
				if(!multiAnswer.equals(""))
					multiAnswer=multiAnswer+",";
				multiAnswer=multiAnswer+temp;
				deliveryProcess=true;
				if (serviceQuality && communication && deliveryProcess)
				{   System.out.println("you have exceed the limit of selection now go to the feedback question ");
					return multiAnswer;
				}
				System.out.println("enter 1 to enter one more choice");
				flag=UserInput();
				count++;
			}
			else{
				System.out.println("kindly enter the correct option");
			}
				
		}
		return multiAnswer;
		
	}
	/** calculate the percentage of the inputs of single choice question.
	 */
	public void calculatePercentage(){
		// percentage array holds the percentage of the occurrence of every input 
		float[] percentage=new float[4];
		
		if(answer.size()==0)
		{
			for(int singleChoiceOption=0;singleChoiceOption<4;singleChoiceOption++)
			System.out.println((singleChoiceOption+1)+" ->  "+percentage[singleChoiceOption]+"%");
					
			return;
		}
		for(int count=0;count<answer.size();count++){
			if(answer.get(count).answer1==1)
				percentage[0]=percentage[0]+1;
			else if(answer.get(count).answer1==2)
				percentage[1]=percentage[1]+1;
			else if(answer.get(count).answer1==3)
				percentage[2]=percentage[2]+1;
			else
				percentage[3]=percentage[3]+1;
		}
		for(int count=0;count<4;count++){
			System.out.println("option"+(count+1)+":"+(percentage[count]=(percentage[count]/answer.size())*100)+"%");
		}
		
	}
	/**
	 * @return the single choice question from the question class
	 */
	public int getSingleChoice() {
		return singleChoice;
	}
	/** set the single choice question
	 * @param singleChoice
	 */
	public void setSingleChoice(int singleChoice) {
		this.singleChoice = singleChoice;
	}
	/**
	 * @return the multiple choice question from the question class
	 */
	public String getMultiChoice() {
		return multiChoice;
	}
	/** set the multiple choice question
	 * @param multiChoice
	 */
	public void setMultiChoice(String multiChoice) {
		this.multiChoice = multiChoice;
	}
	/**
	 * @return the feedback question from the question class
	 */
	public String getFeedback() {
		return feedback;
	}
	/** set the feedback question
	 * @param feedback
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	/**
	 * @return the list of answer.
	 */
	public List<Answer> getAnswer() {
		return answer;
	}
	/** set the list of answer
	 * @param answer
	 */
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	/** shows the response or feedback of participants.
	 */
	public void participantResponse(){
		Question question= new Question();
		for(int count=0;count<answer.size();count++){
			System.out.println("participant "+(count+1)+" response:");
			System.out.println("QUESTION: "+question.singleTypeQuestion());
			System.out.println("ANSWER: "+answer.get(count).answer1);
			System.out.println("QUESTION: "+question.multiTypeQuestion());
			System.out.println("ANSWER: "+answer.get(count).answer2);
			System.out.println("QUESTION: "+question.feedbackQuestion());
			System.out.println("ANSWER: "+answer.get(count).answer3);
		}
		
	}
	public static void main(String[] args) {
		
	Participant participant=new Participant();
	participant.readSurvey();
	}

}