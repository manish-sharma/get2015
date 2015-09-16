package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;


/**This class issue the book to member
 * @author Khemanshu
 *
 */
public class BookIssue {

	public static void main(String[] args) {
		executeQueryUsingPreparedStatement();

		System.out.println("\nExiting . . .");
	}

	
	/* execute query using prepared statement*/
	@SuppressWarnings("resource")
	private static void executeQueryUsingPreparedStatement() {
		
		System.out.println("\nFetching data using PreparedStatement ....");
		//Connection object use to create connection.
		Connection con = null;
		//Prepared statement object to run query.
		PreparedStatement ps = null;
		//Result set object to get the result of the query.
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		//Query to be run to get accession number of a book according to name of book.
		String queryGetAccessionNo = "select B.accession_no from books B inner join titles T on  B.title_id = T.title_id where T.title_name = ?";
		String author_name = "Colombus";

		try {
			ps = con.prepareStatement(queryGetAccessionNo);
			ps.setString(1, author_name);
			rs = ps.executeQuery();
			//Accession number of book, which is to be issued.
			int accession_no = 0 ;
			while (rs.next()) {
				accession_no = Integer.parseInt(rs.getString(1));
			}
			//query to be run to issued the book to a particular member.
			String queryInsertInBookIssue = "INSERT INTO book_issue(issue_date, accession_no, member_id, due_date)VALUES('2015-07-02','"+accession_no+"' , '508', '2015-09-15');";
			ps = con.prepareStatement(queryInsertInBookIssue);
			//Check if the book is issued or not.
			if(ps.executeUpdate(queryInsertInBookIssue) == 1)
			System.out.println("book is issued to member");
			else{
				System.out.println("book is not issued");
			}
			
		}
		catch (MySQLIntegrityConstraintViolationException e) {
			System.out.println("this book is already issued to this member,  So not issued");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
