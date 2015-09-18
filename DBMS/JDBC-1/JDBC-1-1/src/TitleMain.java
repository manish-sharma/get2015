/** Main class for question 1
 * Fetch all the books published by author, given the name of the author.
 * Return the books data (List of Titles).
 * 
 * @author Gaurav Saini
 * Date: 15/09/2015
 */

import java.util.Iterator;
import java.util.List;

public class TitleMain {

	public static void main(String args[]) {
		
		String authorName = "Gaurav";				//authorName holds the name of the author
		
		List<Title> titleList = TitleHelper.fetchBooks(authorName);		//fetching data from database containing books written by the author specified
		
		if(titleList == null) {
			System.out.println("Exception encountered");				//if list is null then
			return;														//exception has occurred
		}
		
		else if(titleList.size() == 0) {
			System.out.println("No books found with author = " + authorName);		//If size of titleList is zero
			return;																	//then no books has been published by the author
		}
		
		else {
			System.out.println("Books Published are:");
			
			for (Title title : titleList) {
				System.out.println(title.getTitleName());
			}
		}
		System.out.println("\nExiting . . .");
	}
}