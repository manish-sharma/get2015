/*
 * This class implements the survey for any organization
 * For survey three types of question available
 * first type is single select
 * second type is multiple select
 * third type is text based
 */

import java.io.*;
import java.util.Scanner;

class Participant{
	/** Name of Participant*/
	private String participantName;
	
	/** response of first two questions in integer type*/
	private int[] responseInt;
	
	/** response of last three questions in string type*/
	private String[] responseString;
	
	/**Parameterized constructor for Participant and parameter is the name of participant */ 
	Participant(String name) {
		participantName=name;
		responseInt = new int[2];
		responseString = new String[3];
		
	}
	void doSurvey() {
		Scanner sc = new Scanner(System.in);
		try{
                 FileReader fileReader = new FileReader("D://Questions.txt");
		
		         BufferedReader bufferReader = new BufferedReader(fileReader);
		
		        System.out.println("\nWelcome "+participantName+" to participate in survey: \n");
		        String question;
		        
		        int countQuestion=0; 
		        while( (question=bufferReader.readLine()) != null ) {
			
			         System.out.println(question);
			         
			         /** For first two questions print and get response*/
			         if(countQuestion<2) {
							responseInt[countQuestion]=sc.nextInt();
							countQuestion++;
							}
			         
			         /** For last three questions print and get response*/
			         else {
			             responseString[countQuestion-2]=sc.nextLine();
			             countQuestion++;
			         }
				      			
	     	     }
		 }
		  catch(IOException e){
			  
			  e.printStackTrace(); }
	
	}
	
};

public class SurveyApplication {
	
	public static void main(String [] arg) throws Exception {
		
		
		
		FileReader fileReader = new FileReader("D://single_select_percentage ditribution.txt");
		
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		System.out.println("Overall Rating, Single Select, (1/2/3/4/5)");
		
		/** this will print line by line */
		String currentLine;	
		while( (currentLine=bufferReader.readLine()) != null ) {
			
			System.out.println(currentLine);
			
			}
			
		
		
		Participant participant1= new Participant("RAJU");
		
		  participant1.doSurvey();
	}
		
}


