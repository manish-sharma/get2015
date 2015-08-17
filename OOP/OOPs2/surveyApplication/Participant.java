package surveyApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Participant  {
	
	private int singleChoice;
	private String multipleChoice;
	private String feedBack;
	private List<Answer> ParticipantAnswer = new ArrayList<Answer>();
	
	
	
	int UserInput() {
		int length;
		try {
			Scanner sc = new Scanner(System.in);

			length = sc.nextInt();
			if (length < 1 || length>4) {
				System.out.println("enter the correct input");
				length = UserInput();

			}
			return length;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			length = UserInput();
			return length;
		}

	}
	
	
	String UserInputForMultipleQuestion()
   	{   String mulString="";
     	int count=2;
   	    boolean ServiceQuality=false,Communication=false,DeliveryProcess=false;
   	    Scanner scanner=new Scanner(System.in);
   	   
   	    while(count==2)
   	    { 
   	    	String Input=scanner.nextLine();
   	    	System.out.println(Input);
   	    
   	    	if(Input.equals("Service Quality") && ServiceQuality==false  )
   	    	{
   	    		mulString=mulString+Input+",";
   	    	    ServiceQuality=true;
   	    	    System.out.print("if you want to add one more option than press 2 othewise 1");
   	    	    count=UserInput();
   	    	    
   	    	}
   	    	
   	    	else if(Input.equalsIgnoreCase("Communication")  && Communication==false)
   	    	{ mulString=mulString+Input+",";
   	    	  Communication=true;
   	    	System.out.print("if you want to add one more option than press 2 othewise 1");
   	    	count=UserInput();
   	    	}		
   	    			
   	    	else if(Input.equalsIgnoreCase("Delivery Process") && DeliveryProcess==false)
   	    	{
   	    		mulString=mulString+Input+",";
   	    		DeliveryProcess=true;
   	    		System.out.print("if you want to add one more option than press 2 othewise 1");
   	    		count=UserInput();
   	    	}	
   	    	else
   	    	{
   	    		System.out.print("Enter the correct input");
   	    		
   	    	   
   	    	}
   	    	
   	    	
   	    	
   	    }
   	    
   	    
   	    
		
	   return mulString;	
	}
	
	
	
	private int readSurvey()
	{
		int answer;
		int result;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		System.out.println("1. Give Feedback");
		System.out.println("2. Total Percentage Distribution");
		System.out.println("3. Final Output");
		System.out.println("4. Exit");
		answer=UserInput();
		return answer;
	}	
		
     private void AnswerOfQuestion()
      {   			Questions questions=new Questions();
                    Scanner scanner=new Scanner(System.in);
		
				      System.out.println(questions.SingleChoice());
			          singleChoice=UserInput();
			         
			          System.out.println("this is mulitiple type Question You can Select one of more choice");
			         
			          System.out.println(questions.MultipleChoice());
			          multipleChoice=UserInputForMultipleQuestion();
			          
			          System.out.println(questions.FeedBack());
				      feedBack=scanner.next(); 
				      
			          ParticipantAnswer.add(new Answer(singleChoice,multipleChoice,feedBack));
			         
			
			}
		
		
		
	
		
	private void CalculatedTotalPercentageDistribution()
	      {      
		       int percentageDistribution[] =new int[4];
	         
	            int TotalParticipant=ParticipantAnswer.size();
	              int AnswerChoice=1;
	            
	              while(AnswerChoice!=5)
	            {
	            
	            	int count=0;
	            	
	            for(int participant=0;participant<ParticipantAnswer.size();participant++)
	            {   
	            	if(ParticipantAnswer.get(participant).SingleChoice==AnswerChoice)
	            	   count++;
	            	
	            
	            }
	               percentageDistribution[AnswerChoice-1]=(count/TotalParticipant)*100;
	               System.out.println(AnswerChoice+"  ->  "+percentageDistribution[AnswerChoice-1]+"%");
	               AnswerChoice++;
	               
	            
	            
	            }
			
		    
		
		}
		
		
		
	private void PrintParticipantResponse()
	{  
        Questions questions=new Questions();
	

      for(int answer=0;answer<ParticipantAnswer.size();answer++)	
		  
	   { System.out.println("Participant "+(answer+1)+" Response");
	    
	       System.out.println(questions.SingleChoice());
	       System.out.println("     "+ParticipantAnswer.get(answer).SingleChoice);
	      
	       System.out.println(questions.MultipleChoice());
	       System.out.println("  "+ParticipantAnswer.get(answer).MultipleChoice);
		      
	   
	       System.out.println( questions.FeedBack());
	       System.out.println("  "+ParticipantAnswer.get(answer).Feedback);
		   
	   
	   }
		
		
		
		
		
	}
		
	
	
	public static void main(String[] args) {
		
		
		int choice=0;
Participant participant=new Participant();
Questions questions=new Questions();
while(choice!=4)
{
choice=participant.readSurvey();
switch(choice)
 {case 1:{	      questions.readQuestions();
          participant.AnswerOfQuestion();
            break;}
  case 2:{
	  
	  participant.CalculatedTotalPercentageDistribution();
      break;      
      }

  case 3:{
	  participant.PrintParticipantResponse();
          break;}
  case 4:choice=4; 
}

}





}
}


