
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
			boolean flag = false;
			do
			{
				
				/* choice menu will be printed */ 
				
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				
				/* Choice of user is taken as input */
				ch=scan.nextInt();						
				
				/* switch case to perform action according to choice */
				switch(ch)
				{
					/* if choice is 1 then take survey with questions*/
					case 1:
						
						
						 /* Processing first question */
						System.out.println(surveyQuestionObj.age(false));
						age = scan.nextInt();
						if(age<18)
						{
							System.out.println("Survey is Available only for 18+ people");
							break;
						}
						answerObj.setAge(age);
						count=count+1;
						
						 /* Processing Second question */
						System.out.println(surveyQuestionObj.nationality(false));
						answer = bufferedReaderObj.readLine();
						answerObj.setNationality(answer);
						
						 /* Processing Third question */
						System.out.println(surveyQuestionObj.gender(false));
						answer = bufferedReaderObj.readLine();
						answerObj.setGender(answer);
						
						 /* Processing Fourth question */
						System.out.println(surveyQuestionObj.ratingHeritages(false));	
						rating=scan.nextInt();									
						if(rating!=1 && rating!=2 && rating!=3 && rating!=4)
						{
							System.out.println("Please enter from available options");
							rating=scan.nextInt();
						}
						answerObj.setRating(rating); 		
						
						/* Processing Fifth question */
						System.out.println(surveyQuestionObj.favoriteHeritages(false));	
						answer = bufferedReaderObj.readLine();
						answerObj.setFavoriteHeritages(answer); 	
						
						/* Sixth question */
						System.out.println(surveyQuestionObj.feedback(false));		
						answer= bufferedReaderObj.readLine();;						
						answerObj.setFeedback(answer);	
						flag = false;
						break;
					
						/* if choice is 2 then show Statistics*/
					case 2:
						if(count == 0)
						{
							System.out.println("Please take the survey at least once to view results");
							break;
						}
						if(flag == false)
						{
							totalA = 0.0;
							totalB = 0.0;
							totalC = 0.0;
							totalD = 0.0;
							for(i=1;i<=count;i++)
							{
								result=answerObj.getRating(i);	
								if(result==1)
									totalA+=1.0;
								
								if(result==2)
									totalB+=1.0;
								
								if(result==3)
									totalC+=1.0;
								
								if(result==4)
									totalD+=1.0;
							}
						}

						/* calculating total percentage of answers */
						System.out.println("Total percentage of Excellent: "+ totalA/count*100);
						System.out.println("Total percentage of Good: "+ totalB/count*100);
						System.out.println("Total percentage of Fair: "+ totalC/count*100);
						System.out.println("Total percentage of Bad: "+ totalD/count*100);
						flag = true;

						break;

						/* if choice is 3 then show the tourists with their answers*/
					case 3:
						
						if(count == 0)
						{
							System.out.println("Please take the survey at least once to view results");
							break;
						}
						for(i=1;i<=count;i++)
						{
							/* Printing Tourist Number */
							System.out.println("\nTourist " +i+"\n");
							
							 /* Processing first question */
							System.out.print(surveyQuestionObj.age(true));
							age=answerObj.getAge(i);	
							System.out.println(age+"\n");
							
							/* Processing Second question */
							System.out.print(surveyQuestionObj.nationality(true));
							answer=answerObj.getNationality(i);	
							System.out.println(answer+"\n");
							
							/* Processing third question */
							System.out.print(surveyQuestionObj.gender(true));
							answer = answerObj.getGender(i);
							System.out.println(answer+"\n");
							
							/* Processing Fourth question */
							System.out.print(surveyQuestionObj.ratingHeritages(true));
							rating = answerObj.getRating(i);
							System.out.println(rating+"\n");
							
							/* Processing Fifth question */
							System.out.print(surveyQuestionObj.favoriteHeritages(true));
							answer = answerObj.getfavoriteHeritages(i);
							System.out.println(answer+"\n");
							
							/* Processing Sixth question */
							System.out.println(surveyQuestionObj.feedback(true));
							answer = answerObj.feedbackGet(i);
							
							System.out.println(answer);
						}
						break;
					default:
						System.out.println("Enter number in tha range 1 to 3\n");
				}
				System.out.println("\nDo you want to continue(press y or Y for yes and any other key to Exit)");
				choice=scan.next().charAt(0);
				
			}while(choice=='y');
			System.out.println("System exited");
			System.exit(0);
			bufferedReaderObj.close();
			scan.close();
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
