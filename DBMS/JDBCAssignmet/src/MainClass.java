import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the main function
 * 
 * @author Shishir Date 16th September 2015
 */

public class MainClass {
	public static void main(String[] args) throws ParseException {
		System.out.println("Library Information System");

		/*
		 * Initialize object of class to access methods of class.
		 */
		while (true) {
			System.out.println("\n1. Want to know books published by author ");
			System.out.println("2. Want to issue book");
			System.out
					.println("3. Remove books from library that aer not issued since last one year");

			/* Input from user. */
			int choice = Utility.getIntegerValue("\nEnter your choice :");
			switch (choice) {
			/*
			 * Take input author name from user and displays books written by
			 * author
			 */
			case 1:
				String authorName = Utility.getStringInput("Enter author name");
				List<Titles> titleList = new ArrayList<Titles>();
				titleList = JDBCHelper.getTitlesByAuthorName(authorName);
				printListOFBooks(titleList);
				break;

			case 2:
				String titleName = Utility
						.getStringInput("Enter name of book to be isssued");
				boolean flag = JDBCHelper.canBeIssuedOrNot(titleName);
				if (flag == true) {
					System.out.println("Book issued successfully");
				} else {
					System.out.println("Book not issued");
				}
				break;
			case 3:
				JDBCHelper.deleteBooks();

				break;

			default:
				System.out.println("Wrong Choice...!!");
				break;
			}
		}
	}

	// this function prints the titles from title list
	static void printListOFBooks(List<Titles> titleList) {
		System.out.println("Title id\tTitle name\tSubject id\tPublisher id");
		for (Titles s : titleList) {
			System.out.println(s.getTitle_id() + "\t\t" + s.getTitle_name()
					+ "\t" + s.getSubject_id() + "\t" + s.getPublisher_id());
		}
	}
}
