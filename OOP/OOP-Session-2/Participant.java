import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Participant {
	//Name of Participant
	private String participantName;
	//response of first two questions in integer type
	private int[] responseInt;
	//response of last three questions in string type
	private String[] responseString;
	//Parameterized constructor for Participant and parameter is the name of participant *
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
			         // For first two questions print and get response
			         if(countQuestion<2) {
							responseInt[countQuestion]=sc.nextInt();
							countQuestion++;
							}
			         // For last three questions print and get response
			         else {
			             responseString[countQuestion-2]=sc.nextLine();
			             countQuestion++;
			         }
				 }
		 }
		  catch(IOException e){
			  
			  e.printStackTrace(); }
	
	}
	
	void reviewSurvey() {
	
		try{
                 FileReader fileReader = new FileReader("D://Questions.txt");
		
		         BufferedReader bufferReader = new BufferedReader(fileReader);
		
		        System.out.println("\n\nThanks!!!! "+participantName+" to participate in survey: \n");
		        String question;
		        
		        int countQuestion=0; 
		        while( (question=bufferReader.readLine()) != null ) {
			
			         System.out.println(question);
			         
			         // For first two questions print and print response
			         if(countQuestion<2) {
							System.out.println(responseInt[countQuestion]);
							countQuestion++;
							}
			         
			         // For last three questions print and print response
			         else {
			        	 System.out.println(responseString[countQuestion-2]);
			             countQuestion++;
			         }
				   }
		 }
		  catch(IOException e){
			  
			  e.printStackTrace(); }
	}
}
