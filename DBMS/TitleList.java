package com.metacube.jdbc.example;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;

public class TitleList {


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

	executeQueryUsingPreparedStatement();

	System.out.println("\nExiting . . .");
}



/* execute query using prepared statement*/
    /**
     * this method use preparedStatement and display the list of books published by author given by user
     */
private static void executeQueryUsingPreparedStatement() {
	

	Connection con = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	List<Object> listOfBooks = new ArrayList<Object>();
	ConnectionUtil conUtil = new ConnectionUtil();
	
	con = conUtil.getConnection();

	String query = ("select title ,au_fname,au_lname from title t"
	                +",author,author_title at,publisher p where au_fname=?"
			        +"and  author.au_id=at.au_id and at.title_id=t.title_id and t.pub_id=p.pub_id");
	

	try {
		preparedStatement = con.prepareStatement(query);
		/* set variable in prepared statement */
		
		
		System.out.println("Enter Name of author");
		String name = scan.next();
		 preparedStatement.setString(1,name);
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			TitlePojo titlePoJo = new TitlePojo();
			AuthorPojo  authorPoJo= new AuthorPojo();
			titlePoJo.setTitle(resultSet.getString(1));
			authorPoJo.setAu_fname(resultSet.getString(2));
			authorPoJo.setAu_lname(resultSet.getString(3));
			listOfBooks.add(titlePoJo.getTitle());
			listOfBooks.add(authorPoJo.getAu_fname());
			listOfBooks.add(authorPoJo.getAu_lname());
		}
		
		System.out.println("Book Name \t AuthorName");
		int i = 0;
		do{
			if(!listOfBooks.isEmpty()){
		System.out.println(listOfBooks.get(i)+"\t"+listOfBooks.get((++i))+" "+listOfBooks.get((++i)));
		i++;
			}
			else{
				System.out.println("No Book Published By author "+name);
			}
		}while(i<listOfBooks.size());
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

}


}

