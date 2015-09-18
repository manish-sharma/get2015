import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

/**
 * This class is used to perform sql related queries to display result
 * 
 * @author Riddhi
 *
 */
public class LibraryInformationSystemHelper {

	/* This method returns the list of titles written by author */
	public List<Title> booksPublishedByAuthor(String authorName)
			throws ParseException {
		// list of title type
		List<Title> titleList = new ArrayList<Title>();
		// title class object
		Title t = null;
		Subject s=null;
		Publisher p=null;
		// connection object
		Connection con = null;
		// resultSet object
		ResultSet rs = null;
		// statement object
		Statement stmt = null;
		// connectionUtil class object
		ConnectionUtil conUtil = new ConnectionUtil();
		// connection util class get connection method to return object of
		// connection
		con = conUtil.getConnection();

		/*
		 * Query to fetch all columns of title table which contains book written
		 * by author
		 */
		String query = "select t.* from titles t inner join title_author ta"
				+ " on ta.title_id=t.title_id inner join authors a on"
				+ " a.author_id=ta.author_id where a.author_name='"
				+ authorName + "'";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			// if execute query returns no rows
			if (rs.wasNull() == true)
				;
			else {
				// iterates over all rows return by query
				while (rs.next()) {
					t = new Title();
					s=new Subject();
					p=new Publisher();
					s.setSubjectId(rs.getInt(1));
					t.setSubjectId(s);
					t.setTitleId(rs.getInt(2));
					t.setTitleName(rs.getString(3));
					p.setPublisherId(rs.getInt(4));
					t.setPublisherId(p);
					titleList.add(t);
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
		return titleList;
	}

	/* This method returns the accession number of book if book is available */
	public int bookAvailable(String bookName) {
		Connection con = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		ResultSet rs = null;
		int accessionNumber = 0;

		// Query to get accession number for the book entered
		String query = "select accession_no From books where title_id in (Select title_id from titles "
				+ "where title_name ='" + bookName + "' and status='A')";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.wasNull() == true)
				;
			else {
				if (rs.next())
					accessionNumber = rs.getInt("accession_no");
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
		return accessionNumber;
	}

	/*
	 * this method is used to return true if the book has been issued to the
	 * member otherwise false
	 */
	public boolean bookIssuedOrNot(String memberName, int accessionNumber) {
		boolean flag = false;
		Connection con = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		ResultSet rs = null;
		int id = 0;
		// query to get the member id of the member name entered
		String query2 = "select member_id from Members where member_name = '"
				+ memberName + "'";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query2);
			if (rs.next() == false)
				;
			else {
				if (rs.next())
					id = rs.getInt("member_id");
				// query to add entry with book issue table
				String query3 = "insert into book_issue(accession_no,member_id) values ( "
						+ accessionNumber + "," + id + ")";
				int num = stmt.executeUpdate(query3);
				// query to update the status of the book issued
				String query4 = "update books set status='NA' where accession_no='"
						+ accessionNumber + "'";
				stmt.executeUpdate(query4);
				if (num > 0)
					flag = true;
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
				e.printStackTrace();
			}
		}
		return flag;
	}

	/* method used to delete books that are not been used since last one year */
	public int deleteBooksNotUsedSinceOneYear() {

		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		ResultSet rs = null;
		int count = 0;
		int index = 1;
		List<Integer> listOfBooks = new ArrayList<Integer>();
		StringBuilder builder = new StringBuilder();

		// query to select accession number of those books which are not used
		// recently
		String query = "select distinct b.accession_no from book_issue bi right join books b on b.accession_no=bi.accession_no "
				+ "AND bi.Issue_date=(Select max(Issue_date) from book_issue bi1 "
				+ " where bi1.accession_no=bi.accession_no group by (bi1.accession_no))"
				+ "Where((DATEDIFF( NOW(), bi.Issue_date)>=365) and "
				+ "DATEDIFF( NOW(), b.purchase_date)>=365 or bi.issue_date is null)";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				// prepared statement used to pass parameters
				listOfBooks.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < listOfBooks.size(); i++) {
			builder.append("?,");
		}
		// query to delete books returned by the select query
		String query1 = "delete From books where accession_no in ("
				+ builder.deleteCharAt(builder.length() - 1).toString() + ")";
		try {
			ps = (PreparedStatement) con.prepareStatement(query1);
			/* set variable in prepared statement */
			// ps.setInt(1,index);
			for (Integer i : listOfBooks) {
				ps.setInt(index++, i);
			}
			count = ps.executeUpdate();
			// count the number of delete operations performed

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (stmt != null)
					stmt.close();
				if (ps != null) {
					ps.close();
					if (con != null) {
						con.close();
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
