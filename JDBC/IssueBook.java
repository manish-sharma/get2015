package com.metacube.jdbc.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IssueBook {
	public static void main(String[] args) throws IOException {
		//buffer object to get name of book and member
		BufferedReader bufferedReaderObj;
		bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Book Name");
		String bookName = bufferedReaderObj.readLine(); 
		System.out.println("Enter Member Name");
		String memberName = bufferedReaderObj.readLine();
		IssueBookPOJO issueBookPOJO = new IssueBookPOJO();
		try {
			getBooksByAuthorName(bookName,memberName);
			if(issueBookPOJO.getIssued())
				System.out.println("Book Issued Successfully");
			else if(!(issueBookPOJO.getIssued()))
				System.out.println("Book Not Issued ");
		}catch( Exception e){System.out.println("Please Enter correct book name or member name");}
	}
	/* execute query using prepared statement*/
	//method which Return flag to indicate whether the  the book has been issued or not.
	private static boolean getBooksByAuthorName(String bookName,String memberName) {
		//Fetching data using PreparedStatement
		Connection con = null;
		PreparedStatement ps = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		//Given the name of the book, to be issued by an existing member.
		String query ="INSERT INTO book_issue(accession_no,member_id) "
				+ "VALUES( (SELECT b.accession_no "
				+ "FROM books b,titles t"
				+ " WHERE t.title_name='"+bookName+"' "
				+ "AND t.title_id=b.title_id ),"
				+ "(SELECT member_id FROM members "
				+ "WHERE member_name='"+memberName+"'));";
		try {
			ps = con.prepareStatement(query);
			//set number of rows came from result set
			int rows = ps.executeUpdate();
				if(rows>0)
					//set value of POJO class variable
					IssueBookPOJO.isIssued=true;
				else
					//set value of POJO class variable
					IssueBookPOJO.isIssued=false;
		} catch(Exception e){System.out.println("Please Enter correct book name or member name");} 
		finally {
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
		return IssueBookPOJO.isIssued;
	}
}
