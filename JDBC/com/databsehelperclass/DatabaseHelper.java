/**
 * @author Pooja Khandelwal
 * @createdDate 16/09/2015
 * @name DatabaseHelper
 * @description this class handle and executes all the queries on database
 */
package com.databsehelperclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.connection.ConnectionUtil;
import com.pojoclass.Title;

public class DatabaseHelper {
	/**
	 * @name executeQueryToFetchTheBooksPublishedByAuthor()
	 * @description this method executes the query to fetch the books that are
	 *              published by the author whose name is given
	 * @return titleList(list of Title type which contains Title class objects)
	 */
	public static List<Title> executeQueryToFetchTheBooksPublishedByAuthor() {
		String query1 = "Select * from Title T WHERE T.titleId In (SELECT TA.titleId from Title_Author TA Where TA.authorId IN (Select A.authorId from Authors A Where A.authorName='Pooja'))";
		String query2 = "Select * From Title T Join Title_Author TA ON T.titleId=TA.titleId Join Authors A On A.authorId=TA.authorId WHERE A.authorName='Pooja'";
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		List<Title> titleList = new ArrayList<Title>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query2);
			System.out.println("get data from result set using column name ");
			while (resultSet.next()) {
				Title title = new Title();
				title.setTitleId(resultSet.getString("titleId"));
				title.setTitleName(resultSet.getString("titleName"));
				title.setPublisherId(resultSet.getString("publisherId"));
				title.setSubjectId(resultSet.getString("subjectId"));
				titleList.add(title);
			}
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
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return titleList;

	}

	/**
	 * @name executeQueryTOFindWhetherTheBookIssuedOrNot()
	 * @description this method executes the query to check whether the
	 *              particular book is issued by a member whose memberId is
	 *              given
	 * @return flag(either 0 or 1)
	 */
	public int executeQueryTOFindWhetherTheBookIssuedOrNot() {
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int flag = 0;
		System.out.println("Enter name of book Title to be issued");
		Scanner scanner = new Scanner(System.in);
		String bookName = scanner.nextLine();
		System.out.println("Enter memberId who want to issue the book");
		Scanner scanner1 = new Scanner(System.in);
		int memberId = scanner1.nextInt();
		try {
			String query = "INSERT INTO Books_Issue (accessionNo,memberId) VALUES((SELECT accessionNo FROM Books B,Title T Where B.titleId=T.titleId AND T.titleName=? LIMIT 0,1),(Select memberId from members Where memberId=?))";
			if (isValidMemberId(memberId) == true
					&& isValidBookName(bookName) == true) {
				preparedStatement = connection.prepareStatement(query);
				/* set variable in prepared statement */
				preparedStatement.setString(1, bookName);
				preparedStatement.setInt(2, memberId);
				System.out.println("execute");
				flag = preparedStatement.executeUpdate();
			} else {
				System.out.println("not execute");
				return flag;
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
		return flag;
	}

	/**
	 * @name isValidBookName()
	 * @description this method checks whether the book that is to be issued is
	 *              available in library or not
	 * @param bookName
	 *            (name of book to be issued)
	 * @return isBookExist(either true or false)
	 */
	private boolean isValidBookName(String bookName) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		ResultSet isBookExist1 = null;
		Boolean isBookExist = false;
		try {
			String query1 = "SELECT accessionNo FROM Books B,Title T Where B.titleId=T.titleId AND T.titleName=? LIMIT 0,1";
			preparedStatement = connection.prepareStatement(query1);
			/* set variable in prepared statement */
			preparedStatement.setString(1, bookName);
			isBookExist1 = preparedStatement.executeQuery();
			isBookExist = isBookExist1.next();
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
				if (isBookExist1 != null) {
					isBookExist1.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isBookExist;
	}

	/**
	 * @name isValidMemberId()
	 * @description this method checks whether the member who want to issue the
	 *              book already exists or not
	 * @param memberId
	 *            (id of member who want to issue the book)
	 * @return isMemberExist(either true or false)
	 */
	private boolean isValidMemberId(int memberId) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		ResultSet isMemberExist1 = null;
		Boolean isMemberExist = false;
		try {
			String query2 = "SELECT memberId FROM Members WHERE memberId=?";

			preparedStatement = connection.prepareStatement(query2);
			/* set variable in prepared statement */
			preparedStatement.setInt(1, memberId);
			isMemberExist1 = preparedStatement.executeQuery();
			isMemberExist = isMemberExist1.next();
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
				if (isMemberExist1 != null) {
					isMemberExist1.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isMemberExist;
	}

	/**
	 * @name executeQueryTODeleteBooksNotIssuedInLast1Yeat()
	 * @description this method delete those books from library which are not
	 *              issued in last 1 year
	 * @return totalBooksDeleted(no of books deleted from library)
	 */
	public int executeQueryTODeleteBooksNotIssuedInLast1Yeat() {
		String query = "DELETE FROM B Using Books AS B WHERE(PERIOD_DIFF(DATE_FORMAT(CURDATE(), '%Y%m'),DATE_FORMAT((SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo "
				+ "ORDER BY BI.issueDate DESC LIMIT 0,1), '%Y%m'))>12 OR (PERIOD_DIFF(DATE_FORMAT(CURDATE(), '%Y%m'),DATE_FORMAT(B.purchaseDate, '%Y%m') )>12 AND "
				+ " NOT EXISTS(SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo ORDER BY BI.issueDate DESC LIMIT 0,1) ))";
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int totalBooksDeleted = 0;
		try {
			preparedStatement = connection.prepareStatement(query);
			/* set variable in prepared statement */
			totalBooksDeleted = preparedStatement.executeUpdate();
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
		return totalBooksDeleted;
	}
}
