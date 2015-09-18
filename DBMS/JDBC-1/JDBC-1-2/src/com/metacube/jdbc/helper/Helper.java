package com.metacube.jdbc.helper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacube.jdbc.util.ConnectionUtil;

/**Helper class. Data is Inserted into book_issue table in this class
 * 
 * @author Gaurav Saini
 * Date:  15/09/2015
 */

public class Helper {

	
	/** Method to issue a book to an existing member
	 * 
	 * @return true if resultSet is generated, false otherwise
	 */
	public static boolean issueBook(String bookName, String memberName) {
		
		boolean flag = true;				//flag indicates whether the book has been issued or not
		
		Connection con = null;				//connection initialization
		Statement stmt = null;				//statement initialization
		try {
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			stmt = con.createStatement();
			
			String query = "INSERT INTO Book_Issue(issue_date,accession_No, member_id, due_Date) "		//query will store the database query in string format
					+ "VALUES(now(), (SELECT accession_no FROM books WHERE status = 1 AND "
					+ "title_id = (SELECT title_id FROM title WHERE title_name= '" + bookName + "') LIMIT 0,1), "
							+ "(SELECT member_id FROM members WHERE member_name = '" + memberName + "'), '2015-11-06');";
			
			flag = stmt.execute(query);				//executing query and result will be stored in flag
			return flag;
		} catch(SQLException e) {
			return flag;
		}
	}
}
