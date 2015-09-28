package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DeleteData {

	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {

	int result = executeQueryUsingPreparedStatement();
     System.out.println("No of rows Deleted ="+result);
	System.out.println("\nExiting . . .");
}



/* execute query using prepared statement*/
@SuppressWarnings("resource")
/**
 * this method delete books in library that is not issue from last 1 year
 * this also print the accession no of deleted books which is not issued from last 1 year
 */
private static int executeQueryUsingPreparedStatement() {
	

	Connection con = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	List<Object> listOfBooks = new ArrayList<Object>();
	ConnectionUtil conUtil = new ConnectionUtil();
	int rows=0;
	con = conUtil.getConnection();

	String query = "select b.accession_no "
			+ "FROM books b WHERE (b.accession_no NOT IN (SELECT accession_no FROM book_issue)"
			+ "AND DATEDIFF(now(),b.purchase_date)>365)OR b.accession_no IN "
			+ "(SELECT bi.accession_no FROM book_issue bi WHERE DATEDIFF(now(),bi.issue_date)>365 AND "
			+ "(bi.accession_no,bi.issue_date,bi.member_id) IN (SELECT br.accession_no,br.issue_date,br.member_id "
			+ "FROM book_return br))";
	
	
	String query1= "delete  "
			+ "FROM books  WHERE (accession_no NOT IN (SELECT accession_no FROM book_issue)"
			+ "AND DATEDIFF(now(),purchase_date)>365) OR accession_no IN "
			+ "(SELECT bi.accession_no FROM book_issue bi WHERE DATEDIFF(now(),bi.issue_date)>365 AND "
			+ "(bi.accession_no,bi.issue_date,bi.member_id) IN (SELECT br.accession_no,br.issue_date,br.member_id "
			+ "FROM book_return br))";

	try {
		preparedStatement = con.prepareStatement(query);
		/* set variable in prepared statement */
	
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			BooksPojo books = new BooksPojo();
			books.setAccession_no(resultSet.getInt(1));
			
			listOfBooks.add(books.getAccession_no());
		}
		
		System.out.println("Book Accession Number");
		int i = 0;
		do{
			if(!listOfBooks.isEmpty()){
		System.out.println(listOfBooks.get(i));
		i++;
			}
			else{
				System.out.println("No Book  ");
			}
		}while(i<listOfBooks.size());
		
		
			preparedStatement = con.prepareStatement(query1);
			
			rows= preparedStatement.executeUpdate();

		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		/* close connection */
		try {
			if (con != null) {
				con.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	return rows;

}


}