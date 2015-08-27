/**
 * Program to Survey of  Participant  by filing questions of single select, multiple select and text 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
/*Starting of SurveyApplication*/
public class SurveyApplicationMain 
{
		/*Starting of main method*/
		public static void main(String args[])
		{
			int noOfUsers=0;
			int id=1;
			List<Questions> questionList=Questions.readQuestionsFromFile();//List of question that contain question object 
			int noOfQuestion=questionList.size();
			Participant participant=null;
			Questions question=null;
			String str="";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Reading input from keyboard
			try
			{
				
				while(true)
				{
					System.out.println("Enter your name");
					String name=readName(br);
				
					System.out.println("Your Name is "+name+"  And ID is "+id);
					participant=new Participant(id++ ,name);
					for(int index=0;index<noOfQuestion;index++)
					{
						question=questionList.get(index);
						if(!question.getQuestionType().equalsIgnoreCase("Text")){
							str="Enter your choice like("+question.getOptions()+")";
						}
						System.out.println(question.getQuestion()+"\t"+question.getQuestionType()+"  "+str);//Display specific question
						str="";
						String response=readResponse(br,question);//read response from keyboard
						participant.doParticipantSurvey(response); //put the response by method doParticipantSurvey
					}
					Participant.doParticipantComplete(participant);
					noOfUsers++;
					int isContinue=0;
					boolean flag=false;
					System.out.println("Any other participant are left press 1 for continue and no for press 0");
					do
					{
						
						try
						{
							isContinue=Integer.parseInt(br.readLine());//read if further participant are continue
						}
						catch(NumberFormatException nf)
						{
							System.out.println("Please enter 1 or 0");
							continue;
						}
						catch(IOException io)
						{
							System.out.println("error occured please enter input again 1 OR 0");
							continue;
						}
						if(isContinue==1)
							break;
						if(isContinue==0)
						{
							flag=true;
							break;
						}
					}while(true);
					
					if(flag)
						break;
				}
				/*For giving rating in percentage or overall rating*/
			
				int rating[]=overallRating(questionList);
				System.out.println("Rating are for single select");
				for(int index=0;index<rating.length;index++)
					System.out.println(index+1+"->"+rating[index]);
				/*Display response given by participant*/
				List<Participant>responseList=Participant.getResponseList();
				List<String> response=null;
				for(int index=0;index<noOfUsers;index++)
				{		/*Print the response of each participants with questions*/
						participant=responseList.get(index);
						System.out.println("Participant Id is "+participant.getParticipantId());
						System.out.println("Participant Name is "+participant.getParticipantName());
						response=participant.getParticipantResponse();
						for(int index1=0;index1<noOfQuestion;index1++)
						{					
							question=questionList.get(index1);
							System.out.println(question.getQuestion()+question.getQuestionType()+question.getOptions());
							System.out.println(response.get(index1));
						}
				}
		
			br.close();		
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter no in format");
				System.exit(1);
			}
			catch (IOException e)
			{
				System.out.println("Input exception");
				System.exit(1);
			}
			catch(ArrayIndexOutOfBoundsException rr)
			{
				System.out.println("array index out of bound exception");
				System.exit(1);
				
			}
		}
		/*Ending of main method*/
		//Check response is given is correct format or not
		public static boolean checkResponse(Questions question,String response)
		{
			String questionType=question.getQuestionType();
			String splitString[]=null;
			String splitStringResponse[]=null;
			String questionOptions=question.getOptions();
			if(questionType.equalsIgnoreCase("Text"))
			{
				if(response.length()>100)
				{
					System.out.println("Please enter feedback upto 100 words");
					return false;
				}
				return true;
			}
			splitString = questionOptions.split("/");
			if(questionType.equalsIgnoreCase("Multi Select"))
			{
				splitStringResponse=response.split("/");
				for(int index=0;index<splitStringResponse.length;index++)
				{
					if(checkCorrectResponse(splitString, splitStringResponse[index]));
							
					else
					{
						return false;
					}
				}
				return true;
				
			}
			else if(questionType.equalsIgnoreCase("Single Select"))
			{
					return checkCorrectResponse(splitString,response);
			}
			return false;
		}
			/*Read response from keyboard*/	
		public static String readResponse(BufferedReader br,Questions question)
		{
			String response="";
			try
			{
				response=br.readLine();
			}
			catch(IOException io)
			{
				System.out.println("error occured please enter again");
				readResponse(br, question);
			}
			if(response==""||response==null)
			{
				System.out.println("Please enter valid response");
				readResponse(br, question);
			}
			boolean isCorrect= checkResponse(question,response);
			if(!isCorrect)
			{
				System.out.println("Please enter valid response");
				readResponse(br,question);
			}
			return response;
		}
		/*Generate rating of given option*/
		public static int[] overallRating(List<Questions> questionList)
		{
			int rating[]=new int[5];
			int index=0,total=0;
			for( index=0;index<questionList.size();index++)
			{
				boolean isSingle=questionList.get(index).getQuestionType().equalsIgnoreCase("Single Select");
				if(isSingle)
					break;
			}
			for(int counter=0;counter<Participant.getResponseList().size();counter++)
			{
				String output=Participant.getResponseList().get(counter).getParticipantResponse().get(index);
				int convert=Integer.parseInt(output);
				rating[convert-1]++;
				total++;
				
			}
			for(index=0;index<rating.length;index++)
			{
				rating[index]=(rating[index]*100)/total;
			}
			return rating;
			
		}
		/*Check if response is correct response or not*/
		public static boolean checkCorrectResponse(String splitString[],String response)
		{
			for(int index=0;index<splitString.length;index++)
			{
				if(splitString[index].equalsIgnoreCase(response))
				{
					return true;
				}
			}
			return false;
		}
		/*read name from keyboard*/
		public static String readName(BufferedReader br)
		{
			boolean flag=false;
			String name="";
			do{	
				try
				{
					name=br.readLine();
				}
				catch(IOException io)
				{
					System.out.println("Error occured please enter again");
					continue;
				}
				if(!name.isEmpty())
					flag=isAlpha(name);
				if(!flag)
				{
					System.out.println("Please enter name which contain character like A B C D");
					continue;
				}
					
			}while(!flag);

			return name;
		}
		/*check if name contain alphabet or not*/
		public static boolean isAlpha(String name) 
		{
		    char[] chars = name.toCharArray();

		    for (char c : chars) {
		        if(!Character.isLetter(c)) {
		            return false;
		        }
		    }
		    return true;
		}	
}
/*Ending of survey Application class*/
