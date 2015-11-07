package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**this class get the titles from the database matching with the title name.
 * @author Khemanshu
 *
 */
public class TitleDetails {

	public static void main(String[] args) {
		executeQueryUsingPreparedStatement();
		System.out.println("\nExiting . . .");
	}

	
	/* execute query using prepared statement*/
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
		//Query to be run.
		String query = "select T.title_id, T.title_name, T.publisher_id, T.subject_id FROM titles T, "
				+ "title_author TA inner join authors A on A.author_id = TA.author_id where"
				+ " T.title_id = TA.title_id && concat(A.author_fname,' ', A.author_lname) = ?";
		String author_name = "salim khan";

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, author_name);
			rs = ps.executeQuery();
			List<Titles> titleList = new ArrayList<Titles>();
			while (rs.next()) {
				Titles titles = new Titles();
				titles.setTitleId(Integer.parseInt(rs.getString(1)));
				titles.setTitleName(rs.getString(2));
				titles.setPublishreId(Integer.parseInt(rs.getString(3)));
				titles.setSubjectId(Integer.parseInt(rs.getString(4)));
				titleList.add(titles);
			}
			System.out.println("List of books are");
			System.out.println(titleList);

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
}
