import java.util.Scanner;

public class Participant {
	  
		 Scanner sc= new Scanner(System.in );
		 //method take users information 
		 //i no of participant 
		 //return name of participant
		 public String  getParticipantDetail(int i){
			String name;
		 System.out.println("Enter the Name");
		 name=sc.nextLine();
	     return name;
		 }
		 
}
