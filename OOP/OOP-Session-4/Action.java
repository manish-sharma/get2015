/*
 * This class contains action method
 * @author Banwari Kevat
 * 
 */
 class Action {
	 private int choice;
	 
	 Action(int choice) {
		 this.choice=choice;		 
	 }
	 
	 public void performAction() {
			Trains trains = new Trains();
			//choose which action would be performed
			switch(choice)  {
			   case 1: {
				  trains.totalTrains();
				  break;
			   }
			   case 2: {
					trains.totalTrains("Good");
					break;
			   }	
			   case 3: {
				    trains.totalTrains("Passanger");
				    break;
			   }
			   case 4: {
				 System.exit(0);
			   }
			}
	 }
 }
