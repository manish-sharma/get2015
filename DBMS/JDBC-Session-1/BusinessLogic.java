import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
 * this class helps to execute business logic
 */
public class BusinessLogic {
	 
	private Helper helper;
	
	BusinessLogic(){
		helper = new Helper();
	}
	/*
	 * This method returns the list of title written by given author
	 * @param author is the name of author  
	 */
	public List<String> getTitlesByAuthor(String author)
	{
		List<String> titles = new ArrayList<String>();
		
		String sql = "SELECT t.title_nm FROM authors a JOIN title_author ta ON a.author_id = ta.author_id "
				+ "JOIN titles t ON t.title_id = ta.title_id WHERE author_nm = '"+author+"'";
		try
		{  
		   if(helper.connection() != null)
		     {
			   ResultSet rs = helper.executeQuery(sql); 
			
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
	public int getIdByMemberName(String member_nm)
	{
		int member_id = 0;
		String sql = "SELECT member_id FROM members WHERE member_nm='"+member_nm+"'";
		try 
		{
			if(helper.connection() != null)
		     {
			   ResultSet rs = helper.executeQuery(sql); 
			
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
	
	public String getAccessionNoByTitleName(String title_nm)
	{
		String accession_no = null;
		
		String sql = "SELECT b.accession_no FROM titles t JOIN books b ON t.title_id = b.title_id"
				+ " WHERE status='Y' && t.title_nm = '"+title_nm+"' LIMIT 1";
		try 
		{
			if(helper.connection() != null)
		     {
			   ResultSet rs = helper.executeQuery(sql); 
			 
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
		accession_no = getAccessionNoByTitleName(title_nm);
		if( accession_no == null )
			return "Book not issued because book is not available";
		int member_id = 0;
		member_id = getIdByMemberName(member_nm);
		if( member_id == 0 )
			return "Book not issued because Member is not available";
		
		String sql1 = "INSERT INTO book_issue (accession_no , member_id) "
				+ " values('"+accession_no+"' ,"+member_id+" )" ;
		
		String sql2 = "UPDATE books SET status = 'N' WHERE accession_no = '"+accession_no+"'";
			  
	   if (helper.executeUpdate(sql1)==1 && helper.executeUpdate(sql2)==1 )
				    return "Book is issued";
		
		return null;
	}
	
	/*
	 * This method delete all the books which is not issued more than one year
	 * and returns number of books deleted
	 */
	public int deleteBooksNotIssuedFromOneYear()
	{   
		int rs = 0;
		String sql = "DELETE FROM books "
				     + "WHERE (accession_no "
			         + "NOT IN (SELECT accession_no FROM book_issue)"
				     + "AND DATEDIFF(now(),purchase_dt)>365)"
				     + "OR accession_no "
				     + "IN (SELECT bi.accession_no FROM book_issue bi "
				     + "WHERE DATEDIFF(now(),bi.issue_dt)>365 "
				     + "AND (bi.accession_no,bi.issue_dt,bi.member_id) "
				     + "IN (SELECT br.accession_no,br.issue_dt,br.member_id FROM book_return br));";
		rs =  helper.executeUpdate(sql);
		
		return rs;
	}
	
	
	

}
