
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Survey {

	static int AreaOfImprovements = 3;
	public static void main(String args[])
	{	
		/* initialization */
		Scanner scan = null;
		BufferedReader bufferedReaderObj = null;
		try
		{
			/* Initialization */
			scan=new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			SurveyQuestion surveyQuestionObj= new SurveyQuestion();
			Answer answerObj= new Answer();
			int ch=1,count=0,i,rating;
			int result;
			int age;
			double totalA=0.0,totalB=0.0,totalC=0.0,totalD=0.0;
			char choice;
			String answer="";
			
			do
			{
				
				/* choice menu will be printed */ 
				
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				ch=scan.nextInt();						// choice of user is taken as input
				 /* switch case to perform action according to choice */
				switch(ch)
				{
					/* if choice is 1 */
					case 1:
						count=count+1;
						System.out.println(surveyQuestionObj.age(false));
						age = scan.nextInt();
						if(age<18)
						{
							System.out.println("Survey is Available only for 18+ people");
							break;
						}
						answerObj.age(age);
						System.out.println(surveyQuestionObj.nationality(false));
						answer = bufferedReaderObj.readLine();
						answerObj.nationality(answer);
						System.out.println(surveyQuestionObj.gender(false));
						answer = bufferedReaderObj.readLine();
						answerObj.gender(answer);
						System.out.println(surveyQuestionObj.ratingHeritages(false));	// retrieving first question
						rating=scan.nextInt();									
						if(rating!=1 && rating!=2 && rating!=3 && rating!=4)
						{
							System.out.println("Please enter from available options");
							rating=scan.nextInt();
						}
						answerObj.rating(rating); 		// storing answer of first question
						System.out.println(surveyQuestionObj.favoriteHeritages(false));	// retrieving second question
						answer = bufferedReaderObj.readLine();
						answerObj.favoriteHeritages(answer); 	// storing answer of second question
						System.out.println(surveyQuestionObj.feedback(false));		// retrieving third question
						answer= bufferedReaderObj.readLine();;						
						answerObj.feedbackSet(answer);						// storing answer of third question
						break;
					
						/* if choice is 2 */
					case 2:
						if(count == 0)
						{
							System.out.println("Please take the survey at least once to view results");
							break;
						}
						for(i=1;i<=count;i++)
						{
							result=answerObj.getRating(i);	// retrieving answer of first question
							if(result==1)
								totalA+=1.0;
							
							if(result==2)
								totalB+=1.0;
							
							if(result==3)
								totalC+=1.0;
							
							if(result==4)
								totalD+=1.0;
						}
						/* total percentage of answers */
						System.out.println("Total percentage of Excellent: "+ totalA/count*100);
						System.out.println("Total percentage of Good: "+ totalB/count*100);
						System.out.println("Total percentage of Fair: "+ totalC/count*100);
						System.out.println("Total percentage of Bad: "+ totalD/count*100);
						break;
						
						/* if choice is 3 */
					case 3:
						
						if(count == 0)
						{
							System.out.println("Please take the survey at least once to view results");
							break;
						}
						for(i=1;i<=count;i++)
						{
							System.out.println("\nTourist " +i+"\n");
							
							System.out.print(surveyQuestionObj.age(true));
							age=answerObj.getAge(i);	// retrieving answer of first question
							System.out.println(age+"\n");
							
							System.out.print(surveyQuestionObj.nationality(true));
							answer=answerObj.getNationality(i);	// retrieving answer of second question
							System.out.println(answer+"\n");
							
							System.out.print(surveyQuestionObj.gender(true));
							answer = answerObj.getGender(i);
							System.out.println(answer+"\n");
				
							System.out.print(surveyQuestionObj.ratingHeritages(true));
							rating = answerObj.getRating(i);
							System.out.println(rating+"\n");// retrieving answer of third question
							
							System.out.print(surveyQuestionObj.favoriteHeritages(true));
							answer = answerObj.getfavoriteHeritages(i);
							System.out.println(answer+"\n");
							
							System.out.println(surveyQuestionObj.feedback(true));
							answer = answerObj.feedbackGet(i);
							System.out.println(answer);
						}
						break;
					default:
						System.out.println("Enter number in tha range 1 to 3\n");
				}
				System.out.println("\nDo you want to continue(y/n)");
				choice=scan.next().charAt(0);
				
			}while(choice=='y');
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
			return;
		}
		finally
		{
			try
			{
				scan.close();
				bufferedReaderObj.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

}
