package assignmentOOP_3;




/**
 
 * Description: This class contains function to be performed on each menu item
 *
 */
public class Action {
	
	/**
	 * This function calls the appropriate action to be performed when some menu item is selected
	 * @param choice: chosen menu item
	 */
	int perform(int choice,TrainReservationSystem trainReservationSystem)
	{
		switch(choice)
		{
			case 1:
				trainReservationSystem.displayByType("P");
				break;
			
			case 2:
				trainReservationSystem.displayByType("G");
				break;
				
			case 3:
				trainReservationSystem.booking();
				break;
			
			case 4:
				return 0;
				
			default:
				return 0;
		
		}
		return 1;
	}

}


