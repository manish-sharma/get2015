/****************************************************************************************
Name            : SurveyApplication
Revision Log    : 2015-08-17: Babalu patidar : created.
                : 
Use             : This class is used manage the whole Survey System.
                :
****************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class SurveyApplication {
	
	//ArrayList that maintain the Participant objects
	public static ArrayList<Participant> participant = new ArrayList<Participant>();
	static String fileName=""C:/Users/Babalu/workspace/OOP2/src/input.txt";
	static String line="";
	static String cvsSplitBy=",";
	static SingleSelect sSelect ;
	static MultiSelect mSelect;
	static Text text;
	

	
	//Start of main method.
	//@param  sSelect is object of SingleSelect class
	//@param  mSelect is object of MultiSelect class.
	//@param  text is object of text class.
	//@param  totalpaticipant Specify total participant
	//@param  flag Specify whether is continue or not
	//@param  pId Specify participant id.
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner scan=new Scanner(System.in);
		int totalparticipant=0;
		String flag="0";
		int pId = (++totalparticipant);
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		while ((line = br.readLine()) != null) {
			String input[] = line.split(cvsSplitBy);
			if(input[2].trim().equalsIgnoreCase("Single Select")){
				 sSelect=new SingleSelect(input[0],input[1] + input[2]+input[3]);
			
			}
			else if(input[2].trim().equalsIgnoreCase("Multi Select")){
				 mSelect=new MultiSelect(input[0],input[1] + input[2]+input[3]);
			}
			else if(input[2].trim().equalsIgnoreCase("Text")){
				text=new Text(input[0],input[1] + input[2]);
			}
		}
		br.close();
	
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
		
		//Calling of printResult Method that print the result
		new PrintResult().printResult(participant, sSelect, mSelect, text);
		
	}
	//End of main method
}
//End of SurveyApplication class


