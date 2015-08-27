import java.util.ArrayList;
import java.util.List;
public class Participant 
{
	
	private int participantId;
	private String participantName;
	private List<String> participantResponse;
	private static List <Participant> responseList = new ArrayList<Participant>();
	public Participant(int participantId,String participantName)
	{
		this.participantId=participantId;
		this.participantName=participantName;
		this.participantResponse=new ArrayList<String>();
	}
	public int getParticipantId()
	{
		return participantId;
	}
	public String getParticipantName()
	{
		return participantName;
	}
	public void doParticipantSurvey(String answer)///add response into the list of the single participant
	{
		participantResponse.add(answer);
		
	}
	public static void doParticipantComplete(Participant participant)//add response into the list of the participants
	{
		responseList.add(participant);
		
	}
	public  List<String> getParticipantResponse()//get response of individuals 
	{
		return participantResponse;
	}
	public static  List<Participant> getResponseList()//get response list of all the participants
	{
		return responseList;
	}


}
