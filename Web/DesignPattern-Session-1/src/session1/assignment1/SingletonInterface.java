package session1.assignment1;

/**
 * Name:SingletonMain
 * @author Gaurav Saini
 * Since: 21-10-2015
 * Description: UserInterface
 */

public class SingletonInterface {
	
	/**
	 * Name:Main
	 * @param args
	 * Description: Implements The Function
	 **/
	public static void main(String[] args) {
		
		// getting instance
		Singleton singleton = Singleton.getInstance();
		
		// calling singleton class function using that instance
		singleton.logException();
	}
}