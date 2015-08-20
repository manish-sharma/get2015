/****************************************************************************************
Name            : Participant
Revision Log    : 2015-08-17: Babalu patidar : created.
                : 
Use             : This class is used store Participant information.
                :
****************************************************************************************/
import java.util.ArrayList;

class Participant{
	public static ArrayList<Participant> participant = new ArrayList<Participant>();
	int pId;
	String singleChoice;
	String multiChoice;
	String text;
	
	    public Participant(int pId,String q1,String q2,String q3){
		this.pId=pId;
		this.singleChoice=q1;
		this.multiChoice=q2;
		this.text=q3;
		
		}
}
//End of Participant class