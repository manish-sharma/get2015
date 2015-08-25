/**
 * Main class to perform all activities related to booking
 * 
 * @author Gaurav Saini--- 
 * 
 */
public class Booking {

	public static void main(String[] args) {

		TrainDetails.readTrainInfo(); // tracking data from files and storing in
										// list
		Procedure procedure = new Procedure();
		procedure.sortChart();// sorting chart

		System.out.println("HELLO");

		TrainMenu trainMenu = new TrainMenu();// calling menu
		trainMenu.menu();

	}

}
