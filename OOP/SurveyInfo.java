package oops_aasignment_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**class for the survey information
 * Name: survey
 * @author ankur gupta
 * Since: 17 August,2015
 *  
 */
public class SurveyInfo extends Participant
{
	 // to output reports as percentage
	 @SuppressWarnings("rawtypes")
	public int[] OutputReportPercentage( ArrayList answer1 ){
		 
		 int[]out = new int[5];
		 for(int i = 0; i  <answer1.size(); i++)
		 {    
			 if(answer1.get(i).equals("1")) out[0]++;
			 if(answer1.get(i).equals("2")) out[1]++;
			 if(answer1.get(i).equals("3")) out[2]++;
			 if(answer1.get(i).equals("4")) out[3]++;
			 if(answer1.get(i).equals("5")) out[4]++;
		
	      }
		 int sum = out[0]+out[1]+out[2]+out[3]+out[4];//calculate the sum
		 try{
			 for(int j = 0; j<5; j++)
			 {
		  		out[j] = (out[j]*100)/sum;//calculate percentage
			 }
		 }
		 catch(ArithmeticException Ae)
		 {
			 System.out.println("please Enter Some Data ");
		 }
		 //print the overall percentage
		 for(int j=0;j<5;j++)
		 {
			 System.out.println(j+1+":");
			 System.out.println(out[j]);
		 }
		 return out;
	 }
	 
	 /**method to print the report
	  * 
	  * @param name
	  * @param answer1 parameter of answer 1
	  * @param answer2 parameter for answer2 
	  * @param answer3 parameter for answer 3
	  */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public void  OutputReport(ArrayList name,ArrayList answer1,ArrayList answer2,ArrayList answer3)
	 { 
		// Participant participant =new Participant();
		 for(int i=0;i<name.size();i++)
		 { 
			 System.out.println("participant:"+(i+1));
			 System.out.println (name.get(i));
			 System.out.println("Q1:Overall Rating?");
			 System.out.println(answer1.get(i));
			 System.out.println("Q2:Area of improvement?");
			 	for(int j = 0; j<3; j++)
			 			System.out.println(((ArrayList<String>) answer2.get(i)).get(j));
			 System.out.println("Q3:Feedback?");
			 System.out.println(answer3.get(i));
		 }
	 }
	 /** main method
	  * 
	  * @param args
	  * @throws IOException it throws input output exception
	  */
	 public static void main(String args[]) throws IOException
	 {
		 
		 Scanner sc = new Scanner(System.in );
		 Participant participant = new Participant();//participant class object
		 Survey survey = new Survey();//survey class object
		 SurveyInfo surveyInfo = new SurveyInfo();
		 ArrayList<String> name = new ArrayList<String>();
		 ArrayList<String> answer1 = new ArrayList<String>();
		 ArrayList<ArrayList<String>> answer2 = new ArrayList<ArrayList<String>>();
		 ArrayList<String> answer3 = new ArrayList<String>();
		 int participants = 0;
		 int number = 0;
		 do
		 {
			 System.out.println("Enter 1 for login \n 2 for participant in survey \n 3 for Output Report \n 4 for Output Data in percentage \n 5 for exit");
			 number = sc.nextInt();
			 if(number == 2)
				 participants++;
			 switch (number) {
			 	case 1:
			 		participant.getParticipantDetail(0);//login the participant
			 		break;
			 	case 2:// participate the participant in the survey
			 		name.add(participant.getParticipantDetail(participants));
			 		answer1.add(survey.singleSelect());
			 		answer2.add(survey.mulipleSelect());
			 		answer3.add(survey.text());
			 		break;
			 	case 3: //to print the report
			 		surveyInfo.OutputReport(name,answer1,answer2,answer3);
			 		break;
		
			 	case 4: //to print the report percentage
			 		surveyInfo.OutputReportPercentage(answer1);
			 		break;
			 	case 5://to exit
			 		System.exit(0);
			 }
		 }while(number != 5);
		 
		 sc.close();
	 }
 }
		