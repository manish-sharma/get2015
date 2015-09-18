import com.metacube.jdbc.helper.Helper;

/**Main class for question 2
 * Given the name of the book, to be issued by an existing member.Return flag to indicate whether the  the book has been issued or not.
 * 
 * @author Gaurav Saini
 * Date:  15/09/2015
 */

public class Main {

	public static void main(String args[]) {
		
		String bookName = "Formula Of Mathematics";
		String memberName = "Gaurav Saini";
		boolean flag = Helper.issueBook(bookName, memberName);				//flag indicates whether the book has been issued or not
		if(flag == false) {
			System.out.println("Book issued successfully");
		} else {
			System.out.println("Book is not issued");
		}
	}
}