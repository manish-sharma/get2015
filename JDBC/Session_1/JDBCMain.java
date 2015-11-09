package assignmentJDBC_1;

/**
* @author Neha Bansal
* Date: 16 September,2015
* Description :  Main Class with all function to execute queries
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCMain {

	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc = null;
		try{
			do{
				System.out.println("Enter Choice: ");
				System.out.println("1. Fetch all the books published by author");
				System.out.println("2. Issue a book by an existing member");
				System.out.println("3. Delete all those books which were not issued in last 1 year");
				sc=new Scanner(System.in);	
				/* Inputting choice of user */
				do
				{
					System.out.println("\n(Enter Positive Integer(>0 and <3)");
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					choice = sc.nextInt();
				}while(choice <= 0 || choice >= 4);
				
				
				JDBCMain jDBCMain=new JDBCMain();
				switch(choice)
				{
				case 1:
					String authorName;
					System.out.println("Enter Author Name: ");
					authorName=sc.next();
					jDBCMain.fetchTitleName(authorName);
					break;
				case 2:
					String titleName;
					System.out.println("\nEnter Title of the book: ");
					titleName=sc.next();
					String memberName;
					System.out.println("\nEnter Member Name: ");
					memberName=sc.next();
					boolean temp =jDBCMain.bookIssue(titleName,memberName);
					if(temp)
					{
						System.out.println("book has been issued\n");
						
					}
					else
					{
						System.out.println("Book can't be issue. Its already been issued\n");
					}
					break;
				case 3:
					int count=jDBCMain.deleteBookData();
					System.out.println("\nTotal no of deleted books are :" + count+"\n");
				}
				
			}while(true);
			
		    
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	/**
	 * Below code is to fetch all the books published by author, given the name of the author. 
	 * @param authorName : Name of the author whose books is to retrieved.
	 */
	private  void fetchTitleName(String authorName) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = " SELECT title_nm"+
                       " FROM titles t"+
                       " INNER JOIN title_author ta"+
                       " ON t.title_id=ta.title_id"+
                       " INNER JOIN authors a"+
                       " ON ta.author_id=a.author_id"+
                       " WHERE a.author_nm= ?;";
		

		try {
			
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, authorName);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				
				Title title =new Title();
				title.setTitle_nm(rs.getString(1));
				System.out.println(title+"\n");
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

	}
	
	
	
	/**
	 * Below code is to issue a book by an existing member.
	 * Here we given the name of the book and name of member.
	 * Return flag to indicate whether the  the book has been issued or not.
	 * @param titleName : Name of the book that member want to issue.
	 * @return : return true if book has been issued otherwise return false.
	 */
	public boolean bookIssue(String titleName,String memberName)
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = " SELECT status,books.accession_no,member_id"+
                       " FROM books"+
                       " INNER JOIN titles"+
                       " ON books.title_id=titles.title_id"+
                       " AND titles.title_nm= ? "+
                       " INNER JOIN members"+
                       " ON member_nm= ? ;";
		
		
		boolean temp=false;
		
		

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, titleName);
			ps.setString(2, memberName);
			
			rs = ps.executeQuery();
            
            int accession_no=0;
			while (rs.next()) 
			{
				Books books =new Books();
				books.setStatus(rs.getString(1));
				books.setAccession_no(rs.getInt(2));
				
				if(books.getStatus().equalsIgnoreCase("NOT_Issued"))
				{
					
					PreparedStatement ps1 = null;
					String query1 = " INSERT INTO book_issue(accession_no,member_id)"+
                                    " VALUES "+
                                    " (?,?);";
					ps1 = con.prepareStatement(query1);
					accession_no=books.getAccession_no();
					int member_id=rs.getInt("member_id");
					ps1.setInt(1, accession_no);
					ps1.setInt(2, member_id);
					ps1.executeUpdate();
					
					PreparedStatement ps2 = null;
					String query2= "UPDATE books SET status='Issued' WHERE accession_no="+accession_no;
					ps2 = con.prepareStatement(query2);
					ps2.executeUpdate();
					temp=true;
					break;
					
				}
				
				
				
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
		return temp;

		
	}
	
	/**
	 * Below code is to Delete all those books which were not issued in last 1 year and Return the number of books deleted.
     * @return : return the no of books deleted
	 */
	
    private int deleteBookData() {
	String query = " DELETE FROM books"+
                   " WHERE status='NOT_issued'"+
                   " and accession_no NOT IN "+
                   " ( Select accession_no"+
                   " FROM book_issue"+
                   " WHERE TIMESTAMPDIFF(YEAR, issue_dt,now()) < 1"+
                   "  );";
	Connection con = null;
	int count = 0;
	Statement stmt = null;
	ConnectionUtil conUtil = new ConnectionUtil();
	con = conUtil.getConnection();
	try {
		stmt = con.createStatement();
		count = stmt.executeUpdate(query);

		
		
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
	
	return count;

	}

}
