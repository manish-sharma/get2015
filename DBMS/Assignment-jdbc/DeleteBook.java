package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**This class is used to delete the book which is not issued for one year.
 * @author Khemanshu
 *
 */
public class DeleteBook {

	public static void main(String[] args) {
		executeQueryUsingPreparedStatement();
		System.out.println("\nExiting . . .");
	}

	
	/* execute query using prepared statement*/
	private static void executeQueryUsingPreparedStatement() {
		
		System.out.println("\nFetching data using PreparedStatement ....");
		//Connection object use to create connection.
		Connection con = null;
		//Statement object to run query.
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		//Query to be run.
		String query = "delete  FROM books WHERE DATEDIFF(NOW(),purchase_date) > 365 "
				+ "AND accession_no NOT IN (SELECT DISTINCT(accession_no) FROM book_issue "
				+ "WHERE DATEDIFF( NOW(),issue_date) <= 365) ;";
		
		con = conUtil.getConnection();
		try {
			stmt = con.createStatement();
			if(stmt.executeUpdate(query) == 1) {
				System.out.println("books are deleted");
			}
			else {
				System.out.println("No books are available to deleted");
			}
			
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

		
	}
}