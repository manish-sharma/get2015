import java.util.ArrayList;
import java.util.Iterator;


public class PrintResult {
	
	public void printResult(ArrayList<Participant> participant,SingleSelect sSelect,MultiSelect mSelect,Text text){
		
		System.out.println(" \nPERCENTAGE COMPARISION OF RATING ");
		//Calling of getOverAllRating method.
		//This method return % rating of single select question.
		double []result=new GetOverAllRating().getOverAllRating(participant);
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

}
