package com.metacube.jdbc.helper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacube.jdbc.util.ConnectionUtil;

/**Helper class. Data is deleted from database in this class
 * 
 * @author Gaurav Saini
 * Date:  15/09/2015
 */

public class Helper {
	
	/** This method deletes the books which has not been issued since last 1 year */
	public static int deleteBooks() {
		
		Connection con = null;
		Statement stmt = null;
		try {
			
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			stmt = con.createStatement();
			
			String query = "DELETE FROM books WHERE accession_no IN "				//query contains the database query in string format
					+ "(SELECT accession_no FROM book_issue "
					+ "WHERE (DATEDIFF(NOW(), issue_Date)) > 365) OR "
					+ "(accession_No NOT IN (SELECT accession_No FROM Book_issue) AND DATEDIFF(NOW(), purchase_Date) > 365);";
			
			int numberOfBooksDeleted = stmt.executeUpdate(query);				//numberOfBooksDeleted will contain total number of books deleted
			return numberOfBooksDeleted;
		} catch (SQLException e) {
			return -1;
		}
	}
}
