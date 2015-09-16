package com.metacube.jdbc.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class GetBooks {
	public static void main(String[] args) throws IOException {
		//buffer object to get name of book and member
		BufferedReader bufferedReaderObj;
		bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Author Name");
		String authorName = bufferedReaderObj.readLine(); 
		ArrayList<Titles> titleList = getBooksByAuthorName(authorName);
		Iterator<Titles> iterator = titleList.iterator();
		//to check titleList is empty or not
		if(titleList.size()==0) {
			System.out.println("No titles corresponding to this author");
			System.exit(0);
		}
		System.out.println("Title Name");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getTitleName()+"\t");
		}
		System.out.println("\nExiting . . .");
	}
	/* execute query using prepared statement*/
	//method which return list of titles
	private static ArrayList<Titles> getBooksByAuthorName(String authorName) {
		//Fetching data using PreparedStatement
		Connection con = null;
		ArrayList<Titles> titleList = new ArrayList<Titles>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		//Fetch all the books published by author, given the name of the author. 
		String query = "SELECT t.title_name FROM "
				+ "authors a, titles t, title_author ta "
				+ "WHERE a.author_id=ta.author_id "
				+ "AND ta.title_id=t.title_id "
				+ "AND a.author_name='"+authorName+"';";
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				//to set POJO class variable
				Titles titles=new Titles();
				titles.titleName=rs.getString(1);
				//to add in list
				titleList.add(titles);
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
				e.printStackTrace();
			}
		}
		return titleList;
	}
}
