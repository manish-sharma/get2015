/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Anjita
 * CricketDemo class demonstrating different cricket play function
 */
public class CricketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cricket oneDayCricket = new OneDayCricket();
		oneDayCricket.play();
		System.out.println();
		
		Cricket t20Cricket = new T20Cricket();
		t20Cricket.play();
		System.out.println();
		
		Cricket testCricket = new TestCricket();
		testCricket.play();
		
	}

}
