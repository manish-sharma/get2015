/**
 * @author Pooja Khandelwal
 * @createdDate 16/09/2015
 * @name DatabaseHelper
 * @description this class is the main class for library information system which calls the differnt methods in DatabaseHelper Class to execute queries on library database
 */
package com.mainclass;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.databsehelperclass.DatabaseHelper;
import com.menu.libraryInfoSystem.Menu;
import com.pojoclass.Title;

public class LibraryInfoSystemMain {
	public static void main(String args[]) {
		Menu menu = new Menu();
		int exitFlag = 1;
		String regex = "[0-9]+";
		String userChoice1;
		int userChoice;
		Scanner scanner = new Scanner(System.in);
		DatabaseHelper databaseHelper = new DatabaseHelper();
		while (exitFlag != 0) {
			do {
				menu.displayMenu();
				userChoice1 = scanner.nextLine();
			} while (!userChoice1.matches(regex));
			userChoice = Integer.parseInt(userChoice1);
			switch (userChoice) {
			case 1:
				/* Assignment 1 */
				List<Title> titleList = new ArrayList<Title>();

				titleList = databaseHelper
						.executeQueryToFetchTheBooksPublishedByAuthor();
				System.out.println("*----Books List----*");
				System.out
						.println("titleId     titleName    subjectId       publisherId\n");
				for (int i = 0; i < titleList.size(); i++) {
					Title title = titleList.get(i);
					System.out.println(title.getTitleId() + "    "
							+ title.getTitleName() + "      "
							+ title.getSubjectId() + "       "
							+ title.getPublisherId());
					System.out.println();
				}
				break;
			case 2:
				/* Assignment 2 */
				int flag = databaseHelper
						.executeQueryTOFindWhetherTheBookIssuedOrNot();
				if (flag == 0) {
					System.out.println("Book not issued");
				} else {
					System.out.println("Book has been issued successfully");
				}
				break;
			case 3:
				/* Assignment 3 */
				int totalBooksDeleted = databaseHelper
						.executeQueryTODeleteBooksNotIssuedInLast1Yeat();
				System.out.println("Total " + totalBooksDeleted
						+ " books were deleted");
				break;
			case 0:
				System.out.println("*----Exit----*");
				exitFlag = 0;
				System.exit(0);
			default:
				System.out.println("Enter valid choice");

			}

		}

	}

}
