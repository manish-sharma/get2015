
public class ActionableMenuItem implements MenuItem{
	
	Action action ;
	String displayText; 
	
	ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}
	@Override
	public void display() {
		System.out.println(displayText);
		
	}

	@Override
	public void takeAction(int choice) {
		Reservation reservationObject = new Reservation();
		switch(choice){
		case 1:
			reservationObject.reservation();
			break;
		case 2:
			reservationObject.chart();
		}
		
	}

}
