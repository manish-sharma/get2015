
import java.util.ArrayList;
import java.util.Iterator;


public class GetOverAllRating {
	
		//Calculate method the percentage rating 
		//@param Double result: Store % of every question
		//@param Double answer1,answer2,answer3,answer4,answer5: store total no of respective answer given.
		//@param Double counter : Specify total no of participant.
	public double[]  getOverAllRating(ArrayList<Participant> participant){	
		
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
	

}
