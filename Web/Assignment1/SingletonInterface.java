package Assignment1;
/**
 *user interface
 * @author Ankur
 * Since:21 October,2015
 */
public class SingletonInterface
{
	/**
	 * Name:Main
	 * @param args
	 * Description: Implements The Function
	 **/
	public static void main(String[] args) 
	{
		// getting instance
		Singleton singleton = Singleton.getInstance();
		// calling singleton class function using that instance
		singleton.logException();
	}
}
