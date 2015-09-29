import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * This class performs the function of retriving the data from database based on
 * query
 * 
 * @author Shishir Date 16th September 2015
 */
public class JDBCHelper {

	/**
	 * This function get all the title details of the books based on author name
	 * 
	 * @param authorName
	 * @return titleOutput
	 */
	public static List<Titles> getTitlesByAuthorName(String authorName) {
		ArrayList<Titles> titleOutput = new ArrayList<Titles>();// arraylist to
		// store the
		// title objects
		// query for the retrieving the titles based on author name
		String query = "SELECT t1.title_id,t1.title_nm FROM titles t1 JOIN title_author ta ON t1.title_id = ta.title_id JOIN Authors a1 on a1.author_id = t1.author_id WHERE author_nm = ? ";
		String authorName1 = authorName;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();// getting connection
		con = conUtil.getConnection();
		try {
			stmt = con.prepareStatement(query);// preparing query
			stmt.setString(1, authorName1);// assigning argument to query
			rs = stmt.executeQuery();// executing query
			Titles title;
			System.out.println("using column index");
			while (rs.next()) {// loop to extract data from result set and
				// storing in array list
				title = new Titles();
				title.setTitle_id(rs.getInt(1));
				title.setTitle_name(rs.getString(2));
				titleOutput.add(title);
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
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return titleOutput;
	}

	/*
	 * This function checks for the particular book based name on that whether
	 * it can be issue to the current member or not
	 */
	public static boolean canBeIssuedOrNot(String titleName) {
		// query to get the status of book based on book name
		String query = "SELECT b1.status from Books b1 INNER JOIN Titles t1 ON t1.title_id = b1.title_id where b1.book_nm = ? ";
		String titleName1 = titleName;
		Connection con = null;
		ResultSet rs = null;
		boolean status = false;
		PreparedStatement ps = null;
		ConnectionUtil conUtil = new ConnectionUtil();// getting connection from
		// the database
		con = conUtil.getConnection();
		try {
			ps = con.prepareStatement(query);// preparing the statement for the
			// execution
			ps.setString(1, titleName1);// setting the arguments on the query
			// supplied by user
			rs = ps.executeQuery();// executing the query
			Books book;
			while (rs.next()) {
				book = new Books();
				book.setStatus(rs.getString(1));// getting the status from the
				// column
			}
			Books b1 = new Books();
			if (b1.getStatus().equalsIgnoreCase("Issued"))// if the status
				// returns issued
				// than book can't
				// be issue as it is
				// already issued
				status = false;

			else
				status = true;
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
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return status;
	}

	/**
	 * This function deletes the book details which has not been issued for more
	 * than a year and returns the count of number of books
	 * 
	 * @return count
	 */
	public static int deleteBooks() {
		// query to delete the book details based on whether they have been
		// issued under 365 days period since last issue date or not
		String query = "DELETE FROM books WHERE accession_no IN (SELECT accession_no"
				+ " FROM(SELECT DISTINCT b.accession_no "
				+ "FROM book_issue bi,books b"
				+ "WHERE (DATEDIFF(now(),b.purchase_dt)>=365"
				+ "AND b.accession_no NOT IN (SELECT accession_no FROM Book_issue))"
				+ "OR b.accession_no IN(SELECT br.accession_no FROM book_return br, books b3"
				+ "WHERE(DATEDIFF(now(),IF(br.return_dt = NULL, purchase_dt, br.return_dt)) >= 365) AND br.accession_no IN"
				+ "(SELECT accession_no FROM books WHERE status = 'Unissued'))) AS a)";
		Connection con = null;
		ResultSet rs = null;
		int count = 0;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();// getting connection from database
		try {
			stmt = con.createStatement();// creating statement
			count = stmt.executeUpdate(query);// executing the query
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
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

}
