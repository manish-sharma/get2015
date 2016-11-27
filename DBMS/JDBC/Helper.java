import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class Helper {

	Connection con = null;
	ResultSet rs = null;
	Statement stmt = null;

	public static void main(String[] args) {
		Helper helper = new Helper();
		helper.getListOfTitles();
        helper.addNewMemberInBookIssue(getAccessionNo(), 1);
        
	}

	/*
	 * private void createConnection() { ConnectionUtil conUtil = new
	 * ConnectionUtil(); con = conUtil.getConnection(); System.out.println(con);
	 * try { stmt = con.createStatement(); System.out.println(con);
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	private void closeConnection() {

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

	public ResultSet executeQuery(String query) {
		Helper helper = new Helper();
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		// helper.createConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs;

	}

	private static int executeUpdateQueryUsingStatement(String query) {
		int checkUpdate = 0;
		Connection connection = null;
		Statement statement = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		connection = conUtil.getConnection();
		try {
			statement = connection.createStatement();
			checkUpdate = statement.executeUpdate(query);
		} catch (MySQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return checkUpdate;
	}

	public static int getAccessionNo() {
		int accessionNo = 0;
		Helper helper = new Helper();
		String query = "select b.accession_no from books b ,titles t where b.title_id=t.title_id and title_name ='dbms_concept';";
		ResultSet resultSet = helper.executeQuery(query);
		try {
			if (resultSet.next()) {
				accessionNo = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accessionNo;
	}

	public static void addNewMemberInBookIssue(int accessionNo, int memberId) {
		Helper helper = new Helper();
		String query = "select *from book_issue where accession_no="
				+ accessionNo
				+ " and member_id ="
				+ memberId
				+ " and"
				+ " (accession_no,issue_date,member_id) in (select accession_no,issue_date,member_id from book_return where return_date<>'0000-00-00');";
		ResultSet resultSet = helper.executeQuery(query);
		try {
			if (resultSet.next())
				System.out.println("Book is alreay alloted to this member.");
			else {
				System.out.println("Book is successfully alloted to member.");
				query = "INSERT INTO book_issue (`accession_no`,`member_id`,`issue_date`, `due_date`)"
						+ "	VALUES ("
						+ accessionNo
						+ ","
						+ memberId
						+ ",now(), '2016-08-16');";
				executeUpdateQueryUsingStatement(query);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
helper.closeConnection();
	}

	private void getListOfTitles() {
		Helper helper = new Helper();
		String query = "select t.title_id,t.title_name,t.purchase_date,t.publisher_id,t.subject_id "
				+ "from titles t,authors a,subjects s,title_author ta"
				+ " where a.author_id=ta.author_id and ta.title_id=t.title_id "
				+ "and t.subject_id=s.subject_id and concat(a.author_fname,' ',a.author_lname)='rahul sharma';";

		List<titles> titleDetails = new ArrayList<titles>();
		try {
			rs = helper.executeQuery(query);
			while (rs.next()) {
				titles title = new titles();
				title.setTitleId(Integer.parseInt(rs.getString(1)));
				title.setTitleName(rs.getString(2));
				title.setPurchaseDate(rs.getString(3));
				title.setPublishreId(Integer.parseInt(rs.getString(4)));
				title.setSubjectId(Integer.parseInt(rs.getString(5)));
				titleDetails.add(title);

			}
			System.out.println(titleDetails);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		helper.closeConnection();
	}

	private void deleteBooks()
	{
		Helper helper = new Helper();
		String query ="delete FROM books WHERE DATEDIFF(NOW(),purchase_date) > "
				+ "365 AND accession_no NOT IN (SELECT DISTINCT(accession_no) "
				+ "FROM book_issue WHERE DATEDIFF( NOW(),issue_date) <= 365) ;";
	int noOFRowDeleted =helper.executeUpdateQueryUsingStatement(query);
		System.out.println("No of row Deleted is "+noOFRowDeleted);
		
	}
}
