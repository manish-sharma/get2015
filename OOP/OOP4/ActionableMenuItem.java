

import java.util.ArrayList;

public class ActionableMenuItem implements MenuItem{
	Action action;
	String displayText; 
	
public ActionableMenuItem(String displayText) {
	this.displayText=displayText;
}

	@Override
	public void display() {
		System.out.println(displayText);
		
	}

	@Override
	public void takeAction(int i) {
		 
		 try{
			 int c=0;
		switch (i) {
		
		case 1:
			name.add(new Participant().getParticipantDetail(c));
			 ans1.add(new Question().singleSelect());
			ans2.add(new Question().mulipleSelect());
			 ans3.add(new Question().text());
			 c++;
			break;
		case 2:
			 new Output().OutputReport(name,ans1,ans2,ans3);
			break;
		case 3:
			new Output().OutputReportPercentage(ans1);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("you choose valid option");
			break;
		}
		 }catch(Exception e)
		 {
			 
		 }
		
	}

}
