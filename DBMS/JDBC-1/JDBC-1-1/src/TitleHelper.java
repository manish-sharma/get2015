import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** This class will be used as a helper class to create objects of 
 * 	title class
 * 
 * @author Gaurav Saini
 * Date: 15/09/2015
 */

public class TitleHelper {

	/** This method creates a title object
	 * 
	 * @param titleName : Name of title
	 * @return
	 */
	public static Title create(String titleName) {
		Title title = new Title();
		title.setTitleName(titleName);
		return title;
	}
	
	/** Method to get list of titles when author name is given
	 * @param authorName : name of author
	 * @return list of titles
	 */
	public static List<Title> fetchBooks(String authorName) {
		
		/* query stores the database query in string format */
		String query = "SELECT t.title_Name FROM title t INNER JOIN Title_Author ta ON t.title_Id = ta.title_Id INNER JOIN Author a ON a.author_Id = ta.author_Id AND a.author_Id = (SELECT author_Id from Author where author_Name = ?)";
		
		/* titleList will contain the list of titles */
		List<Title> titleList = new ArrayList<Title>();
		
		/* Initialization */
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement preparedStmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		try {
			
			/* Instantiation */
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, authorName);
			
			/* rs will store the result of the query */
			rs = preparedStmt.executeQuery();
			
			/* adding titles contained in rs to the list */
			while (rs.next()) {
				titleList.add(TitleHelper.create(rs.getString("title_Name")));
			}
			return titleList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (preparedStmt != null) {
					preparedStmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}