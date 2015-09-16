import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Connection.CreateConnection;

/*
 * this class helps to execute of query
 */
public class Helper {
	//create connection object using CreateConnection Class object
	CreateConnection createConnection = new CreateConnection();
	Connection connection = createConnection.getConnection();
	
	/*
	 * This method returns the list of title written by given author
	 * @param author is the name of author  
	 */
	public List<String> authorToTitles(String author)
	{
		List<String> titles = new ArrayList<String>();
		
		String sql = "SELECT t.title_nm FROM authors a JOIN title_author ta ON a.author_id = ta.author_id "
				+ "JOIN titles t ON t.title_id = ta.title_id WHERE author_nm = '"+author+"'";
		try
		{  
		   if(connection != null)
		     {
			   PreparedStatement preparedStatement = connection.prepareStatement(sql);
			   ResultSet rs = preparedStatement.executeQuery(); 
			
			  while(rs.next())
				 titles.add(rs.getString(1));
			 }
		    else titles.add("Connection not stablished");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return titles;
	}
	
	/*
	 * This method maps member name to member id
	 * @param member_nm
	 */
	public int member_nmToId(String member_nm)
	{
		int member_id = 0;
		String sql = "SELECT member_id FROM members WHERE member_nm='"+member_nm+"'";
		try 
		{
			if(connection != null)
		     {
			   PreparedStatement preparedStatement = connection.prepareStatement(sql);
			   ResultSet rs = preparedStatement.executeQuery(); 
			
			  if(rs.next())
				 member_id = rs.getInt(1);
			 }
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return member_id;
	}
	
	/*
	 * This method search books for given title is available or not 
	 * if available then return accession number of this books else return null
	 * @param title is the book title
	 */
	
	public String titleToAvailableBookAccessionNo(String title_nm)
	{
		String accession_no = null;
		
		String sql = "SELECT b.accession_no FROM titles t JOIN books b ON t.title_id = b.title_id"
				+ " WHERE status='Y' && t.title_nm = '"+title_nm+"' LIMIT 1";
		try 
		{
			if(connection != null)
		     {
			   PreparedStatement preparedStatement = connection.prepareStatement(sql);
			   ResultSet rs = preparedStatement.executeQuery(); 
			 
			  if(rs.next())
				  accession_no = rs.getString(1);
			 }
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return accession_no;
	}
	
	
	/*
	 * This method return true if given book is issued to the given member
	 * @param title_nm is the name of book to be issued
	 * @param memebr_nm is the name of member who issue the books
	 */
	public String issueBookToMember(String title_nm , String member_nm)
	{   
		String accession_no =null;
		accession_no = titleToAvailableBookAccessionNo(title_nm);
		if( accession_no == null )
			return "Book not issued because book is not available";
		int member_id = 0;
		member_id = member_nmToId(member_nm);
		if( member_id == 0 )
			return "Book not issued because Member is not available";
		
		try 
		{      String sql1 = "INSERT INTO book_issue (accession_no , member_id) "
				+ " values('"+accession_no+"' ,"+member_id+" )" ;
		
		       String sql2 = "UPDATE books SET status = 'N' WHERE accession_no = '"+accession_no+"'";
			  
		       PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
		       PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
			   if (preparedStatement1.executeUpdate()==1 && preparedStatement2.executeUpdate()==1 )
				    return "Book is issued";			 
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	/*
	 * This method delete all the books which is not issued more than one year
	 * and returns number of books deleted
	 */
	public int deleteBooksNotIssuedFromOneYear()
	{
		String sql = "DELETE FROM books "
				     + "WHERE (accession_no "
			         + "NOT IN (SELECT accession_no FROM book_issue)"
				     + "AND DATEDIFF(now(),purchase_dt)>365)"
				     + "OR accession_no "
				     + "IN (SELECT bi.accession_no FROM book_issue bi "
				     + "WHERE DATEDIFF(now(),bi.issue_dt)>365 "
				     + "AND (bi.accession_no,bi.issue_dt,bi.member_id) "
				     + "IN (SELECT br.accession_no,br.issue_dt,br.member_id FROM book_return br));";
		try 
		{    		  
		       PreparedStatement preparedStatement = connection.prepareStatement(sql);
		       return preparedStatement.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	

}
