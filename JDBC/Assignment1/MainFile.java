import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to display the main menu to the user and perform the
 * required operations
 * 
 * @author Riddhi
 *
 */
public class MainFile {

	public static void main(String[] args) throws ParseException, IOException {

		System.out.println("Library Information System");

		/*
		 * Initialize object of class to access methods of class.
		 */
		LibraryInformationSystemHelper objectOfInformationSystemHelper = new LibraryInformationSystemHelper();
		while (true) {
			System.out.println("\n1. Want to know books published by author ");
			System.out.println("2. Want to issue book");
			System.out
					.println("3. Remove books from library that aer not issued since last one year");
			System.out.println("4. Exit");
			/* Input from user. */
			int choice = Utility.getIntegerValue("\nEnter your choice :");
			switch (choice) {
			/*
			 * Take input author name from user and displays books written by
			 * author.
			 */
			case 1:
				String authorName = Utility.getStringInput("Enter author name");
				List<Title> titleList = new ArrayList<Title>();
				titleList = objectOfInformationSystemHelper
						.booksPublishedByAuthor(authorName);
				if (titleList.isEmpty()) {
					System.out.println("Enter a valid author name");
				} else {
					printListOFBooks(titleList);
				}

				break;

			/*
			 * Take book name and member name as input and display whether book
			 * issued or not
			 */
			case 2:
				String bookName = Utility
						.getStringInput("Enter name of book to be isssued");
				int accessionNumber = objectOfInformationSystemHelper
						.bookAvailable(bookName);
				if (accessionNumber == 0)
					System.out.println("Book doesnt exists");
				else {
					System.out.println("\nEnter member details :");
					String memberName = Utility
							.getStringInput("Enter member name");
					boolean flag = objectOfInformationSystemHelper
							.bookIssuedOrNot(memberName, accessionNumber);
					if (flag)
						System.out.println("Book issued");
					else {
						System.out.println("Enter a valid member name");
					}
				}
				break;

			/*
			 * Display the number of books deleted which are not used since last
			 * one year
			 */
			case 3:
				System.out.println("Deleted books");
				System.out.println("Number is = "
						+ objectOfInformationSystemHelper
								.deleteBooksNotUsedSinceOneYear());
				break;

			/* */
			case 4:
				System.out.println("Bye..Have a nice day!!");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Choice...!!");

			}
		}
	}

	/* method used to display all the information for a required author */
	static void printListOFBooks(List<Title> titleList) {
		System.out.println("Title id\tTitle name\tSubject id\tPublisher id");
		for (Title s : titleList) {
			System.out.println(s.getTitleId() + "\t\t" + s.getTitleName()
					+ "\t" + s.getSubjectId() + "\t" + s.getPublisherId());
		}
	}

}
