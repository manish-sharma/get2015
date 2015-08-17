/****************************************************************************************
Name            : SurveyApplication
Revision Log    : 2015-08-17: Babalu patidar : created.
                : 
Use             : This class is used manage the whole Survey System.
                :
****************************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class SurveyApplication {
	
	//ArrayList that maintain the Participant objects
	public static ArrayList<Participant> participant = new ArrayList<Participant>();
	
	
	//Calculate method the percentage rating 
	//@param Double result: Store % of every question
	//@param Double answer1,answer2,answer3,answer4,answer5: store total no of respective answer given.
	//@param Double counter : Specify total no of participant.
	
	public double[]  getOverAllRating(){	
	
		double[] result=new double[5];
		double answer1=0,answer2=0,answer3=0,answer5=0,answer4=0;
		double counter=0;
		
		Iterator<Participant> iterator = ((ArrayList<Participant>) participant).iterator();
		//While loop is used to calculate % rating of Single select question.
		while (iterator.hasNext()) {
			Participant pobject = iterator.next();
			counter++;
			if (pobject.singleChoice.equalsIgnoreCase("1")){
				
				answer1++;
			}
			else if(pobject.singleChoice.equalsIgnoreCase("2")){
				answer2++;
			}
			else if(pobject.singleChoice.equalsIgnoreCase("3")){
				answer3++;
			}
			else if(pobject.singleChoice.equalsIgnoreCase("4")){
				answer4++;
			}
			else if(pobject.singleChoice.equalsIgnoreCase("5")){
				answer5++;
			}
		} 
		//End of while loop..
		result[0]=(answer1/counter)*100;
		result[1]=(answer2/counter)*100;
		result[2]=(answer3/counter)*100;
		result[3]=(answer4/counter)*100;
		result[4]=(answer5/counter)*100;
		return result;
	}
	//End of getOverAllRating
	
	//Start of main method.
	//@param  sSelect is object of SingleSelect class
	//@param  mSelect is object of Multiselect class.
	//@param  text is object of text class.
	//@param  totalpaticipant Specify total participant
	//@param  flag Specify whether is continue or not
	//@param  pId Specify participant id.
	public static void main(String[] args) {
		
		SingleSelect sSelect=new SingleSelect("1"," Overall Rating, Single Select, (1/2/3/4/5)");
		MultiSelect mSelect=new MultiSelect("2","Area of improvement, Multi Select, (1. Service Quality/2. Communication/3. Delivery Process)");
		Text text=new Text("3","Feedback, Text");
		Scanner scan=new Scanner(System.in);
		int totalparticipant=0;
		String flag="0";
		int pId = (++totalparticipant);
		System.out.println("****Servey System****\n");
		
		//While loop is used to take input from user.
		//It will take input of all questions answer.
		while (flag.equals("0")) {
			
			System.out.println("**Answer the Following Questions** \n");
			System.out.println(sSelect.qBody);
			
			String q1=scan.nextLine();
			while(!(q1.equals("1")||q1.equals("2")||q1.equals("3")||q1.equals("4")||q1.equals("5"))){
				System.out.println("Please enter number 1/2/3/4/5 only");
				q1=scan.nextLine();
			}
			System.out.println(mSelect.qBody);
			
			
			String q2=scan.nextLine();
			
			System.out.println(text.qBody);
			String q3=scan.nextLine();
			
			Participant part=new Participant(pId,q1,q2,q3);
			participant.add(part);
			
			System.out.println("\nIf you want to continue Application then Press 0 \nfor exit from Application Press Any key");
			
			if (!(scan.nextLine().equals("0"))) {
					flag = "1";
			} else {
					flag = "0";
			}
				
		}
		//End of while loop
		scan.close();
			
		System.out.println(" \nPERCENTAGE COMPARISION OF RATING ");
		//Calling of getOverAllRating method.
		//This method return % rating of single select question.
		double []result=new SurveyApplication().getOverAllRating();
		for(int i=0;i<result.length;i++){
			System.out.println((i+1)+" - "+result[i]+"%");
		}
			
		System.out.println("\n REPORT OF PARTICIPANT ");
		int i=1;
		Iterator<Participant> iterator = ((ArrayList<Participant>) participant).iterator();
		//While loop is used to display All Participant's answer with question
		while (iterator.hasNext()) {
			Participant pobject = iterator.next();
			System.out.println("\n\nParticipant "+i);
			System.out.println("Q."+sSelect.qId+"  "+sSelect.qBody);
			System.out.println("Answer =" +pobject.singleChoice);
			System.out.println("Q."+mSelect.qId+"  "+mSelect.qBody);
			System.out.println("Answer =" +pobject.multiChoice);
			System.out.println("Q."+text.qId+"  "+text.qBody);
			System.out.println("Answer =" +pobject.text);
			i++;	
		}
		//End of while loop
	}
	//End of main method
}
//End of SurveyApplication class


