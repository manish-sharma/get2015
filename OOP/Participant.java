package oops_aasignment_2;

import java.util.Scanner;

/**Stores the Participant information who participates in the survey
 * Name: Paricipant
 * @author ankur gupta
 * Since: 17 August,2015
 *  
 */
class Participant extends Survey
{
	  
	 Scanner sc= new Scanner(System.in );
	 /** method to get info of the participant
	  * 
	  * @param i 
	  * @return it returns the name
	  */
	 public String  getParticipantDetail(int i){
		
		 String name;
		 System.out.println("Enter the Name");
		 name =	sc.nextLine();
		
		return name;
	 }
	 
}