package survey;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/**
 * Name: userInput
 * @author anurag
 * Since: 14 August,2015
 * Description: Takes the input of the user from console
 **/

public class userInput extends surveyQuestion 
{
	/**
	 * Name: userInput
	 * @param number: Takes the input of number of user
	 * @return List: Contaning the list of answer and result 
	 **/
	public static List<String> answer(int number)
	{   
		// For storing the Question
   		List <String> Question=new ArrayList();
   		// For storing the Output
   		List  <String> Option=new ArrayList();
   		Scanner sc=new Scanner(System.in);
   		// For storing the answer of Single Input
   		int SingleRating;
   		DataInputStream abc=new DataInputStream(System.in);
   		// For storing the Feedback and value
   		String uservalue=null;
   		// For concating the result
   		String result="";
   		surveyQuestion obj=new surveyQuestion();
   		try 
   		{
   			// Calling the file to be read
			Question=obj.readCsvFile();
		} 
   		catch (IOException e) 
   		{
			e.printStackTrace();
		}
   		// To contiue till no of users
   		for(int count1=0;count1<number;count1++)
   		{
   			// Intializing the value of storing value as null
   			result="";
   			// No of question
   		for(int count=0;count<Question.size();count++)
   		{
   			System.out.println(Question.get(count));
   			if(count==0)
   			{ 
   				// Inputing first value
   				result= Integer.toString(sc.nextInt());
   			 }
   			 else if(count==1)
   			 {
   				 try 
   				 {
   					 uservalue=abc.readLine();
					 result=result+","+uservalue+",";
				 } 
   				 catch (IOException exception) 
				 {
   					 exception.printStackTrace();
				 }
   			 }
   			 else if(count==2)
   			 {
   				 try 
   				 {
   					 uservalue=abc.readLine();
					 result=result+uservalue;
   				 } 
   				 catch (IOException exception) 
				 {
					exception.printStackTrace();
				 } 
   			 }
   		}
   		// Adding to the List
   		Option.add(result);
   		}
   		//returning the value
   		return Option;
	}
}
