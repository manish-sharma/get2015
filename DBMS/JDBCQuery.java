package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * to execute Queries of DBMS
 * @author Ravika
 * @since 9/16/2015
 */
public class JDBCQuery {

	//main function
	public static void main(String[] args) {
		fetchBooks( "Ankit");
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
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		String query = "select title.title_id,title_name,subject_id,publisher_id from author,title_author,title where author_name = ? and"
				+" author.author_id = title_author.author_id and title.title_id = title_author.title_id";
	
		try {
			preparedStatement = connection.prepareStatement(query);
			/* set variable in prepared statement */
			
			preparedStatement.setString(1,name);
			resultSet = preparedStatement.executeQuery();
			Title newTitle = null;
			while (resultSet.next()) {
				newTitle = new Title();
				newTitle.setId(resultSet.getInt(1));
				newTitle.setName(resultSet.getString(2));
				newTitle.setSubjectId(resultSet.getInt(3));
				newTitle.setPublisherId(resultSet.getInt(4));
				listOfTitles.add(newTitle);
			}

			System.out.println(listOfTitles);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
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
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		//to check member is present or not
		String query = "select member_id from members where member_id =?";

		try {
			preparedStatement = con.prepareStatement(query);
		
			preparedStatement.setInt(1,memberId);
			
			resultSet = preparedStatement.executeQuery();
		
			
			if(!resultSet.next()) {
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
			preparedStatement = connection.prepareStatement(query);
			/* set variable in prepared statement */
			
			preparedStatement.setString(1,book_name);
			
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				query = "INSERT INTO Book_Issue(issue_date,accession_No, member_id,due_date) VALUES(now(), " 
			+ resultSet.getInt(1) + "," + memberId + "," +"DATE_ADD(NOW(), INTERVAL 15 DAY))";
				preparedStatement = con.prepareStatement(query);
				preparedStatement.executeUpdate(query);
				query = "update books set status= 1 where  accession_no ="+resultSet.getInt(1);
				preparedStatement = con.prepareStatement(query);
				preparedStatement.executeUpdate(query);
				return true;
			} else {
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
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
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		int numberOfRows = 0 ;
		connection = connectionUtil.getConnection();
		String query= "SET FOREIGN_KEY_CHECKS=0";
	
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);		
			query = "delete  from books where accession_no in"
					+ " (select accession_no "
					+ "from (select accession_no,max(issue_date) as max_issue_date "
					+ "from book_issue group by accession_no) as issued_books "
					+ "where dateDiff(now(), max_issue_date) > 365) or accession_no not in (select accession_no from book_issue)";
			numberOfRows = statement.executeUpdate(query);
			query = "SET FOREIGN_KEY_CHECKS=1;";
			resultSet = statement.executeQuery(query);		
			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return numberOfRows;
	}
}
