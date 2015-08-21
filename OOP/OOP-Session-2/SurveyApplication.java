/*
 * This class implements the survey for any organization
 * For survey three types of question available
 * first type is single select
 * second type is multiple select
 * third type is text based
 * @author Banwari
 */

import java.io.*;
import java.util.Scanner;

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
			
		
		  // creation of first participation with his/her name as parameterized constructor call 
		  Participant participant1= new Participant("RAJU");
		
		  participant1.doSurvey();
		  participant1.reviewSurvey();
	}
		
}


