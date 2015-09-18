/**Main class for question 3
 * Delete all those books which were not issued in last 1 year. Return the number of books deleted.
 * 
 * @author Gaurav Saini
 * Date:  15/09/2015
 */

import com.metacube.jdbc.helper.Helper;

public class Main {

	public static void main(String args[]) {
		int numberOfBooksDeleted = Helper.deleteBooks();
		System.out.println("Number of books deleted are : " + numberOfBooksDeleted);
	}
}