
/**
 * to execute Queries of DBMS
 * @author Sanjay
 * @since 9/16/2015
 */


package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class JDBCQuery {

	//main function
	public static void main(String[] args) {
		fetchBooks( "amit");
		System.out.println(isBookIssued("C++ Complete Reference",1));
		System.out.println(deleteBooks());
		System.out.println("\nExiting . . .");
	}

	
	/**
	 * to fetch the books which title is given
	 * @param name = book title
	 */
	private static void fetchBooks(String name) {
		ArrayList<Title> listOfTitles = new ArrayList<Title>();
		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "select title.title_id,title_name,subject_id,publisher_id from author,title_author,title where author_name = ? and"
				+" author.author_id = title_author.author_id and title.title_id = title_author.title_id";
	
		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			
			 ps.setString(1,name);
			rs = ps.executeQuery();
			Title newTitle = null;
			while (rs.next()) {
				newTitle = new Title();
				newTitle.setId(rs.getInt(1));
				newTitle.setName(rs.getString(2));
				newTitle.setSubjectId(rs.getInt(3));
				newTitle.setPublisherId(rs.getInt(4));
				listOfTitles.add(newTitle);
			}

			System.out.println(listOfTitles);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}

	}

	/**
	 * to check book will be issued or not
	 * @param book_name = book name
	 * @param memberId = member id
	 * @return true if book issued otherwise false
	 */
	private static boolean isBookIssued(String book_name,int memberId) {
	
		System.out.println("\nFetching data using PreparedStatement2 ....");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		//to check member is present or not
		String query = "select member_id from members where member_id =?";

		try {
			ps = con.prepareStatement(query);
		
			ps.setInt(1,memberId);
			
			rs = ps.executeQuery();
		
			
			if(!rs.next()) {
				System.out.println("member not exist ");
				return false;
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//to get accession number of book
		 query = "select accession_no from books,(select title_id from title where title_name = ?) as title_id_of_given_book_name "
				+ "where title_id_of_given_book_name.title_id = books.title_id and status = 0;";

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			
			ps.setString(1,book_name);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				query = "INSERT INTO Book_Issue(issue_date,accession_No, member_id,due_date) VALUES(now(), " 
			+ rs.getInt(1) + "," + memberId + "," +"DATE_ADD(NOW(), INTERVAL 15 DAY))";
				ps = con.prepareStatement(query);
				ps.executeUpdate(query);
				query = "update books set status= 1 where  accession_no ="+rs.getInt(1);
				ps = con.prepareStatement(query);
				ps.executeUpdate(query);
				return true;
			} else {
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return false;

	}

	/**
	 * to delete books which are not issued in last 1 year
	 * @return = number of deleted books
	 */
	private static int deleteBooks() {
		
		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		int numberOfRows = 0 ;
		con = conUtil.getConnection();
		String query= "SET FOREIGN_KEY_CHECKS=0";
	
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);		
			query = "delete  from books where accession_no in"
					+ " (select accession_no "
					+ "from (select accession_no,max(issue_date) as max_issue_date "
					+ "from book_issue group by accession_no) as issued_books "
					+ "where dateDiff(now(), max_issue_date) > 365) or accession_no not in (select accession_no from book_issue)";
			numberOfRows = stmt.executeUpdate(query);
			query = "SET FOREIGN_KEY_CHECKS=1;";
			rs = stmt.executeQuery(query);		
			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return numberOfRows;
	}
}
